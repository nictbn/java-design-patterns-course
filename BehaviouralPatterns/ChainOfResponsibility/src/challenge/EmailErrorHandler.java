package challenge;

public class EmailErrorHandler implements Receiver {
    public static final String EMAIL = "Email";
    private Receiver nextReceiver;
    @Override
    public boolean processMessage(Message message) {
        if (message.text.contains(EMAIL)) {
            System.out.println("EmailErrorHandler processed " + message.priority + " priority issue: " + message.text);
            return true;
        } else if (nextReceiver != null) {
            nextReceiver.processMessage(message);
        }
        return false;
    }

    @Override
    public void setNextChain(Receiver nextChain) {
        this.nextReceiver = nextChain;
    }
}
