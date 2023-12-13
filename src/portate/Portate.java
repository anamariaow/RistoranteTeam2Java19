package portate;

public abstract class Portate {
    public double prezzo;
    public String nomePiatto;
//TODO getter e setter e modificare public con private
//TODO aggiungere metodo void per stampare
    public Portate(double prezzo, String nomePiatto) {
        this.prezzo = prezzo;
        this.nomePiatto = nomePiatto;
    }

    public void stampaDettagli(){
        System.out.println(nomePiatto + " " + prezzo + " Є");

    }
}
