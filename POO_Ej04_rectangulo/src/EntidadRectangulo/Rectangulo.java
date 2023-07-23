
package EntidadRectangulo;

public class Rectangulo {
    private double base, altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double superficie() {
        double superf = this.base * this.altura;
        return superf;
    }
    
    public double perimetro() {
        double perim = (this.base + this.altura) * 2;
        return perim;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
    
    
    
}
