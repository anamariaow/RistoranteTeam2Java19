public class Prenotazione {
    private String orarioPrenotazione;
    private Cliente cliente;
    private int postiRiservati;

    public Prenotazione(String orarioPrenotazione, Cliente cliente, int postiRiservati) {
        this.orarioPrenotazione = orarioPrenotazione;
        this.cliente = cliente;
        this.postiRiservati = postiRiservati;
    }

    public String getOrarioPrenotazione() {
        return orarioPrenotazione;
    }

    public void setOrarioPrenotazione(String orarioPrenotazione) {
        this.orarioPrenotazione = orarioPrenotazione;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getPostiRiservati() {
        return postiRiservati;
    }

    public void setPostiRiservati(int postiRiservati) {
        this.postiRiservati = postiRiservati;
    }

    public void stampaDettagli(){
        System.out.println("Prenotazione : " +
                "Data e ora prenotazione = " + orarioPrenotazione  +
                " Cliente =" + cliente +
                " Posti riservati = " + postiRiservati);
    }
}