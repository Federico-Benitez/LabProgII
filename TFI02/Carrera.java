import java.util.Iterator;
import java.util.TreeSet;

public class Carrera {
    String nombre;
    //coleccion materia
    TreeSet<Materia> coleccionMaterias;

    public Carrera(String nombre, TreeSet<Materia> coleccionMaterias) {
        this.nombre = nombre;
        this.coleccionMaterias = coleccionMaterias;
    }


    public void agregarMateria(Materia materia){
        coleccionMaterias.add(materia);
    }

    public void eliminarMateria(String nombreMateria){
        //Que materia eliminar?
        Iterator<Materia> iterador = coleccionMaterias.iterator();
        while (iterador.hasNext()){
            if (iterador.next().nombre.equals(nombreMateria)){
                iterador.remove();
            }
        }
    }


    public Materia encontrarMateria(String nombre){
        Iterator<Materia> iterador = coleccionMaterias.iterator();
        while(iterador.hasNext()){
            String nombreMateria = iterador.next().nombre;
            if(nombre.equals(nombreMateria)){
                //materia encontrada
                break;
            }
        }
        return iterador.next();
    }

    public void mostrarMaterias(){
        Iterator <Materia> iterador = coleccionMaterias.iterator();
        while (iterador.hasNext()){
            System.out.println("Materia: "+iterador.next().nombre);
            System.out.println("Profesor"+ iterador.next().titular.getNombre());
            //mostrar Estudiantes
            System.out.println("Estudiantes:"+ iterador.next().listarContenidos());
        }

    }


    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", coleccionMaterias=" + coleccionMaterias +
                '}';
    }
}
