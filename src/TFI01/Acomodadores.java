package TFI01;

public class Acomodadores extends Empleados implements ParaAcomodadores{
    Salas sala;


    public Acomodadores(String nombre, int edad) {
        super(nombre,edad);
    }

    @Override
    public Salas getSala() {
        return sala;
    }

    public String getNombreSala(){
        return sala.getNombre();
    }

    public void setSala(Salas sala){
        this.sala=sala;
    }

    public String getTipo(){
        return "Acomodador";
    }



    public String toString() {
        return "Nombre: "+getNombre()+"| Edad: "+getEdad()+"| Sueldo: $"+ getSueldo()+"| es un: "+getTipo()+ " de la sala: "+getNombreSala();
    }
}
