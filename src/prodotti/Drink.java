package prodotti;

import java.util.ArrayList;

public class Drink extends Portata {
    //aggiunta sottoclasse Drink con i suoi fields
    private String ingredienti;
    private Boolean isAlcoholic;

    public Drink(String nome, Double prezzo, ArrayList<AllergeneEnum> allergeniEnumArrayList, String ingredienti, Boolean isAlcoholic) {
        super(nome, prezzo, allergeniEnumArrayList);
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
    public void stampaDettagli() {
        super.stampaDettagli();
    }
}
