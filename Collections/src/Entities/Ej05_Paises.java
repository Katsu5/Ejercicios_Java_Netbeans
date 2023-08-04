
package Entities;


public class Ej05_Paises {
    private String pais;

    public Ej05_Paises() {
    }

    public Ej05_Paises(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
        
    @Override
    public String toString() {
        return this.pais;
    }
    
}
