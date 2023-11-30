public class SecondiPiatti {
    public int prezzo;
    public String nomePiatto;
    public SecondiPiatti(int prezzo,String nomePiatto) {
        this.prezzo = prezzo;
        this.nomePiatto = nomePiatto;
    }
    @Override
    public String toString() {
        return nomePiatto + " " + prezzo + " Є";
    }
}

