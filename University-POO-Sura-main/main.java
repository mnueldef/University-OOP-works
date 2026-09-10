public class main {
    public static void main(String[] args){
        //-- La misma persona en el dominio clinico 
        PacienteHospital pacienteClinico =
        new PacienteHospital("10239319","Ana ruiz","O+");

        pacienteClinico.registrarTemperatura(38.4);
        pacienteClinico.asignarMedicacion("acetaminofen 500mg");
        
        System.out.println(pacienteClinico.resumenClinico());

        //-- la misma persona en el dominio asegurador

        PacienteAseguradora pacienteAsegurado =
        new PacienteAseguradora("1234142141" , "Laura piedrahita", 19, "sura");
            pacienteAsegurado.registrarSiniestro();
            System.out.println(pacienteAsegurado.resumenPoliza());
        
    }

};

