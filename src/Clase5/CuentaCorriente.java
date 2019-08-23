package Clase5;


import java.util.Random;

public class CuentaCorriente {
    Random randomizer = new Random(System.nanoTime());


    private String nombreTitular;
    private double saldo;
    private long numeroCuenta;

    //Constructores
    public CuentaCorriente(String nombreTitular,double saldo){
        this.numeroCuenta=(long)(Math.random()*10);//que no se repita
        this.saldo = saldo;
        this.nombreTitular=nombreTitular;
    }

    //Getters y Setters

    public String getNombreTitular() {
        return nombreTitular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public long getNumeroCuenta() {
        return numeroCuenta;
    }


    //Metodos
    public void ingresarDinero(double amount){
        if (amount>0){
            setSaldo(getSaldo()+amount);
        }
    }

    public void retirarDinero(double amount){
        if (amount<=getSaldo()){
            setSaldo(getSaldo()-amount);
        }else{
            System.out.println("Tu saldo no es suficiente !!");
        }
    }

    public void mostrarDatos(){
        System.out.println("Numero de cuenta: "+getNumeroCuenta());
        System.out.println("Nombre de cliente: "+getNombreTitular());
        System.out.println("Saldo : $"+getSaldo());
    }


    public double hacerTransferencia(double amount){
        if (amount<=getSaldo()){
            retirarDinero(amount);
            return amount;
        }else{
            System.out.println("Saldo insuficiente para hacer esta operacion");
        }
        return 0;
    }
}