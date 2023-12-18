package portate;

public class SecondiPiatti extends Portate {


    //TODO i campi sono uguali per tutte le classi, quindi possiamo fare una classe padre,
    //TODO ovviamente le classi figlio dovranno poi avere dei field aggiuntivi ad esempio dessert avrà un campo percentualeZucchero
    public Boolean senzaGlutine;
    public Boolean senzaLattosio;

    public SecondiPiatti(Double prezzo, String nomePiatto, Boolean senzaGlutine, Boolean senzaLattosio) {
        super(prezzo, nomePiatto);
        this.senzaGlutine = senzaGlutine;
        this.senzaLattosio = senzaLattosio;
    }

    public Boolean getSenzaGlutine() {
        return senzaGlutine;
    }

    public void setSenzaGlutine(Boolean senzaGlutine) {
        this.senzaGlutine = senzaGlutine;
    }

    public Boolean getSenzaLattosio() {
        return senzaLattosio;
    }

    public void setSenzaLattosio(Boolean senzaLattosio) {
        this.senzaLattosio = senzaLattosio;
    }

    //TODO siamo sicuri che serva un to string per stampare, dobbiamo stampare un menù quello nel to string non la rappresentazione dell'oggetto ma è una stampa
    // quindi forse serve un metodo di stampa che magari inserisce anche degli spazi fissi
    @Override
    public String toString() {
        return getNomePiatto() + " " + getPrezzo() + " Є";
    }
}

