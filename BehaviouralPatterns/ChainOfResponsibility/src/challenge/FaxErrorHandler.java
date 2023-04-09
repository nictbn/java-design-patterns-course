package challenge;

public class FaxErrorHandler implements Receiver {
    public static final String FAX = "Fax";
    private Receiver nextReceiver;
    @Override
    public boolean processMessage(Message message) {
        if (message.text.contains(FAX)) {
            System.out.println("FaxErrorHandler processed " + message.priority + " priority issue: " + message.text);
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
