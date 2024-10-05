package Par;

public class Main {
    public static <F, S> void imprimirPar(Par<F, S> par) {
        System.out.println(par.toString());
    }

    public static void main(String[] args) {
        Par<String, Integer> par1 = new Par<>("Kim", 122);
        Par<Double, Boolean> par2 = new Par<>(3.1416, true);
        Par<Persona, Integer> par3 = new Par<>(new Persona("Kimberly",20), 57);

        System.out.println("Par: String, Entero>:");
        imprimirPar(par1); 

        System.out.println("\nPar<Double, Boolean>:");
        imprimirPar(par2); 

        System.out.println("\nPar: Persona, Entero:");
        imprimirPar(par3); 
    }
}
