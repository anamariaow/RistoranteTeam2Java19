package prodotti;

import java.util.ArrayList;

public class Dessert extends Portata {
    private LivelloDiDolcezzaEnum livelloDiDolcezzaEnum;
    private CalorieEnum calorieEnum;
    public Dessert(Double prezzo, String nomePiatto, ArrayList<AllergeneEnum> allergeneEnumArrayList, LivelloDiDolcezzaEnum livelloDiDolcezzaEnum, CalorieEnum calorieEnum) {
        super(prezzo, nomePiatto, allergeneEnumArrayList);
        this.livelloDiDolcezzaEnum=livelloDiDolcezzaEnum;
        this.calorieEnum = calorieEnum;
    }




    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
    }
}
