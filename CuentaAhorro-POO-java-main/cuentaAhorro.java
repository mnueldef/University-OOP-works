public class cuentaAhorro{
    private String nombreDueño ;
    private double saldo ;
    private String numeroCuenta;


    public cuentaAhorro(String nombreDueño, String numeroCuenta){
        this.nombreDueño = nombreDueño;
        this.saldo = 0;
        this.numeroCuenta =numeroCuenta;
    }
    public void consignar(double monto){
        if(monto <= 0){
            System.out.println("Rechazado: no es posible consignar valores MENORES o IGUALES a 0");
        }else{
            System.out.println("Transferencia exitosa: " + monto);
            this.saldo += monto;
        }


    }
    public boolean retirar(double monto){
        if(this.saldo>monto){
            System.out.println("retiro exitoso: " + monto);
            this.saldo -= monto;
            return true;
        }else {
            System.out.println("saldo insuficiente");
            return false;
        }

    }
    public double consultarSaldo(){
        return saldo;

    }
    public String getTitular(){
        return nombreDueño;

    }

}