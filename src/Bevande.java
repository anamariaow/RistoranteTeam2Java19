public class Bevande {
    public int prezzo;
    public String nomePiatto;
    public Bevande(int prezzo,String nomePiatto) {
        this.prezzo = prezzo;
        this.nomePiatto = nomePiatto;
    }

        @Override
        public String toString() {
            return nomePiatto + " " + prezzo + " Є";
        }
    }