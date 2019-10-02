package TPN8;

import java.util.Scanner;

public class Auto implements Vehiculo {
    Scanner input = new Scanner(System.in);
    int velocidadActual ;

    public Auto(int velocidadInicial){
        //informar que supero la velocidad maxima
        this.velocidadActual=velocidadInicial;
        if(velocidadInicial>velocidadMaxima){
            System.out.println("Se ha superado la velocidad maxima!");
        }
    }

    @Override
    public void acelerar() {
        System.out.println("Ingrese la velocidad de aceleracion:");
        int incremento = input.nextInt();
        if(incremento>0) {
            velocidadActual += incremento;
            if (velocidadActual > velocidadMaxima) {
                System.out.println("Se ha superado la velocidad maxima!!!");
            }
        }else{
            System.out.println("La aceleracion debe ser mayor a 0!");
        }
        mostrarVelocidad();
    }

    public void frenar() {
        System.out.println("Ingrese la velocidad de frenado:");
        int decremento = input.nextInt();
        velocidadActual-=decremento;
        if(decremento>0) {
            if (velocidadActual < decremento) {
                System.out.println("Ya no es posible frenar mas");
                velocidadActual = 0;
            }
        }else{
            System.out.println("El decremento tiene que ser mayor a 0!");
        }
        mostrarVelocidad();
    }

    public int getVelocidadActual(){
        return velocidadActual;
    }

    @Override
    public void mostrarVelocidad() {
        System.out.println("La velocidad actual es de: "+getVelocidadActual()+" km/h");
    }

    @Override
    public int getNumeroDePlazas() {
        return 5;
    }

}
