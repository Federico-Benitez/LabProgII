package TPN2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op=0;
        Scanner input = new Scanner(System.in);
        do{
            mostrar("Ingrese  1 para ir al ejercicio 1");
            mostrar("Ingrese  2 para ir al ejercicio 2");
            mostrar("Ingrese -1 para salir");
            mostrar(":");
            op=input.nextInt();

            if(op==1){
                ejercicio1();
            }else{
                if(op==2){
                    ejercicio2();
                }else{
                    if(op==-1){
                        mostrar("Hasta luego");
                    }else{
                        mostrar("Opcion incorrecta");
                    }
                }
            }
        }while(op!=-1);

    }

    static void ejercicio1(){
        //Ejercicio 1: Almacenar en Array
        //Desarrollar un programa que pida al usuario que introduzca 10 números enteros por consola.
        //Los números introducidos se almacenarán en un array.
        //El programa imprime en consola cuántos números negativos, positivos y valores 0 hay en el array.
        Scanner input = new Scanner(System.in);
        int [] array = new int[10];
        //Carga de valores en el array
        cargar(array);

        int contCero=0, contNegativos=0, contPositivos=0;
        //Recorrer y ver los valores del arreglo
        for(int elemento:array){
            if (elemento==0){//Contar ceros
                contCero++;
            }else{
                if (elemento>0){//Contar positivos
                    contPositivos++;
                }else{//Contar negativos
                    contNegativos++;;
                }
            }
        }
        //Mostrar contadores
        mostrar("-------------------------------------------------------------------");
        mostrar("La cantidad de elementos del array que son ceros es de : "+contCero);
        mostrar("La cantidad de elementos del array que son negativos es de : "+contNegativos);
        mostrar("La cantidad de elementos del array que son positivos es de : "+contPositivos);
    }

    static void ejercicio2(){
        //Ejercicio 2. Media en posiciones pares del Array
        //En este ejercicio, se pide al usuario que introduzca 10 números enteros por consola.
        //Los números se almacenarán en un array y el programa calculará
        // la media de los números introducidos en las posiciones pares del array. (Debes utilizar el operador módulo “%”).

        int [] array = new int[10];
        cargar(array);

        //calcular media en posicion pares
        int media=0;
        //recorrer array
        for(int i=0; i<10; i=i+2){
            mostrar(i);
            media+=array[i];
        }
        //calcular media
        media=media/5;
        mostrar("La media de los numeros introducidos en las posiciones pares es de :"+media);

    }

    //metodo para cargar array
    static void cargar(int [] array ){
        Scanner input = new Scanner(System.in);
        //Carga de valores en el array
        for (int i=0;i<10;i++) {
            mostrar("Ingrese un numero para agregar en el array en la posicion "+i);
            array[i] = input.nextInt();
        }
    }

    //metodo para mostrar string
    static void mostrar(String palabra){
        System.out.println(palabra);
    }
    //metodo para mostrar int
    static void mostrar(int n){
        System.out.println(n);
    }
}
