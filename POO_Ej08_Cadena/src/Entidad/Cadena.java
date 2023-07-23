
package Entidad;

public class Cadena {
    private String frase;
    private int longitudFrase;
    
    public Cadena(){
    }

    public Cadena(String frase, int longitudFrase) {
        this.frase = frase;
        this.longitudFrase = longitudFrase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitudFrase = frase.length();
    }

    public int getLongitudFrase() {
        return longitudFrase;
    }

    public void setLongitudFrase(int longitudFrase) {
        this.longitudFrase = longitudFrase;
    }
    
    
}
    
    
