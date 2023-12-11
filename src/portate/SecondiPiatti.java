package portate;

public class SecondiPiatti extends Portate {


    //TODO i campi sono uguali per tutte le classi, quindi possiamo fare una classe padre, ovviamente
    //le classi figlio dovranno poi avere dei field aggiutivi ad esempio dessert avrà un campo percentualeZucchero
    public boolean senzaGlutine;
    public boolean senzaLattosio;

    public SecondiPiatti(double prezzo, String nomePiatto, boolean senzaGlutine, boolean senzaLattosio) {
        super(prezzo, nomePiatto);
        this.senzaGlutine = senzaGlutine;
        this.senzaLattosio = senzaLattosio;
    }


    //TODO siamo sicuri che serva un to string per stampare, dobbiamo stampare un menù quello nel tu string non la rappresetazione dell'oggetto ma è una stampa
    // quindi forse serve un metodo di stampa che magari inserisce anche degli spazi fissi
    @Override
    public String toString() {
        return nomePiatto + " " + prezzo + " Є";
    }
}

