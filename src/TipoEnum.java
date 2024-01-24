public enum TipoEnum {
    ALL("Menù completo"),
    CARNE("Menù di carne"),
    PESCE("Menù di pesce"),
    VEGETARIANO("Menù vegetariano"),
    BABY("Menù Baby"),
    VEGANO("Menù Vegano"),
    APERITIVO("Menù Aperitivo");
    private String descrizione;

    TipoEnum(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}


