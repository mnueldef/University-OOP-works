import java.util.ArrayList;

class Estudiante {
    private String nombre;
    private int edad;
    private float nota;

    public Estudiante(String nombre, int edad, float nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    public void mostrar() {
        System.out.println(nombre + " | " + edad + " años | nota: " + nota);
    }

    public boolean aprobo() {
        return nota >= 3.0f;
    }

    public float getNota() {
        return nota;
    }

    public String getNombre() {
        return nombre;
    }

}

public class EstudiantesOOP {

    public static void main(String[] args) {

        ArrayList<Estudiante> curso = new ArrayList<>();

        curso.add(new Estudiante("Laura Florez", 20,  4.2f));
        curso.add(new Estudiante("Manuel Fernandez",  22,  2.8f));
        curso.add(new Estudiante("Juan zapata", 20,  3.7f));
        

        System.out.println("==========listado del curso===========");

        for(Estudiante e : curso){
            e.mostrar();
        }
        float suma = 0f;

        for (Estudiante e: curso){
            suma= suma + e.getNota();
    }
    System.out.println("promedio del curso: " + (suma/curso.size()));

    System.out.println("-------------aprobados (nota >= 3.0)-------------");

    for(Estudiante e : curso ){
        if (e.aprobo()){
            System.out.println(e.getNombre() + " con " + e.getNota());
        }

    }
}
}
