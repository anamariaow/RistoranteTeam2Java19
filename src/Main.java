import portate.*;

public class Main {
    public static void main(String[] args) {
        Antipasti insaltaDiMare = new Antipasti(10, "insalta di mare");
        Antipasti cruditesDiMare = new Antipasti(11, "insalta di mare");
        Antipasti polipettiAffogati = new Antipasti(9, "Polipetti affogati");

        PrimiPiatti trepoline = new PrimiPiatti(10, "Trepoline con rape e cozze",false,true);
        PrimiPiatti assassina = new PrimiPiatti(14, "Spaghetti all'assassina con polpo",true,true);
        PrimiPiatti scoglio = new PrimiPiatti(12, "Spaghetti allo scoglio",false,true);

        SecondiPiatti orata = new SecondiPiatti(17, "Orata al cartoccio");
        SecondiPiatti polpo = new SecondiPiatti(12, "Polpo alla luciana");
        SecondiPiatti gamberoni = new SecondiPiatti(15, "Gamberoni al forno");

        Contorni patate = new Contorni(7, "Patate al limone");
        Contorni carote = new Contorni(6, "Carote alla vinaigrette");
        Contorni carciofi = new Contorni(6, "Carciofi allo zest d'arancia");

        Bevande acqua = new Bevande(3.0, "Acqua naturale/frizzante", false, true);
        Bevande vino = new Bevande(10.0, "Vino della casa", true, true);
        Bevande bibite = new Bevande(6.0, "Bibite analcoliche", false, true);

        System.out.println("Antipasti :" + "\n\r" + insaltaDiMare + "\n\r" + cruditesDiMare + "\n\r" + polipettiAffogati);
        System.out.println();
        System.out.println("Primi piatti :" + "\n\r" + trepoline + "\n\r" + assassina + "\n\r" + scoglio);
        System.out.println();
        System.out.println("Secondi piatti :" + "\n\r" + orata + "\n\r" + polpo + "\n\r" + gamberoni);
        System.out.println();
        System.out.println("portate.Contorni :" + "\n\r" + patate + "\n\r" + carote + "\n\r" + carciofi);
        System.out.println();
        System.out.println();
        System.out.println("Contorni :" + "\n\r" + patate + "\n\r" + carote + "\n\r" + carciofi);
        System.out.println();
        System.out.println("Bibite :" + "\n\r" + acqua + "\n\r" + vino + "\n\r" + bibite);
    }
}
