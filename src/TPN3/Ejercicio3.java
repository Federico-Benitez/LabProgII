package TPN3;

import java.util.Scanner;

/*Crear una matriz que contenga datos de personas,
siendo cada columna una persona diferente y cada fila los datos de las mismas.*/
public class Ejercicio3 {
    public static void main(String [] args){
        String [][] matriz = new String[3][3];
        Scanner input = new Scanner(System.in);
        //Cargar
        for (int i=0;i<3;i++) {
            mostrar("Ingrese nombre");
            matriz[0][i]=input.next();
            mostrar("Ingrese DNI");
            matriz[1][i]=input.next();
            mostrar("Ingrese Edad");
            matriz[2][i]=input.next();
        }

        //Ordenar
        String [] aux = new String [3]; //Crear auxiliar
        //Ordenar
        for(int i=0; i<3;i++){
            for(int x=0; x<3-i-1;x++){
                if(matriz[0][x].compareTo(matriz[0][x+1])>0){//Si el nombre actual es mayor alfabeticamente que el siguiente
                    //Resguardar datos
                    aux[0]=matriz[0][x+1];//Nombre
                    aux[1]=matriz[1][x+1];//Dni
                    aux[2]=matriz[2][x+1];//Edad
                    //Cambiar
                    matriz[0][x+1]=matriz[0][x];//Nombre
                    matriz[1][x+1]=matriz[1][x];//Dni
                    matriz[2][x+1]=matriz[2][x];//Edad
                    //Actualizar actual
                    matriz[0][x]=aux[0];//Nombre
                    matriz[1][x]=aux[1];//Dni
                    matriz[2][x]=aux[2];//Edad
                }
            }
        }

        //Mostrar
        for(int i=0;i<3;i++){
            for (int x=0; x<3;x++){
                System.out.print(matriz[i][x]+"\t| ");
            }
            System.out.println("");
        }

    }

    static void mostrar(String p){
        System.out.println(p);
    }
}
