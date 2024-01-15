package prodotti;

import java.util.ArrayList;

public class Antipasto extends Portata {

//TODO inserire altri field a piacere
    public Antipasto(Double prezzo, String nomePiatto, ArrayList<AllergeneEnum> allergeneEnumArrayList) {
        super(prezzo, nomePiatto, allergeneEnumArrayList);
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
    }
}


