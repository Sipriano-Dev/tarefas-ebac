package com.sipriano;

import com.sipriano.carros.Carro;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Carro car = new Carro("Celta", 1998);
        Annotation[] annotations = car.getClass().getAnnotations();
        Arrays.stream(annotations).forEach(System.out::println);
        Arrays.stream(annotations).map(Annotation::annotationType).forEach(System.out::println);



    }

}
