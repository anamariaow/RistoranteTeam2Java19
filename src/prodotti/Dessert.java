package prodotti;

import java.util.ArrayList;

public class Dessert extends Portata {
    public Dessert(Double prezzo, String nomePiatto, ArrayList<AllergeneEnum> allergeneEnumArrayList) {
        super(prezzo, nomePiatto, allergeneEnumArrayList);
    }
//TODO tutte le classi figlio devono esistere per incrementare l'applicazione, ci può essere un enum calorie o livello dolcezza (medio, alto, basso)




    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
    }
}
