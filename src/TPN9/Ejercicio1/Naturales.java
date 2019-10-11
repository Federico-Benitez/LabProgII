package TPN9.Ejercicio1;

public class Naturales implements Numeros {
    String tipo = "Natural";
    private double valor;

    public Naturales(double valor) {
        this.setValor(valor);
    }


    @Override
    public Numeros sumar(Numeros a, Numeros b) {
        Naturales aNatural = (Naturales)a;
        Naturales bNatural = (Naturales)b;
        Naturales resultado = new Naturales(aNatural.getValorNumerico()+bNatural.getValorNumerico());
        return resultado;
    }

    @Override
    public Numeros restar(Numeros a, Numeros b) {
        Naturales aNatural = (Naturales)a;
        Naturales bNatural = (Naturales)b;
        Naturales resultado = new Naturales(aNatural.getValorNumerico()-bNatural.getValorNumerico());
        return resultado;
    }

    @Override
    public void getValue() {
        System.out.println(this.valor);
    }

    @Override
    public Numeros multiplicar(Numeros a, Numeros b) {
        Naturales aNatural = (Naturales)a;
        Naturales bNatural = (Naturales)b;
        Naturales resultado = new Naturales(aNatural.getValorNumerico()*bNatural.getValorNumerico());
        return resultado;
    }

    public double getValorNumerico() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
