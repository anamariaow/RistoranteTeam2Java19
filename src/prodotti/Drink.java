package prodotti;

import java.util.ArrayList;

public class Drink extends Portata {
    //aggiunta sottoclasse Drink con i suoi fields
    private String ingredienti;

    public Drink(String nome, Double prezzo, ArrayList<AllergeneEnum> allergeniEnumArrayList, CalorieEnum calorieEnum, String ingredienti) {
        super(nome, prezzo, allergeniEnumArrayList, calorieEnum);
        this.ingredienti = ingredienti;
    }

    public String getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.println("\u001B[37m" + ingredienti+ "\u001B[0m");
    }
}
