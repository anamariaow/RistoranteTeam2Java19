package prodotti;

import java.util.ArrayList;

public abstract class Portata {
    private String nome;
    private Double prezzo;

    private ArrayList<AllergeneEnum> allergeniEnumArrayList;


    public Portata(String nome, Double prezzo, ArrayList<AllergeneEnum> allergeniEnumArrayList) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.allergeniEnumArrayList = allergeniEnumArrayList;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public ArrayList<AllergeneEnum> getAllergeniEnumArrayList() {
        return allergeniEnumArrayList;
    }

    public void setAllergeniEnumArrayList(ArrayList<AllergeneEnum> allergeniEnumArrayList) {
        this.allergeniEnumArrayList = allergeniEnumArrayList;
    }

    public void stampaDettagli() {
        Integer lineLength = 80;
        StringBuilder sb = new StringBuilder(lineLength);
        sb.append(nome);
        //TODO da debbuggare
        for (int i = 0; i + nome.length() < lineLength; i++) {
            sb.append(".");
        }
        sb.append(prezzo);

        System.out.println(sb);

        stampaAllergeni();
    }

    public void stampaAllergeni() {
        if (!allergeniEnumArrayList.isEmpty()) {
            System.out.print("\u001B[31m" + "(");
            for (int i = 0; i < allergeniEnumArrayList.size(); i++) {
                System.out.print(allergeniEnumArrayList.get(i).getDescrizione());
                if(i < allergeniEnumArrayList.size()-1) {
                    System.out.println(", ");
                }
            }
            System.out.println(")" + "\u001B[0m");
        }
    }
}

