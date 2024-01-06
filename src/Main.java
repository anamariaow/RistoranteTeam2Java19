import prodotti.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //TODO e ora tutta questa logica dove la mettiamo? va creata una classe menu che avrà tutti i campi e le funzionalità per stampare un menu

        Chef chef1 = new Chef("Simon Timon", 45, 3);
        Portate insalataDiMare = PortateFactory.getPortate("antipasto",10.0,"Insalata di mare", new ArrayList<>(List.of(AllergeniEnum.MOLLUSCHI,AllergeniEnum.CROSTACEI)));
        Portate cruditesDiMare = PortateFactory.getPortate("antipasto",11.0,"Crudités di mare", new ArrayList<>(List.of(AllergeniEnum.CROSTACEI,AllergeniEnum.LUPINI,AllergeniEnum.MOLLUSCHI)));
        Portate polipettiAffogati = PortateFactory.getPortate("antipasto",9.0,"Polipetti affogati", new ArrayList<>(List.of(AllergeniEnum.FRUTTAAGUSCIO)));

        Portate trepoline = PortateFactory.getPortate("antipasto",10.0,"Trepoline con rape e cozze", new ArrayList<>(List.of(AllergeniEnum.MOLLUSCHI)));
        Portate assassina = PortateFactory.getPortate("antipasto",14.0,"Spaghetti all'assassina con polpo", new ArrayList<>(List.of(AllergeniEnum.GLUTINE,AllergeniEnum.FRUTTAAGUSCIO)));
        Portate scoglio = PortateFactory.getPortate("antipasto",12.0,"Spaghetti allo scoglio", new ArrayList<>(List.of(AllergeniEnum.MOLLUSCHI,AllergeniEnum.CROSTACEI,AllergeniEnum.GLUTINE)));

        Portate orata = PortateFactory.getPortate("antipasto",17.0,"Orata al cartoccio", new ArrayList<>(List.of(AllergeniEnum.SENAPE)));
        Portate polpo = PortateFactory.getPortate("antipasto",12.0,"Polpo alla luciana", new ArrayList<>(List.of(AllergeniEnum.SEDANO)));
        Portate gamberoni = PortateFactory.getPortate("antipasto",15.0,"Gamberoni al forno", new ArrayList<>(List.of(AllergeniEnum.CROSTACEI)));

        Portate patate = PortateFactory.getPortate("antipasto",7.0,"Patate al limone", new ArrayList<>());
        Portate carote = PortateFactory.getPortate("antipasto",6.0,"Carote alla vinaigrette", new ArrayList<>(List.of(AllergeniEnum.SESAMO)));
        Portate carciofi = PortateFactory.getPortate("antipasto",6.5,"Carciofi allo zest d'arancia", new ArrayList<>());

        Portate dessertMango = PortateFactory.getPortate("antipasto",10.50,"Mousse di Mango", new ArrayList<>(List.of(AllergeniEnum.LATTE)));
        Portate dessertMaracuya = PortateFactory.getPortate("antipasto",8.50,"Mousse di Maracuya", new ArrayList<>(List.of(AllergeniEnum.LATTE)));
        Portate dessertNoce = PortateFactory.getPortate("antipasto",5.50,"Mousse di Noce", new ArrayList<>(List.of(AllergeniEnum.LATTE,AllergeniEnum.FRUTTAAGUSCIO)));


        //selezione di bevande non alcoliche
        SoftDrink acquaNaturale = new SoftDrink("Acqua Naturale", 4.00, 750);
        SoftDrink acquaFrizzante = new SoftDrink("Acqua Frizzante", 4.00, 750);
        SoftDrink cocaCola = new SoftDrink("Coca Cola", 6.00, 330);
        SoftDrink fanta = new SoftDrink("Fanta", 6.00, 330);
        SoftDrink sprite = new SoftDrink("Sprite", 6.00, 330);
        SoftDrink lipton = new SoftDrink("Lipton", 6.00, 500);
        SoftDrink teCaldo = new SoftDrink("Té caldo", 4.00, 400);

        //delezione di vini spumanti
        System.out.println("Bollicine: ");
        Vino domPerignong = new Vino("Champagne Brut Vintage - Dom Pérignon", 300.00, "Bollicina", "Uve: Pinot Nero Chardonnay, Abbinamento: Pesce e crostacei, Alcool: 12.5%", "Champagne, Francia", 2013);
        Vino deVilmont = new Vino("Champagne Brut Réserve Premier Cru - De Vilmont", 50.00, "Bollicina", "Uve: Chardonnay Pinot Nero Meunier, Abbinamento: Pesce e crostacei, Alcool: 12.5%", "Champagne, Francia", 2020);
        Vino veuveClicquot = new Vino("Champagne Brut Cuvée Saint Petersbourg - Veuve Clicquot", 70.00, "Bollicina", "Uve: Pinot Nero Chardonnay Meunier, Abbinamento: Pesce e crostacei, Alcool: 12%", "Champagne, Francia", 2020);
        Vino serenaWines = new Vino("Prosecco Rosé Vigner - Serena Wines", 25.00, "Bollicina", "Uve: Glera Pinot Nero, Abbinamento: Salumi, Alcool: 11%", "Veneto, Italia", 2022);
        Vino francoisDiligent = new Vino("Champagne Nature Meunier Frqncois Diligent", 100.00, "Bollicina", "Uve: Meunier, Abbinamento: Pesce e crostacei, Alcool: 12.5%", "Champagne, Francia", 2017);
        Vino colVetoraz = new Vino("Prosecco Valdobbiadene Superiore Extra Dry - Col Vetoraz", 90.00, "Bollicina", "Uve: Timorasso, Abbinamento: Salumi, Alcool: 11.5%", "Veneto, Italia", 2022);

        //selezione di vini bianchi
        System.out.println("Bianchi: ");
        Vino hofstatter = new Vino("Alto Adige Gewürztraminer Kolbenhof - Hofstatter", 50.00, "Bianco", "Uve: Gewürztraminer, Abbinamento: Pesce e crostacei, Alcool: 15%", "Alto Adige, Italia", 2021);
        Vino vignetiMassa = new Vino("Colli Tortonesi Timorasso Sterpi - Vigneti Massa", 70.00, "Bianco", "Uve: Timorasso, Abbinamento: Pesce e crostacei, Alcool: 15%", "Piemonte, Italia", 2021);
        Vino bossanova = new Vino("Trebbiano d'Abruzzo - Bossanova", 35.00, "Bianco", "Uve: Trebbiano, Abbinamenti: Pesce e crostacei, Alcool: 12%", "Abruzzo, Italia", 2022);
        Vino tascaDAlmerita = new Vino("Contea di Sclafani Chardonnay Vigna San Francesco - Tasca D'Almerita", 55.00, "Bianco", "Uve: Chardonnay, Abbinamento: Formaggi, Alcool: 14%", "Sicilia, Italia", 2021);
        Vino damijan = new Vino("Venezia Giulia Ribolla Gialla - Damijan", 60.00, "Bianco", "Uve: Ribolla Gialla, Abbinamento: Carni bianche e verdure, Alcool: 13.5%", "Friuli-Venezia Giulia, Italia", 2019);
        Vino girlan = new Vino("Alto Adige Pinot Bianco Platt & Riegl - Girlan", 20.00, "Bianco", "Uve: Pinot Bianco, Abbinamento: Carni bianche e verdure, Alcool: 14%", "Alto Adige, Italia", 2022);

        //selezione di vini rossi
        System.out.println("Rossi: ");
        Vino bennati = new Vino("Valpolicella Ripasso Superiore Sfojà - Bennati", 30.00, "Rosso", "Uve: Corvina Corvinone Rondinella, Abbinamento: Carni rosse, Alcool: 14%", "Veneto, Italia", 2021);
        Vino donnafugata = new Vino("Sicilia Mille e una Notte - Donnafugata", 80.00, "Rosso", "Uve: Nero d'Avola Petit Verdot Syrah, Abbinamento: Carni rosse, Alcool: 13.5%", "Sicilia, Italia", 2019);
        Vino pandolfa = new Vino("Rubicone Sangiovese Ginevra - Pandolfa", 25.00, "Rosato", "Uve: Sangiovese, Abbinamento: Carni bianche e verdure, Alcool: 12%", "Emilia Romagna, Italia", 2022);
        Vino montepulciano = new Vino("Montepulciano d'Abbruzzo - Bossanova", 35.00, "Rosso", "Uve: Montepulciano, Abbinamento: Carni bianche e verdure, Alcool: 13.5%", "Abbruzzo, Italia", 2021);
        Vino cavalchina = new Vino("Bardolino - Cavalchina", 20.00, "Rosso", "Uve: Corvina Rondinella Molinara, Abbinamento: Salumi, Alcool: 12.5%", "Veneto, Italia", 2022);
        Vino villaSpinosa = new Vino("Recioto Classico della Valpolicella Francesca Finato Spinosa - Villa Spinosa", 40.00,"Rosso", "Uve:  Corvina Veronese Corvinone Rondinella, Abbinamento: Formaggi, Alcool: 15%", "Veneto, Italia", 2019);

        //selezione di drink alcolici
        Drink bloodyMary = new Drink("Bloody Mary", 10.00, "Bloody Mix, Vodka, Lemon juice, Salt&Pepper", true);
        Drink camilla = new Drink("Camilla", 10.00, "Chamomile, Portobello Road Gin, Chartreuse Jaune, Umeshu", true);
        Drink flo = new Drink("Flò", 10.00, "Zubrowka, Granny Smith Apple, Lime Sherbet", true);
        Drink myTie = new Drink("My Tie", 12.00, "Appleton 8 Almond Milk Washed, Dry Curacao, Bubbles", true);
        Drink beatMe = new Drink("Beat me", 11.00, "Bloody Mix, Mr Three and Bros Falernum, Beetroot, Tomato Juice, Celery Cachaca", true);
        Drink sayMyName = new Drink("Say My Name", 12.00, "Sage leaves, Absinth, Ginger Syrup, Lime, Fig Liqueur, Xoriguer Gin", true);
        Drink fermento = new Drink("Fermento", 10.00, "Fresh Sage, Pimento Liqueur, Lemon Juice, Fernet, Honey, Zubrowka, Peated Whisky Spray", true);
        Drink purpleRain = new Drink("Purple Rain", 11.00, "Mezcal, Select, Raspberry, Beetrot, Ginger Ale, Absinth, Lime", true);
        Drink myExperience = new Drink("My Experience", 10.00, "Fresh Cucumber, Lemon & Lime Juice, Mastiha, Americano Bianco, Keffir Leaves Gin", true);
        Drink goldie = new Drink("Goldie", 13.00, "Hennessy VS Cognac, Rye Whiskey, Pear distillate, Chartreuse Jaune, Agave, Cardamom Bitters, Palo Santo", true);

//        Menu menu = new Menu(nome, TipoMenuEnum.PESCE);
//        //TODO nel menu add e remove, forse dobbiamo usare un set? vogliamo portate duplicate?
//        menu.add( new Bevanda(3.0, "Acqua"));
//
//
//        menu.stampaMenu();
//
//
//        //TODO per dopo le vacanze , sistemare tutto e poi creare la classe ristorrante che conterrà una lista di menu quindi poi sul main
//
//        ristorante.stampaMenues();
//        ristorante.stampaMenues(TipoMenuEnum.PESCE)
//
//        //TODO obbiettivo dopo è fare la classe cliente e creae un sistema di prenotazione(nel ristorante va messo un integer numero posti)
//        // obbiettivo fare una prenotazione e stampare il menu in base al Cliente
    }
}
