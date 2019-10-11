package TPN9.Ejercicio2;

public class Polideportivo extends Canchas implements Oficinas{
    Canchas[] array;

    public Polideportivo(int cantidadCanchas) {
        array = new Canchas[cantidadCanchas];
    }

    public int cantidadDeCanchas(){
        int cantidadCanchas =0;
        for (int i=0;i<array.length;i++){
            if (array[i] instanceof Canchas){
                cantidadCanchas++;
            }
        }
        return cantidadCanchas;
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
