package com.patterns.pattern.factory_method.cargo_ware;

import static java.lang.System.out;

public class HouseholdAppliancesCargo extends Cargo {

    @Override
    void getGoods() {
        out.println("HouseholdAppliancesCargo get goods;");
    }
}