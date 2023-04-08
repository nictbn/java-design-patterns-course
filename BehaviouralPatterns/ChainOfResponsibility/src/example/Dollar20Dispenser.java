package example;

public class Dollar20Dispenser implements DispenseChain {
    public static final int TWENTY = 20;
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= TWENTY) {
            int num = currency.getAmount() / TWENTY;
            int remainder = currency.getAmount() % TWENTY;
            System.out.println("Dispensing " + num + " 20$ bills");
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(currency);
        }
    }
}
