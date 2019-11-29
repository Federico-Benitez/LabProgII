import java.util.Iterator;
import java.util.TreeSet;

public class Carrera implements  Comparable<Carrera>, Informacion {
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

    public void encontrarEstudiante(Estudiante estudianteAEliminar){
        Iterator<Materia> iterador = coleccionMaterias.iterator();
        while (iterador.hasNext()){
            //recorrer cada materia
            TreeSet<Estudiante> Estudiante = iterador.next().coleccionEstudiantes;
            Iterator<Estudiante> iteradorEstudiantes = Estudiante.iterator();
            while (iterador.hasNext()){
                if (iteradorEstudiantes.next().getLegajo() == estudianteAEliminar.getLegajo()){
                    iteradorEstudiantes.remove();
                }
            }
        }
    }


    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", coleccionMaterias=" + coleccionMaterias +
                '}';
    }

    @Override
    public int compareTo(Carrera o) {
        if (this.getNombre().compareTo(o.getNombre()) > 0) return 1;
        if (this.getNombre().compareTo(o.getNombre()) < 0) return -1;
        return 0;
    }

    public String getNombre() {
        return nombre;
    }

    public TreeSet<Materia> getColeccionMaterias() {
        return coleccionMaterias;
    }
    @Override
    public int verCantidad() {
        return materias.size();
    }

    @Override
    public String listarContenidos() {
        return "Materias: " + materias + "\n";
    }
}
