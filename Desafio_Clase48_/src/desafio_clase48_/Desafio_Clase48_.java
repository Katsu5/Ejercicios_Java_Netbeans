
package desafio_clase48_;

import Entidades.Alquiler;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Desafio_Clase48_ {

    
    public static void main(String[] args) {
        // TODO code application logic here
         SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        Date date=new Date();
        Date date2=new Date();
       

        Alquiler[] origen = {
            new Alquiler(date, date2, null, 122),
            new Alquiler(date, date2, null, 500)
        };

        //Expresion Lambda 
        Alquiler[] result = Arrays.stream(origen).filter(x -> x.getPrecio() == 10).toArray(Alquiler[]::new);

        if (result.length > 0) {
            System.out.println("lo encontre");
        }else{
             System.out.println("Nada, no lo encontre");
        }
    }
    
}
