package com.sipriano.abstract_factory.carros;

public class CarroSUV implements Carro {
    @Override
    public void exibirInfo() {
        System.out.println("Carro SUV criado.");
    }
}