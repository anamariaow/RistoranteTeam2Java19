package portate;

public class PrimiPiatti {
    public boolean contieneLattosio;
    public boolean contieneGlutine;
    public double prezzo;
    public String nomePiatto;

    public PrimiPiatti(int prezzo, String nomePiatto, boolean contieneLattosio, boolean contieneGlutine) {
        this.prezzo = prezzo;
        this.nomePiatto = nomePiatto;
        this.contieneLattosio = contieneLattosio;
        this.contieneGlutine = contieneGlutine;
    }

    @Override
    public String toString() {
        return nomePiatto + " " + prezzo + " Є";
    }
}
