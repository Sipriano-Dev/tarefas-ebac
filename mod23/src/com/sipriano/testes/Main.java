package com.sipriano.testes;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        String pessoas = """
                    Anderson-M,
                    Gabrielle-F,
                    Felipe-M,
                    Beatriz-F
                """;

        List<String> mulheresAndGenero = Mulheres.getMulheresAndGenero(pessoas);
        List<String> mulheresNome = getMulheresNome(mulheresAndGenero);

        mulheresNome.forEach(System.out::println);


    }

    public static List<String> getMulheresNome(List<String> mulheresAndGenero) {
        return mulheresAndGenero.stream().map(mulher -> mulher.replace("-F", "")).toList();
    }

}

