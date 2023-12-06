package portate;

public class Antipasti {
        public int prezzo;
        public String nomePiatto;
        public Antipasti(int prezzo,String nomePiatto) {
            this.prezzo = prezzo;
            this.nomePiatto = nomePiatto;
        }
        @Override
        public String toString() {
            return nomePiatto + " " + prezzo + " Є";
        }
    }

