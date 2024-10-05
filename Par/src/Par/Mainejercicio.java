package Par;

public class Mainejercicio {
	public static void main(String[] args) {
        Contenedor<String, Integer> contenedor1 = new Contenedor<>();

        contenedor1.agregarPar("Uno", 1);
        contenedor1.agregarPar("Dos", 2);
        contenedor1.agregarPar("Tres", 3);

        System.out.println("Pares en contenedor1:");
        contenedor1.mostrarPares();

        System.out.println("\nObteniendo el par en el índice 1:");
        Par<String, Integer> parObtenido = contenedor1.obtenerPar(1);
        System.out.println(parObtenido);

        Contenedor<Double, Boolean> contenedor2 = new Contenedor<>();
        contenedor2.agregarPar(1.1, true);
        contenedor2.agregarPar(2.2, false);

        System.out.println("\nPares en contenedor2:");
        contenedor2.mostrarPares();
    }
}
