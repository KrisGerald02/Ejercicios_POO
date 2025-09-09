package com.ejemplo.textoestadistica;

import com.ejemplo.textoestadistica.service.*;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        com.ejemplo.textoestadistica.model.EstadisticaTexto texto = new com.ejemplo.textoestadistica.model.EstadisticaTexto(
                Arrays.asList("hola", "mundo", "java", "hola", "estadistica", "texto")
        );

        EstadisticaService service = new EstadisticaServiceImpl();

        System.out.println("Cantidad de palabras: " + service.contarPalabras(texto.getPalabras()));
        System.out.println("Palabras únicas: " + service.obtenerPalabrasUnicas(texto.getPalabras()));
        System.out.println("Palabra más larga: " + service.obtenerPalabraMasLarga(texto.getPalabras()));
        System.out.println("Palabra más corta: " + service.obtenerPalabraMasCorta(texto.getPalabras()));
    }
}

