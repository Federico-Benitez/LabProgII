package TPN5;

import java.util.Scanner;

public class Facultad {
    private String name;
    private int cantEstudiantesMax;
    private int contEstudiantes=0;
    Scanner input = new Scanner(System.in);
    Estudiante[] alumnos; //array alumnos


    //Constructor
    public Facultad(String name,int cantEstudiantesMax){
        this.name=name;
        this.cantEstudiantesMax=cantEstudiantesMax;
        this.alumnos = new Estudiante[cantEstudiantesMax];//Cantidad de estudiantes maxima como cantidad de elementos del array alumnos
    }

    //Metodos
    public void agregarEstudiante(){
        if(this.contEstudiantes<=this.cantEstudiantesMax){//Si aun podemos seguir agregando alumnos
            System.out.println("Ingrese Nombre");
            String name =input.next();//Nombre
            System.out.println("Ingrese nota media");
            double nota = input.nextDouble();//Nota media
            Estudiante alumno = new Estudiante(name,nota); //Creamos objeto alumno y llamamos al constructor con los datos ingresados
            alumnos[contEstudiantes]=alumno;//Cargamos al array alumnos el nuevo estudiante
            this.contEstudiantes++;//incrementamos nuestro contador de estudiantes
        }else{
            System.out.println("Cantidad maxima de alumnos superada");
        }
    }

    public void listarEstudiantes(){//Mostrar todos los estudiantes cargados en el array alumnos
        for (int i=0;i<contEstudiantes;i++){
            mostrar("-------------------------------------");
            System.out.println("Nombre: " +alumnos[i].getName());
            System.out.println("Nota media: "+ alumnos[i].getNotaMedia());
            System.out.println("Id Estudiante :"+alumnos[i].getId());
        }
    }

    public void buscarEstudiante(){
        mostrar("Ingrese el nombre del estudiante a buscar");
        String nombre = input.next();
        for (int i=0;i<contEstudiantes;i++){
            if(nombre.compareTo(alumnos[i].getName())==0){//comparo por peso, si son iguales, da 0
                mostrar("Encontrado!!");
                mostrar("Id de alumno: "+alumnos[i].getId());
                mostrar("Nota Media: "+alumnos[i].getNotaMedia());
            }
        }
    }

    public void borrarEstudiante(){
        if(contEstudiantes>0) {//aun quedan alumnos
            mostrar("Ingrese la id del estudiante a borrar");
            int idIngresada = input.nextInt();
            for (int i = 0; i < contEstudiantes; i++) {
                if (idIngresada == alumnos[i].getId()) {//Alumno encontrado
                    //Mover el alumno que estaba siguiente a la posicion actual
                    if (i + 1 < contEstudiantes) {//si el siguiente no es el ultimo
                        for (int x = i; x < contEstudiantes - 1; x++) {
                            alumnos[x].setName(alumnos[x+1].getName());//copiar nombre
                            alumnos[x].setNotaMedia(alumnos[x+1].getNotaMedia());//copiar nota media
                            alumnos[x].setNotaMedia(alumnos[x+1].getNotaMedia());//copiar id
                        }
                    }
                    //el siguiente es el ultimo
                    contEstudiantes--;
                }
            }
        }else{
            mostrar("No  existen alumnos cargados");
        }
    }

    public void cambiarNota(){
        mostrar("Ingrese el nombre del estudiante a buscar");
        String nombre = input.next();
        for (int i=0;i<contEstudiantes;i++){
            if(nombre.compareTo(alumnos[i].getName())==0){//comparo por peso, si son iguales, da 0
                //Se encontro alumno
                mostrar("Su nota media actual es: "+alumnos[i].getNotaMedia());
                mostrar("Ingrese nueva nota media 1-10");
                mostrar("Ingrese <-1> para no realizar cambios");
                double notaNueva = input.nextDouble();
                if (notaNueva!=-1){
                    alumnos[i].setNotaMedia(notaNueva);
                }
            }
        }

    }


    public void mostrar(String p){
        //Metodo para mostrar Strings
        System.out.println(p);
    }

    //Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCantEstudiantes() {
        return cantEstudiantesMax;
    }

    public void setCantEstudiantes(int cantEstudiantes) {
        this.cantEstudiantesMax = cantEstudiantes;
    }

}
