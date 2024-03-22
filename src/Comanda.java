import prodotti.Portata;

import java.util.ArrayList;
import java.util.Objects;

public class Comanda {
    private Cliente cliente;
    private TipoEnum tipoMenu;
    private ArrayList<Portata> ordineCliente;

    public Comanda(Cliente cliente, TipoEnum tipoMenu) {
        this.cliente = cliente;
        this.tipoMenu = tipoMenu;
        this.ordineCliente = new ArrayList<>();

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoEnum getTipoMenu() {
        return tipoMenu;
    }

    public void setTipoMenu(TipoEnum tipoMenu) {
        this.tipoMenu = tipoMenu;
    }

    public ArrayList<Portata> getOrdineCliente() {
        return ordineCliente;
    }

    public void setOrdineCliente(ArrayList<Portata> ordineCliente) {
        this.ordineCliente = ordineCliente;
    }
    public void aggiungiPortataAComanda(Portata portata) {
        ordineCliente.add(portata);
    }
    public void rimuoviPortataDaComanda(Portata portata) {
        ordineCliente.remove(portata);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comanda comanda = (Comanda) o;
        return Objects.equals(cliente, comanda.cliente) && tipoMenu == comanda.tipoMenu && Objects.equals(ordineCliente, comanda.ordineCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cliente, tipoMenu, ordineCliente);
    }

    public void stampaDettagliComanda() {
        System.out.println("\u001B[33m" + "Comanda cliente " + cliente.getNome() + ": " + "\u001B[0m" + "\n" + "\u001B[36m" + "Menu scelto: " + cliente.getMenuScelto()  + "\n" + "\u001B[0m");
        for (Portata portata : ordineCliente) {
            Integer lineLength = 50;
            StringBuilder sb = new StringBuilder(lineLength);
            sb.append(portata.getNome());
            for (int i = 0; i + portata.getNome().length() < lineLength; i++) {
                sb.append(".");
            }
            sb.append(portata.getPrezzo());

            System.out.println(sb);
        }
    }

    public Double calcoloContoTotale(){
        Double contoTotale = 0.0;
        for (Portata portata : ordineCliente) {
            if (ordineCliente.contains(portata)) {
                contoTotale += portata.getPrezzo();
            }
        }
        Integer puntiCliente = cliente.getFidelityCard().getPunti();
        if(puntiCliente>=1000){
            puntiCliente -= 1000;
            contoTotale = contoTotale/100*80;
            cliente.getFidelityCard().setPunti(puntiCliente);
        }
        return  contoTotale;
    }
    public void pagamentoConto() {
        Double contoTotale = calcoloContoTotale();

        Integer lineLength = 50;
        System.out.println("\u001B[32m");
        StringBuilder sb = new StringBuilder(lineLength);
        String stringaTotale = "Totale:";
        sb.append(stringaTotale);
        for (int i = 0; i + stringaTotale.length() < lineLength; i++) {
            sb.append(".");
        }
        sb.append(contoTotale);

        System.out.println(sb);
        System.out.println("\u001B[0m");
    }
}
