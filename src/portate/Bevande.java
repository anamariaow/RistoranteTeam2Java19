package portate;

public class Bevande {
    public double prezzo;
    public String nomePiatto;
    public boolean bevandaAlcolica;
    public boolean frizzante;
    public Bevande(double prezzo,String nomePiatto, boolean bevandaAlcolica, boolean frizzante) {
        this.prezzo = prezzo;
        this.nomePiatto = nomePiatto;
        this.bevandaAlcolica = bevandaAlcolica;
        this.frizzante = frizzante;
    }

        @Override
        public String toString() {
            return nomePiatto + " " + prezzo + " Є";
        }
    }