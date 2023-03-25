package challenge.item;

import java.math.BigDecimal;

public class ChickenBurger extends Burger {
    @Override
    public BigDecimal price() {
        return new BigDecimal("4.50");
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
