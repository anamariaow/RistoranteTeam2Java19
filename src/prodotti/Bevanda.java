package prodotti;

public abstract class Bevanda {
    private String nome;
    private Double prezzo;

    public Bevanda(String nome, Double prezzo) {
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

    @Override
    public String toString() {
        return "Bevanda: " + nome + ", " + prezzo + "€";
    }
}