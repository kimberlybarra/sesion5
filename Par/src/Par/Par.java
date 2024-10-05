package Par;

public class Par<F, S> {
	private F primero; 
    private S segundo; 

    public Par(F primero, S segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public F getPrimero() {
        return primero;
    }

    public void setPrimero(F primero) {
        this.primero = primero;
    }

    public S getSegundo() {
        return segundo;
    }

    public void setSegundo(S segundo) {
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return String.format("(Primero: %s, Segundo: %s)", primero, segundo);
    }
    
    public boolean esIgual(Par<F, S> otroPar) {
        if (this == otroPar) {
            return true; 
        }
        if (otroPar == null) {
            return false; 
        }
        return (this.primero.equals(otroPar.getPrimero()) && this.segundo.equals(otroPar.getSegundo()));
    }
}
