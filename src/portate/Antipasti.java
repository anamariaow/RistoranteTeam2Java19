package portate;

public class Antipasti extends Portate{

    private String allergeni;

    private Boolean surgelato;

//TODO override metodo stampa con il super
//TODO getter e setter
//TODO modificare double e Boolean
    public Antipasti(double prezzo, String nomePiatto,String allergeni,Boolean surgelato) {
        super(prezzo, nomePiatto);
        this.allergeni = allergeni;
        this.surgelato = surgelato;
    }


}

