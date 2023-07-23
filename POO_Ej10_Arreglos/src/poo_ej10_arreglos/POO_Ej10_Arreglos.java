
package poo_ej10_arreglos;

import java.util.Arrays;

public class POO_Ej10_Arreglos {

    public static void main(String[] args) {
        double [] arregloA = new double [50];
        double [] arregloB = new double [20];

        //Lleno el array A
        for (int i=0; i<arregloA.length; i++){
            arregloA[i]= (double) Math.random()*50 + 1;
        }
        for (int i = 0; i < arregloA.length; i++) {
            System.out.print(arregloA[i]);            
        }
        System.out.println("");
        
        //Ordeno el vector y lo imprimo
        Arrays.sort(arregloA);
        System.out.println("El array ordenado");
        System.out.print(Arrays.toString(arregloA));
        System.out.println("");
        
        //Aqui llenamos las primeras 10 posiciones del vector B con las del vector A
        for (int i=0; i<10; i++){
            for (int j=0; j<20; j++){        
            arregloB[i]= arregloA[i];
            }
        }
                    
        for (int j=10; j<20; j++){
            if (arregloB[j] == 0){
                arregloB[j] = 0.5;
                }
        }
        
        for (int i=0; i<arregloA.length; i++){
            System.out.println(arregloA[i]);
        }
        System.out.println("");
         for (int i=0; i<arregloB.length; i++){
            System.out.println(arregloB[i]);
        }
        
    }
    
}
