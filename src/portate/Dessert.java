package portate;

public class Dessert extends Portate {

    public Boolean senzaZuchero;
    public Boolean senzalatte;

    public Dessert(Double prezzo, String nomePiatto, Boolean senzaZuchero, Boolean senzalatte) {
        super(prezzo, nomePiatto);
        this.senzaZuchero = senzaZuchero;
        this.senzalatte = senzalatte;
    }

    public Boolean getSenzaZuchero() {
        return senzaZuchero;
    }

    public void setSenzaZuchero(Boolean senzaZuchero) {
        this.senzaZuchero = senzaZuchero;
    }

    public Boolean getSenzalatte() {
        return senzalatte;
    }

    public void setSenzalatte(Boolean senzalatte) {
        this.senzalatte = senzalatte;
    }

    //TODO questo toString deve stare nella classe padre, mettere private, getter e setter
    @Override
    public String toString() {
        return "Dessert :" + getNomePiatto() + " " + getPrezzo() + "Є" + "  " + "Senza zuchero" + " " + senzaZuchero + " " + "Senza Latte" + " " + senzalatte;
    }
}
