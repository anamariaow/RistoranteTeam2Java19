package prodotti;

    public enum CartaViniEnum {
        ROSSO ("Vino rosso"),
        BIANCO ("Vino bianco"),
        BOLLICINA("Bollicina");
        private String descrizione;

        CartaViniEnum(String descrizione) {
            this.descrizione = descrizione;
        }

        public String getDescrizione() {
            return descrizione;
        }
    }

