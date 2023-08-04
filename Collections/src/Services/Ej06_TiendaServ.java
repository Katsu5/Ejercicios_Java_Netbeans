
package Services;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej06_TiendaServ {
    
    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Integer> productos = new HashMap();
    String respuesta, producto;
    int valor;

    
    
    
    public void crearProductos() {
        do {
            System.out.println("Ingrese nombre del producto");
            producto = teclado.next();
            System.out.println("Ingrese valor del producto");
            valor = teclado.nextInt();
            this.productos.put(producto, valor);
            System.out.println("Desea ingresar un nuevo producto? S/N");
            respuesta = teclado.next();
        } while (respuesta.equalsIgnoreCase("s"));
    }
    
    public void modificarProducto(){
        System.out.println("Ingrese el producto que desea modificar");
        String prodModificar = teclado.next();
        if (productos.containsKey(prodModificar)){
            productos.put(prodModificar, teclado.nextInt());
        }else{
            System.out.println("El producto no existe");
        }
    }
    
    public void eliminarProducto(){
        System.out.println("Ingrese el producto que desea eliminar");
        String prodEliminar = teclado.next();
        if (productos.containsKey(prodEliminar)){
            productos.remove(prodEliminar);
        }else{
            System.out.println("El producto no existe");
        }
        
    }
    
    public void mostrarProductos(){
        for (Map.Entry<String, Integer> producto : productos.entrySet()) {
            String key = producto.getKey();
            Integer value = producto.getValue();
            
            System.out.println("key: " + key + " Valor:  " + value);
        }
    }
    
}
