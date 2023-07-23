
package Servicio;

import Entidad.Matematicas;

public class MateServicio {
    private Matematicas operacion;
    //Puedo usar el constructor para pasarle los datos a los parametros del objeto creado de la clase MateServicio
    public MateServicio() {
    }

    public MateServicio(Matematicas operacion) {
        this.operacion = operacion;
    }
    //Esta es otra forma de hacerlo. Pero no se lo pasas como parametro a la clase sino que: cServicio.setOperacion(operacion);
    //en la clase main
    public void setOperacion(Matematicas operacion) {
        this.operacion = operacion;
    }
    
    
    public int devolverMayor(){
        int numMayor;
        if (this.operacion.getNumero1() > this.operacion.getNumero2()){
            numMayor = this.operacion.getNumero1();
        }else{
            numMayor = this.operacion.getNumero2();
        }
        System.out.println("El numero mayor es: " + numMayor);
        return numMayor;
    }
    
    public double calcularPotencia(){
        int nuMax = Math.max(operacion.getNumero1(),operacion.getNumero2()); 
        int nuMin = Math.min(operacion.getNumero1(),operacion.getNumero2()); 
        double potencia = Math.pow(Math.round(nuMax), Math.round(nuMin));
        System.out.println("La potencia de " + nuMax + " elevado al " + nuMin + " es: " + potencia);
        return  potencia;    
    }
    
    public int calcularRaiz(){
        int nuMin = Math.min(operacion.getNumero1(),operacion.getNumero2()); 
        int vAbsnuMin = Math.abs(nuMin);
        vAbsnuMin = (int) Math.sqrt(nuMin);
        System.out.println("La raiz cuadrada de: " + nuMin + " es: " + vAbsnuMin);
        return vAbsnuMin;
    }
}
