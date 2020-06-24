package com.patterns.pattern.factory_method.cargo_ware;

import static java.lang.System.out;

public class AgriculturalProductsCargo extends Cargo {

    @Override
    void getGoods() {
        out.println("AgriculturalProductsCargo get goods;");
    }
}
