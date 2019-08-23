package Clase5;

import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class

public class Clase5 {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[]args){

        ArrayList<CuentaCorriente> cuentas = new ArrayList<CuentaCorriente>();
        int op=0;
        int ultimo=0;//cantidad de cuentas que se pueden crear
        do{
            menu();
            op=input.nextInt();
            switch (op){
                case 1:
                    if(ultimo<5){
                        crearCuenta(cuentas,ultimo);
                        ultimo++;//Para tener un limite de cuantas cuentas crear
                    }else{
                        mostrar("No se pueden crear mas cuentas");
                    }
                    break;
                case 2:
                    mostrarCuenta(cuentas);
                    break;
                case 3:
                    retirarPlata(cuentas);
                    break;
                case 4:
                    ingresarPlata(cuentas);
                    break;
                case 5:
                    verSaldo(cuentas);
                    break;
                case 6:
                    transferencia(cuentas);
                    break;
                case -1:
                    mostrar("Hasta luego!");
                    break;
                default:
                    mostrar("Opcion no valida");
                    break;
            }
        }while (op!=-1);

    }

    static void transferencia(ArrayList<CuentaCorriente> cuentas){
        mostrar("Ingrese su numero de cuenta");
        long accNum = input.nextLong();
        int busquedaCuenta1 = buscar(cuentas,accNum);
        if(busquedaCuenta1!=1){
            mostrar("Ingrese numero de cuenta a donde desea enviar el dinero");
            long accNum2 = input.nextLong();
            int busquedaCuenta2 = buscar(cuentas,accNum2);
            if (busquedaCuenta2!=-1){
                mostrar("Ingrese cantidad de dinero a transferir :");
                double amount = input.nextDouble();
                cuentas.get(busquedaCuenta2).ingresarDinero(cuentas.get(busquedaCuenta1).hacerTransferencia(amount));
                mostrar("Transferencia hecha");
            }else{
                mostrar("Numero de cuenta no valido");
            }
        }else{
            mostrar("Numero de cuenta no valido");
        }


    }

    static void verSaldo(ArrayList<CuentaCorriente> cuentas){
        mostrar("Ingrese su numero de cuenta");
        long accNum = input.nextLong();
        int busqueda = buscar(cuentas,accNum);
        if (busqueda!=-1){
            mostrar("Su saldo es de : $"+cuentas.get(busqueda).getSaldo());
        }else{
            mostrar("Numero de cuenta no valido");
        }

    }

    static void ingresarPlata(ArrayList<CuentaCorriente> cuentas){
        mostrar("Ingrese su numero de cuenta");
        long accNum = input.nextLong();
        int busqueda = buscar(cuentas,accNum);
        if (busqueda!=-1){
            mostrar("Ingrese cantidad de dinero a ingresar");
            double amount = input.nextDouble();
            cuentas.get(busqueda).ingresarDinero(amount);
        }else{
            mostrar("Numero de cuenta no valido ");
        }
    }

    static void retirarPlata(ArrayList<CuentaCorriente> cuentas){
        mostrar("Ingrese su numero de cuenta");
        long accNum = input.nextLong();
        int busqueda = buscar(cuentas,accNum);

        if (busqueda!=-1){//La cuenta ingresada era valida
            mostrar("Ingrese la cantidad de dinero a retirar");
            double amount = input.nextDouble();
            cuentas.get(busqueda).retirarDinero(amount);
        }else{
            mostrar("Numero de cuenta no valido");
        }

    }

    static int buscar(ArrayList<CuentaCorriente> cuentas,long accountNumber){
        int i;
        for (i=0;i<cuentas.size();i++){
            if (cuentas.get(i).getNumeroCuenta()==accountNumber){//Encontro la cuenta
                break;
            }
        }
        if(cuentas.get(i).getNumeroCuenta()==accountNumber){
            return i;
        }else{
            return -1;
        }
    }

    static void crearCuenta(ArrayList<CuentaCorriente> cuentas,int ultimo){
        mostrar("Ingrese su nombre");
        String name = input.next();
        mostrar("Ingrese su saldo inicial");
        double saldo = input.nextDouble();
        cuentas.add(new CuentaCorriente(name, saldo));
        mostrar("Su numero de cuenta es :"+cuentas.get(ultimo).getNumeroCuenta());
    }

    static void mostrarCuenta(ArrayList<CuentaCorriente> cuentas){
        mostrar("Ingrese su numero de cuenta");
        long account = input.nextLong();
        int i;
        int busqueda = buscar(cuentas,account);
        if (busqueda!=-1){
            cuentas.get(busqueda).mostrarDatos();
        }else{
            mostrar("Numero de cuenta no valido");
        }

    }

    static void menu(){
        mostrar("-----------------------------------------");
        mostrar("Ingrese < 1 > para crear cuenta");
        mostrar("Ingrese < 2 > para ver datos de su cuenta");
        mostrar("Ingrese < 3 > para Retirar dinero de su cuenta");
        mostrar("Ingrese < 4 > para Ingresar dinero a su cuenta");
        mostrar("Ingrese < 5 > para ver saldo");
        mostrar("Ingrese < 6 > para hacer transferencias ");
        mostrar("Ingrese < -1 > par salir del programa");
    }

    static void mostrar(String p){
        System.out.println(p);
    }

}

