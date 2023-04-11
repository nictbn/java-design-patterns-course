package example;

public class Client {
    public static void main(String[] args) {
        Topic topic = new Topic();

        Observer observer1 = new TopicSubscriber("Observer1");
        Observer observer2 = new TopicSubscriber("Observer2");
        Observer observer3 = new TopicSubscriber("Observer3");

        topic.register(observer1);
        topic.register(observer2);
        topic.register(observer3);

        observer1.setSubject(topic);
        observer2.setSubject(topic);
        observer3.setSubject(topic);

        observer1.update();

        topic.postMessage("New Message");
    }
}
