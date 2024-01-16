package prodotti;

import java.util.ArrayList;

public class Primo extends Portata {
    private CalorieEnum calorieEnum;


    public Primo(Double prezzo, String nomePiatto, ArrayList<AllergeneEnum> allergeneEnumArrayList,CalorieEnum calorieEnum) {
        super(prezzo, nomePiatto, allergeneEnumArrayList);
        this.calorieEnum=calorieEnum;
    }


    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
    }
}

