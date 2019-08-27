package TPN4;

public class CuentaCorriente {
    private String nombreTitular;
    private double saldo;
    private long numeroCuenta;

    //Constructor
    public CuentaCorriente(String nombreTitular, double saldo){
        this.setNumeroCuenta((long)(Math.random()*1000));
        this.setSaldo(saldo);
        this.setNombreTitular(nombreTitular);
    }

    //Getters y Setters
    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    //Metodos
    public void ingresarDinero(double amount){
        if (amount>0){
            setSaldo(getSaldo()+amount);
        }
    }

    public void realizarReintegro(double amount){
        ingresarDinero(amount);
    }

    public void mostrarDatos(){
        System.out.println("Numero de cuenta: "+getNumeroCuenta());
        System.out.println("Nombre de cliente: "+getNombreTitular());
        System.out.println("Saldo : $"+getSaldo());
    }

    public double obtenerSaldo(){
        return(getSaldo());//devuelve el valor del saldo
    }

    public void realizarTransferencia(double amount, CuentaCorriente destinatario, CuentaCorriente emisor){
        if (emisor.getSaldo()>amount){//Si la cuenta que envia el dinero tiene saldo suficiente
            emisor.saldo-=amount;
            destinatario.ingresarDinero(amount);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
}
