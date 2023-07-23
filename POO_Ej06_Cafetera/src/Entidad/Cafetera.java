
package Entidad;

public class Cafetera {
    private int capMaxima;
    private int cantActual;

    public Cafetera() {
    }

    public Cafetera(int capMaxima, int cantActual) {
        this.capMaxima = capMaxima;
        this.cantActual = cantActual;
    }

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public int getCantActual() {
        return cantActual;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }
    
    
    

}
