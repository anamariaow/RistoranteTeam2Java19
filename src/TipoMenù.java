public enum TipoMenù {

    //TODO mai accenti e poi si scrive enum dopo il nome
    CARNE("Menù di carne"),
    PESCE("Menù di pesce"),
    VEGETALI("Menù vegetariano");
    public String descrizione;
    TipoMenù(String descrizione) {
        this.descrizione = descrizione;
    }

    //TODO perchè non c'è il getter
}


