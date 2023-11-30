public class Main {
    public static void main(String[] args) {
        PrimiPiatti trepoline = new PrimiPiatti(10, "Trepoline con rape e cozze");
        PrimiPiatti assassina = new PrimiPiatti(14, "Spaghetti all'assassina con polpo");
        PrimiPiatti scoglio = new PrimiPiatti(12, "Spaghetti allo scoglio");

        SecondiPiatti orata = new SecondiPiatti(17,"Orata al cartoccio");
        SecondiPiatti polpo = new SecondiPiatti(12, "Polpo alla luciana");
        SecondiPiatti gamberoni = new SecondiPiatti(15, "Gamberoni al forno");

        System.out.println("Primi piatti :" + "\n\r" + trepoline + "\n\r" + assassina + "\n\r" + scoglio);
        System.out.println();
        System.out.println("Secondi piatti :" + "\n\r" + orata + "\n\r" + polpo + "\n\r" + gamberoni);
    }
}
