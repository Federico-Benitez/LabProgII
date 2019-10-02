package TPN8;

public interface Vehiculo {
    int velocidadMaxima = 120;
    void acelerar();
    public void frenar();
    int getNumeroDePlazas();
    int getVelocidadActual();
    void mostrarVelocidad();
}
