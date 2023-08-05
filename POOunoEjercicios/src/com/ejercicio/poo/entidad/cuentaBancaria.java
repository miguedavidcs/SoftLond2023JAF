package com.ejercicio.poo.entidad;

import java.math.BigDecimal;

public class cuentaBancaria extends cuenta {
    public boolean bandera;//bandera
    public boolean ingreso(double cantidad) {
            bandera = true;
        if(cantidad < 0)   {
            bandera = false;
            System.out.println("No se ha ingresado nada.");
        } else{            
            System.out.println("Ingreso de dinero es: " + cantidad);
            BigDecimal saldo = getSaldo(); // Asumiendo que getSaldo() retorna un Bigdecimal
            BigDecimal cantidadBigDecimal = BigDecimal.valueOf(cantidad);// esto es como un casteo
            BigDecimal nuevoBalance = saldo.add(cantidadBigDecimal);
            setSaldo(nuevoBalance);
            System.out.println("Nuevo saldo: " + nuevoBalance);        
        } 
        return bandera;
    }
    public boolean retiro(double cantidad){
            bandera = true;
        return false;
        
    }
}

