package prodotti;

import java.util.ArrayList;

public class Dessert extends Portata {
    private LivelloDolcezzaEnum livelloDiDolcezzaEnum;
    private CalorieEnum calorieEnum;

    public Dessert(String nome, Double prezzo, ArrayList<AllergeneEnum> allergeniEnumArrayList, LivelloDolcezzaEnum livelloDiDolcezzaEnum, prodotti.CalorieEnum calorieEnum) {
        super(nome, prezzo, allergeniEnumArrayList);
        this.livelloDiDolcezzaEnum = livelloDiDolcezzaEnum;
        this.calorieEnum = calorieEnum;
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

        System.out.println(calorieEnum.getCalorie());
    }
}
