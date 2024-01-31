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
     * @auhor Mattia
     * @param recensione: quando chiamato, questo metodo necessita dell'inserimento di un oggetto di tipo Recensione
     */
    public void addRecensione(Recensione recensione) {
        recensioneArrayList.add(recensione);
    }

    /**
     * questo metodo permette di aggiungere una prenotazione
     * @auhor Mattia
     * @param prenotazione: quando chiamato, questo metodo necessita dell'inserimento di un oggetto di tipo Prenotazione
     */
    public void addPrenotazione(Prenotazione prenotazione) {
        prenotazioneLinkedList.add(prenotazione);
    }

    /**
     * questo metodo permette di aggiungere un menu
     * @auhor Antonio
     * @param menu: quando chiamato, questo metodo necessita dell'inserimento di un oggetto di tipo Menu.
     */
    public void aggiungiMenu(Menu menu) {
        boolean nonPresente = false;
        if (menuArrayList.isEmpty()) {
            nonPresente = true;
        } else {
            for (Menu menuVar : menuArrayList) {
                if (!menuVar.getTipoMenuEnum().equals(menu.getTipoMenuEnum())) {
                    nonPresente = true;
                }
            }
        }

        if (nonPresente) {
            menuArrayList.add(menu);
        }
    }
    /**
     * questo metodo permette di rimuovere un menu
     * @auhor Antonio
     * @param menu: quando chiamato, questo metodo necessita dell'inserimento di un oggetto di tipo Menu.
     */
    public void rimuoviMenu(Menu menu) {
        menuArrayList.remove(menu);
    }

    /**
     * questo metodo stampa i dettagli (fields: nomeRistorante, indirizzo) della classe Ristorante e aggiunge colori per rendere la stampa più accattivante.
     * Nel metodo viene chiamato il metodo isRistoranteAperto()
     * @auhor Elisabetta
     */
    public void stampaRistorante() {
        System.out.println('\n' + "Ristorante: " + "\u001B[36m" + "||" + nomeRistorante + "||" + "\u001B[0m \n" + "Indirizzo: " + "\u001B[33m" + " -- " + indirizzoRistorante + " --" + "\u001B[0m \n");
        isRistoranteAperto();
    }

    //TODO ogni metodo deve fare solo il suo, quandi fare un metodo che stampi le prenotazioni
    public void stampaMenu(TipoEnum tipoMenu) {
        System.out.println();
        System.out.println("Menù a cura del grande Chef suricato: ");
        chef.stampaDettagliChef();
        for (Menu menuVar : menuArrayList) {
            if (menuVar.getTipoMenuEnum().equals(tipoMenu)) {
                menuVar.stampaMenu();
            }
        }
        System.out.println();
    }

    public void stampaRecensione() {
        System.out.println("\u001B[32m" + "Recensioni: " + "\u001B[0m");
        for (Recensione recensione : recensioneArrayList) {
            recensione.stampaDettagli();
        }
        System.out.println();
    }

    public void stampaPrenotazione() {
        System.out.println("\u001B[32m" + "Prenotazioni: " + "\u001B[0m");
        for (Prenotazione prenotazione : prenotazioneLinkedList) {
            prenotazione.stampaDettagli();
        }
        System.out.println();
    }

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

    //TODO qui ci deve essere un metodo in overloaded che suggerisce i menu preferiti
    // ciclare sulle prenotazioni per recuperare la preferenza del cliente
}

