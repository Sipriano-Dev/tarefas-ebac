package com.sipriano.abstract_factory.factories;

import com.sipriano.abstract_factory.cars.Car;
import com.sipriano.abstract_factory.cars.EconomicCar;

public class IEconomicCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new EconomicCar();
    }
}
