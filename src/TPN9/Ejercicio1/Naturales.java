package TPN9.Ejercicio1;

public class Naturales implements Numeros {

    private double valor;

    public Naturales(double valor) {
        this.setValor(valor);
    }


    @Override
    public Numeros sumar(Numeros a, Numeros b) {
        Naturales aNatural = (Naturales)a;
        Naturales bNatural = (Naturales)b;
        Naturales resultado = new Naturales(aNatural.getValor()+bNatural.getValor());
        return resultado;
    }

    @Override
    public Numeros restar(Numeros a, Numeros b) {
        Naturales aNatural = (Naturales)a;
        Naturales bNatural = (Naturales)b;
        Naturales resultado = new Naturales(aNatural.getValor()-bNatural.getValor());
        return resultado;
    }

    @Override
    public Numeros multiplicar(Numeros a, Numeros b) {
        Naturales aNatural = (Naturales)a;
        Naturales bNatural = (Naturales)b;
        Naturales resultado = new Naturales(aNatural.getValor()*bNatural.getValor());
        return resultado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
