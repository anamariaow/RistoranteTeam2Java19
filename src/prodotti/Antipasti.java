package prodotti;

import java.util.ArrayList;

public class Antipasti extends Portate {

//TODO inserire altri field a piacere
    public Antipasti(Double prezzo, String nomePiatto, ArrayList<AllergeniEnum> allergeniEnumArrayList) {
        super(prezzo, nomePiatto, allergeniEnumArrayList);
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
    }
}


