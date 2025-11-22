package com.sipriano.testes;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;


class MulheresTest {

    @Test
    void deveRetornarSomenteMulheres() {
        String pessoas = """
                    Anderson-M,
                    Gabrielle-F,
                    Felipe-M,
                    Beatriz-F
                """;
        List<String> mulheres = Mulheres.getMulheresAndGenero(pessoas);
        assertTrue(mulheres.stream().allMatch(p -> p.endsWith("-F")));
    }

    @Test
    void naoDeveConterHomensNaListaDeMulheres() {
        String entrada = "Ana-F, Joao-M, Carla-F, Pedro-M";

        List<String> mulheres = Mulheres.getMulheresAndGenero(entrada);

        // Aqui garantimos que NENHUM item da lista final é homem
        assertTrue(mulheres.stream().noneMatch(p -> p.endsWith("-M")));
    }

}