public enum DrinksEnum {
    FRIZZANTE ("frizzante"),
    ALCOLICO ("alcolico"),
    ANALCOLICO ("Analcolico");
    private String descrizione;
    DrinksEnum(String descrizione){
        this.descrizione = descrizione;
    }
    public String getDescrizione(){
        return descrizione;
    }
}
