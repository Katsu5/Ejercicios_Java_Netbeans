package Servicio;

import Entidad.Cadena;

public class CadenaServicio {

    private Cadena frase;

    public void setFrase(Cadena frase) {
        this.frase = frase;
    }

    public void mostrarVocales() {
        int contarVocales = 0;
        String newfrase = this.frase.getFrase();
        char[] subFrase = newfrase.toCharArray();
        for (int i = 0; i < subFrase.length; i++) {
            String itemFrase = String.valueOf(subFrase[i]);
            if (itemFrase.equalsIgnoreCase("a")
                    || itemFrase.equalsIgnoreCase("e")
                    || itemFrase.equalsIgnoreCase("i")
                    || itemFrase.equalsIgnoreCase("o")
                    || itemFrase.equalsIgnoreCase("u")) {
                contarVocales++;
            }
        }
        System.out.println("El numero de vocales en la frase es: " + contarVocales);
    }

    public void invertirFrase() {
        String newfrase = this.frase.getFrase();
        char[] subFrase = newfrase.toCharArray();
        for (int i = subFrase.length - 1; i >= 0; i--) {
            System.out.print(subFrase[i]);
        }
        System.out.println("");
    }

    public void vecesRepetido(String letra) {
        int contarLetra = 0;
        String newfrase = this.frase.getFrase();
        char[] subFrase = newfrase.toCharArray();
        for (int i = 0; i < subFrase.length; i++) {
            String itemFrase = String.valueOf(subFrase[i]);
            if (itemFrase.equalsIgnoreCase(letra)) {
                contarLetra++;
            }
        }
        System.out.println("La letra: " + letra + " se repite " + contarLetra + " veces");
    }
    
    public void compararLongitud(String nFrase){
        String newfrase = this.frase.getFrase();
        if (newfrase.length() == nFrase.length()){
            System.out.println("Las longitudes son iguales");
        }else{
            System.out.println("Las longitudes son diferentes");
        }
    }
    
    public void unirFrases(String ofrase){
        String fraseUnida = this.frase.getFrase().concat(ofrase);
        System.out.println(" " + fraseUnida);
    }
    
    public void reemplazar(String pletra){
        String newfrase = this.frase.getFrase().replaceAll("a", pletra);
        System.out.println(newfrase);
    }
    
    public boolean contiene(String qletra){
        String newfrase = this.frase.getFrase();
        System.out.println("La frase contiene la letra? " + qletra + " : " + newfrase.contains(qletra));
        return newfrase.contains(qletra);
    }
       
}
