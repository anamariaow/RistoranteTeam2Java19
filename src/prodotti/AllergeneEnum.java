package prodotti;

public enum AllergeneEnum {
    SOIA ("soia"),
    UOVA ("uova"),
    LATTE ("latte"),
    GLUTINE ("glutine"),
    FRUTTAAGUSCIO ("frutta a guscio"),
    ARACHIDI ("arachidi"),
    CROSTACEI ("crostacei"),
    MOLLUSCHI ("molluschi"),
    CEREALI ("cereali"),
    FAVE ("fave"),
    LUPINI ("lupini"),
    SENAPE ("senape"),
    SEDANO ("sedano"),
    SESAMO ("sesamo"),
    SOLFITI("solfiti"),
    PEPE("pepe"),
    CONGELATO ("prodotto congelato a bordo");
    private String descrizione;

    AllergeneEnum(String descrizione){
        this.descrizione = descrizione;
    }
    public String getDescrizione(){
        return descrizione;
    }
}
