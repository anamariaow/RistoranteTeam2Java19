package portate;

public abstract class Portate {
    private Double prezzo;
    private String nomePiatto;

//TODO aggiungere metodo void per stampare
    public Portate(Double prezzo, String nomePiatto) {
        this.prezzo = prezzo;
        this.nomePiatto = nomePiatto;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public String getNomePiatto() {
        return nomePiatto;
    }

    public void setNomePiatto(String nomePiatto) {
        this.nomePiatto = nomePiatto;
    }

    public void stampaDettagli(){
        System.out.println(nomePiatto + " " + prezzo + " Є");

    }
}
