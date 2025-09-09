package com.ejemplo.textoestadistica.model;

import java.util.List;

public class EstadisticaTexto {
    private List<String> palabras;

    public EstadisticaTexto(List<String> palabras) {
        this.palabras = palabras;
    }

    public List<String> getPalabras() {
        return palabras;
    }

    public void setPalabras(List<String> palabras) {
        this.palabras = palabras;
    }
}
