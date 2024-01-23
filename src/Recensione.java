public class Recensione {

    //TODO abbiamo l'oggetto a sto punto
    private Cliente cliente;
    private String recensione;
    private Double voto;

    public Recensione(Cliente cliente, String recensione, Double voto) {
        this.cliente = cliente;
        this.recensione = recensione;
        this.voto = voto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getRecensione() {
        return recensione;
    }

    public Double getVoto() {
        return voto;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setRecensione(String recensione) {
        this.recensione = recensione;
    }

    public void setVoto(Double voto) {
        this.voto = voto;
    }

    @Override
    public String toString() {
        return "Nome cliente: '" + cliente.getNome() + '\'' +
                " Recensione: '" + recensione + '\'' +
                " Voto su 5: " + voto;
    }
    public void stampaDettagli(){
        System.out.println("Nome cliente: '" + cliente.getNome() + '\'' +
                " Recensione: '" + recensione + '\'' +
                " Voto su 5: " + voto);
    }
}
