public class Chef {
    public String nome;
    public int eta;
    public int stelleMichelin;

    public Chef(String nome, int eta, int stelleMichelin) {
        this.nome = nome;
        this.eta = eta;
        this.stelleMichelin = stelleMichelin;
    }
//TODO getter e setter e stampa dettagli, incapsulamento (private), override
//TODO metodo overloaded per stampare con un colore diverso
    @Override
    public String toString() {
        return "Chef: " + '\n' +
                nome + ", " +
                eta +
                ", Stelle Michelin: " + stelleMichelin;
    }
}
