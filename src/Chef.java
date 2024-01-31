public class Chef {
    private String nome;
    private Integer eta;
    private String stelleMichelin;

    public Chef(String nome, Integer eta, String stelleMichelin) {
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

    public String getStelleMichelin() {
        return stelleMichelin;
    }

    public void setStelleMichelin(String stelleMichelin) {
        this.stelleMichelin = stelleMichelin;
    }

    /**
     * questo metodo stampa i dettagli (fields: nome, eta, stelleMichelin) della classe Chef e attribuisce un colore
     * @author Ana
     */
    public void stampaDettagliChef() {
        
        System.out.println("\u001B[33m" + nome + " - " +  eta + " anni - " + stelleMichelin + " Stelle Michelin" + "\u001B[0m");
        System.out.println();
    }

}
