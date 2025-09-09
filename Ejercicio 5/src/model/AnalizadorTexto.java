public class AnalizadorTexto {
    private String texto;

    // Constructor
    public AnalizadorTexto(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("El texto no puede ser nulo");
        }
        this.texto = texto;
    }

    public int contarPalabras() {
        String[] palabras = texto.trim().split("\\s+");
        return palabras.length;
    }

    public int contarOcurrencias(String palabra) {
        if (palabra == null || palabra.isEmpty()) {
            return 0;
        }
        String[] palabras = texto.split("\\s+");
        int contador = 0;
        for (String p : palabras) {
            if (p.equalsIgnoreCase(palabra)) { // ignora mayúsculas/minúsculas
                contador++;
            }
        }
        return contador;
    }

    public String reemplazarPalabra(String palabraOriginal, String nuevaPalabra) {
        if (palabraOriginal == null || nuevaPalabra == null) {
            return texto;
        }
        return texto.replaceAll("(?i)\\b" + palabraOriginal + "\\b", nuevaPalabra);
    }

    public String getTexto() {
        return texto;
    }
}
