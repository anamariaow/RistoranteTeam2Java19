import java.util.ArrayList;

public class Ristorante {
    private String nomeRistorante;
    private String orarioApertura;
    private Integer numeroPosti;
    private ArrayList<TipoMenuEnum> menuEnumArrayList;
    private ArrayList<Recensione> recensioneArrayList;


    public Ristorante(String nomeRistorante, String orarioApertura, Integer numeroPosti, ArrayList<TipoMenuEnum> menuEnumArrayList, ArrayList<Recensione> recensioneArrayList) {
        this.nomeRistorante = nomeRistorante;
        this.orarioApertura = orarioApertura;
        this.numeroPosti = numeroPosti;
        this.menuEnumArrayList = menuEnumArrayList;
        this.recensioneArrayList = recensioneArrayList;
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

    public ArrayList<TipoMenuEnum> getMenuEnumArrayList() {
        return menuEnumArrayList;
    }

    public void setMenuEnumArrayList(ArrayList<TipoMenuEnum> menuEnumArrayList) {
        this.menuEnumArrayList = menuEnumArrayList;
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
                ", " + "\u001B[34m" + "Ristorante di " + menuEnumArrayList + "\u001B[0m" +
                ", " + "\n" + "Recensioni: " + recensioneArrayList +
                '.';
    }
}

