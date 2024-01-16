package prodotti;

import java.util.ArrayList;

public class Secondo extends Portata {
    private boolean isProdottoStagionale;


    public Secondo(Double prezzo, String nomePiatto, ArrayList<AllergeneEnum> allergeneEnumArrayList,boolean isProdottoStagionale) {
        super(prezzo, nomePiatto, allergeneEnumArrayList);
        this.isProdottoStagionale=isProdottoStagionale;
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
    }
}

