import prodotti.*;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Menu {

    private List<Portata> portataList;
    private TipoEnum tipoMenuEnum;
    private OffsetDateTime dataCreazione;

    public Menu (TipoEnum tipoMenuEnum,OffsetDateTime dataCreazione) {
        this.tipoMenuEnum = tipoMenuEnum;
        this.portataList = new ArrayList<>();
        this.dataCreazione = dataCreazione;
    }

    public List<Portata> getPortataList() {
        return portataList;
    }

    public void setPortataList(List<Portata> portataList) {
        this.portataList = portataList;
    }

    public TipoEnum getTipoMenuEnum() {
        return tipoMenuEnum;
    }

    public void setTipoMenuEnum(TipoEnum tipoMenuEnum) {
        this.tipoMenuEnum = tipoMenuEnum;
    }

    public OffsetDateTime getDataCreazione() {
        return dataCreazione;
    }

    public void setDataCreazione(OffsetDateTime dataCreazione) {
        this.dataCreazione = dataCreazione;
    }

    //creazione del metodo per stampare tutto il menu
    public void stampaMenu() {
        System.out.println("\u001B[44m"+" ~  ☆ ANTIPASTI ☆  ~ "+"\u001B[0m");
        for (Portata portata : portataList) {
            if (portata instanceof Antipasto) {
                portata.stampaDettagli();
            }
        }
        System.out.println("\u001B[44m"+" ~    ☆ PRIMI ☆    ~ "+"\u001B[0m");
        for (Portata portata : portataList) {
            if (portata instanceof Primo) {
                portata.stampaDettagli();
            }
        }
        System.out.println("\u001B[44m"+" ~    ☆ SECONDI ☆    ~ "+"\u001B[0m");
        for (Portata portata : portataList) {
            if (portata instanceof Secondo) {
                portata.stampaDettagli();
            }
        }
        System.out.println('\n'+"\u001B[44m"+" ~    ☆ CONTORNI ☆    ~ "+"\u001B[0m");
        for (Portata portata : portataList) {
            if (portata instanceof Contorno) {
                portata.stampaDettagli();
            }
        }
        System.out.println('\n'+"\u001B[44m"+" ~    ☆ DESSERTS ☆    ~ "+"\u001B[0m");
        for (Portata portata : portataList) {
            if (portata instanceof Dessert) {
                portata.stampaDettagli();
            }
        }
        System.out.println('\n'+"\u001B[44m"+" ~   ☆ CARTA VINI ☆   ~ "+"\u001B[0m");
        for (Portata portata : portataList) {
            if (portata instanceof Vino) {
                portata.stampaDettagli();
            }
        }
        System.out.println("\u001B[44m"+" ~  ☆ SOFT DRINKS ☆  ~ "+"\u001B[0m");
        for (Portata portata : portataList) {
            if (portata instanceof SoftDrink) {
                portata.stampaDettagli();
            }
        }
        System.out.println('\n'+"\u001B[44m"+" ~     ☆ DRINKS ☆     ~ "+"\u001B[0m");
        for (Portata portata : portataList) {
            if (portata instanceof Drink) {
                portata.stampaDettagli();
            }
        }
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.ITALY);
        String dataCreazioneFormat = dataCreazione.format(dateTimeFormatter);
        System.out.println('\n'+"\u001B[32m" + "Menù creato in data: " + dataCreazioneFormat +"\u001B[0m");
        System.out.println(" ");
    }
    public void addPortata (Portata portata) throws Exception {
        if (!portataList.contains(portata)) {
            portataList.add(portata);
        } else {
            throw new Exception(portata + "già presente nel menù");
        }
    }
    public void removePortata (Portata portata) {
        portataList.remove(portata);
    }
}
