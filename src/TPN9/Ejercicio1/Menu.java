package TPN9.Ejercicio1;

import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);

    public void mostrarMensajeCuantosElementosArray(){
        mostrarString("Cuantos numeros desea cargar?");
    }

    public void elegirEntreNaturalComplejo(){
        mostrarString("1-- Si desea cargar un numero Natural");
        mostrarString("2-- Si desea cargar un numero Complejo");
    }

    public int cargarArray(){
        elegirEntreNaturalComplejo();
        int opcion = input.nextInt();
        if(opcion!=1 && opcion!=2){
            mostrarString("Opcion no valida");
            return cargarArray();
        }
        return opcion;
    }

    public void mostrarOpciones(){
        mostrarString("1--Desea sumar todos los numeros naturales?");
        mostrarString("2--Desea sumar todos los numeros complejos?");
        mostrarString("3--Desea realizar un listado de numeros naturales ordenados de forma creciente?");
        mostrarString("4--Desea realizar un listado de los numeros complejos?");
    }

    static void mostrarString(String p){
        System.out.println(p);
    }
}
