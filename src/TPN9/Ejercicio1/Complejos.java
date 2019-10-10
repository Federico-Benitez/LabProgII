package TPN9.Ejercicio1;

public class Complejos implements Numeros {
    private double valorA,valorB;



    public Complejos(double valorA, double valorB) {
        this.valorA = valorA; //el valor real
        this.valorB = valorB; //la componente imaginaria
    }

    public Complejos() {

    }

    @Override
    public Numeros sumar(Numeros a, Numeros b) {
        //Downcasting
        Complejos aComplejo = (Complejos)a;
        Complejos bComplejo = (Complejos)b;
        Complejos resultado = new Complejos(aComplejo.getValorA() + bComplejo.getValorA(),
                aComplejo.getValorB() + bComplejo.getValorB());
        return resultado;
    }

    @Override
    public Numeros restar(Numeros a, Numeros b) {
        //Downcasting
        Complejos aComplejo = (Complejos)a;
        Complejos bComplejo = (Complejos)b;

        Complejos resultado = new Complejos(aComplejo.getValorA() - bComplejo.getValorA(),
                aComplejo.getValorB() - bComplejo.getValorB());
        return resultado;
    }

    @Override
    public Numeros multiplicar(Numeros a, Numeros b) {
        //Downcasting
        Complejos aComplejo = (Complejos)a;
        Complejos bComplejo = (Complejos)b;

        Complejos resultado = new Complejos(aComplejo.getValorA() * bComplejo.getValorA(),
                aComplejo.getValorB() * bComplejo.getValorB());
        return resultado;
    }


    public double getValorA() {
        return valorA;
    }

    public double getValorB() {
        return valorB;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public void setValorB(double valorB) {
        this.valorB = valorB;
    }
}
