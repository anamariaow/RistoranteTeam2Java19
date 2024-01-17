package prodotti;

import java.util.ArrayList;

public class Antipasto extends Portata {

    private boolean perDuePersone;

    public Antipasto(String nome, Double prezzo, ArrayList<AllergeneEnum> allergeniEnumArrayList, boolean perDuePersone) {
        super(nome, prezzo, allergeniEnumArrayList);
        this.perDuePersone = perDuePersone;
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
    }
}


