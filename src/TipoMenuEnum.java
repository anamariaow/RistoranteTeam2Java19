public enum TipoMenuEnum {

    CARNE("Menù di carne"),
    PESCE("Menù di pesce"),
    VEGETARIANO("Menù vegetariano");
    private String descrizione;

    TipoMenuEnum(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}


