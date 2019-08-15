package TPN1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;

        do{
            mostrar("Ingrese su nombre :");
            String nombre=input.next();
            mostrar("Ingrese su edad");
            edad = input.nextInt();

            if (edad>=18){
                mostrar(nombre+" es mayor de edad");
            }else{
                if (edad!=0) {
                    mostrar(nombre + " es menor de edad");
                }
            }
        }while(edad>0);

        mostrar("Hasta luego!");


    }
    //Metodo para mostrar strings
    static void mostrar(String palabra){
        System.out.println(palabra);
    }
}
