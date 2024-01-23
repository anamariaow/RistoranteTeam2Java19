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

    }
}


