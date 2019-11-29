import java.awt.image.ImageConsumer;
import java.util.Iterator;
import java.util.TreeSet;

public class Facultad implements Informacion{
    String nombre;
    //coleccion con las carreras a ocupar
    TreeSet<Carrera> coleccionCarreras;

    public Facultad(String nombre, TreeSet<Carrera> coleccionCarreras) {
        this.nombre = nombre;
        this.coleccionCarreras = coleccionCarreras;
    }

    public void agregarCarrera(Carrera carrera){
        this.coleccionCarreras.add(carrera);
    }

    public void eliminarCarrera(String nombre){
        Iterator<Carrera> iterador = coleccionCarreras.iterator();
        while(iterador.hasNext()){
            if (iterador.next().nombre.equals(nombre)){
                iterador.remove();
            }
        }
    }

    public void eliminarEstudiante(Estudiante estudiante){
        //eliminar al estudiante en cada materia en la que se inscribio
        Iterator<Carrera> iteradorCarreras = coleccionCarreras.iterator();

        while (iteradorCarreras.hasNext()){
            iteradorCarreras.next().encontrarEstudiante(estudiante);
        }
    }

    @Override
    public int verCantidad() {
        //devolver el valor de la cantidad de carreras que contiene
        int i = 1;
        Iterator<Carrera> iterador = coleccionCarreras.iterator();
        while (iterador.hasNext()){
            i++;
        }
        return i;
    }

    @Override
    public String listarContenidos() {
        Iterator<Carrera> iterador = coleccionCarreras.iterator();
        while(iterador.hasNext()){
            System.out.println("Materia "+iterador.next().toString());
        }
        return null;
    }

    @Override
    public String toString() {
        return "Facultad{" +
                "nombre='" + nombre + '\'' +
                ", coleccionCarreras=" + coleccionCarreras +
                '}';
    }
}
