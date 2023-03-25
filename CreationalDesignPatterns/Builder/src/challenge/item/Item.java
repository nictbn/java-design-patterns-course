package challenge.item;

import challenge.packing.Packing;

import java.math.BigDecimal;

public interface Item {
    String name();
    Packing packing();
    BigDecimal price();

}
