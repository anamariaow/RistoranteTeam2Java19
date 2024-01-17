public enum TipoEnum {

    //TODO in base a come viene creato il cliente noi gli diamo la possibilità di visualizzare solo i menù di sua prederenza

    ALL("Menu"),
    CARNE("Menù di carne"),
    PESCE("Menù di pesce"),
    VEGETARIANO("Menù vegetariano");
    private String descrizione;

    TipoEnum(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}


