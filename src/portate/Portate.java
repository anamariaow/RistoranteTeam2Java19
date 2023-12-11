package portate;

public abstract class Portate {
    public double prezzo;
    public String nomePiatto;
    public Portate(double prezzo,String nomePiatto) {
        this.prezzo = prezzo;
        this.nomePiatto = nomePiatto;
    }
}
