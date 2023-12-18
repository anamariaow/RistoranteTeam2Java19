public enum AllergeniEnum {
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
    SESAMO ("contiene sesamo");
    private String descrizione;

    AllergeniEnum(String descrizione){
        this.descrizione = descrizione;
    }
    public String getDescrizione(){
        return descrizione;
    }
}
