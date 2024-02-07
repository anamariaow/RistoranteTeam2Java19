public class FidelityCard {
    private Integer punti;
    private Cliente cliente;
    public FidelityCard(){
        this.punti = 0;
    }

    public Integer getPunti() {
        return punti;
    }

    public void setPunti(Integer punti) {
        this.punti = punti;
    }
    public void stampaDettagli(){
        System.out.println("Il cliente: " + cliente.getNome() + " ha " + punti + " punti.");
    }

}
