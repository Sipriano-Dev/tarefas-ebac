package com.sipriano.abstract_factory.fabricas;

import com.sipriano.abstract_factory.carros.Carro;
import com.sipriano.abstract_factory.carros.CarroSedan;

public class CarroSedanFactory implements CarroFactory {

    @Override
    public Carro criarCarro() {
        return new CarroSedan();
    }
}
