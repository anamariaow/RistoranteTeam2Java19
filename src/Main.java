import prodotti.*;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Chef chef1 = new Chef("Simon Timon", 45, "☆☆☆");

        Portata insalataDiMare = new Antipasto("Insalata di mare", 10.0, new ArrayList<>(List.of(AllergeneEnum.MOLLUSCHI, AllergeneEnum.CROSTACEI)), CalorieEnum.TRECENTO, false);
        Portata cruditesDiMare = new Antipasto("Crudités di mare", 11.0, new ArrayList<>(List.of(AllergeneEnum.CROSTACEI, AllergeneEnum.LUPINI, AllergeneEnum.MOLLUSCHI)), CalorieEnum.DUECENTOCINQUANTA, true);
        Portata polipettiAffogati = new Antipasto("Polipetti affogati", 9.0, new ArrayList<>(List.of(AllergeneEnum.FRUTTAAGUSCIO)), CalorieEnum.DUECENTO, false);

        Portata trepoline = new Primo("Trepoline con rape e cozze", 10.0, new ArrayList<>(List.of(AllergeneEnum.MOLLUSCHI)), CalorieEnum.CINQUECENTO);
        Portata assassina = new Primo("Spaghetti all'assassina con polpo", 14.0, new ArrayList<>(List.of(AllergeneEnum.GLUTINE, AllergeneEnum.FRUTTAAGUSCIO)), CalorieEnum.CINQUECENTOCINQUANTA);
        Portata scoglio = new Primo("Spaghetti allo scoglio", 12.0, new ArrayList<>(List.of(AllergeneEnum.MOLLUSCHI, AllergeneEnum.CROSTACEI, AllergeneEnum.GLUTINE)), CalorieEnum.SEICENTO);

        Portata orata = new Secondo("Orata al cartoccio", 17.0, new ArrayList<>(List.of(AllergeneEnum.SENAPE, AllergeneEnum.CONGELATO)), CalorieEnum.TRECENTOCINQUANTA, Boolean.TRUE);
        Portata polpo = new Secondo("Polpo alla luciana", 12.0, new ArrayList<>(List.of(AllergeneEnum.SEDANO)), CalorieEnum.QUATTROCENTOCINQUANTA, Boolean.TRUE);
        Portata gamberoni = new Secondo("Gamberoni al forno", 15.0, new ArrayList<>(List.of(AllergeneEnum.CROSTACEI)), CalorieEnum.QUATTROCENTO, Boolean.TRUE);

        Portata patate = new Contorno("Patate al limone", 7.0, new ArrayList<>(), CalorieEnum.CENTOCINQUANTA);
        Portata carote = new Contorno("Carote alla vinaigrette", 6.0, new ArrayList<>(List.of(AllergeneEnum.SESAMO)), CalorieEnum.CENTOCINQUANTA);
        Portata carciofi = new Contorno("Carciofi allo zest d'arancia", 6.5, new ArrayList<>(), CalorieEnum.CENTO);

        Portata dessertMango = new Dessert("Mousse di Mango", 10.50, new ArrayList<>(List.of(AllergeneEnum.LATTE)), CalorieEnum.CENTO, LivelloDolcezzaEnum.MEDIO);
        Portata dessertMaracuya = new Dessert("Mousse di Maracuya", 8.50, new ArrayList<>(List.of(AllergeneEnum.LATTE)), CalorieEnum.CENTOCINQUANTA, LivelloDolcezzaEnum.ALTO);
        Portata dessertNoce = new Dessert("Mousse di Noce", 5.50, new ArrayList<>(List.of(AllergeneEnum.LATTE, AllergeneEnum.FRUTTAAGUSCIO)), CalorieEnum.DUECENTO, LivelloDolcezzaEnum.BASSO);


        //selezione di bevande non alcoliche
        SoftDrink acquaNaturale = new SoftDrink("Acqua Naturale", 4.00, new ArrayList<>(), CalorieEnum.ZERO, 750);
        SoftDrink acquaFrizzante = new SoftDrink("Acqua Frizzante", 4.00, new ArrayList<>(), CalorieEnum.ZERO, 750);
        SoftDrink cocaCola = new SoftDrink("Coca Cola", 6.00, new ArrayList<>(), CalorieEnum.CENTOCINQUANTA, 330);
        SoftDrink fanta = new SoftDrink("Fanta", 6.00, new ArrayList<>(), CalorieEnum.CENTOCINQUANTA, 330);
        SoftDrink sprite = new SoftDrink("Sprite", 6.00, new ArrayList<>(), CalorieEnum.CENTOCINQUANTA, 330);
        SoftDrink lipton = new SoftDrink("Lipton", 6.00, new ArrayList<>(), CalorieEnum.CENTO, 500);
        SoftDrink teCaldo = new SoftDrink("Té caldo", 4.00, new ArrayList<>(), CalorieEnum.CINQUE, 400);

        //selezione di vini spumanti
        Vino domPerignon = new Vino("Champagne Brut Vintage - Dom Pérignon", 300.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)), CalorieEnum.CENTO, CartaViniEnum.BOLLICINA, "Uve - Pinot Nero Chardonnay | Abbinamento - Pesce e crostacei | Alcool - 12.5%", "Champagne, Francia", 2013);
        Vino deVilmont = new Vino("Champagne Brut Réserve Premier Cru - De Vilmont", 50.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)), CalorieEnum.CENTOCINQUANTA, CartaViniEnum.BOLLICINA, "Uve - Chardonnay Pinot Nero Meunier | Abbinamento - Pesce e crostacei | Alcool - 12.5%", "Champagne, Francia", 2020);
        Vino veuveClicquot = new Vino("Champagne Brut Cuvée Saint Petersbourg - Veuve Clicquot", 70.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)), CalorieEnum.CENTO, CartaViniEnum.BOLLICINA, "Uve - Pinot Nero Chardonnay Meunier | Abbinamento - Pesce e crostacei | Alcool - 12%", "Champagne, Francia", 2020);
        Vino serenaWines = new Vino("Prosecco Rosé Vigner - Serena Wines", 25.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)), CalorieEnum.CENTOCINQUANTA, CartaViniEnum.BOLLICINA, "Uve - Glera Pinot Nero | Abbinamento - Salumi | Alcool - 11%", "Veneto, Italia", 2022);
        Vino francoisDiligent = new Vino("Champagne Nature Meunier Frqncois Diligent", 100.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)), CalorieEnum.CENTO, CartaViniEnum.BOLLICINA, "Uve - Meunier | Abbinamento - Pesce e crostacei | Alcool: 12.5%", "Champagne, Francia", 2017);
        Vino colVetoraz = new Vino("Prosecco Valdobbiadene Superiore Extra Dry - Col Vetoraz", 90.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)), CalorieEnum.CENTO, CartaViniEnum.BOLLICINA, "Uve - Timorasso | Abbinamento - Salumi | Alcool - 11.5%", "Veneto, Italia", 2022);

        //selezione di vini bianchi
        Vino hofstatter = new Vino("Alto Adige Gewürztraminer Kolbenhof - Hofstatter", 50.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)), CalorieEnum.CENTOCINQUANTA, CartaViniEnum.BIANCO, "Uve - Gewürztraminer | Abbinamento - Pesce e crostacei | Alcool - 15%", "Alto Adige, Italia", 2021);
        Vino vignetiMassa = new Vino("Colli Tortonesi Timorasso Sterpi - Vigneti Massa", 70.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)), CalorieEnum.CENTOCINQUANTA, CartaViniEnum.BIANCO, "Uve - Timorasso | Abbinamento - Pesce e crostacei | Alcool - 15%", "Piemonte, Italia", 2021);
        Vino bossanova = new Vino("Trebbiano d'Abruzzo - Bossanova", 35.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)), CalorieEnum.CENTOCINQUANTA, CartaViniEnum.BIANCO, "Uve - Trebbiano | Abbinamenti - Pesce e crostacei | Alcool - 12%", "Abruzzo, Italia", 2022);
        Vino tascaDAlmerita = new Vino("Contea di Sclafani Chardonnay Vigna San Francesco - Tasca D'Almerita", 55.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)), CalorieEnum.CENTOCINQUANTA, CartaViniEnum.BIANCO, "Uve - Chardonnay | Abbinamento - Formaggi | Alcool - 14%", "Sicilia, Italia", 2021);
        Vino damijan = new Vino("Venezia Giulia Ribolla Gialla - Damijan", 60.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)), CalorieEnum.CENTOCINQUANTA, CartaViniEnum.BIANCO, "Uve - Ribolla Gialla | Abbinamento - Carni bianche e verdure | Alcool - 13.5%", "Friuli-Venezia Giulia, Italia", 2019);
        Vino girlan = new Vino("Alto Adige Pinot Bianco Platt & Riegl - Girlan", 20.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)), CalorieEnum.CENTOCINQUANTA, CartaViniEnum.BIANCO, "Uve - Pinot Bianco | Abbinamento - Carni bianche e verdure | Alcool - 14%", "Alto Adige, Italia", 2022);

        //selezione di vini rossi
        Vino bennati = new Vino("Valpolicella Ripasso Superiore Sfojà - Bennati", 30.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)), CalorieEnum.CENTO, CartaViniEnum.ROSSO, "Uve - Corvina Corvinone Rondinella | Abbinamento - Carni rosse | Alcool - 14%", "Veneto, Italia", 2021);
        Vino donnafugata = new Vino("Sicilia Mille e una Notte - Donnafugata", 80.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)), CalorieEnum.CENTO, CartaViniEnum.ROSSO, "Uve - Nero d'Avola Petit Verdot Syrah | Abbinamento - Carni rosse | Alcool - 13.5%", "Sicilia, Italia", 2019);
        Vino pandolfa = new Vino("Rubicone Sangiovese Ginevra - Pandolfa", 25.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)), CalorieEnum.CENTO, CartaViniEnum.ROSSO, "Uve - Sangiovese | Abbinamento - Carni bianche e verdure | Alcool - 12%", "Emilia Romagna, Italia", 2022);
        Vino montepulciano = new Vino("Montepulciano d'Abbruzzo - Bossanova", 35.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)), CalorieEnum.CENTO, CartaViniEnum.ROSSO, "Uve - Montepulciano | Abbinamento - Carni bianche e verdure | Alcool - 13.5%", "Abbruzzo, Italia", 2021);
        Vino cavalchina = new Vino("Bardolino - Cavalchina", 20.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)), CalorieEnum.CENTO, CartaViniEnum.ROSSO, "Uve - Corvina Rondinella Molinara | Abbinamento - Salumi | Alcool - 12.5%", "Veneto, Italia", 2022);
        Vino villaSpinosa = new Vino("Recioto Classico della Valpolicella Francesca Finato - Villa Spinosa", 40.00, new ArrayList<>(List.of(AllergeneEnum.SOLFITI)), CalorieEnum.CENTO, CartaViniEnum.ROSSO, "Uve - Corvina Veronese Corvinone Rondinella | Abbinamento - Formaggi | Alcool - 15%", "Veneto, Italia", 2019);

        //selezione di drink alcolici
        Drink bloodyMary = new Drink("Bloody Mary", 10.00, new ArrayList<>(List.of(AllergeneEnum.PEPE)), CalorieEnum.CENTOCINQUANTA, "Bloody Mix, Vodka, Lemon juice, Salt&Pepper");
        Drink camilla = new Drink("Camilla", 10.00, new ArrayList<>(), CalorieEnum.DUECENTO, "Chamomile, Portobello Road Gin, Chartreuse Jaune, Umeshu");
        Drink flo = new Drink("Flò", 10.00, new ArrayList<>(), CalorieEnum.DUECENTO, "Zubrowka, Granny Smith Apple, Lime Sherbet");
        Drink myTie = new Drink("My Tie", 12.00, new ArrayList<>(List.of(AllergeneEnum.FRUTTAAGUSCIO)), CalorieEnum.CENTOCINQUANTA, "Appleton 8 Almond Milk Washed, Dry Curacao, Bubbles");
        Drink beatMe = new Drink("Beat me", 11.00, new ArrayList<>(List.of(AllergeneEnum.SEDANO)), CalorieEnum.DUECENTO, "Bloody Mix, Mr Three and Bros Falernum, Beetroot, Tomato Juice, Celery Cachaca");
        Drink sayMyName = new Drink("Say My Name", 12.00, new ArrayList<>(), CalorieEnum.TRECENTO, "Sage leaves, Absinth, Ginger Syrup, Lime, Fig Liqueur, Xoriguer Gin");
        Drink fermento = new Drink("Fermento", 10.00, new ArrayList<>(List.of(AllergeneEnum.PEPE)), CalorieEnum.TRECENTOCINQUANTA, "Fresh Sage, Pimento Liqueur, Lemon Juice, Fernet, Honey, Zubrowka, Peated Whisky Spray");
        Drink purpleRain = new Drink("Purple Rain", 11.00, new ArrayList<>(), CalorieEnum.TRECENTO, "Mezcal, Select, Raspberry, Beetrot, Ginger Ale, Absinth, Lime");
        Drink myExperience = new Drink("My Experience", 10.00, new ArrayList<>(), CalorieEnum.DUECENTO, "Fresh Cucumber, Lemon & Lime Juice, Mastiha, Americano Bianco, Kaffir Leaves Gin");
        Drink goldie = new Drink("Goldie", 13.00, new ArrayList<>(), CalorieEnum.QUATTROCENTO, "Hennessy VS Cognac, Rye Whiskey, Pear distillate, Chartreuse Jaune, Agave, Cardamom Bitters, Palo Santo");

        MenuBuilder builder = new MenuBuilder();
        builder.setTipoMenuEnum(TipoEnum.PESCE).setDataCreazione(OffsetDateTime.parse("2023-12-04T13:00:00Z"));
        Menu menu = builder.build();

        Cliente cliente1 = new Cliente("Ana B.", 2, TipoEnum.ALL);
        Cliente cliente2 = new Cliente("Mario F.", 4, TipoEnum.PESCE);
        Cliente cliente3 = new Cliente("Antonio T.", 4, TipoEnum.APERITIVO);
        Cliente cliente4 = new Cliente("Michele V.", 2, TipoEnum.VEGETARIANO);


        Ristorante ristorante = new Ristorante("Un ristorante qualsiasi", "Via dei Ricchi 100", LocalTime.of(11, 00), LocalTime.of(23, 30), DayOfWeek.SUNDAY, 10, chef1);
        Recensione recensione1 = new Recensione(cliente1, "Il ristorante ha superato le mie aspettative, il cibo era davvero ottimo e anche l'accostamento dei vini proposto dal sommelier era perfetto. Il personale davvero gentile e l'ambiente bellissimo, perfetto anche per una cena romantica. Tornerò sicuramente.", 5.0);
        Recensione recensione2 = new Recensione(cliente2, "Ottimo cibo e ottimo ambiente, io e la mia famiglia abbiamo scelto il menù di Pesce ed era spettacolare.", 5.0);
        Recensione recensione3 = new Recensione(cliente3, "Io e la mia compagna siamo stati a cena qui qualche sera fa e abbiamo mangiato bene, ci è piaciuta la vasta scelta di menù. Noi abbiamo mangiato un po' di tutto", 4.0);
        Recensione recensione4 = new Recensione(cliente4, "Uno dei pochi ristoranti che hanno una scelta così varia di piatti vegani e vegetariani. Torneremo presto", 4.5);

        Prenotazione prenotazione1 = new Prenotazione("2024-03-17 20:00", cliente1, 4);
        Prenotazione prenotazione2 = new Prenotazione("2024-03-16 20:00", cliente2, 3);
        Prenotazione prenotazione3 = new Prenotazione("2024-03-19 20:00", cliente3, 2);
        Prenotazione prenotazione4 = new Prenotazione("2024-03-11 20:00", cliente4, 5);


        ristorante.stampaRistorante();

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
        ristorante.addRecensione(recensione2);
        ristorante.addRecensione(recensione3);
        ristorante.addRecensione(recensione4);

        ristorante.addPrenotazione(prenotazione1);
        ristorante.addPrenotazione(prenotazione2);
        ristorante.addPrenotazione(prenotazione3);
        ristorante.addPrenotazione(prenotazione4);

        ristorante.aggiungiMenu(menu);
        cliente1.stampaDettagliCliente();

        ristorante.stampaMenu(TipoEnum.PESCE);
        ristorante.stampaMenuConsigliati();

        ristorante.stampaRecensione();
        ristorante.stampaPrenotazione();

        ristorante.creaComanda(cliente1, TipoEnum.ALL);
        ristorante.aggiungiPortateAComanda(insalataDiMare, cliente1);
        ristorante.aggiungiPortateAComanda(polipettiAffogati, cliente1);
        ristorante.aggiungiPortateAComanda(scoglio, cliente1);
        ristorante.aggiungiPortateAComanda(trepoline, cliente1);
        ristorante.aggiungiPortateAComanda(orata, cliente1);
        ristorante.aggiungiPortateAComanda(polpo, cliente1);
        ristorante.aggiungiPortateAComanda(carciofi, cliente1);
        ristorante.aggiungiPortateAComanda(carote, cliente1);
        ristorante.aggiungiPortateAComanda(dessertMango, cliente1);
        ristorante.aggiungiPortateAComanda(dessertMaracuya, cliente1);
        ristorante.aggiungiPortateAComanda(acquaFrizzante, cliente1);
        ristorante.aggiungiPortateAComanda(bossanova, cliente1);
        ristorante.aggiungiPortateAComanda(bloodyMary, cliente1);
        ristorante.aggiungiPortateAComanda(purpleRain, cliente1);
        ristorante.aggiungiPortateAComanda(patate, cliente1);
        ristorante.aggiungiPortateAComanda(acquaNaturale, cliente1);

        ristorante.stampaDettagliComanda(cliente1);
        ristorante.pagaContoRistorante(cliente1);
        //ristorante.rimuoviComandaChiusa(cliente1);

        ristorante.creaComanda(cliente2, TipoEnum.PESCE);
        ristorante.aggiungiPortateAComanda(cruditesDiMare, cliente2);
        ristorante.aggiungiPortateAComanda(polipettiAffogati, cliente2);
        ristorante.aggiungiPortateAComanda(cruditesDiMare, cliente2);
        ristorante.aggiungiPortateAComanda(insalataDiMare, cliente2);
        ristorante.aggiungiPortateAComanda(scoglio, cliente2);
        ristorante.aggiungiPortateAComanda(trepoline, cliente2);
        ristorante.aggiungiPortateAComanda(assassina, cliente2);
        ristorante.aggiungiPortateAComanda(assassina, cliente2);
        ristorante.aggiungiPortateAComanda(orata, cliente2);
        ristorante.aggiungiPortateAComanda(gamberoni, cliente2);
        ristorante.aggiungiPortateAComanda(gamberoni, cliente2);
        ristorante.aggiungiPortateAComanda(polpo, cliente2);
        ristorante.aggiungiPortateAComanda(carciofi, cliente2);
        ristorante.aggiungiPortateAComanda(carote, cliente2);
        ristorante.aggiungiPortateAComanda(carote, cliente2);
        ristorante.aggiungiPortateAComanda(patate, cliente2);
        ristorante.aggiungiPortateAComanda(dessertMango, cliente2);
        ristorante.aggiungiPortateAComanda(dessertMaracuya, cliente2);
        ristorante.aggiungiPortateAComanda(acquaNaturale, cliente2);
        ristorante.aggiungiPortateAComanda(acquaFrizzante, cliente2);

        ristorante.stampaDettagliComanda(cliente2);
        ristorante.pagaContoRistorante(cliente2);
        //ristorante.rimuoviComandaChiusa(cliente2);

        ristorante.creaComanda(cliente3, TipoEnum.APERITIVO);
        ristorante.aggiungiPortateAComanda(polipettiAffogati, cliente3);
        ristorante.aggiungiPortateAComanda(polipettiAffogati, cliente3);
        ristorante.aggiungiPortateAComanda(insalataDiMare, cliente3);
        ristorante.aggiungiPortateAComanda(cruditesDiMare, cliente3);
        ristorante.aggiungiPortateAComanda(goldie, cliente3);
        ristorante.aggiungiPortateAComanda(fermento, cliente3);
        ristorante.aggiungiPortateAComanda(camilla, cliente3);
        ristorante.aggiungiPortateAComanda(beatMe, cliente3);
        ristorante.aggiungiPortateAComanda(montepulciano, cliente3);
        ristorante.aggiungiPortateAComanda(hofstatter, cliente3);

        ristorante.stampaDettagliComanda(cliente3);
        ristorante.pagaContoRistorante(cliente3);
        //ristorante.rimuoviComandaChiusa(cliente3);

        ristorante.creaComanda(cliente4, TipoEnum.VEGETARIANO);
        ristorante.aggiungiPortateAComanda(carote, cliente4);
        ristorante.aggiungiPortateAComanda(patate, cliente4);
        ristorante.aggiungiPortateAComanda(carciofi, cliente4);
        ristorante.aggiungiPortateAComanda(carciofi, cliente4);
        ristorante.aggiungiPortateAComanda(carote, cliente4);
        ristorante.aggiungiPortateAComanda(dessertNoce, cliente4);
        ristorante.aggiungiPortateAComanda(dessertNoce, cliente4);
        ristorante.aggiungiPortateAComanda(acquaNaturale, cliente4);
        ristorante.aggiungiPortateAComanda(girlan, cliente4);

        ristorante.stampaDettagliComanda(cliente4);
        ristorante.pagaContoRistorante(cliente4);
        //ristorante.rimuoviComandaChiusa(cliente4);

    }
}
