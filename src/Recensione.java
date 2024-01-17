public class Recensione {
    private String nome;
    private String recensione;
    private Double voto;

    public Recensione(String nome, String recensione, Double voto) {
        this.nome = nome;
        this.recensione = recensione;
        this.voto = voto;
    }


    public String getNome() {
        return nome;
    }

    public String getRecensione() {
        return recensione;
    }

    public Double getVoto() {
        return voto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRecensione(String recensione) {
        this.recensione = recensione;
    }

    public void setVoto(Double voto) {
        this.voto = voto;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                " recensione= '" + recensione + '\'' +
                " voto= " + voto;
    }
}
