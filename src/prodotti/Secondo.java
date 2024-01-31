package prodotti;

import java.util.ArrayList;

public class Secondo extends Portata {
    private Boolean isProdottoStagionale;

    public Secondo(String nome, Double prezzo, ArrayList<AllergeneEnum> allergeniEnumArrayList, CalorieEnum calorieEnum, Boolean isProdottoStagionale) {
        super(nome, prezzo, allergeniEnumArrayList, calorieEnum);
        this.isProdottoStagionale = isProdottoStagionale;
    }

    public Boolean getProdottoStagionale() {
        return isProdottoStagionale;
    }

    public void setProdottoStagionale(Boolean prodottoStagionale) {
        isProdottoStagionale = prodottoStagionale;
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        if(isProdottoStagionale){
            System.out.println("\u001B[37m"+" ~ Piatto di stagione ~ " + "\u001B[0m");
        }
    }
}

