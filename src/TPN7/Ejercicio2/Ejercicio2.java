package TPN7.Ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        try{
            pedirNumero();
        }catch (OutofRange e){
            System.out.println(e.getMessage());
        }
    }

    static void pedirNumero() throws OutofRange{
        Scanner input = new Scanner(System.in);
        int num;
            System.out.println("Ingrese un numero del 1 al 100");
            num=input.nextInt();
            if ((num<0)||(num>100)){
                throw  new OutofRange("Numero ingresado fuera de rango");
            }
    }
}
