public class PacienteHospital {
    

    private String documento ;
    private String nombre;
    private String grupoSanguineo;
    private double temperatura;
    private String medicacionActiva;
 /**
  * constructor: se ejecuto al crear el objeto con la palabra new
  *   
    @param documento
    @param nombre
    @param grupoSanguineo
    
 */   

    public PacienteHospital(String documento, String nombre, String grupoSanguineo){
    this.documento = documento;
    this.nombre = nombre;
    this.grupoSanguineo = grupoSanguineo;



    this.temperatura = 36.5;
    this.medicacionActiva = "ninguna";
    }

    public void registrarTemperatura(double valor) {
        if(valor >= 30.0 && valor <= 45.0 ){
            this.temperatura = valor;
        }else {
            System.out.println("temperatura fuera de rango clinico: " + valor);
        }

    }

    public void asignarMedicacion(String medicamento ){
        this.medicacionActiva = medicamento;
    }
    public boolean tieneFiebre(){
        return this.temperatura >= 38.0;

    }
    public String resumenClinico(){
        return nombre + "| grupo "+ grupoSanguineo
        + "| temp " + temperatura
        + "| medicacion: " + medicacionActiva
        + " | fiebre: " + tieneFiebre();
    }
}
