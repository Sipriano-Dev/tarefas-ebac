package com.sipriano.abstract_factory.factories;

import com.sipriano.abstract_factory.cars.Car;
import com.sipriano.abstract_factory.cars.LuxuryCar;

public class ILuxuryCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new LuxuryCar();
    }
}
