package com.sipriano.generics.util;

import com.sipriano.generics.carros.Carro;

import java.util.ArrayList;
import java.util.List;

public class Garagem<T extends Carro> {

    private List<T> carros = new ArrayList<>();

    public void adicionar(T carro) {
        carros.add(carro);
    }

    public List<T> getCarros() {
        return carros;
    }
}

