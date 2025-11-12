package com.sipriano.abstract_factory.fabricas;
import com.sipriano.abstract_factory.carros.Carro;
import com.sipriano.abstract_factory.carros.CarroSUV;

public class CarroSUVFactory implements CarroFactory {
    @Override
    public Carro criarCarro() {
        return new CarroSUV();
    }
}
