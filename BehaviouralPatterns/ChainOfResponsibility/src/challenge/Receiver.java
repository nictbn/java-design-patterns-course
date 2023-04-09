package challenge;

public interface Receiver {
    boolean processMessage(Message message);
    void setNextChain(Receiver nextChain);
}
