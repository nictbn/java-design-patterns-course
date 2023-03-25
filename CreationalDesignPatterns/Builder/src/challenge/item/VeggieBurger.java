package challenge.item;

import java.math.BigDecimal;

public class VeggieBurger extends Burger {
    @Override
    public BigDecimal price() {
        return new BigDecimal("3.50");
    }

    @Override
    public String name() {
        return "Veggie Burger";
    }
}
