import prodotti.Antipasto;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ristorante {
    private String nomeRistorante;
    private String orarioApertura;
    private Integer numeroPosti;
    private Chef chef;
    private ArrayList<Menu> menuArrayList;
    private ArrayList<Recensione> recensioneArrayList;
    private LinkedList<Prenotazione> prenotazioneLinkedList;

    public Ristorante(String nomeRistorante, String orarioApertura, Integer numeroPosti,Chef chef) {
        this.nomeRistorante = nomeRistorante;
        this.orarioApertura = orarioApertura;
        this.numeroPosti = numeroPosti;
        this.chef = chef;
        this.menuArrayList = new ArrayList<>();
        this.recensioneArrayList = new ArrayList<>();
        this.prenotazioneLinkedList = new LinkedList<>();
    }

    public String getNomeRistorante() {
        return nomeRistorante;
    }

    public void setNomeRistorante(String nomeRistorante) {
        this.nomeRistorante = nomeRistorante;
    }
    public String getOrarioApertura() {
        return orarioApertura;
    }

    public void setOrarioApertura(String orarioApertura) {
        this.orarioApertura = orarioApertura;
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
    public void addRecensione(Recensione recensione){
        recensioneArrayList.add(recensione);
    }
    public void addPrenotazione(Prenotazione prenotazione){
        prenotazioneLinkedList.add(prenotazione);
    }


    public void aggiungiMenu(Menu menu){
        boolean nonPresente = false;
        if(menuArrayList.isEmpty()) {
            nonPresente = true;
        }else{
            for(Menu menuVar : menuArrayList){
                if(!menuVar.getTipoMenuEnum().equals(menu.getTipoMenuEnum())){
                    nonPresente = true;
                }
            }
        }

        if(nonPresente){
            menuArrayList.add(menu);
        }
    }

    public void rimuoviMenu(Menu menu){
        menuArrayList.remove(menu);
    }

    public void stampaRistorante() {
        System.out.println('\n'+"Ristorante: " + "\u001B[36m" + nomeRistorante + "\u001B[0m \n");

    }
    public void stampaMenu(TipoEnum tipoMenu){
        System.out.println();
        System.out.println("Menù a cura del grande Chef suricato: ");
        chef.stampaDettagliChef();
        for(Menu menuVar : menuArrayList){
            if(menuVar.getTipoMenuEnum().equals(tipoMenu) ){
                menuVar.stampaMenu();
            }
        }
        System.out.println("\u001B[32m"+"Recensioni: "+"\u001B[0m");
        for(Recensione recensione:recensioneArrayList){
            recensione.stampaDettagli();
        }
        System.out.println();
        System.out.println("\u001B[32m"+"Prenotazioni: "+"\u001B[0m");
        for(Prenotazione prenotazione:prenotazioneLinkedList){
            prenotazione.stampaDettagli();
        }
    }

}

