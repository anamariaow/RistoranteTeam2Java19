package portate;

public class Dessert extends Portate {

    public boolean senzaZuchero;
    public boolean senzalatte;

    public Dessert(double prezzo, String nomePiatto, boolean senzaZuchero, boolean senzalatte) {
        super(prezzo, nomePiatto);
        this.senzaZuchero = senzaZuchero;
        this.senzalatte = senzalatte;
    }
//TODO questo toString deve stare nella classe padre, mettere private, getter e setter
    @Override
    public String toString() {
        return "Dessert :" + nomePiatto + " " + prezzo + "Є" + "  " + "Senza zuchero" + " " + senzaZuchero + " " + "Senza Latte" + " " + senzalatte;
    }
}
