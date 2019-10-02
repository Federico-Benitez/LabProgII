package TPN8;

import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);

    public void manipularVehiculo(Vehiculo vehiculoElegido,int comportamientoElegido){
        switch (comportamientoElegido){
            case 1://frenar
                vehiculoElegido.frenar();
                break;
            case 2:
                vehiculoElegido.acelerar();
                break;
            case 3:
                System.out.println("La cantidad de plazas del vehiculo es de :"+vehiculoElegido.getNumeroDePlazas());
                break;
            default:
                break;
        }
    }

    public int elegirVehiculo(int cantidadVehiculos){
        mostrarString("-----------------------------------------");
        mostrarString("Cual vehiculo desea?");
        mostrarString("Ingrese del 1 al "+cantidadVehiculos);
        int vehiculoElegido = input.nextInt();
        if(vehiculoElegido<0 || vehiculoElegido>(cantidadVehiculos)){//controlar que no vaya afuera del rango
            mostrarString("El vehiculo elegido es erroneo!");
            return elegirVehiculo(cantidadVehiculos);
        }else{
            return (vehiculoElegido-1);
        }
    }

    public int getAccionVehiculo(){
        mostrarString("Ingrese 1 para FRENAR");
        mostrarString("Ingrese 2 para ACELERAR");
        mostrarString("Ingrese 3 para obtener el numero de plazas del vehiculo");
        mostrarString("Ingrese 4 para salir");
        int accionElegida = input.nextInt();
        return accionElegida;
    }

    public int elegirEntreAutoOmoto(){
        mostrarString("-----------------------------------------");
        mostrarString("Ingrese <1> para crear una moto");
        mostrarString("Ingrese <2> para crear un auto");
        int op =input.nextInt();
        if(op != 1 && op !=2){
            mostrarString("Tipo de Vehiculo no Valido!");
            return elegirEntreAutoOmoto();
        }
        return op;
    }


    public Vehiculo crearNuevoVehiculo(int opc){
        if (opc ==1){
            return new Moto(setVelocidadInicial());
        }else{
            return new Auto(setVelocidadInicial());
        }
    }

    public int setVelocidadInicial(){
        mostrarString("Ingrese velocidad inicial");
        int velocidad = input.nextInt();
        return velocidad;
    }

    public void listarVehiculos(Vehiculo[] array,int tamanio){
        for (int i = 0 ; i<tamanio;i++){
            mostrarString("----------------------------------------------------------");
            mostrarString("Vehiculo "+(i+1)+" Velocidad actual: "+ array[i].getVelocidadActual()+" km/h");
            mostrarString("----------------------------------------------------------");
        }
    }




    public static void mostrarString(String p){
        System.out.println(p);
    }


}
