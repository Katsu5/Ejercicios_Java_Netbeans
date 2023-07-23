
package Entidad;

import java.util.Scanner;

public class Circunferencia {
    private double radio;
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double area(){
        double area = 3.1416 * Math.pow(this.radio,2);
        return area;        
    }
    
    public double perimetro(){
        double perimetro = 2 * 3.1416 * this.radio;
        return perimetro;        
    }
    
}
