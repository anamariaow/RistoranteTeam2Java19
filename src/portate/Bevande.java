package portate;

public class Bevande extends Portate {
    public boolean bevandaAlcolica;
    public boolean frizzante;
    public Bevande(double prezzo,String nomePiatto, boolean bevandaAlcolica, boolean frizzante) {
        super(prezzo,nomePiatto);
        this.bevandaAlcolica = bevandaAlcolica;
        this.frizzante = frizzante;
    }

        @Override
        public String toString() {
            return nomePiatto + " " + prezzo + " Є";
        }
    }