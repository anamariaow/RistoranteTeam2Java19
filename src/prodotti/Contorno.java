package prodotti;

import java.util.ArrayList;

public class Contorno extends Portata {


    public Contorno(String nome, Double prezzo, ArrayList<AllergeneEnum> allergeniEnumArrayList, boolean isVegano, boolean isBiologico) {
        super(nome, prezzo, allergeniEnumArrayList);

    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
    }
}

