public enum TipoEnum {


    ALL("Menu"),
    CARNE("Menù di carne"),
    PESCE("Menù di pesce"),
    VEGETARIANO("Menù vegetariano"),
    BABY("Menù Baby"),
    Vegano("Menù Vegano"),
    APERITIVO("Menù Aperitivo");
    private String descrizione;

    TipoEnum(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}


