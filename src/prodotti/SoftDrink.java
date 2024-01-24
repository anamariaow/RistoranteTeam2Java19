package prodotti;

import java.util.ArrayList;

public class SoftDrink extends Portata {
    //aggiunta sottoclasse SoftDrink con un field
    private Integer centilitri;

    public SoftDrink(String nome, Double prezzo, ArrayList<AllergeneEnum> allergeniEnumArrayList, CalorieEnum calorieEnum, Integer centilitri) {
        super(nome, prezzo, allergeniEnumArrayList, calorieEnum);
        this.centilitri = centilitri;
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.println(centilitri + " cl");
    }
}
