package prodotti;

import java.util.ArrayList;

public class Vino extends Portata {
    //aggiunta sottoclasse Vino con i suoi fields
    private String tipologia;
    private String descrizione;
    private String provenienza;
    private Integer annoProduzione;

    public Vino(String nome, Double prezzo, ArrayList<AllergeneEnum> allergeniEnumArrayList, CalorieEnum calorieEnum, String tipologia, String descrizione, String provenienza, Integer annoProduzione) {
        super(nome, prezzo, allergeniEnumArrayList, calorieEnum);
        this.tipologia = tipologia;
        this.descrizione = descrizione;
        this.provenienza = provenienza;
        this.annoProduzione = annoProduzione;
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
        System.out.println("\u001B[36m" + "Tipologia: "+"\u001B[0m" + tipologia + '\n' + "Descrizione: " + descrizione + '\n' + "Provenienza: " + provenienza + '\n' + "Anno di produzione: " + annoProduzione + '\n');
    }

}