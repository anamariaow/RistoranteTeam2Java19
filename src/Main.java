public class Main {
    public static void main(String[] args) {

        System.out.println();

        System.out.println("~Un Ristorante Qualsiasi~");

        System.out.println(Menu.chef1);

        System.out.println("Menù a carico del grande chef suricato dell'antica prateria.");

        System.out.println();

        System.out.println(TipoMenuEnum.PESCE.getDescrizione());

        System.out.println();

        System.out.println("Antipasti :");
        Menu.insaltaDiMare.stampaDettagli();
        Menu.cruditesDiMare.stampaDettagli();
        Menu.polipettiAffogati.stampaDettagli();

        System.out.println("Primi piatti :");
        Menu.trepoline.stampaDettagli();
        Menu.assassina.stampaDettagli();
        Menu.scoglio.stampaDettagli();

        System.out.println();

        System.out.println("Secondi piatti :");
        Menu.orata.stampaDettagli();
        Menu.polpo.stampaDettagli();
        Menu.gamberoni.stampaDettagli();

        System.out.println();

        System.out.println("Contorni :");
        Menu.patate.stampaDettagli();
        Menu.carote.stampaDettagli();
        Menu.carciofi.stampaDettagli();

        System.out.println();

        System.out.println("Dessert :");
        Menu.dessertMango.stampaDettagli();
        Menu.dessertMaracuya.stampaDettagli();
        Menu.dessertNoce.stampaDettagli();

        System.out.println();

        System.out.println("Bibite :");
        Menu.acqua.stampaDettagli();
        Menu.vino.stampaDettagli();
        Menu.bibite.stampaDettagli();

        System.out.println();

        System.out.println("Data di creazione : " + Menu.dataCreazione);
        System.out.println("Data Ultima modifica : " + Menu.dataUltimaModifica);

    }
}
