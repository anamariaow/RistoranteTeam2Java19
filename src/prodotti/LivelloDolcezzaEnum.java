package prodotti;

public enum LivelloDolcezzaEnum {
    ALTO("Alto"),
    MEDIO("Medio"),
    BASSO("Basso");
    private String livelli;
    LivelloDolcezzaEnum(String livelli){
        this.livelli=livelli;
    }

    public String getLivelli() {
        return livelli;
    }
}
