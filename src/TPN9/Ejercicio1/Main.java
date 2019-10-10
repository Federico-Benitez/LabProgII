package TPN9.Ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        int total = 0;

        menu.mostrarMensajeCuantosElementosArray();
        final int sizeArray = input.nextInt();
        Numeros[] arrayNumeros = new Numeros[sizeArray];
        for (int i=0; i< sizeArray ; i++){
            int opcion = menu.cargarArray();
            switch (opcion){
                case 1:
                    arrayNumeros[i]=new Naturales(2);
                    total+=arrayNumeros[i].
                    break;
                case 2:
                    mostrarString("ingresa a");
                    double a = input.nextDouble();
                    mostrarString("ingresa b");
                    double b = input.nextDouble();
                    arrayNumeros[i]=new Complejos(a,b);
                    break;
                default:
                    break;
            }
        }
        //menu.mostrarOpciones();



        mostrarString("Resultado: "+total.getValor());
    }

    static void mostrarString(String p){
        System.out.println(p);
    }
}
