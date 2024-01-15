package prodotti;

//TODO anche bevanda deve estendere portata
public abstract class Bevanda {
    private String nome;
    private Double prezzo;

    public Bevanda(String nome, Double prezzo) {
        super();
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }
//to string non più, ma stampa allergeni
    @Override
    public String toString() {
        return "Bevanda: " + nome + ", " + prezzo + "€";
    }
}