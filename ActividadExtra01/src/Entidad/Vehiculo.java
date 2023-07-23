package Entidad;

import java.util.Scanner;

public class Vehiculo {

    private String marca, modelo, tipo;
    private int año, distancia;

    public Vehiculo(String marca, String modelo, String tipo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.año = año;
        this.distancia =0;
    }
    
    public void moverse(int segundos){             
        if (this.tipo.equalsIgnoreCase("automovil")){
            this.distancia = (3 * segundos);
        }else if(this.tipo.equalsIgnoreCase("motocicleta")){
            this.distancia = (2 * segundos);
        }else{
            this.distancia = (1 * segundos);
        }
    }
    
    
    public void frenar(){
        if (this.tipo.equalsIgnoreCase("automovil")){
            this.distancia = (distancia + 2);
        }else if(this.tipo.equalsIgnoreCase("motocicleta")){
            this.distancia = (distancia + 2);
        }
    }

    public int getDistancia() {
        return distancia;
    }
    
    
}

