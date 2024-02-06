import prodotti.Portata;

import java.util.ArrayList;

public class Comanda {
    private Cliente cliente;
    private TipoEnum tipoMenu;
    private Portata antipasto;
    private Portata primo;
    private Portata secondo;
    private Portata contorno;
    private Portata dolce;
    private Portata softDrink;
    private Portata drink;
    private Portata vino;
    private Portata extra1;
    private Portata extra2;

    public Comanda(Cliente cliente, TipoEnum tipoMenu, Portata antipasto, Portata primo, Portata secondo, Portata contorno, Portata dolce, Portata softDrink, Portata drink, Portata vino, Portata extra1, Portata extra2) {
        this.cliente = cliente;
        this.tipoMenu = tipoMenu;
        this.antipasto = antipasto;
        this.primo = primo;
        this.secondo = secondo;
        this.contorno = contorno;
        this.dolce = dolce;
        this.softDrink = softDrink;
        this.drink = drink;
        this.vino = vino;
        this.extra1 = extra1;
        this.extra2 = extra2;
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

    public Portata getAntipasto() {
        return antipasto;
    }

    public void setAntipasto(Portata antipasto) {
        this.antipasto = antipasto;
    }

    public Portata getPrimo() {
        return primo;
    }

    public void setPrimo(Portata primo) {
        this.primo = primo;
    }

    public Portata getSecondo() {
        return secondo;
    }

    public void setSecondo(Portata secondo) {
        this.secondo = secondo;
    }

    public Portata getContorno() {
        return contorno;
    }

    public void setContorno(Portata contorno) {
        this.contorno = contorno;
    }

    public Portata getDolce() {
        return dolce;
    }

    public void setDolce(Portata dolce) {
        this.dolce = dolce;
    }

    public Portata getSoftDrink() {
        return softDrink;
    }

    public void setSoftDrink(Portata softDrink) {
        this.softDrink = softDrink;
    }

    public Portata getDrink() {
        return drink;
    }

    public void setDrink(Portata drink) {
        this.drink = drink;
    }

    public Portata getVino() {
        return vino;
    }

    public void setVino(Portata vino) {
        this.vino = vino;
    }

    public Portata getExtra1() {
        return extra1;
    }

    public void setExtra1(Portata extra1) {
        this.extra1 = extra1;
    }

    public Portata getExtra2() {
        return extra2;
    }

    public void setExtra2(Portata extra2) {
        this.extra2 = extra2;
    }


    public void stampaDettagliComanda(ArrayList<Portata> ordineCliente) {
        System.out.println("\u001B[33m" + "Comanda cliente " + cliente + ": " + "\u001B[0m" + "\n" + "\u001B[36m" + "Menu scelto: " + cliente.getMenuScelto()  + "\n" + "\u001B[0m");
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
        pagamentoConto(ordineCliente);
        System.out.println("");
    }


    public void pagamentoConto(ArrayList<Portata> ordineCliente) {
        Double contoTotale = 0.0;
        for (Portata portata : ordineCliente) {
            if (ordineCliente.contains(portata)) {
                contoTotale += portata.getPrezzo();
            }
        }
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
