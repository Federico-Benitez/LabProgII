package TFI01;

public class Espectadores extends Personas{
    private String fila;
    private int silla;

    public Espectadores(String fila, int silla,String nombre, int edad) {
        super(nombre,edad);
        this.fila = fila;
        this.silla = silla;
    }


    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getSilla() {
        return silla;
    }

    public void setSilla(int silla) {
        this.silla = silla;
    }

    public String getButaca(){
        return "| Silla: "+getSilla()+"| Fila: "+getFila();
    }

    @Override
    public String getTipo() {
        return "Espectador";
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+"| Edad: "+getEdad()+getButaca();
    }
}
