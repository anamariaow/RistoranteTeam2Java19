package prodotti;

import java.util.ArrayList;

public class PortateFactory {
    public static Portate creaPortate(String tipo, Double prezzo, String nomePiatto, ArrayList<AllergeniEnum> allergeniEnumArrayList){

        Portate  portata = switch (tipo) {
            case "antipasto" -> new Antipasti(prezzo, nomePiatto, allergeniEnumArrayList);
            case "primo piatto" -> new PrimiPiatti(prezzo, nomePiatto, allergeniEnumArrayList);
            case "secondo piatto" -> new SecondiPiatti(prezzo, nomePiatto, allergeniEnumArrayList);
            case "contorni" -> new Contorni(prezzo, nomePiatto, allergeniEnumArrayList);
            case "dessert" -> new Dessert(prezzo, nomePiatto, allergeniEnumArrayList);
            default -> null;
        };

        return portata;
        }
}
