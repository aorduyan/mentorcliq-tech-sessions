package com.patterns.pattern.factory_method.cargo_ware;

public class AgriculturalProductsCargoFactory extends CargoWareService {

    @Override
    Cargo createCargo() {
        return new AgriculturalProductsCargo();
    }

}
