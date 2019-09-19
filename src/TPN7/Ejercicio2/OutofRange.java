package TPN7.Ejercicio2;

class OutofRange extends Exception{

    public OutofRange(){

    }
    public OutofRange(String mensajeError){
        super(mensajeError);
    }
}
