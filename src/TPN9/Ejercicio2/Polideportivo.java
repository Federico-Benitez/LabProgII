package TPN9.Ejercicio2;

public class Polideportivo implements Canchas, Oficinas {
    private String nombre;

    public Polideportivo(String nombre) {
        this.setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
