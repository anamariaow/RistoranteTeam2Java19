public class Recensione {
    private Cliente cliente;
    private String recensione;
    private Double voto;

    public Recensione(Cliente cliente, String recensione, Double voto) {
        this.cliente = cliente;
        this.recensione = recensione;
        this.voto = voto;
    }

    public void stampaDettagli(){
        System.out.println(cliente.getNome() + " - " + '\'' +
                recensione + '\'' +
                " - Voto: " + voto + "/5");
    }
}
