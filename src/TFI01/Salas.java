package TFI01;

public class Salas {
    private int capacidad;
    private String pelicula;
    private String nombre;
    private Espectadores[] espectadores;


    public Salas(int capacidad, String nombre) {
        this.capacidad = capacidad;
        this.nombre = nombre;
    }


    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void getEspectadores() {
        for (int i =0;i<espectadores.length;i++){
            System.out.println(espectadores[i].toString());
        }
    }

    public void setEspectadores(Espectadores[] espectadores) {
        //que no sea mayor a su capacidad
        this.espectadores = espectadores;
    }
}


