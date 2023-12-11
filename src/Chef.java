public class Chef {
    public String nome;
    public int eta;
    public int stelleMichelin;

    public Chef(String nome, int eta, int stelleMichelin) {
        this.nome = nome;
        this.eta = eta;
        this.stelleMichelin = stelleMichelin;
    }

    @Override
    public String toString() {
        return "Chef: " + '\n' +
                nome + ", " +
                eta +
                ", Stelle Michelin: " + stelleMichelin;
    }
}
