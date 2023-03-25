package challenge.item;

import challenge.packing.Packing;
import challenge.packing.Wrapper;

import java.math.BigDecimal;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract BigDecimal price();
}
