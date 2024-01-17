package prodotti;

import java.util.ArrayList;

public class Contorno extends Portata {
    private boolean isVegano;
    private boolean isBiologico;

    public Contorno(String nome, Double prezzo, ArrayList<AllergeneEnum> allergeniEnumArrayList, boolean isVegano, boolean isBiologico) {
        super(nome, prezzo, allergeniEnumArrayList);
        this.isVegano = isVegano;
        this.isBiologico = isBiologico;
    }

    //TODO tutti i campi in grigio devono essere usati sennò che li mettiamo a fare, quindi nella stampa vanno inseriti
    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
    }
}

