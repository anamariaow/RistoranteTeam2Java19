package prodotti;

public enum AllergeneEnum {
    SOIA ("contiene soia"),
    UOVA ("contiene uova"),
    LATTE ("contiene latte"),
    GLUTINE ("contiene glutine"),
    FRUTTAAGUSCIO ("contiene frutta a guscio"),
    ARACHIDI ("contiene arachidi"),
    CROSTACEI ("contiene crostacei"),
    MOLLUSCHI ("contiene molluschi"),
    CEREALI ("contiene cereali"),
    FAVE ("contiene fave"),
    LUPINI ("contiene lupini"),
    SENAPE ("contiene senape"),
    SEDANO ("contiene sedano"),
    SESAMO ("contiene sesamo"),
    SOLFITI("contiene solfiti"),
    PEPE("contiene pepe");
    private String descrizione;

    AllergeneEnum(String descrizione){
        this.descrizione = descrizione;
    }
    public String getDescrizione(){
        return descrizione;
    }
}