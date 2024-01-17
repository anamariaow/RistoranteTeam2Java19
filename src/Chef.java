public class Chef {
    private String nome;
    private Integer eta;
    private Integer stelleMichelin;

    public Chef(String nome, Integer eta, Integer stelleMichelin) {
        this.nome = nome;
        this.eta = eta;
        this.stelleMichelin = stelleMichelin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    public Integer getStelleMichelin() {
        return stelleMichelin;
    }

    public void setStelleMichelin(Integer stelleMichelin) {
        this.stelleMichelin = stelleMichelin;
    }
    public void stampaDettagliChef() {
        System.out.println("\u001B[33m" + nome + ", " +  eta + "anni, " + stelleMichelin + " stelle Michelin" + "\u001B[0m");
    }
}
