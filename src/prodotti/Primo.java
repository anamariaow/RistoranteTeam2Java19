package prodotti;

import java.util.ArrayList;

public class Primo extends Portata {

    public Primo(String nome, Double prezzo, ArrayList<AllergeneEnum> allergeniEnumArrayList, CalorieEnum calorieEnum) {
        super(nome, prezzo, allergeniEnumArrayList, calorieEnum);
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.println();
    }
}

