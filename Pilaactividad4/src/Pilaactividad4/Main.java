package Pilaactividad4;

public class Main {
	public static void main(String[] args) {
        Pila<Integer> pila1 = new Pila<>(5);
        Pila<Integer> pila2 = new Pila<>(5);

        pila1.push(1);
        pila1.push(2);

        pila2.push(1);
        pila2.push(2);

        System.out.println("¿Las pilas son iguales? " + pila1.esIgual(pila2));  
        
        pila2.push(3);

        System.out.println("¿Las pilas son iguales? " + pila1.esIgual(pila2)); 
    }
}
