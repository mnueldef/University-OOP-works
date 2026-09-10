// ============================================================
// Main.java
// POO - Sesion 5: prueba de la clase Estudiante
// Ejecuta ESTE archivo (es el que tiene el metodo main).
// ============================================================

public class main {                         // El archivo debe llamarse Main.java

    public static void main(String[] args) {              // Punto de entrada del programa.

        // --- 1. Crear un objeto valido -----------------------------------
        Estudiante e1 = new Estudiante("TI-2026-001", "  Ana Gomez  ", 19);
        // Fijate en los espacios de "  Ana Gomez  ": el setter los recorta.

        System.out.println("Creado: " + e1);              // Usa toString() automaticamente.

        // --- 2. Leer con getters -----------------------------------------
        System.out.println("Nombre leido con getNombre(): [" + e1.getNombre() + "]");
        System.out.println("Codigo: " + e1.getCodigo());
        System.out.println("Aprobado por ahora: " + e1.isAprobado());  // false, el promedio arranca en 0.0

        // --- 3. Escribir con setters -------------------------------------
        e1.setPromedio(4.2);                              // Pasa la validacion sin problema.
        System.out.println("Tras setPromedio(4.2): " + e1);
        System.out.println("Aprobado ahora: " + e1.isAprobado());       // true

        // --- 4. Lo que el compilador NO permite --------------------------
        // e1.nombre = "Otro";            // ERROR: el atributo es private.
        // e1.promedio = 9.9;             // ERROR: por aqui se colaria un dato imposible.
        // e1.setCodigo("X");             // ERROR: ese metodo no existe, el codigo es de solo lectura.
        // Descomenta una linea en clase y muestra el error en pantalla.

        // --- 5. El setter defendiendo el objeto ---------------------------
        System.out.println("\n--- Pruebas de validacion ---");

        try {
            e1.setEdad(3);                                  // Fuera del rango 15-99.
        } catch (IllegalArgumentException ex) {             // Capturamos para que el programa no muera aqui.
            System.out.println("Rechazado: " + ex.getMessage());
        }

        try {
            e1.setPromedio(7.5);                             // Fuera de la escala 0.0-5.0.
        } catch (IllegalArgumentException ex) {
            System.out.println("Rechazado: " + ex.getMessage());
        }

        try {
            e1.setNombre("   ");                             // Solo espacios en blanco.
        } catch (IllegalArgumentException ex) {
            System.out.println("Rechazado: " + ex.getMessage());
        }

        // --- 6. El objeto sigue intacto ----------------------------------
        System.out.println("\nEstado final (nada se corrompio): " + e1);
    }
}