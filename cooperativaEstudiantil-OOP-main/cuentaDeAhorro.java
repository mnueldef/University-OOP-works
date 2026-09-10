public class cuentaDEAhorro{
    private String titular ;
    private double saldo ;
    private String numeroCuenta;


    public cuentaDeAhorro(String titular, String numeroCuenta){
        this.titular = titular;
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
        if(this.saldo>monto && monto > 0){
            System.out.println("retiro exitoso: " + monto);
            this.saldo -= monto;
            return true;
        }else if(this.saldo< monto){
            System.out.println("saldo insuficiente");
            return false;
        }else if(monto<0){
            System.out.println("el monto a retirar no puede ser menor a 0");
            return false;
        }

    }
    public double consultarSaldo(){
        return saldo;

    }
    public String getTitular(){
        return titular;

    }

}