import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int [][] matriz = new int[3][3];
        Scanner input = new Scanner(System.in);

        matriz[0][0]=12;
        matriz[0][1]=23;
        matriz[0][2]=21;
        matriz[1][0]=44;
        matriz[1][1]=41;
        matriz[1][2]=42;
        matriz[2][0]=12;
        matriz[2][1]=13;
        matriz[2][2]=16;

        for(int x=0;x< matriz.length;x++){
            for (int y=0;y<matriz[x].length;y++){
                System.out.print(matriz[x][y]+" ");
            }
            System.out.println("");
        }
    }
}