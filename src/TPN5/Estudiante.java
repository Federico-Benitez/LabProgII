package TPN5;

public class Estudiante {
    private String name;
    private double notaMedia;
    private int id;
    private static int countId=1;


    public Estudiante(String name, double notaMedia){
        this.name= name;
        this.notaMedia=notaMedia;
        this.id=this.countId;//se le asigna un numero entero como id
        this.countId++;//se aumenta el contador para tener id consecutivos
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

}
