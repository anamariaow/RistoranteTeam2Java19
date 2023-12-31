package prodotti;

public class Drink extends Bevanda {
    //aggiunta sottoclasse Drink con i suoi fields
    private String ingredienti;
    private Boolean isAlcoholic;

    public Drink(String nome, Double prezzo, String ingredienti, Boolean isAlcoholic) {
        super(nome, prezzo);
        this.ingredienti = ingredienti;
        this.isAlcoholic = isAlcoholic;
    }

    public String getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }

    public Boolean isAlcoholic() {
        return isAlcoholic;
    }

    public void setAlcoholic(Boolean alcoholic) {
        isAlcoholic = alcoholic;
    }

    @Override
    public String toString() {
        return "Drink: " + getNome() + ", " + getPrezzo() + "€" +
                ", Ingredienti: " + ingredienti +
                ", Alcolico: " + isAlcoholic;
    }
}
