package portate;

public class PrimiPiatti extends Portate {
    public boolean contieneLattosio;
    public boolean contieneGlutine;

    public PrimiPiatti(double prezzo, String nomePiatto, boolean contieneLattosio, boolean contieneGlutine) {
        super(prezzo, nomePiatto);
        this.contieneLattosio = contieneLattosio;
        this.contieneGlutine = contieneGlutine;
    }

    @Override
    public String toString() {
        return nomePiatto + " " + prezzo + " Є";
    }
}
