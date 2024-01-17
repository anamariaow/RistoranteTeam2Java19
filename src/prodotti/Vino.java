package prodotti;

import java.util.ArrayList;

public class Vino extends Portata {
    //aggiunta sottoclasse Vino con i suoi fields
    private String tipologia;
    private String descrizione;
    private String provenienza;
    private Integer annoProduzione;

    public Vino(String nome, Double prezzo, ArrayList<AllergeneEnum> allergeniEnumArrayList, String tipologia, String descrizione, String provenienza, Integer annoProduzione) {
        super(nome, prezzo, allergeniEnumArrayList);
        this.tipologia = tipologia;
        this.descrizione = descrizione;
        this.provenienza = provenienza;
        this.annoProduzione = annoProduzione;
    }

    public String getTipologia() {
        return tipologia;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getProvenienza() {
        return provenienza;
    }

    public Integer getAnnoProduzione() {
        return annoProduzione;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setProvenienza(String provenienza) {
        this.provenienza = provenienza;
    }

    public void setAnnoProduzione(Integer annoProduzione) {
        this.annoProduzione = annoProduzione;
    }

    @Override
    public void stampaDettagli() {
        super.stampaDettagli();
    }

}