package com.sipriano.testes;

import java.util.Arrays;
import java.util.List;

public class Mulheres {

    static List<String> getMulheresAndGenero(String pessoas) {
        return Arrays.stream(pessoas.split(","))
                .map(String::trim)
                .filter(p -> p.endsWith("-F"))
                .toList();
    }


}
