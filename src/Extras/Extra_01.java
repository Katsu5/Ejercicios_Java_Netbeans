
package Extras;

public class Extra_01 {
    public static void tablamultiplicar(){
        for (int i = 1; i < 10; i++) {
            System.out.println("tabla del " + i);
            for (int j = 1; j <= 10; j++) {                
                System.out.println( i + " x " + j + " = " + i*j);               
            }
        }
    }
}
