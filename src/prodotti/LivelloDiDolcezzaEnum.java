package prodotti;

public enum LivelloDiDolcezzaEnum {
    ALTO("Alto"),
    MEDIO("Medio"),
    BASSO("Basso");
    private String livelli;
    LivelloDiDolcezzaEnum (String livelli){
        this.livelli=livelli;
    }

    public String getLivelli() {
        return livelli;
    }
}
