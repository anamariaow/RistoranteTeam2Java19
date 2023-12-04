public class Contorni {
    public int prezzo;
    public String nomePiatto;
    public Contorni(int prezzo,String nomePiatto) {
        this.prezzo = prezzo;
        this.nomePiatto = nomePiatto;
    }

    @Override
    public String toString() {
        return nomePiatto + " " + prezzo + " Є";
    }
}

