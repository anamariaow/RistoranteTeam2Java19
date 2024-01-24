import prodotti.Portata;

import java.time.OffsetDateTime;
import java.util.List;

public class MenuBuilder {
    private TipoEnum tipoMenuEnum;
    private OffsetDateTime dataCreazione;

    public MenuBuilder() {
    }

    public MenuBuilder setTipoMenuEnum(TipoEnum tipoMenuEnum) {
        this.tipoMenuEnum = tipoMenuEnum;
        return this;
    }

    public MenuBuilder setDataCreazione(OffsetDateTime dataCreazione) {
        this.dataCreazione = dataCreazione;
        return this;
    }

    public Menu build() {
        return new Menu(tipoMenuEnum,dataCreazione);
    }
}
