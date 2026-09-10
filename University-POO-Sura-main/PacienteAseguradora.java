public class PacienteAseguradora{

    private String documento;
    private String nombre;
    private int edad;
    private String poliza;
    private int siniestrosPrevios;

    public PacienteAseguradora(String documento, String nombre, int edad, String poliza){
        this.documento = documento;
        this.nombre = nombre;
        this.edad = edad;
        this.poliza = poliza;
    // un asegurado arranca sin siniestros previos
        this.siniestrosPrevios = 0;


    }

    public void registrarSiniestro(){
    this.siniestrosPrevios++ ;
    
    }
    
    
    public String nivelDeRiesgo(){
    if (edad > 65 || siniestrosPrevios >= 3){
    
        return "ALTO";
    
    }else if( edad >40 || siniestrosPrevios >= 1){
        return "MEDIO";
    }
    return "BAJO";
    }
    public String resumenPoliza(){
        return nombre + " | poliza "+ poliza
            + " | siniestros " + siniestrosPrevios
            + "| riesgo " + nivelDeRiesgo();    
    
    
    }
    
};

