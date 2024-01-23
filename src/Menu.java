import prodotti.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class Menu {

    private List<Portata> portataList;
    private TipoEnum tipoMenuEnum;
    private final ZonedDateTime dataCreazione;
    private ZonedDateTime dataUltimaModifica;
    public Menu (TipoEnum tipoMenuEnum) {
        this.tipoMenuEnum = tipoMenuEnum;
        this.portataList = new ArrayList<>();
        this.dataCreazione = ZonedDateTime.now();
        this.dataUltimaModifica = ZonedDateTime.now();
        }

    public List<Portata> getPortateList() {
        return portataList;
    }

    public void setPortateList(List<Portata> portataList) {
        this.portataList = portataList;
    }

    public TipoEnum getTipoMenuEnum() {
        return tipoMenuEnum;
    }

    public void setTipoMenuEnum(TipoEnum tipoMenuEnum) {
        this.tipoMenuEnum = tipoMenuEnum;
    }

    public ZonedDateTime getDataCreazione() {
        return dataCreazione;
    }

    public ZonedDateTime getDataUltimaModifica() {
        return dataUltimaModifica;
    }

    public void setDataUltimaModifica(ZonedDateTime dataUltimaModifica) {
        this.dataUltimaModifica = dataUltimaModifica;
    }


    //creazione del metodo per stampare tutto il menu
    public void stampaMenu() {
        System.out.println("\u001B[35m"+"\nAntipasti:\n"+"\u001B[0m");
        for (Portata portata : portataList) {
            if (portata instanceof Antipasto) {
                portata.stampaDettagli();
            }
        }
        System.out.println("\u001B[35m"+"\nPrimi:\n"+"\u001B[0m");
        for (Portata portata : portataList) {
            if (portata instanceof Primo) {
                portata.stampaDettagli();
            }
        }
        System.out.println("\u001B[35m"+"\nSecondi:\n"+"\u001B[0m");
        for (Portata portata : portataList) {
            if (portata instanceof Secondo) {
                portata.stampaDettagli();
            }
        }
        System.out.println("\u001B[35m"+"\nContorni:\n"+"\u001B[0m");
        for (Portata portata : portataList) {
            if (portata instanceof Contorno) {
                portata.stampaDettagli();
            }
        }
        System.out.println("\u001B[35m"+"\nDessert:\n"+"\u001B[0m");
        for (Portata portata : portataList) {
            if (portata instanceof Dessert) {
                portata.stampaDettagli();
            }
        }
        System.out.println("\u001B[35m"+"\nCarta Dei Vini:\n"+"\u001B[0m");
        for (Portata portata : portataList) {
            if (portata instanceof Vino) {
                portata.stampaDettagli();
            }
        }
        System.out.println("\u001B[35m"+"\nSoft Drinks:\n"+"\u001B[0m");
        for (Portata portata : portataList) {
            if (portata instanceof SoftDrink) {
                portata.stampaDettagli();
            }
        }
        System.out.println("\u001B[35m"+"\nDrinks:\n"+"\u001B[0m");
        for (Portata portata : portataList) {
            if (portata instanceof Drink) {
                portata.stampaDettagli();
            }
        }
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.ITALY);
        String dataCreazioneFormat = dataCreazione.format(dateTimeFormatter);
        String dataUltimaModificaFormat = dataUltimaModifica.format(dateTimeFormatter);
        System.out.println(" ");
        System.out.println("\u001B[32m" + "Questo menù è stato creato " + dataCreazioneFormat);
        System.out.println("Ultima modifica effettuata " + dataUltimaModificaFormat + "\u001B[0m");
        System.out.println(" ");
    }
    public void addPortata (Portata portata) throws Exception {
        if (!portataList.contains(portata)) {
            portataList.add(portata);
        } else {
            throw new Exception("Portata già presente nel menù");
        }
    }
    public void removePortata (Portata portata) {
        portataList.remove(portata);
    }
}
