package TPN3;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String [] args){
        int [][] matriz = new int[3][3];
        //Cargar
        cargar(matriz);
        mostrar("Matriz cargada sin ordenar :");
        mostrarMatriz(matriz);
        mostrar("Matriz cargada y ordenada");
        ordenarMatriz(matriz);
        mostrarMatriz(matriz);
    }

    //Metodo para cargar matriz
    static void cargar(int [] [] matriz ){
        Scanner input = new Scanner(System.in);
        //Carga de valores en el array
        for (int i=0;i<3;i++) {
            for (int x=0;x<3;x++){
                mostrar("Ingrese un numero para agregar en la matriz en la fila: "+i+" columna: "+x);
                matriz[i][x] = input.nextInt();
            }
        }
    }
    //Metodo para mostrar String por consola
    static void mostrar(String p){
        System.out.println(p);
    }
    //Metodo para mostrar una matriz por consola
    static void mostrarMatriz(int [][] matriz){
        for (int i=0;i<3;i++){
            for (int x=0;x<3;x++){
                System.out.print(matriz[i][x]+ " ");
            }
            System.out.println("");
        }
    }
    //Metodo para ordenar matriz
    static void ordenarMatriz(int [][] matriz){
        for( int i=0; i < 3; i++){
            for( int j=0;j< 3; j++){
                for(int x=0; x < 3; x++){
                    for(int y=0; y <3; y++){
                        if(matriz[i][j] < matriz[x][y]){
                            int t = matriz[i][j];
                            matriz[i][j] = matriz[x][y];
                            matriz[x][y] = t;
                        }
                    }
                }
            }
        }
    }

}
