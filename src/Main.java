import portate.*;

import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        //TODO e ora tutta questa logica dove la mettiamo? va creata una classe menu che avrà tutti i campi e le funzionalità per stampare un menu


        Chef chef1 = new Chef("Simon Timon", 45, 3);
        Antipasti insaltaDiMare = new Antipasti(10.0, "insalta di mare");
        Antipasti cruditesDiMare = new Antipasti(11.0, "insalta di mare");
        Antipasti polipettiAffogati = new Antipasti(9.0, "Polipetti affogati");

        PrimiPiatti trepoline = new PrimiPiatti(10.0, "Trepoline con rape e cozze");
        PrimiPiatti assassina = new PrimiPiatti(14.0, "Spaghetti all'assassina con polpo");
        PrimiPiatti scoglio = new PrimiPiatti(12.0, "Spaghetti allo scoglio");

        SecondiPiatti orata = new SecondiPiatti(17.0, "Orata al cartoccio");
        SecondiPiatti polpo = new SecondiPiatti(12.0, "Polpo alla luciana");
        SecondiPiatti gamberoni = new SecondiPiatti(15.0, "Gamberoni al forno");

        Contorni patate = new Contorni(7.0, "Patate al limone");
        Contorni carote = new Contorni(6.0, "Carote alla vinaigrette");
        Contorni carciofi = new Contorni(6.5, "Carciofi allo zest d'arancia");

        Dessert dessertMango = new Dessert(10.50, "Mousse di Mango");
        Dessert dessertMaracuya = new Dessert(8.50, "Mousse di Maracuya");
        Dessert dessertNoce = new Dessert(5.50, "Mousse di Noce");

        Bevande acqua = new Bevande(3.0, "Acqua naturale/frizzante");
        Bevande vino = new Bevande(10.0, "Vino della casa");
        Bevande bibite = new Bevande(6.0, "Bibite analcoliche");

        ZonedDateTime dataCreazione = ZonedDateTime.parse("2023-11-22T15:25:00+01:00[Europe/Rome]");
        ZonedDateTime dataUltimaModifica = ZonedDateTime.parse("2023-12-18T13:00:00+01:00[Europe/Rome]");


        System.out.println();
        System.out.println("~Un Ristorante Qualsiasi~");
        System.out.println(chef1);
        System.out.println("Menù a carico del grande chef suricato dell'antica prateria.");
        System.out.println();
        System.out.println(TipoMenuEnum.PESCE.getDescrizione());
        System.out.println();
        System.out.println("Antipasti :" + "\n\r" + insaltaDiMare + "\n\r" + cruditesDiMare + "\n\r" + polipettiAffogati);
        System.out.println();

        System.out.println("Primi piatti :");
        trepoline.stampaDettagli();
        assassina.stampaDettagli();
        scoglio.stampaDettagli();

        System.out.println();
        System.out.println("Secondi piatti :" + "\n\r" + orata + "\n\r" + polpo + "\n\r" + gamberoni);
        System.out.println();
        System.out.println("Contorni :" + "\n\r" + patate + "\n\r" + carote + "\n\r" + carciofi);
        System.out.println();
        System.out.println("Dessert :" + "\n\r" + dessertMango + "\n\r" + dessertMaracuya + "\n\r" + dessertNoce);
        System.out.println();
        System.out.println("Bibite :" + "\n\r" + acqua + "\n\r" + vino + "\n\r" + bibite);
        System.out.println();
        System.out.println("Data di creazione : " + dataCreazione);
        System.out.println("Data Ultima modifica : " + dataUltimaModifica);

    }
}
