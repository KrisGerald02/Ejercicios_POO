package com.ejemplo.textoestadistica.service;

import java.util.*;

public class EstadisticaServiceImpl implements EstadisticaService {

    @Override
    public int contarPalabras(List<String> palabras) {
        return palabras == null ? 0 : palabras.size();
    }

    @Override
    public Set<String> obtenerPalabrasUnicas(List<String> palabras) {
        return palabras == null ? Collections.emptySet() : new HashSet<>(palabras);
    }

    @Override
    public String obtenerPalabraMasLarga(List<String> palabras) {
        return palabras == null || palabras.isEmpty() ? null :
                palabras.stream().max(Comparator.comparingInt(String::length)).orElse(null);
    }

    @Override
    public String obtenerPalabraMasCorta(List<String> palabras) {
        return palabras == null || palabras.isEmpty() ? null :
                palabras.stream().min(Comparator.comparingInt(String::length)).orElse(null);
    }
}
