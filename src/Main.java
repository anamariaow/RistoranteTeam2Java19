import portate.*;

public class Main {
    public static void main(String[] args) {
        Chef chef1 = new Chef("Simon Timon", 45, 3);
        Antipasti insaltaDiMare = new Antipasti(10, "insalta di mare","gamberi",true);
        Antipasti cruditesDiMare = new Antipasti(11, "insalta di mare","gamberi",true);
        Antipasti polipettiAffogati = new Antipasti(9, "Polipetti affogati","nessuno",false);

        PrimiPiatti trepoline = new PrimiPiatti(10.0, "Trepoline con rape e cozze", false, true);
        PrimiPiatti assassina = new PrimiPiatti(14.0, "Spaghetti all'assassina con polpo", true, true);
        PrimiPiatti scoglio = new PrimiPiatti(12.0, "Spaghetti allo scoglio", false, true);

        SecondiPiatti orata = new SecondiPiatti(17.0, "Orata al cartoccio", true, true);
        SecondiPiatti polpo = new SecondiPiatti(12.0, "Polpo alla luciana", false, true);
        SecondiPiatti gamberoni = new SecondiPiatti(15.0, "Gamberoni al forno", true, true);

        Contorni patate = new Contorni(7.0, "Patate al limone", true, true);
        Contorni carote = new Contorni(6.0, "Carote alla vinaigrette", true, true);
        Contorni carciofi = new Contorni(6.5, "Carciofi allo zest d'arancia", true, false);

        Dessert dessertMango = new Dessert(10.50, "Mousse di Mango", true, false);
        Dessert dessertMaracuya = new Dessert(8.50, "Mousse di Maracuya", true, false);
        Dessert dessertNoce = new Dessert(5.50, "Mousse di Noce", true, true);

        Bevande acqua = new Bevande(3.0, "Acqua naturale/frizzante", false, true);
        Bevande vino = new Bevande(10.0, "Vino della casa", true, true);
        Bevande bibite = new Bevande(6.0, "Bibite analcoliche", false, true);

        System.out.println();
        System.out.println("~Un Ristorante Qualsiasi~");
        System.out.println(chef1);
        System.out.println("Menù a carico del grande chef suricato dell'antica prateria.");
        System.out.println();
        System.out.println(TipoMenù.PESCE.descrizione);
        System.out.println();
        System.out.println("Antipasti :" + "\n\r" + insaltaDiMare + "\n\r" + cruditesDiMare + "\n\r" + polipettiAffogati);
        System.out.println();
        System.out.println("Primi piatti :" + "\n\r" + trepoline + "\n\r" + assassina + "\n\r" + scoglio);
        System.out.println();
        System.out.println("Secondi piatti :" + "\n\r" + orata + "\n\r" + polpo + "\n\r" + gamberoni);
        System.out.println();
        System.out.println("Contorni :" + "\n\r" + patate + "\n\r" + carote + "\n\r" + carciofi);
        System.out.println();
        System.out.println("Dessert :" + "\n\r" + dessertMango + "\n\r" + dessertMaracuya + "\n\r" + dessertNoce);
        System.out.println();
        System.out.println("Bibite :" + "\n\r" + acqua + "\n\r" + vino + "\n\r" + bibite);
        System.out.println();

    }
}
