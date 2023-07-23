
package desafio_clase57_gimnasio;

import Entidades.Cliente;
import java.util.ArrayList;

public class Desafio_Clase57_Gimnasio {

    public static void main(String[] args) {
        ArrayList<Cliente> listaLetras = new ArrayList<Cliente>();
        Cliente cliente1 = new Cliente(1, 37, "katia", "bajar de peso", 1.60, 54 );
               
        listaLetras.add(cliente1);
        
        listaLetras.forEach((cliente)->{
            System.out.println(cliente.getId());
        });
        
        

    }
}
