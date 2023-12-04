public class Main {
    public static void main(String[] args) {
        Antipasti insaltaDiMare = new Antipasti(10,"insalta di mare");
        Antipasti cruditesDiMare = new Antipasti(11,"insalta di mare");
        Antipasti polipettiAffogati = new Antipasti(9,"Polipetti affogati");

        PrimiPiatti trepoline = new PrimiPiatti(10, "Trepoline con rape e cozze");
        PrimiPiatti assassina = new PrimiPiatti(14, "Spaghetti all'assassina con polpo");
        PrimiPiatti scoglio = new PrimiPiatti(12, "Spaghetti allo scoglio");

        SecondiPiatti orata = new SecondiPiatti(17,"Orata al cartoccio");
        SecondiPiatti polpo = new SecondiPiatti(12, "Polpo alla luciana");
        SecondiPiatti gamberoni = new SecondiPiatti(15, "Gamberoni al forno");

        Bevande acqua = new Bevande(3,"Acqua naturale/frizzante");
        Bevande vino = new Bevande(10, "Vino della casa");
        Bevande bibite = new Bevande(6, "Bibite analcoliche");

        System.out.println("Antipasti :" + "\n\r" + insaltaDiMare + "\n\r" + cruditesDiMare + "\n\r" + polipettiAffogati);
        System.out.println();
        System.out.println("Primi piatti :" + "\n\r" + trepoline + "\n\r" + assassina + "\n\r" + scoglio);
        System.out.println();
        System.out.println("Secondi piatti :" + "\n\r" + orata + "\n\r" + polpo + "\n\r" + gamberoni);
        System.out.println("Bibite :" + "\n\r" + acqua + "\n\r" + vino + "\n\r" + bibite);
    }
}
