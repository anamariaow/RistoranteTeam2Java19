package prodotti;

import java.util.ArrayList;

public class Contorno extends Portata {
    private boolean isVegano;
    private boolean isBiologico;

    public Contorno(Double prezzo, String nomePiatto, ArrayList<AllergeneEnum> allergeneEnumArrayList,boolean isVegano,boolean isBiologico) {
        super(prezzo, nomePiatto, allergeneEnumArrayList);
        this.isVegano=isVegano;
        this.isBiologico=isBiologico;
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
    }
}

