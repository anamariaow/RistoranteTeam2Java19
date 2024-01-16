package prodotti;

import java.util.ArrayList;

public class Antipasto extends Portata {

    private boolean perDuePersone;

    public Antipasto(Double prezzo, String nomePiatto, ArrayList<AllergeneEnum> allergeneEnumArrayList,boolean perDuePersone) {
        super(prezzo, nomePiatto, allergeneEnumArrayList);
        this.perDuePersone=perDuePersone;
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
    }
}


