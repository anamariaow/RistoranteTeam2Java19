package prodotti;

import java.util.ArrayList;

public class Dessert extends Portate {
    public Dessert(Double prezzo, String nomePiatto, ArrayList<AllergeniEnum> allergeniEnumArrayList) {
        super(prezzo, nomePiatto, allergeniEnumArrayList);
    }
//TODO tutte le classi figlio devono esistere per incrementare l'applicazione, ci può essere un enum calorie o livello dolcezza (medio, alto, basso)




    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
    }
}
