
package Entities;

public class Ej06_Tienda {
    private String producto;
    private int precio;

    public Ej06_Tienda() {
    }

    public Ej06_Tienda(String producto, int precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ej06_Tienda{" + "producto=" + producto + ", precio=" + precio + '}';
    }

   
    
}
