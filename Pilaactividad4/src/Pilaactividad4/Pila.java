package Pilaactividad4;

import java.util.Stack;

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
            throw new IllegalStateException("La Pila está llena");
        }
        elementos[++superior] = valorAMeter; 
    }

    public E pop() {
        if (superior == -1) { 
            throw new IllegalStateException("Pila vacia no se puede eliminar");
        }
        return elementos[superior--]; 
    }

    public int size() {
        return superior + 1;
    }

    public E peek() {
        if (superior == -1) { 
            throw new IllegalStateException("La pila esta vacia, no se puede ver el tope");
        }
        return elementos[superior];
    }

    public boolean esIgual(Pila<E> otraPila) {
        if (this.size() != otraPila.size()) {
            return false;
        }

        Stack<E> tempStack1 = new Stack<>();
        Stack<E> tempStack2 = new Stack<>();

        for (int i = 0; i <= this.superior; i++) {
            E elemento1 = this.elementos[i];
            E elemento2 = otraPila.elementos[i];

            if (!elemento1.equals(elemento2)) {
                return false;
            }

            tempStack1.push(elemento1);
            tempStack2.push(elemento2);
        }
        return true;
    }
}
