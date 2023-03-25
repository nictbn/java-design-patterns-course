package challenge.item;

import java.math.BigDecimal;

public class Pepsi extends ColdDrink {
    @Override
    public BigDecimal price() {
        return new BigDecimal("1.50");
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
