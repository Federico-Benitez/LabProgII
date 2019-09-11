package TPN6;

import java.util.*;

public class Principal {//Clase principal

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int longitud = 0, cantidad = 0;
        Creador contraseñas;
        do {

            mostrar("Ingrese cuantas contraseñas desea generar");
            cantidad = input.nextInt();
            mostrar("Ingrese longitud de dichas contraseñas ");
            longitud = input.nextInt();
            //Crear contraseñas
            if(longitud < 1 ){
                mostrar("La longitud de las contraseñas es demasiado corta");
            }
            if (cantidad<1){
                mostrar("La cantidad de contraseñas es invalida");
            }

        } while (longitud < 1 && cantidad < 1);

        contraseñas = new Creador(cantidad, longitud);

        mostrar("-------------------------------------------------------");

        contraseñas.buildPassword();
        contraseñas.showPasswords();
    }

    public static void mostrar(String p) {//metodo para mostrar Strings
        System.out.println(p);
    }
}


