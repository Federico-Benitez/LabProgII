package TFI01;

public abstract class Personas {
    private String nombre;
    private int Edad;

    public Personas(String nombre, int edad) {
        this.nombre = nombre;
        Edad = edad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public abstract String getTipo();

    public abstract String toString();
}
