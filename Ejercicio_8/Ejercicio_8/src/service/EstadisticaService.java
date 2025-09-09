package com.ejemplo.textoestadistica.service;

import java.util.List;
import java.util.Set;

public interface EstadisticaService {
    int contarPalabras(List<String> palabras);
    Set<String> obtenerPalabrasUnicas(List<String> palabras);
    String obtenerPalabraMasLarga(List<String> palabras);
    String obtenerPalabraMasCorta(List<String> palabras);
}
