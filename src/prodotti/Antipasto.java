package prodotti;

import java.util.ArrayList;

public class Antipasto extends Portata {

    private Boolean perDuePersone;

    public Antipasto(String nome, Double prezzo, ArrayList<AllergeneEnum> allergeniEnumArrayList, CalorieEnum calorieEnum, Boolean perDuePersone) {
        super(nome, prezzo, allergeniEnumArrayList, calorieEnum);
        this.perDuePersone = perDuePersone;
    }


    @Override
    public void stampaDettagli() {
        Integer lineLength = 80;
        StringBuilder sb = new StringBuilder(lineLength);
        sb.append(getNome());
        if(perDuePersone){
            sb.append(" (per due persone)");
        }
        for (int i = sb.length(); i < lineLength; i++) {
            sb.append(".");
        }
        sb.append(getPrezzo());

        System.out.println(sb);

        stampaAllergeni();
        System.out.println();
    }
}


