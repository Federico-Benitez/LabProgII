package TPN8;

import java.util.Scanner;

public class Moto implements Vehiculo {
    int velocidadActual;
    Scanner input = new Scanner(System.in);


    public Moto(int velocidadInicial){
        //informar que supero la velocidad maxima
        this.velocidadActual= velocidadInicial;
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
                System.out.println("Se ha superado la velocidad maxima!!!!");
            }
        }else{
            System.out.println("La aceleracion debe ser mayor a 0!");
        }
        mostrarVelocidad();
    }

    public void frenar() {
        System.out.println("Ingrese velocidad de frenado para rueda delantera");
        System.out.println("Si ingresa un valor negativo, la velocidad de frenado sera 0");
        int velFrenoDelantero = input.nextInt();
        System.out.println("Ingrese velocidad de frenado para rueda trasera");
        System.out.println("Si ingresa un valor negativo, la velocidad de frenado sera 0");
        int velFrenoTrasero = input.nextInt();

        if(velFrenoDelantero<0) velFrenoDelantero =0;
        if(velFrenoTrasero<0) velFrenoTrasero=0;

        if ((velFrenoDelantero>velFrenoTrasero)&& (velFrenoDelantero > velocidadActual || velFrenoTrasero < velocidadActual)){
            System.out.println("Frenó demasiado fuerte!! Usted choco!");
            velocidadActual=0;
        }else{
            if (velFrenoDelantero>velFrenoTrasero){
                velocidadActual-=velFrenoDelantero;
            }else{
                velocidadActual-=velFrenoTrasero;
            }
            if(velocidadActual<0){
                System.out.println("Ya no es posible frenar mas");
                velocidadActual=0;
            }
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
        return 2;
    }
}
