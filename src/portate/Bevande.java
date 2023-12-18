package portate;

public class Bevande extends Portate {
    private Boolean bevandaAlcolica;
    private Boolean frizzante;
    public Bevande(Double prezzo,String nomePiatto, Boolean bevandaAlcolica, Boolean frizzante) {
        super(prezzo,nomePiatto);
        this.bevandaAlcolica = bevandaAlcolica;
        this.frizzante = frizzante;
    }
    //TODO spostare toString nella classe Portate
    public Boolean getBevandaAlcolica() {
        return bevandaAlcolica;
    }

    public void setBevandaAlcolica(Boolean bevandaAlcolica) {
        this.bevandaAlcolica = bevandaAlcolica;
    }

    public Boolean getFrizzante() {
        return frizzante;
    }

    public void setFrizzante(Boolean frizzante) {
        this.frizzante = frizzante;
    }
        @Override
        public String toString() {
            return getNomePiatto() + " " + getNomePiatto() + " Є";
        }
    }