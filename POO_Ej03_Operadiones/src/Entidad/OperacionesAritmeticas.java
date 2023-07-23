package Entidad;

public class OperacionesAritmeticas {

    private int numero1, numero2;

    public OperacionesAritmeticas() {
        this.numero1 = 0;
        this.numero2 = 0;
    }
    
    public OperacionesAritmeticas(int pnumero1, int pnumero2) {
        this.numero1 = pnumero1;
        this.numero2 = pnumero2;
    }
    
    public int suma() {
        return this.numero1 + this.numero2;
    }

    public int resta() {
        return this.numero1 - this.numero2;
    }

    public int multiplicacion() {
    
        return this.numero1 * this.numero2;
    }

    public int division() {
        return this.numero1 / this.numero2;
    }

    public int getNumero1() {
        return this.numero1;
    }

    public int getNumero2() {
        return this.numero2;
    }

    public void setNumero1(int gnumero1) {
        this.numero1 = gnumero1;
    }

    public void setNumero2(int gnumero2) {
        this.numero2 = gnumero2;
    }
}
