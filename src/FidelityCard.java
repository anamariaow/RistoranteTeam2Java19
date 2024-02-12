public class FidelityCard {
    private Integer punti;
    public FidelityCard(){
        this.punti = 0;
    }

    public Integer getPunti() {
        return punti;
    }

    public void setPunti(Integer punti) {
        this.punti = punti;
    }

    public void addPuntiFidelityCard(double punti) {
        this.punti += (int) punti;
    }


}
