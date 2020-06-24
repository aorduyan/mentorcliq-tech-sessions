package com.patterns.pattern.factory_method.cargo_ware;

public abstract class CargoWareService {

    public void processCargo() {
        Cargo cargo = createCargo();
        cargo.getGoods();
        if (cargo.validateGoodsLegality()) {
            cargo.loadGoods();
        }

    }

    abstract Cargo createCargo();

}
