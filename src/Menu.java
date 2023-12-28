import prodotti.*;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    //TODO ma questo oggetto come viene istanziato? quindi io non posso creare più menù

   private  List<Portate> portateList = new ArrayList<>();
     private ZonedDateTime dataCreazione = ZonedDateTime.parse("2023-11-22T15:25:00+01:00[Europe/Rome]");
    private  ZonedDateTime dataUltimaModifica = ZonedDateTime.parse("2023-12-18T13:00:00+01:00[Europe/Rome]");

    //creazione del metodo per stampare tutto il menu
    public void stampaMenu() {

        //TODO

        for (Portate portate: portateList) {
            if (portate instanceof  Antipasti){
                portate.stampaDettagli();
            }
            if (portate instanceof  PrimiPiatti){

                portate.stampaDettagli();
            }
        }


        System.out.println();
        System.out.println("~Un Ristorante Qualsiasi~");
        System.out.println(chef1);
        System.out.println("Menù a carico del grande chef suricato dell'antica prateria.");
        System.out.println();
        System.out.println(TipoMenuEnum.PESCE.getDescrizione());
        System.out.println();

        System.out.println("Antipasti");
        insaltaDiMare.stampaDettagli();
        cruditesDiMare.stampaDettagli();
        polipettiAffogati.stampaDettagli();
        System.out.println();

        System.out.println("Primi piatti:");
        trepoline.stampaDettagli();
        assassina.stampaDettagli();
        scoglio.stampaDettagli();
        System.out.println();

        System.out.println("Secondi piatti:");
        orata.stampaDettagli();
        polpo.stampaDettagli();
        gamberoni.stampaDettagli();
        System.out.println();

        //commento questa linea di codice perche non funziona correttamente
        /*
        System.out.println("Contorni :" + "\n\r" + patate + AllergeniEnum.ARACHIDI.getDescrizione() +
                "\n\r" + carote + AllergeniEnum.SENAPE.getDescrizione() + "\n\r" + carciofi +
                AllergeniEnum.SEDANO.getDescrizione());
        */

        System.out.println("Contorni:");
        patate.stampaDettagli();
        carote.stampaDettagli();
        carciofi.stampaDettagli();
        System.out.println();

        System.out.println("Dessert:");
        dessertMango.stampaDettagli();
        dessertMaracuya.stampaDettagli();
        dessertNoce.stampaDettagli();
        System.out.println();

        System.out.println("Bibite:");
        acqua.stampaDettagli();
        vino.stampaDettagli();
        bibite.stampaDettagli();
        System.out.println();

        System.out.println("Data di creazione : " + dataCreazione);
        System.out.println("Data Ultima modifica : " + dataUltimaModifica);
    }
}
