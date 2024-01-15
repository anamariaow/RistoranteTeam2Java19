package prodotti;

import java.util.ArrayList;

public abstract class Portata {
    private Double prezzo;
    private String nomePiatto;
    private ArrayList<AllergeneEnum> allergeneEnumArrayList;


    public Portata(Double prezzo, String nomePiatto, ArrayList<AllergeneEnum> allergeneEnumArrayList) {
        this.prezzo = prezzo;
        this.nomePiatto = nomePiatto;
        this.allergeneEnumArrayList = allergeneEnumArrayList;

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

    public ArrayList<AllergeneEnum> getAllergeniEnumArrayList() {
        return allergeneEnumArrayList;
    }

    public void setAllergeniEnumArrayList(ArrayList<AllergeneEnum> allergeneEnumArrayList) {
        this.allergeneEnumArrayList = allergeneEnumArrayList;
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
        if (!allergeneEnumArrayList.isEmpty()) {
            System.out.print("(");
            for (AllergeneEnum allergeneEnum : allergeneEnumArrayList) {
                System.out.print(allergeneEnum.getDescrizione() + ",");
            }
            System.out.println(")");
        }
    }
}

