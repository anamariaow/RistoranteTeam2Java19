package portate;

public class Contorni extends Portate {
    public Boolean vegan;
    public Boolean diStagione;

    public Contorni(Double prezzo, String nomePiatto, Boolean vegan, Boolean diStagione) {
        super(prezzo, nomePiatto);
        this.vegan = vegan;
        this.diStagione = diStagione;
    }

    public Boolean getVegan() {
        return vegan;
    }

    public void setVegan(Boolean vegan) {
        this.vegan = vegan;
    }

    public Boolean getDiStagione() {
        return diStagione;
    }

    public void setDiStagione(Boolean diStagione) {
        this.diStagione = diStagione;
    }

    @Override
    public String toString() {
        return getNomePiatto() + " " + getPrezzo() + " Є";
    }
}

