package prodotti;

import java.util.ArrayList;

public abstract class Portate {
    private Double prezzo;
    private String nomePiatto;
    private ArrayList<AllergeniEnum> allergeniEnumArrayList;


    public Portate(Double prezzo, String nomePiatto, ArrayList<AllergeniEnum> allergeniEnumArrayList) {
        this.prezzo = prezzo;
        this.nomePiatto = nomePiatto;
        this.allergeniEnumArrayList = allergeniEnumArrayList;

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

    public void stampaDettagli() {
        Integer lineLength = 40;
        StringBuilder sb = new StringBuilder(lineLength);
        sb.append(nomePiatto);
        for (int i = 0; i + nomePiatto.length() + prezzo < lineLength; i++) {
            sb.append(".");
        }
        sb.append(prezzo);

        System.out.println(sb);

        stampaAllergeni();
    }

    public void stampaAllergeni() {
        if (!allergeniEnumArrayList.isEmpty()) {
            System.out.print("(");
            for (AllergeniEnum allergeniEnum : allergeniEnumArrayList) {
                System.out.print(allergeniEnum.getDescrizione() + ",");
            }
            System.out.println(")");
        }
    }
}

