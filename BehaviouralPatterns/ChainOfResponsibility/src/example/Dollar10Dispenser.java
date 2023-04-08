package example;

public class Dollar10Dispenser implements DispenseChain {
    public static final int TEN = 10;
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= TEN) {
            int num = currency.getAmount() / TEN;
            int remainder = currency.getAmount() % TEN;
            System.out.println("Dispensing " + num + " 10$ bills");
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(currency);
        }
    }
}
