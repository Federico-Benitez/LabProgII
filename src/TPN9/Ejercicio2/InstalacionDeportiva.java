package TPN9.Ejercicio2;

public class InstalacionDeportiva {
    private String nombre;
    private double superficie;
    int cantidadOficinas;


    public InstalacionDeportiva(String nombre, double superficie,int cantOficinas) {
        this.nombre = nombre;
        this.superficie = superficie;
        this.cantidadOficinas=cantOficinas;

    }

    public int cantidadDeOficinas(){
        return cantidadOficinas;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie){
        this.superficie=superficie;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
