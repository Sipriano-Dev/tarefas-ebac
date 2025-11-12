package com.sipriano.abstract_factory;

import com.sipriano.abstract_factory.carros.Carro;
import com.sipriano.abstract_factory.fabricas.CarroFactory;
import com.sipriano.abstract_factory.fabricas.CarroSUVFactory;
import com.sipriano.abstract_factory.fabricas.CarroSedanFactory;

public class Teste {

    public static void main(String[] args) {

        CarroFactory fabricaSedan = new CarroSedanFactory();
        Carro sedan = fabricaSedan.criarCarro();
        sedan.exibirInfo();

        CarroFactory fabricaSUV = new CarroSUVFactory();
        Carro suv = fabricaSUV.criarCarro();
        suv.exibirInfo();

    }

}
