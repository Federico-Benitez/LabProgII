package TPN8;

public class Main {

    public static void main(String[] args) {
        int sizeArray = 3;
        Vehiculo[] array = new Vehiculo[sizeArray];
        Menu menu = new Menu();

        for (int i=0;i<sizeArray;i++) {
            int vehiculoElegido = menu.elegirEntreAutoOmoto();
            array[i] = menu.crearNuevoVehiculo(vehiculoElegido);
        }

        //realizar acciones
        do{
            menu.listarVehiculos(array,sizeArray);
            int vehiculoAccion = menu.getAccionVehiculo();
            if(vehiculoAccion==4){break;}
            int vehiculoChoosed = menu.elegirVehiculo(sizeArray);
            System.out.println("-----------------------------------------");
            menu.manipularVehiculo(array[vehiculoChoosed],vehiculoAccion);
            System.out.println("-----------------------------------------");
        }while (true);
    }
}


