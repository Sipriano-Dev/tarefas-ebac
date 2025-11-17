package com.sipriano.generics.carros;

public class Honda extends Carro {

    public Honda(String modelo) {
        super(modelo);
    }

    @Override
    public String toString() {
        return "Carro Honda: " + getModelo();
    }
}