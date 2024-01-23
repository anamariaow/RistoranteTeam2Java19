import prodotti.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Chef chef1 = new Chef("Simon Timon", 45, 3);

        Portata insalataDiMare = new Antipasto("Insalata di mare",10.0, new ArrayList<>(List.of(AllergeneEnum.MOLLUSCHI, AllergeneEnum.CROSTACEI)),true);
        Portata cruditesDiMare = new Antipasto("Crudités di mare",11.0, new ArrayList<>(List.of(AllergeneEnum.CROSTACEI, AllergeneEnum.LUPINI, AllergeneEnum.MOLLUSCHI)),false);
        Portata polipettiAffogati = new Antipasto("Polipetti affogati",9.0, new ArrayList<>(List.of(AllergeneEnum.FRUTTAAGUSCIO)),true);

        Portata trepoline = new Primo("Trepoline con rape e cozze",10.0, new ArrayList<>(List.of(AllergeneEnum.MOLLUSCHI)),CalorieEnum.CENTO);
        Portata assassina = new Primo("Spaghetti all'assassina con polpo",14.0, new ArrayList<>(List.of(AllergeneEnum.GLUTINE, AllergeneEnum.FRUTTAAGUSCIO)),CalorieEnum.CENTOVENTI);
        Portata scoglio = new Primo("Spaghetti allo scoglio",12.0, new ArrayList<>(List.of(AllergeneEnum.MOLLUSCHI, AllergeneEnum.CROSTACEI, AllergeneEnum.GLUTINE)),CalorieEnum.CINQUECENTO);

        Portata orata = new Secondo("Orata al cartoccio",17.0, new ArrayList<>(List.of(AllergeneEnum.SENAPE, AllergeneEnum.CONGELATO)),true);
        Portata polpo = new Secondo("Polpo alla luciana",12.0, new ArrayList<>(List.of(AllergeneEnum.SEDANO)),true);
        Portata gamberoni = new Secondo("Gamberoni al forno",15.0, new ArrayList<>(List.of(AllergeneEnum.CROSTACEI)),false);

        Portata patate = new Contorno("Patate al limone",7.0, new ArrayList<>(),true,false);
        Portata carote = new Contorno("Carote alla vinaigrette",6.0, new ArrayList<>(List.of(AllergeneEnum.SESAMO)),true,false);
        Portata carciofi = new Contorno("Carciofi allo zest d'arancia",6.5, new ArrayList<>(),true,true);

        Portata dessertMango = new Dessert("Mousse di Mango",10.50, new ArrayList<>(List.of(AllergeneEnum.LATTE)), LivelloDolcezzaEnum.MEDIO, CalorieEnum.CENTO);
        Portata dessertMaracuya = new Dessert("Mousse di Maracuya",8.50, new ArrayList<>(List.of(AllergeneEnum.LATTE)), LivelloDolcezzaEnum.ALTO, CalorieEnum.SESSANTA);
        Portata dessertNoce = new Dessert("Mousse di Noce",5.50, new ArrayList<>(List.of(AllergeneEnum.LATTE, AllergeneEnum.FRUTTAAGUSCIO)), LivelloDolcezzaEnum.BASSO, CalorieEnum.OTTANTA);


        //selezione di bevande non alcoliche
        SoftDrink acquaNaturale = new SoftDrink("Acqua Naturale", 4.00, new ArrayList<>(),750);
        SoftDrink acquaFrizzante = new SoftDrink("Acqua Frizzante", 4.00, new ArrayList<>(),750);
        SoftDrink cocaCola = new SoftDrink("Coca Cola", 6.00, new ArrayList<>(),330);
        SoftDrink fanta = new SoftDrink("Fanta", 6.00, new ArrayList<>(),330);
        SoftDrink sprite = new SoftDrink("Sprite", 6.00, new ArrayList<>(),330);
        SoftDrink lipton = new SoftDrink("Lipton", 6.00, new ArrayList<>(),500);
        SoftDrink teCaldo = new SoftDrink("Té caldo", 4.00, new ArrayList<>(),400);

        //delezione di vini spumanti
        Vino domPerignon = new Vino("Champagne Brut Vintage - Dom Pérignon", 300.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)),"Bollicina", "Uve: Pinot Nero Chardonnay, Abbinamento: Pesce e crostacei, Alcool: 12.5%", "Champagne, Francia", 2013);
        Vino deVilmont = new Vino("Champagne Brut Réserve Premier Cru - De Vilmont", 50.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)),"Bollicina", "Uve: Chardonnay Pinot Nero Meunier, Abbinamento: Pesce e crostacei, Alcool: 12.5%", "Champagne, Francia", 2020);
        Vino veuveClicquot = new Vino("Champagne Brut Cuvée Saint Petersbourg - Veuve Clicquot", 70.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)),"Bollicina", "Uve: Pinot Nero Chardonnay Meunier, Abbinamento: Pesce e crostacei, Alcool: 12%", "Champagne, Francia", 2020);
        Vino serenaWines = new Vino("Prosecco Rosé Vigner - Serena Wines", 25.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)),"Bollicina", "Uve: Glera Pinot Nero, Abbinamento: Salumi, Alcool: 11%", "Veneto, Italia", 2022);
        Vino francoisDiligent = new Vino("Champagne Nature Meunier Frqncois Diligent", 100.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)),"Bollicina", "Uve: Meunier, Abbinamento: Pesce e crostacei, Alcool: 12.5%", "Champagne, Francia", 2017);
        Vino colVetoraz = new Vino("Prosecco Valdobbiadene Superiore Extra Dry - Col Vetoraz", 90.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)),"Bollicina", "Uve: Timorasso, Abbinamento: Salumi, Alcool: 11.5%", "Veneto, Italia", 2022);

        //selezione di vini bianchi
        Vino hofstatter = new Vino("Alto Adige Gewürztraminer Kolbenhof - Hofstatter", 50.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)),"Bianco", "Uve: Gewürztraminer, Abbinamento: Pesce e crostacei, Alcool: 15%", "Alto Adige, Italia", 2021);
        Vino vignetiMassa = new Vino("Colli Tortonesi Timorasso Sterpi - Vigneti Massa", 70.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)),"Bianco", "Uve: Timorasso, Abbinamento: Pesce e crostacei, Alcool: 15%", "Piemonte, Italia", 2021);
        Vino bossanova = new Vino("Trebbiano d'Abruzzo - Bossanova", 35.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)),"Bianco", "Uve: Trebbiano, Abbinamenti: Pesce e crostacei, Alcool: 12%", "Abruzzo, Italia", 2022);
        Vino tascaDAlmerita = new Vino("Contea di Sclafani Chardonnay Vigna San Francesco - Tasca D'Almerita", 55.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)),"Bianco", "Uve: Chardonnay, Abbinamento: Formaggi, Alcool: 14%", "Sicilia, Italia", 2021);
        Vino damijan = new Vino("Venezia Giulia Ribolla Gialla - Damijan", 60.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)),"Bianco", "Uve: Ribolla Gialla, Abbinamento: Carni bianche e verdure, Alcool: 13.5%", "Friuli-Venezia Giulia, Italia", 2019);
        Vino girlan = new Vino("Alto Adige Pinot Bianco Platt & Riegl - Girlan", 20.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)),"Bianco", "Uve: Pinot Bianco, Abbinamento: Carni bianche e verdure, Alcool: 14%", "Alto Adige, Italia", 2022);

        //selezione di vini rossi
        Vino bennati = new Vino("Valpolicella Ripasso Superiore Sfojà - Bennati", 30.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)),"Rosso", "Uve: Corvina Corvinone Rondinella, Abbinamento: Carni rosse, Alcool: 14%", "Veneto, Italia", 2021);
        Vino donnafugata = new Vino("Sicilia Mille e una Notte - Donnafugata", 80.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)),"Rosso", "Uve: Nero d'Avola Petit Verdot Syrah, Abbinamento: Carni rosse, Alcool: 13.5%", "Sicilia, Italia", 2019);
        Vino pandolfa = new Vino("Rubicone Sangiovese Ginevra - Pandolfa", 25.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)),"Rosato", "Uve: Sangiovese, Abbinamento: Carni bianche e verdure, Alcool: 12%", "Emilia Romagna, Italia", 2022);
        Vino montepulciano = new Vino("Montepulciano d'Abbruzzo - Bossanova", 35.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)),"Rosso", "Uve: Montepulciano, Abbinamento: Carni bianche e verdure, Alcool: 13.5%", "Abbruzzo, Italia", 2021);
        Vino cavalchina = new Vino("Bardolino - Cavalchina", 20.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)),"Rosso", "Uve: Corvina Rondinella Molinara, Abbinamento: Salumi, Alcool: 12.5%", "Veneto, Italia", 2022);
        Vino villaSpinosa = new Vino("Recioto Classico della Valpolicella Francesca Finato Spinosa - Villa Spinosa", 40.00,new ArrayList<>(List.of(AllergeneEnum.SOLFITI)),"Rosso", "Uve:  Corvina Veronese Corvinone Rondinella, Abbinamento: Formaggi, Alcool: 15%", "Veneto, Italia", 2019);

        //selezione di drink alcolici
        Drink bloodyMary = new Drink("Bloody Mary", 10.00, new ArrayList<>(List.of(AllergeneEnum.PEPE)),"Bloody Mix, Vodka, Lemon juice, Salt&Pepper", true);
        Drink camilla = new Drink("Camilla", 10.00, new ArrayList<>(),"Chamomile, Portobello Road Gin, Chartreuse Jaune, Umeshu", true);
        Drink flo = new Drink("Flò", 10.00, new ArrayList<>(),"Zubrowka, Granny Smith Apple, Lime Sherbet", true);
        Drink myTie = new Drink("My Tie", 12.00, new ArrayList<>(List.of(AllergeneEnum.FRUTTAAGUSCIO)),"Appleton 8 Almond Milk Washed, Dry Curacao, Bubbles", true);
        Drink beatMe = new Drink("Beat me", 11.00, new ArrayList<>(List.of(AllergeneEnum.SEDANO)),"Bloody Mix, Mr Three and Bros Falernum, Beetroot, Tomato Juice, Celery Cachaca", true);
        Drink sayMyName = new Drink("Say My Name", 12.00, new ArrayList<>(),"Sage leaves, Absinth, Ginger Syrup, Lime, Fig Liqueur, Xoriguer Gin", true);
        Drink fermento = new Drink("Fermento", 10.00, new ArrayList<>(List.of(AllergeneEnum.PEPE)),"Fresh Sage, Pimento Liqueur, Lemon Juice, Fernet, Honey, Zubrowka, Peated Whisky Spray", true);
        Drink purpleRain = new Drink("Purple Rain", 11.00, new ArrayList<>(),"Mezcal, Select, Raspberry, Beetrot, Ginger Ale, Absinth, Lime", true);
        Drink myExperience = new Drink("My Experience", 10.00, new ArrayList<>(),"Fresh Cucumber, Lemon & Lime Juice, Mastiha, Americano Bianco, Kaffir Leaves Gin", true);
        Drink goldie = new Drink("Goldie", 13.00, new ArrayList<>(),"Hennessy VS Cognac, Rye Whiskey, Pear distillate, Chartreuse Jaune, Agave, Cardamom Bitters, Palo Santo", true);


        Menu menu = new Menu(TipoEnum.PESCE);

        Cliente cliente1= new Cliente("Mario",4,TipoEnum.PESCE);
        Cliente cliente2= new Cliente("Antonio",4,TipoEnum.ALL);
        Cliente cliente3= new Cliente("Michele",2,TipoEnum.VEGETARIANO);
        Cliente cliente4 = new Cliente("Ana",2,TipoEnum.ALL);


        Ristorante ristorante = new Ristorante("Un ristorante qualsiasi","11:00",10,chef1);
        Recensione recensione1 = new Recensione(cliente4, "Il ristorante ha superato le mie aspettative, il cibo era davvero ottimo e anche l'accostamento dei vini proposto dal sommelier era perfetto. Il personale davvero gentile e l'ambiente bellissimo, perfetto anche per una cena romantica. Tornerò sicuramente.",5.0);
        Recensione recensione2 = new Recensione(cliente1, "Ottimo cibo e ottimo ambiente, io e la mia famiglia abbiamo scelto il menù di Pesce ed era spettacolare.", 5.0);

        //Antipasti
        menu.addPortata(insalataDiMare);
        menu.addPortata(cruditesDiMare);
        menu.addPortata(polipettiAffogati);

        //Primi
        menu.addPortata(trepoline);
        menu.addPortata(assassina);
        menu.addPortata(scoglio);

        //Secondi
        menu.addPortata(orata);
        menu.addPortata(polpo);
        menu.addPortata(gamberoni);

        //Contorni
        menu.addPortata(patate);
        menu.addPortata(carote);
        menu.addPortata(carciofi);

        //Dessert
        menu.addPortata(dessertMango);
        menu.addPortata(dessertMaracuya);
        menu.addPortata(dessertNoce);

        //Soft Drink
        menu.addPortata(acquaNaturale);
        menu.addPortata(acquaFrizzante);
        menu.addPortata(cocaCola);
        menu.addPortata(fanta);
        menu.addPortata(sprite);
        menu.addPortata(lipton);
        menu.addPortata(teCaldo);

        //Vini Spumanti
        menu.addPortata(domPerignon);
        menu.addPortata(deVilmont);
        menu.addPortata(veuveClicquot);
        menu.addPortata(serenaWines);
        menu.addPortata(francoisDiligent);
        menu.addPortata(colVetoraz);

        //Vini Bianchi
        menu.addPortata(hofstatter);
        menu.addPortata(vignetiMassa);
        menu.addPortata(bossanova);
        menu.addPortata(tascaDAlmerita);
        menu.addPortata(damijan);
        menu.addPortata(girlan);

        //Vini Rossi
        menu.addPortata(bennati);
        menu.addPortata(donnafugata);
        menu.addPortata(pandolfa);
        menu.addPortata(montepulciano);
        menu.addPortata(cavalchina);
        menu.addPortata(villaSpinosa);

        //Drink
        menu.addPortata(bloodyMary);
        menu.addPortata(camilla);
        menu.addPortata(flo);
        menu.addPortata(myTie);
        menu.addPortata(beatMe);
        menu.addPortata(sayMyName);
        menu.addPortata(fermento);
        menu.addPortata(purpleRain);
        menu.addPortata(myExperience);
        menu.addPortata(goldie);

        ristorante.addRecensione(recensione1);

        ristorante.aggiungiMenu(menu);
        ristorante.stampaMenu(TipoEnum.PESCE);


        cliente1.stampaDettagliCliente();
        cliente1.vizualizzaMenuConsigliti(ristorante);

    }
}
