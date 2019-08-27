package TPN4;

public class UsoCuenta {
    public static void main(String[] args) {
        CuentaCorriente Cuenta1 = new CuentaCorriente("Pablo",300);
        CuentaCorriente Cuenta2 = new CuentaCorriente("Cristina",500);
        Cuenta1.realizarTransferencia(200,Cuenta2,Cuenta1);
        Cuenta1.mostrarDatos();
        Cuenta2.mostrarDatos();
    }
}
