package challenge.item;

import challenge.packing.Bottle;
import challenge.packing.Packing;

import java.math.BigDecimal;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract BigDecimal price();
}
