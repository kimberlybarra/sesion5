package Pila;

public class Pila<E> {
    private final int tamanio; 
    private int superior;      
    private E[] elementos;  

    public Pila() {
        this(10); 
    }

    public Pila(int s) {
        tamanio = s > 0 ? s : 10; 
        superior = -1;             
        elementos = (E[]) new Object[tamanio]; 
    }

    public void push(E valorAMeter) {
        if (superior == tamanio - 1) { 
            throw new ExcepcionPilaLlena(String.format(
                "La Pila está llena, no se puede meter %s", valorAMeter));
        }
        elementos[++superior] = valorAMeter; 
    }

    public E pop() {
        if (superior == -1) { 
            throw new ExcepcionPilaVacia("Pila vacía, no se puede sacar");
        }
        return elementos[superior--]; 
    }

    public boolean contains(E elemento) {
        for (int i = superior; i >= 0; i--) { 
            if (elementos[i].equals(elemento)) {
                return true; 
            }
        }
        return false; 
    }

    public void mostrarPila() {
        if (superior == -1) {
            System.out.println("Pila vacía.");
        } else {
            System.out.println("Elementos en la pila:");
            for (int i = 0; i <= superior; i++) {
                System.out.printf("%s ", elementos[i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>(5); 
        pila.push(1);
        pila.push(3);
        pila.push(5);
        pila.push(7);
        pila.push(9);

        pila.mostrarPila(); 

        System.out.println("¿Contiene 3?: " + pila.contains(3)); 
        System.out.println("¿Contiene 10?: " + pila.contains(10)); 
    }
}

class ExcepcionPilaLlena extends RuntimeException {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public ExcepcionPilaLlena(String mensaje) {
     super(mensaje);
 }
}

class ExcepcionPilaVacia extends RuntimeException {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public ExcepcionPilaVacia(String mensaje) {
     super(mensaje);
 }
}
