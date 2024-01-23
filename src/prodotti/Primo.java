package prodotti;

import java.util.ArrayList;

public class Primo extends Portata {
    private CalorieEnum calorieEnum;

    public Primo(String nome, Double prezzo, ArrayList<AllergeneEnum> allergeniEnumArrayList, prodotti.CalorieEnum calorieEnum) {
        super(nome, prezzo, allergeniEnumArrayList);
        this.calorieEnum = calorieEnum;
    }


    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.println(calorieEnum.getCalorie());
    }
}

