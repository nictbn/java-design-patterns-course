package challenge.item;

import java.math.BigDecimal;

public class Coke extends ColdDrink {
    @Override
    public BigDecimal price() {
        return new BigDecimal("1.30");
    }

    @Override
    public String name() {
        return "Coke";
    }
}
