package portate;

public class PrimiPiatti {
    public int prezzo;
    public String nomePiatto;
    public PrimiPiatti(int prezzo,String nomePiatto) {
        this.prezzo = prezzo;
        this.nomePiatto = nomePiatto;
    }
    @Override
    public String toString() {
        return nomePiatto + " " + prezzo + " Є";
    }
}
