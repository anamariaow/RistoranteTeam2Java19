public enum VegEnum {
    VEGANO ("Piatto vegano"),
    VEGETARIANO ("Piatto vegetariano");
    private String descrizione;
    VegEnum(String descrizione){
        this.descrizione = descrizione;
    }
    public String getDescrizione(){
        return descrizione;
    }
}
