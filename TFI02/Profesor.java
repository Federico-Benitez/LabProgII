public class Profesor extends Persona{
    double basico;
    int antiguedad;

    public Profesor(String nombre, String apellido, int legajo, double basico, int antiguedad) {
        super(nombre, apellido, legajo);
        this.basico = basico;
        this.antiguedad = antiguedad;
    }

    public double calcularSueldo(){
        double sueldo = basico + 0.10*antiguedad;
        return sueldo;
    }

    @Override
    public String toString() {
        return "Profesor{" + super.toString() +
                "basico=" + basico +
                ", antiguedad=" + antiguedad +
                '}';
    }
}
