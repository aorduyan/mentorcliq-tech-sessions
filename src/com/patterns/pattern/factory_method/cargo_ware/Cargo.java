package com.patterns.pattern.factory_method.cargo_ware;

import static java.lang.System.out;

public abstract class Cargo {

    abstract void getGoods();

    boolean validateGoodsLegality() {
        out.println("Goods are valid.");
        return true;
    }

    void loadGoods() {
        out.println("Goods are loaded.");
    }

}
