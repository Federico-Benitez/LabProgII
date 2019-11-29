import javax.sound.sampled.Line;
import java.util.Iterator;
import java.util.TreeSet;

public class Materia implements Informacion{
    String nombre;
    Profesor titular;
    //coleccion estudiantes
    TreeSet<Estudiante> coleccionEstudiantes;


    public Materia(String nombre, Profesor titular, TreeSet<Estudiante> coleccionEstudiantes) {
        this.nombre = nombre;
        this.titular = titular;
        this.coleccionEstudiantes = coleccionEstudiantes;
    }


    public void agregarEstudiante(Estudiante estudiante){
        coleccionEstudiantes.add(estudiante);
    }

    public void eliminarEstudiante(String nombre){
        Iterator<Estudiante> iterador = coleccionEstudiantes.iterator();
        while (iterador.hasNext()){
            if (iterador.next().getNombre().equals(nombre)){
                iterador.remove();
            }
        }
    }

    //borrar
    public void modificarTitular(Profesor profesor){
        this.titular = profesor;
    }

    @Override
    public int verCantidad() {
        //ver cantidad de estudiantes
        Iterator<Estudiante> iterador = coleccionEstudiantes.iterator();
        int i = 0;
        while (iterador.hasNext()){
            i++;
        }
        return i;
    }

    @Override
    public String listarContenidos() {
        Iterator<Estudiante> iterador = coleccionEstudiantes.iterator();
        while (iterador.hasNext()){
            System.out.println("Nombre "+ iterador.next().getNombre());
            System.out.println("Apellido "+ iterador.next().getApellido());
            System.out.println("Legajo "+ iterador.next().getLegajo());
        }

        return "";

    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", titular=" + titular +
                ", coleccionEstudiantes=" + coleccionEstudiantes +
                '}';
    }
}
