package prodotti;

import java.util.ArrayList;

public class Dessert extends Portata {
    private LivelloDiDolcezzaEnum livelloDiDolcezzaEnum;
    private CalorieEnum calorieEnum;

    public Dessert(String nome, Double prezzo, ArrayList<AllergeneEnum> allergeniEnumArrayList, prodotti.LivelloDiDolcezzaEnum livelloDiDolcezzaEnum, prodotti.CalorieEnum calorieEnum) {
        super(nome, prezzo, allergeniEnumArrayList);
        this.livelloDiDolcezzaEnum = livelloDiDolcezzaEnum;
        this.calorieEnum = calorieEnum;
    }
    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
    }
}