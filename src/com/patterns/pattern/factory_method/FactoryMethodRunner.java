package com.patterns.pattern.factory_method;

import com.patterns.pattern.factory_method.cargo_ware.AgriculturalProductsCargoFactory;
import com.patterns.pattern.factory_method.cargo_ware.CargoWareService;
import com.patterns.pattern.factory_method.cargo_ware.HouseholdAppliancesCargoFactory;
import com.patterns.run.PatternRunner;

public class FactoryMethodRunner implements PatternRunner {

    @Override
    public void run() {
        CargoWareService cargoWareService = new AgriculturalProductsCargoFactory();
        cargoWareService.processCargo();

        cargoWareService = new HouseholdAppliancesCargoFactory();
        cargoWareService.processCargo();
    }
}
