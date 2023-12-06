package portate;

public class SecondiPiatti {


    //TODO i campi sono uguali per tutte le classi, quindi possiamo fare una classe padre, ovviamente
    //le classi figlio dovranno poi avere dei field aggiutivi ad esempio dessert avrà un campo percentualeZucchero
    public int prezzo;
    public String nomePiatto;
    public SecondiPiatti(int prezzo,String nomePiatto) {
        this.prezzo = prezzo;
        this.nomePiatto = nomePiatto;
    }


    //TODO siamo sicuri che serva un to string per stampare, dobbiamo stampare un menù quello nel tu string non la rappresetazione dell'oggetto ma è una stampa
    // quindi forse serve un metodo di stampa che magari inserisce anche degli spazi fissi
    @Override
    public String toString() {
        return nomePiatto + " " + prezzo + " Є";
    }
}

