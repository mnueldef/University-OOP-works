public class main{

    public static void main(String[] args){
        cuentaAhorro cliente = new cuentaAhorro("laura piedrahita","91293572033");
        
        cliente.consultarSaldo();
        cliente.consignar(50000);
        cliente.retirar(80000);
        cliente.retirar(20000);
        cliente.consultarSaldo();

        /**cliente.saldo = 100000;
         el error que sale es por que el atributo esta en private 
        Si el atributo saldo fuera public el cliente.saldo podria entrar a ella sin problema
        -------¿Qué pasaría si el atributo saldo fuera public?----
        R:/ se podria modificar desde el main directamente, sin pasar por el metodo de consginar
        -------¿Por qué la validación del retiro se escribe dentro de la clase CuentaAhorro y no en el main?------
        R:/ por que desde la clase cuentaAhorro se tiene el permiso de restarle dinero a la cuenta. tambien para tenerlo mas organizado todo 
        
        */

    }
}