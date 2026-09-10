import java.util.ArrayList;

class producto {
    private String codigo;
    private String nombre;
    private int cantidad;
    private float precio;

    public producto(String codigo, String nombre, int cantidad, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public void mostrarInventario() {

        System.out.println("Name: " + nombre + " | Quantity: " + cantidad + " | Code: " + codigo + " | Price: $" + precio + " |  ");
        System.out.println();

    }

};

public class cafeteria {
    public static void main(String[] args) {
        ArrayList<producto> inventario = new ArrayList<>();

        inventario.add(new producto("1292932", "Capuchino", 1, 5000f));
        inventario.add(new producto("1414322", "coffe with milk", 3, 3000f));
        inventario.add(new producto("124142342", "american coffe", 5, 1500f));
        inventario.add(new producto("1585858", "Mocca Latte", 2, 5500f));
        inventario.add(new producto("122606586", "Milo", 0, 4000f));

        for (producto e : inventario) {
            e.mostrarInventario();
        }
    }
}