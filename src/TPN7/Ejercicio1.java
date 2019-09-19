package TPN7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mostrar("Ingrese un numero");

        try{
            int num=input.nextInt();
            if (num %2 ==0){
                mostrar("El numero "+num+" es par");
            }else{
                mostrar("El numero "+num+" es impar");
            }
        }catch (InputMismatchException e){
            mostrar("El valor introducido no es un numerico. El programa se cerrara");
        }


    }

    static void mostrar(String p){
        System.out.println(p);
    }
}
