import portate.*;

import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        //TODO e ora tutta questa logica dove la mettiamo? va creata una classe menu che avrà tutti i campi e le funzionalità per stampare un menu

         Chef chef1 = new Chef("Simon Timon", 45, 3);
         Antipasti insaltaDiMare = new Antipasti(10.0, "Insalta di mare");
         Antipasti cruditesDiMare = new Antipasti(11.0, "Crudités di mare");
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

        static Bevande acqua = new Bevande(3.0, "Acqua");
        static Bevande vino = new Bevande(10.0, "Vino della casa");
        static Bevande bibite = new Bevande(6.0, "Bibite analcoliche");

        Menu menu = new Menu(nome, TipoMenuEnum.PESCE);
        //TODO nel menu add e remove, forse dobbiamo usare un set? vogliamo portate duplicate?
        menu.add( new Bevande(3.0, "Acqua"));


        menu.stampaMenu();


        //TODO per dopo le vacanze , sistemare tutto e poi creare la classe ristorrante che conterrà una lista di menu quindi poi sul main

        ristorante.stampaMenues();
        ristorante.stampaMenues(TipoMenuEnum.PESCE)

        //TODO obbiettivo dopo è fare la classe cliente e creae un sistema di prenotazione(nel ristorante va messo un integer numero posti)
        // obbiettivo fare una prenotazione e stampare il menu in base al Cliente
    }
}
