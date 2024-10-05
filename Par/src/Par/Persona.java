package Par;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s, edad: %d", nombre, edad);
    }
}

