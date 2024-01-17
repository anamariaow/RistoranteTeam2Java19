package prodotti;

import java.util.ArrayList;

public class Antipasto extends Portata {

    private boolean perDuePersone;

    public Antipasto(String nome, Double prezzo, ArrayList<AllergeneEnum> allergeniEnumArrayList, boolean perDuePersone) {
        super(nome, prezzo, allergeniEnumArrayList);
        this.perDuePersone = perDuePersone;
    }

    //TODO se vuoi un field così va fatto un enumerato e lo chiamiamo mezza porzione, porzione intera, famiglia
    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.println(perDuePersone);
    }
}


