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
                    arrayNumeros[i] = menu.crearNuevoNumeroNatural();
                    break;
                case 2:
                    arrayNumeros[i] = menu.crearNuevoNumeroComplejo();
                    break;
                default:
                    break;
            }
        }
        int opcion;
        do {
            opcion=menu.mostrarOpciones();
            switch (opcion){
                case 1:
                    menu.sumaTotalNaturales(arrayNumeros);
                    break;
                case 2:
                    menu.sumaTotalComplejos(arrayNumeros);
                    break;
                case 3:
                    menu.listarNaturalesOrdenados(arrayNumeros);
                    break;
                case 4:
                    menu.listadoNumerosComplejos(arrayNumeros);
                    break;
                default:
                    break;
            }
        }while (opcion!=5);
    }

    static void mostrarString(String p){
        System.out.println(p);
    }
}
