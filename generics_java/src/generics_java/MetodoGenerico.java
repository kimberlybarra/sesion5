package generics_java;

public class MetodoGenerico {
	
    public static <E> void imprimirArreglo(E[] arregloEntrada) {
        for (E elemento : arregloEntrada) {
            System.out.printf("%s ", elemento);
        }
        System.out.println();
    }
    
    public static <E> int imprimirArreglo(E[] arregloEntrada, int subindiceInferior, int subindiceSuperior) throws InvalidSubscriptException {
    	if (subindiceInferior < 0 || subindiceSuperior >= arregloEntrada.length || subindiceInferior >= subindiceSuperior) {
            throw new InvalidSubscriptException("los subindices son invalidos");
        }
        for (int i = subindiceInferior; i <= subindiceSuperior; i++) {
            System.out.printf("%s ", arregloEntrada[i]);
        }
        System.out.println(); 
        return subindiceSuperior - subindiceInferior + 1;
    }
    public static void main(String[] args) {
        Integer[] arregloInteger = {1, 2, 3, 4, 5, 6};
        Double[] arregloDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] arregloCharacter = {'H', 'O', 'L', 'A'};

        System.out.println("El arreglo arregloInteger contiene:");
        imprimirArreglo(arregloInteger); 

        System.out.println("\nEl arreglo arregloDouble contiene:");
        imprimirArreglo(arregloDouble); 

        System.out.println("\nEl arreglo arregloCharacter contiene:");
        imprimirArreglo(arregloCharacter); 

        try {
            System.out.println("\nImpresión parcial de arregloInteger índices 1 a ):");
            int elementosImpresos = imprimirArreglo(arregloInteger, 1, 4);
            System.out.printf("Se imprimieron %d elementos.%n", elementosImpresos);
        } catch (InvalidSubscriptException e) {
        	/*
        	 * System.err es la salida de errores en eclipse se manda en rojo      
        	 */
            System.err.println(e.getMessage());
        }

        try {
            System.out.println("\nImpresión parcial de arregloDouble índices 2 a 5:");
            int elementosImpresos = imprimirArreglo(arregloDouble, 2, 5);
            System.out.printf("Se imprimieron %d elementos.%n", elementosImpresos);
        } catch (InvalidSubscriptException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println("\nIntento de impresión con índices inválidos en arregloCharacter índices 2 a 1:");
            imprimirArreglo(arregloCharacter, 2, 1); 
        } catch (InvalidSubscriptException e) {
            System.err.println(e.getMessage());
        }
    }   
}

class InvalidSubscriptException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidSubscriptException(String mensaje) {
        super(mensaje);
	}
}