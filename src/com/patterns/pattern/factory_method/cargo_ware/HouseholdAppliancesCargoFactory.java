package com.patterns.pattern.factory_method.cargo_ware;

public class HouseholdAppliancesCargoFactory extends CargoWareService {

    @Override
    Cargo createCargo() {
        return new HouseholdAppliancesCargo();
    }

}
