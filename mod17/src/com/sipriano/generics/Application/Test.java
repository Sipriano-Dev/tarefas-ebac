package com.sipriano.generics.Application;

import com.sipriano.generics.carros.Carro;
import com.sipriano.generics.carros.Civic;
import com.sipriano.generics.carros.Honda;
import com.sipriano.generics.util.Garagem;

public class Test {

    public static void main(String[] args) {
        Garagem<Carro> garagem = new Garagem<>();

        garagem.adicionar(new Honda("Fit"));
        garagem.adicionar(new Civic("Civic Sport"));

        garagem.getCarros().forEach(System.out::println);
    }

}
