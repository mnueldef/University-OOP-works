public class clientetapitas {
    private String documentoCliente;
    private String nombreCliente;
    private String telefonoCliente;
    private int nitCLiente;
    private String direccionCliente;
    private String ciudadCliente;
    private String metodoDePagoCliente;
    private int diasCreditoCliente;
    private double recargoPorCreditoCliente;

    // constructor
    public clientetapitas(String documentoCliente, String nombreCliente, String telefonoCliente, 
                          int nitCLiente, String direccionCliente, String ciudadCliente, String metodoDePago) {
        this.documentoCliente = documentoCliente;
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
        this.nitCLiente = nitCLiente;
        this.direccionCliente = direccionCliente;
        this.ciudadCliente = ciudadCliente;
        this.metodoDePagoCliente = metodoDePago;
        
        metodoDePago(3);
    }

    public void metodoDePago(int dias) {
        // .equals() para comparar texto ya que si usamos = no deja commprar stings, entonces usamos este metodo 
        if ("transferencia".equalsIgnoreCase(this.metodoDePagoCliente) || "efectivo".equalsIgnoreCase(this.metodoDePagoCliente)) {
            this.diasCreditoCliente = dias;
            this.recargoPorCreditoCliente = 0.0;
        } else if ("credito".equalsIgnoreCase(this.metodoDePagoCliente)) {
            configurarIva(dias);
        }
    }

    public void configurarIva(int dias) {
        this.diasCreditoCliente = dias;
        this.recargoPorCreditoCliente = 0.01 * dias;
    }

    public String ImprimirCliente() {
        return nombreCliente + "   |   "+
               " Documento: " + documentoCliente + "   |   " +
               " Telefono: " + telefonoCliente + "\n" +
               "_________________________________________________________________________________"+ "\n" +
               " Nit: " + nitCLiente + "   |   " +
               " Direccion: " + direccionCliente + "   |   " +
               " Ciudad: " + ciudadCliente + "\n" +
               "--------------------------------------------------------------------------------------";
    }
}