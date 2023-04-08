package example;

public class Dollar50Dispenser implements  DispenseChain {
    public static final int FIFTY = 50;
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= FIFTY) {
            int num = currency.getAmount() / FIFTY;
            int remainder = currency.getAmount() % FIFTY;
            System.out.println("Dispensing " + num + " 50$ bills");
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(currency);
        }
    }
}
