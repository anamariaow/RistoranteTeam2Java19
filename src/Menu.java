import prodotti.*;

import java.time.ZonedDateTime;
import java.util.*;

public class Menu {

    private List<Portata> portataList;
    private TipoMenuEnum tipoMenuEnum;
    private final ZonedDateTime dataCreazione;
    private ZonedDateTime dataUltimaModifica;
    public Menu (TipoMenuEnum tipoMenuEnum) {
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

    public TipoMenuEnum getTipoMenuEnum() {
        return tipoMenuEnum;
    }

    public void setTipoMenuEnum(TipoMenuEnum tipoMenuEnum) {
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

        //TODO la lista di portate va aggiunga nel main perchè l'unico posto dove si creano oggetti è li
        //TODO in questo modo possiamo creare più menu e aggiungere quante portate vogliamo la lista è this.portate

        for (Portata portata : portataList) {
            if (portata instanceof Antipasto) {
                portata.stampaDettagli();
            }
        }
        for (Portata portata : portataList) {
            if (portata instanceof Primo) {
                portata.stampaDettagli();
            }
        }
        for (Portata portata : portataList) {
            if (portata instanceof Secondo) {
                portata.stampaDettagli();
            }
        }
        for (Portata portata : portataList) {
            if (portata instanceof Contorno) {
                portata.stampaDettagli();
            }
        }
        for (Portata portata : portataList) {
            if (portata instanceof Dessert) {
                portata.stampaDettagli();
            }
        }
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
