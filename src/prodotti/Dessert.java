package prodotti;

import java.util.ArrayList;

public class Dessert extends Portata {
    private LivelloDolcezzaEnum livelloDiDolcezzaEnum;


    public Dessert(String nome, Double prezzo, ArrayList<AllergeneEnum> allergeniEnumArrayList, CalorieEnum calorieEnum, LivelloDolcezzaEnum livelloDiDolcezzaEnum) {
        super(nome, prezzo, allergeniEnumArrayList, calorieEnum);
        this.livelloDiDolcezzaEnum = livelloDiDolcezzaEnum;
    }


    @Override
    public void stampaDettagli() {
        Integer lineLength = 80;
        StringBuilder sb = new StringBuilder(lineLength);
        sb.append(getNome());
        sb.append(" (" + livelloDiDolcezzaEnum.getLivelli() + ")");
        for (int i = sb.length(); i < lineLength; i++) {
            sb.append(".");
        }
        sb.append(getPrezzo());

        System.out.println(sb);

        stampaAllergeni();
    }
}
