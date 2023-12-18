import portate.*;

import java.time.ZonedDateTime;

public class Menu {
    static Chef chef1 = new Chef("Simon Timon", 45, 3);
    static Antipasti insaltaDiMare = new Antipasti(10.0, "insalta di mare","gamberi",true);
    static Antipasti cruditesDiMare = new Antipasti(11.0, "insalta di mare","gamberi",true);
    static Antipasti polipettiAffogati = new Antipasti(9.0, "Polipetti affogati","nessuno",false);

    static PrimiPiatti trepoline = new PrimiPiatti(10.0, "Trepoline con rape e cozze", false, true);
    static PrimiPiatti assassina = new PrimiPiatti(14.0, "Spaghetti all'assassina con polpo", true, true);
    static PrimiPiatti scoglio = new PrimiPiatti(12.0, "Spaghetti allo scoglio", false, true);

    static SecondiPiatti orata = new SecondiPiatti(17.0, "Orata al cartoccio", true, true);
    static SecondiPiatti polpo = new SecondiPiatti(12.0, "Polpo alla luciana", false, true);
    static SecondiPiatti gamberoni = new SecondiPiatti(15.0, "Gamberoni al forno", true, true);

    static Contorni patate = new Contorni(7.0, "Patate al limone", true, true);
    static Contorni carote = new Contorni(6.0, "Carote alla vinaigrette", true, true);
    static Contorni carciofi = new Contorni(6.5, "Carciofi allo zest d'arancia", true, false);

    static Dessert dessertMango = new Dessert(10.50, "Mousse di Mango", true, false);
    static Dessert dessertMaracuya = new Dessert(8.50, "Mousse di Maracuya", true, false);
    static Dessert dessertNoce = new Dessert(5.50, "Mousse di Noce", true, true);

    static Bevande acqua = new Bevande(3.0, "Acqua naturale/frizzante", false, true);
    static Bevande vino = new Bevande(10.0, "Vino della casa", true, true);
    static Bevande bibite = new Bevande(6.0, "Bibite analcoliche", false, true);

    static ZonedDateTime dataCreazione = ZonedDateTime.parse("2023-11-22T15:25:00+01:00[Europe/Rome]");
    static ZonedDateTime dataUltimaModifica = ZonedDateTime.parse("2023-12-18T13:00:00+01:00[Europe/Rome]");
}
