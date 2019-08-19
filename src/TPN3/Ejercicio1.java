package TPN3;

import java.util.Arrays;

/*Crear un array de 100 elementos que guarde en cada una de las posiciones un número aleatorio entre 1 y 100.
El programa debe imprimir en consola todos los valores almacenados en el array.
Utiliza un bucle for-each para leer los valores almacenados.
(Debes utilizar el método random() de la clase Math para poder rellenar los elementos del array.
BONUS: Verificar que el número no se repita.
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        int [] array = new int[100];

        //Cargar array
        for (int i=0;i<100;i++){

            boolean repetido=false;
            //Verificar que no este repetido
            do {
                array[i] = (int) (Math.random() * 100);
                repetido=false;
                for (int x=0;x<100;x++){//Posicion siguiente
                    if ((array[x]==array[i])&&(x!=i)){//Se encontro repetido
                        repetido=true;
                        break; //finalizar for de busqueda de repetido
                    }
                }
            }while(repetido==true);

        }

        Arrays.sort(array);
        for (int elemento:array){
            System.out.print(elemento+" ");
        }
        //Mostrar array
    }

}
