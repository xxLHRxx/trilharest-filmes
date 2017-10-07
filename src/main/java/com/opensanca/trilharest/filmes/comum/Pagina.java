package com.opensanca.trilharest.filmes.comum;

import java.util.List;

public class Pagina<T> {

    private List<T> registros;
    private Integer totaldeRegistros;

    public List<T> getRegistros() {
        return registros;
    }

    public void setRegistros(List<T> registros) {
        this.registros = registros;
    }

    public Integer getTotaldeRegistros() {
        return totaldeRegistros;
    }

    public void setTotaldeRegistros(Integer totaldeRegistros) {
        this.totaldeRegistros = totaldeRegistros;
    }

}
