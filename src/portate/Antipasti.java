package portate;

public class Antipasti extends Portate{

    private String allergeni;

    private Boolean surgelato;

//TODO override metodo stampa con il super
    public Antipasti(Double prezzo, String nomePiatto, String allergeni, Boolean surgelato) {
        super(prezzo, nomePiatto);
        this.allergeni = allergeni;
        this.surgelato = surgelato;
    }

    public String getAllergeni() {
        return allergeni;
    }

    public void setAllergeni(String allergeni) {
        this.allergeni = allergeni;
    }

    public Boolean getSurgelato() {
        return surgelato;
    }

    public void setSurgelato(Boolean surgelato) {
        this.surgelato = surgelato;
    }

    @Override
    public String toString() {
        return getNomePiatto() + " " + getPrezzo() + " Є";
    }
}

