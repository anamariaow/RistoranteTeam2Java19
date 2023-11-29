public class Main {
    public static void main(String[] args) {
        PrimiPiatti trepoline = new PrimiPiatti(10, "Trepoline con rape e cozze");
        PrimiPiatti assassina = new PrimiPiatti(14, "Spaghetti all'assassina con polpo");
        PrimiPiatti scoglio = new PrimiPiatti(12, "Spaghetti allo scoglio");

        System.out.println("Primi piatti :" + "\n\r" + trepoline + "\n\r" + assassina + "\n\r" + scoglio);
    }
}
