package prodotti;

public enum LivelloDolcezzaEnum {
    ALTO("Dolcezza alto"),
    MEDIO("Dolcezza medio"),
    BASSO("Dolcezza basso");
    private String livelli;
    LivelloDolcezzaEnum(String livelli){
        this.livelli=livelli;
    }

    public String getLivelli() {
        return livelli;
    }
}
