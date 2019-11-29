public class Estudiante extends Persona implements Comparable <Estudiante> {
    public Estudiante(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);

    }

    @Override
    public int compareTo(Estudiante o) {
        if (super.getNombre().compareTo(o.getNombre()) > 0) return 1;
        if (super.getNombre().compareTo(o.getNombre()) < 0) return -1;
        return 0;
    }


}
