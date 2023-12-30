package prodotti;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Portate {
    private Double prezzo;
    private String nomePiatto;
     private ArrayList<AllergeniEnum> allergeniEnumArrayList;



    public Portate(Double prezzo, String nomePiatto,ArrayList<AllergeniEnum> allergeniEnumArrayList) {
        this.prezzo = prezzo;
        this.nomePiatto = nomePiatto;
        this.allergeniEnumArrayList=allergeniEnumArrayList;

    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public String getNomePiatto() {
        return nomePiatto;
    }

    public void setNomePiatto(String nomePiatto) {
        this.nomePiatto = nomePiatto;
    }

    public ArrayList<AllergeniEnum> getAllergeniEnumArrayList() {
        return allergeniEnumArrayList;
    }

    public void setAllergeniEnumArrayList(ArrayList<AllergeniEnum> allergeniEnumArrayList) {
        this.allergeniEnumArrayList = allergeniEnumArrayList;
    }

    public void stampaDettagli(){

        System.out.println(nomePiatto + " " + prezzo + " Є");
        stampaAllergeni();
    }
    public void stampaAllergeni(){
        for (AllergeniEnum allergeniEnum : allergeniEnumArrayList ){
            System.out.println("Allergeni Presenti : " + allergeniEnum.getDescrizione());
        }
    }



}
