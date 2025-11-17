package com.sipriano.generics.carros;

public class Civic extends Carro {
    public Civic(String modelo) {
        super(modelo);
    }

    @Override
    public String toString() {
        return "Honda Civic: " + getModelo();
    }
}

