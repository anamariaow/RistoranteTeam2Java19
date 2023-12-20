public enum DrinksEnum {
    //TODO boolean isAlcolico, isAnalcolico
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
