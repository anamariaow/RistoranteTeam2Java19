package portate;

public class Contorni extends Portate{
    public boolean vegan;
    public boolean diStagione;
    public Contorni(double prezzo,String nomePiatto, boolean vegan, boolean diStagione) {
        super(prezzo, nomePiatto);
        this.vegan = vegan;
        this.diStagione = diStagione;
    }

    @Override
    public String toString() {
        return nomePiatto + " " + prezzo + " Є";
    }
}

