package TPN7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num=0;
        boolean a=false;

        do{
            try{
                System.out.println("Ingrese un numero");
                num = input.nextInt();
                a = true;
            }catch (InputMismatchException e){
                input = new Scanner (System.in);
                System.out.println("Ingreso no valido");
            }
        }while(!a);
        if (num%2==0){
            System.out.println("El numero ingresado es par ");
        }else{
            System.out.println("El numero ingresado es impar");
        }
    }
}
