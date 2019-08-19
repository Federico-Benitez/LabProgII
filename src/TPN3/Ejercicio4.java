package TPN3;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String [] args){
        int [][] matriz = new int[3][3];
        //Cargar matriz con numeros random
        for (int i=0;i<3;i++){
            for (int x=0;x<3;x++){
                matriz[i][x]=(int)(Math.random()*99);
            }
        }
        //Mostrar matriz
        System.out.println("Matriz Desordenada :");
        mostrarMatriz(matriz);

        System.out.println("Matriz ordenada :");
        //Ordena la matriz
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
        //Mostrar matriz
        mostrarMatriz(matriz);
    }

    static void mostrarMatriz(int [][] matriz){
        for (int i=0;i<3;i++){
            for (int x=0;x<3;x++){
                System.out.print(matriz[i][x]+ " ");
            }
            System.out.println("");
        }
    }
}
