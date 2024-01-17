package prodotti;

import java.util.ArrayList;

public class SoftDrink extends Portata {
    //aggiunta sottoclasse SoftDrink con un field
    private Integer centilitri;

    public SoftDrink(String nome, Double prezzo, ArrayList<AllergeneEnum> allergeniEnumArrayList, Integer centilitri) {
        super(nome, prezzo, allergeniEnumArrayList);
        this.centilitri = centilitri;
    }

    public Integer getCentilitri() {
        return centilitri;
    }

    public void setCentilitri(Integer centilitri) {
        this.centilitri = centilitri;
    }

    @Override
    public String toString() {
        return getNome() + ", " + getPrezzo() + "€, " + centilitri + " cl";
    }
}
