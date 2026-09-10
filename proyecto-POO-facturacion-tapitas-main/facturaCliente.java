public class facturaCliente {
    // se crea el arreglo  para guardar los productos
    private Producto[] factura;
    public facturaCliente(Producto[] factura) {
        this.factura = factura;
    }
    // metodo para calcular el total 
    public double total() {
        double totalPagar = 0;
        // if != null para evitar errores si el arreglo no esta lleno 
        if (factura != null) {
            for (Producto p : factura) {
                totalPagar += p.precio * p.cantidad;
            }
        }
        return totalPagar;
    }

    public void imprimirFactura() {
        if (factura != null) {
            for (Producto p : factura) {
                System.out.println(p.nombre + " | Precio: $" + p.precio + " | Cantidad: " + p.cantidad);
            }
        }
        System.out.println("TOTAL A PAGAR: $" + total());
    }
}