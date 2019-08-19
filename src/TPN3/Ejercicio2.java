package TPN3;
/*Crear una matriz de 3 x 3 con elementos generados de forma aleatoria
por medio del método random() de la clase Math.
Una vez que se genere el array de array mostrar los elementos cargados utilizando la consola.
*/
public class Ejercicio2 {

    public static void main(String[] args) {
        int [][] matriz = new int [3][3];
        for (int i=0;i<matriz.length;i++){
            for (int x=0;x<matriz[i].length;x++){
                matriz[i][x]=(int)(Math.random()*20);
            }
        }

        //Mostrar
        for(int i=0;i<matriz.length;i++){
            for (int x=0;x<matriz[i].length;x++){
                System.out.print(matriz[i][x]+" ");
            }
            System.out.println();
        }
    }
}
