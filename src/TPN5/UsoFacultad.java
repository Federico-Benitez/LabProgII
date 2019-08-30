package TPN5;
//Grupo FJM
//Benitez Federico
//Rodriguez Gustavo Joaquin
//Gomez Norberto Manuel

import java.util.Scanner;

public class UsoFacultad {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Facultad utn = new Facultad("Utn", 10);
        int op=0;
        do{
            mostrar("-------------------------------------");
            mostrar("\t****** MENU DE OPCIONES ******");
            mostrar("Ingrese 1 para agregar alumno");
            mostrar("Ingrese 2 para listar todos los estudiantes");
            mostrar("Ingrese 3 para buscar un estudiante por nombre");
            mostrar("Ingrese 4 para Borrar un estudiante");
            mostrar("Ingrese 5 para modificar nota Media");
            mostrar("Ingrese -1 para salir");
            mostrar("-------------------------------------");
            op= input.nextInt();
            mostrar("-------------------------------------");
            switch (op){
                case 1:
                    utn.agregarEstudiante();
                    break;
                case 2:
                    utn.listarEstudiantes();
                    break;
                case 3:
                    utn.buscarEstudiante();
                    break;
                case 4:
                    utn.borrarEstudiante();
                    break;
                case 5:
                    utn.cambiarNota();
                    break;
                default:
                    break;
            }

        }while (op!=-1);

    }

    public static void mostrar(String p){
        //Metodo para mostrar Strings
        System.out.println(p);
    }

}
