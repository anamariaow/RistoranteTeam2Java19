package portate;

public class Antipasti extends Portate{

    private String allergeni;

    private Boolean surgelato;


    public Antipasti(double prezzo, String nomePiatto,String allergeni,Boolean surgelato) {
        super(prezzo, nomePiatto);
        this.allergeni = allergeni;
        this.surgelato = surgelato;
    }


}

