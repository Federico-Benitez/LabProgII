package TPN9.Ejercicio2;

import java.util.Scanner;

public class InstalacionDeportiva extends Polideportivo {
    private String nombre;
    private double superficie;
    int cantidadOficinas;
    Polideportivo polideportivo;


    public InstalacionDeportiva(String nombre, double superficie,int cantOficinas, int cantCanchas) {
        super(cantCanchas);
        this.nombre = nombre;
        this.superficie = superficie;
        this.cantidadOficinas=cantOficinas;

    }

    public void crearPolideportivo(){
        System.out.println("Ingrese cantidad de canchas");
        Scanner input = new Scanner(System.in);
        int cantCanchas = input.nextInt();
        polideportivo = new Polideportivo(cantCanchas);
    }

    public int cantidadDeOficinas(){
        return cantidadOficinas;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie){
        this.superficie=superficie;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
