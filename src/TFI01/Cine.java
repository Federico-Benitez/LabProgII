package TFI01;

import javax.lang.model.util.ElementScanner6;
import java.util.InputMismatchException;
import java.util.Scanner;

public  class Cine {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int i=0;
        //Cargar espectador
        Salas Sala01= new Salas(3,"Jocker");
        Espectadores[] espectador = new Espectadores[3];


        try{
            do{
                mostrarString("ingrese Nombre ");
                String Nombre = input.next();
                mostrarString("Ingrese edad");
                int edad = input.nextInt();
                mostrarString("Ingrese fila <a..z>");
                String fila = input.next();
                mostrarString("Ingrese silla <1..200>");
                int silla = input.nextInt();
                espectador[i] = new Espectadores(fila,silla,Nombre,edad);
                i++;
            }while(i<3);
            mostrarString("Lista de espectadores de la sala 01");
            Sala01.setEspectadores(espectador);
            Sala01.getEspectadores();

            Acomodadores acomodador = new Acomodadores("Juan",30);
            acomodador.setSala(Sala01);
            acomodador.setSueldo(50000);
            mostrarString(acomodador.toString());

            Empleados empleado = new Empleados("Carlos",36);
            empleado.setSueldo(999999);
            mostrarString(empleado.toString());

        }catch (Exception e){
            mostrarString("ERROR EN EL INGRESO DE DATOS");
        }
    }

    public static void mostrarString(String p){
        System.out.println(p);
    }

}
