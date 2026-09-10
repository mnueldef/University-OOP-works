class Producto {
    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
}

public class main {
    public static void main(String[] args) {
        // Crear cliente
        clientetapitas cliente = new clientetapitas(
            "12345678", "Juan Pérez", "555-1234", 
            900123, "Calle 10 #20-30", "Medellín", "credito"
        );
        // imprimir los datos del cliente
        System.out.println("------------------------ DATOS DEL CLIENTE ----------------------------"); 
        System.out.println(cliente.ImprimirCliente());
        System.out.println();

        // productos factura
        Producto[] factura = new Producto[3];
        factura[0] = new Producto("Tapitas rojas", 6000, 3);
        factura[1] = new Producto("Tapitas Verdes", 2500, 2);
        factura[2] = new Producto("Tapitas azules", 5000, 1);

        // imprimir y crear factura
        System.out.println("--- DETALLE DE FACTURA ---");
        facturaCliente miFactura = new facturaCliente(factura);
        miFactura.imprimirFactura();
    }
}