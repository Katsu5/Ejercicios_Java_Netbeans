package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;

public class CuentaServicios {
    //Se crea esta propiedad donde se almacena un objeto
    private Cuenta MyCuenta;
    
    public void pedirDatos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero de cuenta");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese su DNI");
        int DNI = leer.nextInt();
        System.out.println("Ingrese saldo actual de su cuenta");
        int saldoCuenta = leer.nextInt();

        this.MyCuenta = new Cuenta(numeroCuenta, DNI, saldoCuenta);
       
    }
    
    public void ingreso(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nueva cantidad de dinero a ingresar");
        int nuevoIngreso = leer.nextInt();
        int saldoTmp = this.MyCuenta.getSaldoActual();
        saldoTmp += nuevoIngreso;
        this.MyCuenta.setSaldoActual(saldoTmp);
    } 
    
    public void retirar(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dinero a retirar");
        int retiro = leer.nextInt();
        int saldoTmp = this.MyCuenta.getSaldoActual();
        if (retiro > saldoTmp){
            saldoTmp = 0;
        }else{
            saldoTmp -= retiro;
        }
        this.MyCuenta.setSaldoActual(saldoTmp);
    } 
    
    public void extraccionRapida(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el monto de su retiro rápido");
        int retiroRapido = leer.nextInt();
        int saldoTmp = this.MyCuenta.getSaldoActual();
        int porcentajeRetiro =(int)(saldoTmp * 0.2);
        if (retiroRapido > porcentajeRetiro){
            System.out.println("Transaccion rechazada. Su retiro supera el + "
                    + " porcentaje permitido");
        }else{
            saldoTmp -= retiroRapido;
        }
        this.MyCuenta.setSaldoActual(saldoTmp);
    } 
     
    public void consultarSaldo(){
        System.out.println("El saldo disponible en la cuenta es: " + this.MyCuenta.getSaldoActual());
    } 
    
    public void consultarDatos(){
        System.out.println("El numero de cuenta es: " + this.MyCuenta.getNumeroCuenta());
        System.out.println("El DNI es: " + this.MyCuenta.getDNI());
        System.out.println("El saldo de la cuenta es: " + this.MyCuenta.getSaldoActual());
    }
}
