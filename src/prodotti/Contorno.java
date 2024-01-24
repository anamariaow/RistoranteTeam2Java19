package prodotti;

import java.util.ArrayList;

public class Contorno extends Portata {

    public Contorno(String nome, Double prezzo, ArrayList<AllergeneEnum> allergeniEnumArrayList, CalorieEnum calorieEnum) {
        super(nome, prezzo, allergeniEnumArrayList, calorieEnum);
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
    }
}

