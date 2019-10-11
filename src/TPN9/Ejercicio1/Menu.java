package TPN9.Ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);

    public void mostrarMensajeCuantosElementosArray(){
        mostrarString("Cuantos numeros desea cargar?");
    }

    public void elegirEntreNaturalComplejo(){
        mostrarString("1-- Si desea cargar un numero Natural");
        mostrarString("2-- Si desea cargar un numero Complejo");
    }

    public int cargarArray(){
        elegirEntreNaturalComplejo();
        int opcion = input.nextInt();
        if(opcion!=1 && opcion!=2){
            mostrarString("Opcion no valida");
            return cargarArray();
        }
        return opcion;
    }

    public Naturales crearNuevoNumeroNatural(){
        mostrarString("Ingrese el valor del numero");
        double valor = input.nextDouble();
        return new Naturales(valor);
    }

    public Complejos crearNuevoNumeroComplejo(){
        mostrarString("Ingrese el valor de A");
        double a = input.nextDouble();
        mostrarString("Ingrese el valor de B");
        double b = input.nextDouble();
        return new Complejos(a,b);
    }

    public void sumaTotalNaturales(Numeros[] array){
        double total=0;
        for (int i = 0; i<array.length; i++){
            if(array[i] instanceof Naturales){
                Naturales numero = (Naturales) array[i];
                total+=numero.getValorNumerico();
            }
        }
        mostrarString("La suma de todos los numeros naturales es de : "+total);
    }

    public void sumaTotalComplejos(Numeros[] array){
        double totalA=0,totalB=0;
        for(int i = 0; i<array.length;i++){
            if (array[i] instanceof Complejos){
                Complejos numero = (Complejos) array[i];
                totalA+=numero.getValorA();
                totalB+=numero.getValorB();
            }
        }
        mostrarString("La suma total de todos los numeros Complejos es de : "+totalA+" , "+totalB+"i");
    }

    public void listarNaturalesOrdenados(Numeros[] array){
        //Darle longitud al array con numeros naturales
        int sizeArrayNaturales=0;
        for (int i=0;i<array.length;i++){
            if (array[i] instanceof Naturales){
                sizeArrayNaturales++;
            }
        }
        double[] arrayConNumerosNaturales = new double[sizeArrayNaturales];
        int x=0; //para las posiciones del segundo array
        for (int i=0;i<array.length;i++){
            if (array[i] instanceof Naturales){
                mostrarString("Entro");
                Naturales numero= (Naturales) array[i];
                arrayConNumerosNaturales[x]=numero.getValorNumerico();
                x++;
            }
        }
        mostrarString("Numeros Naturales Ordenados");
        Arrays.sort(arrayConNumerosNaturales);
        for (int i=0;i<x;i++){
            System.out.print(arrayConNumerosNaturales[i]+" , ");
        }
        mostrarString("");
    }

    public void listadoNumerosComplejos(Numeros[] array){
        mostrarString("Listado de Numeros Complejos");
        for (int i=0;i<array.length;i++){
            if (array[i] instanceof Complejos){
                Complejos numero =(Complejos) array[i];
                mostrarString(numero.getValorA()+","+numero.getValorB()+"i");
            }
        }
    }


    public int mostrarOpciones(){
        mostrarString("1--Desea sumar todos los numeros naturales?");
        mostrarString("2--Desea sumar todos los numeros complejos?");
        mostrarString("3--Desea realizar un listado de numeros naturales ordenados de forma creciente?");
        mostrarString("4--Desea realizar un listado de los numeros complejos?");
        mostrarString("5--Para salir");
        int opcion = input.nextInt();
        return opcion;
    }

    static void mostrarString(String p){
        System.out.println(p);
    }
}
