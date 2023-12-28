package prodotti;

public class SoftDrink extends Bevanda {
    //aggiunta sottoclasse SoftDrink con un field
    private Integer centilitri;

    public SoftDrink(String nome, Double prezzo, Integer centilitri) {
        super(nome, prezzo);
        this.centilitri = centilitri;
    }

    public Integer getCentilitri() {
        return centilitri;
    }

    public void setCentilitri(Integer centilitri) {
        this.centilitri = centilitri;
    }

    @Override
    public String toString() {
        return getNome() + ", " + getPrezzo() + "€, " + centilitri + " cl";
    }
}
