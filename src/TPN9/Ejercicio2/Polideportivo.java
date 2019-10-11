package TPN9.Ejercicio2;

import java.util.Scanner;

public class Polideportivo extends Canchas implements Oficinas{
    Canchas[] array;

    public Polideportivo(int cantidadCanchas) {
        array = new Canchas[cantidadCanchas];
        this.crearCanchas(array);
    }

    public void crearCanchas(Canchas[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Ingrese el tipo de deporte: ");
            Scanner input = new Scanner(System.in);
            String tipoDeporte = input.next();
            array[i].setTipoDeporte(tipoDeporte);
        }
    }

    public int cantidadDeCanchas(){
        return array.length;
    }

    public void listadoCanchas(){
        for (int i=0;i<array.length;i++){
            if (array[i] instanceof Canchas){
                System.out.println("Cancha N°"+i+" | Tipo de Deporte:"+array[i].getTipoDeporte());
            }
        }
    }


    public String getTipo(){
        return "Polideportivo";
    }




}
