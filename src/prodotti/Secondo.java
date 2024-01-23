package prodotti;

import java.util.ArrayList;

public class Secondo extends Portata {
    private boolean isProdottoStagionale;

    public Secondo(String nome, Double prezzo, ArrayList<AllergeneEnum> allergeniEnumArrayList, boolean isProdottoStagionale) {
        super(nome, prezzo, allergeniEnumArrayList);
        this.isProdottoStagionale = isProdottoStagionale;
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        if(isProdottoStagionale){
            System.out.println("\u001B[47m"+"\u001B[30m"+"piatto di Stagione" + "\u001B[0m");
        }
    }
}

