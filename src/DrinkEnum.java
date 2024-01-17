public enum DrinkEnum {
    FRIZZANTE ("frizzante"),
    ALCOLICO ("alcolico"),
    ANALCOLICO ("Analcolico");
    private String descrizione;
    DrinkEnum(String descrizione){
        this.descrizione = descrizione;
    }
    public String getDescrizione(){
        return descrizione;
    }
}
