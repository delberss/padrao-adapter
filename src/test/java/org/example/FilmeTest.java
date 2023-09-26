package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FilmeTest {

    @Test
    void deveRetornarConceitoFilme() {
        Filme filme = new Filme();
        filme.setClassificacao("Excelente");

        assertEquals("Excelente", filme.getClassificacao());
    }

    @Test
    void deveRetornarClassificacaoNotaFilme() {
        Filme filme = new Filme();
        filme.setClassificacao("Excelente");

        assertEquals(5, filme.getNota());
    }

}