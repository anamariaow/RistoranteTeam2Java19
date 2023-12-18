import portate.*;

import java.time.ZonedDateTime;

public class Menu {
    static Chef chef1 = new Chef("Simon Timon", 45, 3);
    static Antipasti insaltaDiMare = new Antipasti(10.0, "insalta di mare");
    static Antipasti cruditesDiMare = new Antipasti(11.0, "insalta di mare");
    static Antipasti polipettiAffogati = new Antipasti(9.0, "Polipetti affogati");

    static PrimiPiatti trepoline = new PrimiPiatti(10.0, "Trepoline con rape e cozze");
    static PrimiPiatti assassina = new PrimiPiatti(14.0, "Spaghetti all'assassina con polpo");
    static PrimiPiatti scoglio = new PrimiPiatti(12.0, "Spaghetti allo scoglio");

    static SecondiPiatti orata = new SecondiPiatti(17.0, "Orata al cartoccio");
    static SecondiPiatti polpo = new SecondiPiatti(12.0, "Polpo alla luciana");
    static SecondiPiatti gamberoni = new SecondiPiatti(15.0, "Gamberoni al forno");

    static Contorni patate = new Contorni(7.0, "Patate al limone");
    static Contorni carote = new Contorni(6.0, "Carote alla vinaigrette");
    static Contorni carciofi = new Contorni(6.5, "Carciofi allo zest d'arancia");

    static Dessert dessertMango = new Dessert(10.50, "Mousse di Mango");
    static Dessert dessertMaracuya = new Dessert(8.50, "Mousse di Maracuya");
    static Dessert dessertNoce = new Dessert(5.50, "Mousse di Noce");

    static Bevande acqua = new Bevande(3.0, "Acqua naturale/frizzante");
    static Bevande vino = new Bevande(10.0, "Vino della casa");
    static Bevande bibite = new Bevande(6.0, "Bibite analcoliche");

    static ZonedDateTime dataCreazione = ZonedDateTime.parse("2023-11-22T15:25:00+01:00[Europe/Rome]");
    static ZonedDateTime dataUltimaModifica = ZonedDateTime.parse("2023-12-18T13:00:00+01:00[Europe/Rome]");
}
