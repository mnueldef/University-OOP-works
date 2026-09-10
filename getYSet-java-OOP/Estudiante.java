public class Estudiante {
    private String nombre;         //nadie lo modifica sin pasar por el set
    private int edad;              //debe estar entre 15 y 19
    private double promedio;       //debe estar entre 0.0 y 5.0
    private final String codigo;   //'final' se asigna una vez en el constructor, no tendra set

    public Estudiante(String codigo, String nombre, int edad) {
        this.codigo = codigo;
        setNombre(nombre);
        setEdad(edad);
        this.promedio = 0.0;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public double getPromedio(){
        return promedio;
    }

    public String getCodigo(){
        return codigo;
    }

    public boolean isAprobado(){
        return promedio >= 3.0;
    }

    public void setNombre(String nombre){
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        this.nombre= nombre.trim();
    }

    public void setEdad(int edad){
        if (edad < 15 || edad > 99)
            throw new IllegalArgumentException("Edad fuera de rango: " +edad);
        this.edad = edad;
    }

    public void setPromedio(double promedio){
        if (promedio <0.0 || promedio > 5.0) {
             throw new IllegalArgumentException("Promedio invlido: " + promedio);
        }  
        this.promedio = promedio;
    }

    @override 
    public String toString(){
        return codigo + " | " + nombre + " | " + edad + "anios | promedio " + promedio;

    }
}