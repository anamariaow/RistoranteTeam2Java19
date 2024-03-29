import prodotti.*;

import prodotti.Portata;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;

public class Ristorante {
    private String nomeRistorante;
    private String indirizzoRistorante;
    private LocalTime orarioApertura;
    private LocalTime orarioChiusura;
    private DayOfWeek giornoChiusura;
    private Integer numeroPosti;
    private Chef chef;
    private ArrayList<Menu> menuArrayList;
    private ArrayList<Recensione> recensioneArrayList;
    private LinkedList<Prenotazione> prenotazioneLinkedList;
    private ArrayList<Comanda> listaComande;

    public Ristorante(String nomeRistorante, String indirizzoRistorante, LocalTime orarioApertura, LocalTime orarioChiusura, DayOfWeek giornoChiusura, Integer numeroPosti, Chef chef) {
        this.nomeRistorante = nomeRistorante;
        this.indirizzoRistorante = indirizzoRistorante;
        this.orarioApertura = orarioApertura;
        this.orarioChiusura = orarioChiusura;
        this.giornoChiusura = giornoChiusura;
        this.numeroPosti = numeroPosti;
        this.chef = chef;
        this.menuArrayList = new ArrayList<>();
        this.recensioneArrayList = new ArrayList<>();
        this.prenotazioneLinkedList = new LinkedList<>();
        this.listaComande = new ArrayList<>();
    }

    public String getNomeRistorante() {
        return nomeRistorante;
    }

    public String getIndirizzoRistorante() {
        return indirizzoRistorante;
    }

    public void setIndirizzoRistorante(String indirizzoRistorante) {
        this.indirizzoRistorante = indirizzoRistorante;
    }

    public void setNomeRistorante(String nomeRistorante) {
        this.nomeRistorante = nomeRistorante;
    }

    public LocalTime getOrarioApertura() {
        return orarioApertura;
    }

    public void setOrarioApertura(LocalTime orarioApertura) {
        this.orarioApertura = orarioApertura;
    }

    public LocalTime getOrarioChiusura() {
        return orarioChiusura;
    }

    public void setOrarioChiusura(LocalTime orariChiusura) {
        this.orarioChiusura = orariChiusura;
    }

    public DayOfWeek getGiornoChiusura() {
        return giornoChiusura;
    }

    public void setGiornoChiusura(DayOfWeek giornoChiusura) {
        this.giornoChiusura = giornoChiusura;
    }

    public Integer getNumeroPosti() {
        return numeroPosti;
    }

    public void setNumeroPosti(Integer numeroPosti) {
        this.numeroPosti = numeroPosti;
    }

    public ArrayList<Menu> getMenuArrayList() {
        return menuArrayList;
    }

    public void setMenuArrayList(ArrayList<Menu> menuArrayList) {
        this.menuArrayList = menuArrayList;
    }

    public ArrayList<Recensione> getRecensioneArrayList() {
        return recensioneArrayList;
    }

    public void setRecensioneArrayList(ArrayList<Recensione> recensioneArrayList) {
        this.recensioneArrayList = recensioneArrayList;
    }

    /**
     * questo metodo permette di aggiungere una recensione
     *
     * @param recensione: quando chiamato, questo metodo necessita dell'inserimento di un oggetto di tipo Recensione
     * @auhor Mattia
     */
    public void addRecensione(Recensione recensione) {
        recensioneArrayList.add(recensione);
    }

    /**
     * questo metodo permette di aggiungere una prenotazione
     *
     * @param prenotazione: quando chiamato, questo metodo necessita dell'inserimento di un oggetto di tipo Prenotazione
     * @auhor Mattia
     */
    public void addPrenotazione(Prenotazione prenotazione) {
        prenotazioneLinkedList.add(prenotazione);
    }

    /**
     * questo metodo permette di aggiungere un menu
     *
     * @param menu: quando chiamato, questo metodo necessita dell'inserimento di un oggetto di tipo Menu.
     * @auhor Antonio
     */
    public void aggiungiMenu(Menu menu) {
        if (!menuArrayList.contains(menu.getTipoMenuEnum())){
            menuArrayList.add(menu);
        }
    }

    /**
     * questo metodo permette di rimuovere un menu
     *
     * @param menu: quando chiamato, questo metodo necessita dell'inserimento di un oggetto di tipo Menu.
     * @author Antonio
     */
    public void rimuoviMenu(Menu menu) {
        menuArrayList.remove(menu);
    }

    /**
     * questo metodo stampa i dettagli (fields: nomeRistorante, indirizzo) della classe Ristorante e aggiunge colori per rendere la stampa più accattivante.
     * Nel metodo viene chiamato il metodo isRistoranteAperto()
     *
     * @author Elisabetta
     */
    public void stampaRistorante() {
        System.out.println('\n' + "Ristorante: " + "\u001B[36m" + "||" + nomeRistorante + "||" + "\u001B[0m \n" + "Indirizzo: " + "\u001B[33m" + " -- " + indirizzoRistorante + " --" + "\u001B[0m \n");
        isRistoranteAperto();
    }

    /**
     * questo metodo stampa tutto il contenuto del menù (sulla base del tipo scelto dall'enum TipoMenuEnum) e contiene il metodo stampaDettagliChef() che stampa i fields dell'oggetto Chef
     *
     * @param tipoMenu: prende come parametro il tipo di menu scelto dall'enum
     * @author Antonio
     */
    public void stampaMenu(TipoEnum tipoMenu) {
        System.out.println();
        System.out.println("Menù a cura del grande Chef suricato: ");
        chef.stampaDettagliChef();
        piattiConsigliati(tipoMenu);
        for (Menu menuVar : menuArrayList) {
            if (menuVar.getTipoMenuEnum().equals(tipoMenu)) {
                menuVar.stampaMenu();
            }
        }
        System.out.println();
    }

    /**
     * questo metodo stampa le recensioni dei clienti ciclando sull'Arraylist delle recensioni, aggiungendo un colore per rendere la stampa accattivante
     *
     * @author Antonio
     */
    public void stampaRecensione() {
        System.out.println("\u001B[32m" + "Recensioni: " + "\u001B[0m");
        for (Recensione recensione : recensioneArrayList) {
            recensione.stampaDettagli();
        }
        System.out.println();
    }

    /**
     * questo metodo stampa le prenotazioni dei clienti ciclando sulla Linkedlist delle prenotazioni, aggiungendo un colore per rendere la stampa accattivante
     *
     * @author Mattia
     */
    public void stampaPrenotazione() {
        System.out.println("\u001B[32m" + "Prenotazioni: " + "\u001B[0m");
        for (Prenotazione prenotazione : prenotazioneLinkedList) {
            prenotazione.stampaDettagli();
        }
        System.out.println();
    }

    /**
     * questo metodo mostra in tempo reale se il ristorante è aperto, usando gli operatori logici. Se al momento della consultazione del menù il ristorante risulta chiuso, mostra gli orari di apertura.
     * I colori rendono la stampa più chiara.
     *
     * @author Elisabetta
     */
    public void isRistoranteAperto() {
        LocalTime oraAttuale = LocalTime.now();
        LocalDateTime oggi = LocalDateTime.now();
        DayOfWeek giornoOggi = oggi.getDayOfWeek();
        if (oraAttuale.isAfter(orarioApertura) && giornoOggi != giornoChiusura) {
            System.out.println("\u001B[32m" + "Oggi il ristorante è aperto dalle " + orarioApertura + " alle " + orarioChiusura + "\u001B[0m");
        } else if (oraAttuale.isBefore(orarioApertura) || giornoOggi == giornoChiusura) {
            System.out.println("\u001B[31m" + "Il ristorante è chiuso. Aprirà domani alle " + orarioApertura + "\u001B[0m");
        }
        System.out.println(" ");
    }

    /**
     * questo metodo compie una selezione tra le portate presenti in ogni classe (Antipasto, Primo Secondo etc.), preferendo piatti di stagione (se presenti) o in base al numero di persone.
     * fornisce quindi una selezione di piatti consigliati con una stampa personalizzata da font e colori diversi per rendere migliore la leggibilità in console.
     * @param tipoMenu: prende come parametro il tipo di menu scelto dall'enum.
     * @author Antonio.
     */
    public void piattiConsigliati(TipoEnum tipoMenu) {
        System.out.println("\u001B[43m" + " ~  ☆ PIATTI CONSIGLIATI DALLO CHEF ☆  ~ " + "\u001B[0m");
        System.out.println();
        for (Menu menuVar : menuArrayList) {
            if (menuVar.getTipoMenuEnum().equals(tipoMenu)) {
                for (Portata portata : menuVar.getPortataList()) {
                    if (portata instanceof Antipasto) {
                        if (!((Antipasto) portata).getPerDuePersone()) {
                            System.out.println("\u001B[43m" + " ~  ☆ ANTIPASTO ☆  ~ " + "\u001B[0m");
                            portata.stampaDettagli();
                            break;
                        }
                    }
                }
                for (Portata portata : menuVar.getPortataList()) {
                    if (portata instanceof Primo) {
                        if (!portata.getAllergeniEnumArrayList().contains(AllergeneEnum.GLUTINE)) {
                            System.out.println("\u001B[43m" + " ~    ☆ PRIMO ☆    ~ " + "\u001B[0m");
                            portata.stampaDettagli();
                            break;
                        }
                    }
                }
                for (Portata portata : menuVar.getPortataList()) {
                    if (portata instanceof Secondo) {
                        if (((Secondo) portata).getProdottoStagionale()) {
                            System.out.println("\u001B[43m" + " ~    ☆ SECONDO ☆    ~ " + "\u001B[0m");
                            portata.stampaDettagli();
                            break;
                        }
                    }
                }
            }
        }
    }

    /**
     * metodo d stampa per i piatti consigliati.
     * @author Samira.
     */
    public void stampaMenuConsigliati() {
        System.out.println("Menu consigliati:");
        for (Prenotazione prenotazione : prenotazioneLinkedList) {
            for (Menu menu : menuArrayList) {
                if (prenotazione.getCliente().getMenuScelto().equals(menu.getTipoMenuEnum())) {
                    stampaMenu(prenotazione.getCliente().getMenuScelto());
                }
            }
        }
    }

    /**
     * metodo per creare una nuova comanda e aggiungerla all'Arraylist di comande esistenti.
     * @param cliente: inserendo un oggetto Cliente, gli si associa direttamente la nuova comanda.
     * @param tipoMenu: inserendo il tipoMenu come parametro, questo comparirà nella nuova comanda.
     * @author Elisabetta.
     */
    public void creaComanda(Cliente cliente, TipoEnum tipoMenu) {
        listaComande.add(new Comanda(cliente, tipoMenu));

    }

    /**
     * metoo per aggiunger una portata alla comanda.
     * @param portata: la portata da aggiungere.
     * @param cliente: il cliente a cui è associata la comanda.
     * @author Elisabetta.
     */
    public void aggiungiPortateAComanda(Portata portata, Cliente cliente) {
        for (Comanda comanda : listaComande) {
            if (comanda.getCliente().equals(cliente)) {
                comanda.aggiungiPortataAComanda(portata);
            }
        }
    }

    /**
     * metodo di stampa del contenuto della comanda.
     * @param cliente: il cliente associato alla comanda permette di selezionare la comanda che si desidera stampare.
     * @author Elisabetta.
     */
    public void stampaDettagliComanda(Cliente cliente) {
        for (Comanda comanda : listaComande) {
            if (comanda.getCliente().equals(cliente)) {
                comanda.stampaDettagliComanda();
            }
        }
    }

    /**
     * metodo che permette di pagare il conto, sommando tutti i prezzi di ciascuna portata inserita nella comanda. Aggiung inoltre i punti fidelity in base alla somma pagata.
     * @param cliente: il cliente associato alla comanda permette di selezionare la comanda di cui si desidera il totale dell'ordine.
     * @author ELisabetta
     */
    public void pagaContoRistorante(Cliente cliente) {
        for (Comanda comanda : listaComande) {
            if (comanda.getCliente().equals(cliente)) {
                comanda.pagamentoConto();
                comanda.getCliente().getFidelityCard().addPuntiFidelityCard(comanda.calcoloContoTotale());
            }
        }
    }

    /**
     * metodo che permette di rimuovere le comande chiuse.
     * @param cliente: il cliente associato alla comanda permette di selezionare la comanda che si desidera eliminare.
     * @author ELisabetta
     */
    public void rimuoviComandaChiusa(Cliente cliente) {
        Comanda comanda = null;
        for (Comanda comandaVar : listaComande) {
            if (cliente.equals(comandaVar.getCliente())) {
                comanda = comandaVar;
            }
        }
        if (comanda != null) {
            listaComande.remove(comanda);
            System.out.println("Comanda " + cliente.getNome() + " rimossa.");
        }
        System.out.println("");
    }
}


