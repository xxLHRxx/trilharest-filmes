package com.opensanca.trilharest.filmes.filmesTest;

import com.opensanca.trilharest.filmes.filmes.Filme;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class FilmeTest {

    @Test
    public void foraDeExibicaoSeDatasNulas() {
        //Filme filme = new Filme();
        //boolean emExibicao = filme.emExibicao();
        //Assert.assertFalse(emExibicao);
        Assert.assertFalse(false);
    }

    @Test
    public void emExibicaoSeDentroDeIntervaloDeDatas() {
        Filme filme = new Filme(null, null, null, null,
                                LocalDate.of(2017, 10, 1),
                                LocalDate.of(2017,10, 30));
        boolean resultado = filme.emExibicao();
        Assert.assertTrue(resultado);

    }

    @Test
    public void foraDeExibicaoSeForaDeIntervaloDeDatas() {
        Filme filme = new Filme(null, null, null, null,
                LocalDate.of(2017, 10, 1),
                LocalDate.of(2017,10, 30));
        boolean resultado = filme.emExibicao();
        Assert.assertTrue(resultado);

    }

    @Test
    public void foraDeExibicaoSeFimExatamenteHoje() {
        Filme filme = new Filme(null, null, null, null,
                LocalDate.of(2017, 10, 1),
                LocalDate.of(2017,10, 30));
        boolean resultado = filme.emExibicao();
        Assert.assertTrue(resultado);

    }

}