package prodotti;

import java.util.ArrayList;

public abstract class Portata {
    private Double prezzo;
    private String nomePiatto;
    private ArrayList<AllergeneEnum> allergeniEnumArrayList;


    public Portata(Double prezzo, String nomePiatto, ArrayList<AllergeneEnum> allergeniEnumArrayList) {
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

    public ArrayList<AllergeneEnum> getAllergeniEnumArrayList() {
        return allergeniEnumArrayList;
    }

    public void setAllergeniEnumArrayList(ArrayList<AllergeneEnum> allergeniEnumArrayList) {
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
            System.out.print("\u001B[31m" + "(");
            for (AllergeneEnum allergeniEnum : allergeniEnumArrayList) {
                System.out.print(allergeniEnum.getDescrizione() + ", ");
            }
            System.out.println(")" + "\u001B[0m");
        }
    }
}

