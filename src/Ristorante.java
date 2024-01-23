import java.util.ArrayList;

public class Ristorante {
    private String nomeRistorante;
    private String orarioApertura;
    private Integer numeroPosti;
    private Chef chef;
    private ArrayList<Menu> menuArrayList;
    private ArrayList<Recensione> recensioneArrayList;




    public Ristorante(String nomeRistorante, String orarioApertura, Integer numeroPosti,Chef chef) {
        this.nomeRistorante = nomeRistorante;
        this.orarioApertura = orarioApertura;
        this.numeroPosti = numeroPosti;
        this.chef = chef;
        this.menuArrayList = new ArrayList<>();
        this.recensioneArrayList = new ArrayList<>();
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

    @Override
    public String toString() {
        return  "Ristorante: " + "\u001B[36m" + nomeRistorante + "\u001B[0m" + ", " +
                "\u001B[32m" + "orarioApertura = " + orarioApertura + "\u001B[0m" +
                ", numeroPosti = " + numeroPosti +
                ", " + "\u001B[34m" + "Ristorante di " + menuArrayList + "\u001B[0m" +
                ", " + "\n" + "Recensioni: " + recensioneArrayList +
                '.';
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

    public void stampaMenu(TipoEnum tipoMenu){
        System.out.println("Ristorante: " + "\u001B[36m" + nomeRistorante + "\u001B[0m \n");
        System.out.println("Menu a cura del grande chef suricato: ");
        chef.stampaDettagliChef();
        for(Menu menuVar : menuArrayList){
            if(menuVar.getTipoMenuEnum().equals(tipoMenu) ){
                menuVar.stampaMenu();
            }
        }
        System.out.println("Recensioni: ");
        for(Recensione recensione:recensioneArrayList){
            recensione.stampaDettagli();
        }
    }
}

