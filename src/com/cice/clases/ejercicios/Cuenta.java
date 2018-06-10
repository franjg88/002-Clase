package com.cice.clases.ejercicios;

public class Cuenta {

    private double balance;

    public void ingreso(double cantidad){
        System.out.println("ingreso");
    }

    public void reintegro(double cantidad){
        System.out.println("reintegro");
    }

    public void transferencia(double cantidad){
        System.out.println("transferencia");
    }

    public void setBalance(double cantidad){

            balance = cantidad;
    }

    public double getBalance(){
        return balance;
    }
}
