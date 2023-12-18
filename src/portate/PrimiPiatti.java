package portate;

public class PrimiPiatti extends Portate {
    private Boolean contieneLattosio;
    private Boolean contieneGlutine;

    public PrimiPiatti(Double prezzo, String nomePiatto, Boolean contieneLattosio, Boolean contieneGlutine) {
        super(prezzo, nomePiatto);
        this.contieneLattosio = contieneLattosio;
        this.contieneGlutine = contieneGlutine;
    }

    public Boolean getContieneLattosio() {
        return contieneLattosio;
    }

    public void setContieneLattosio(Boolean contieneLattosio) {
        this.contieneLattosio = contieneLattosio;
    }

    public Boolean getContieneGlutine() {
        return contieneGlutine;
    }

    public void setContieneGlutine(Boolean contieneGlutine) {
        this.contieneGlutine = contieneGlutine;
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.println("lattosio "+ contieneLattosio+ " Glutine " +  contieneLattosio);
    }
}
