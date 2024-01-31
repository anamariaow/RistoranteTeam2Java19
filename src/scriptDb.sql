CREATE DATABASE ristorante_team2;
CREATE TABLE ristorante_team2.menu(
id INT PRIMARY KEY AUTO_INCREMENT,
portata_list LONG VARCHAR NOT NULL,
tipo_enum LONG VARCHAR NOT NULL,
data_creazione DATETIME NOT NULL
);
CREATE TABLE ristorante_team2.primo(
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(100) NOT NULL,
prezzo DOUBLE NOT NULL,
allergeniEnumArrayList LONG VARCHAR,
calorieEnum LONG VARCHAR NOT NULL,
id_menu INT,
FOREIGN KEY (id_menu) REFERENCES menu(id)
);
CREATE TABLE ristorante_team2.antipasto(
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(100) NOT NULL,
prezzo DOUBLE NOT NULL,
allergeniEnumArrayList LONG VARCHAR,
calorieEnum LONG VARCHAR NOT NULL,
perDuePersone BOOL,
id_menu INT,
FOREIGN KEY (id_menu) REFERENCES menu(id)
);

CREATE TABLE ristorante_team2.secondo (
id INT auto_increment NOT NULL PRIMARY KEY,
nome VARCHAR (255) NOT NULL,
prezzo DOUBLE NOT NULL,
lista_allergeni_enum VARCHAR (255),
calorie_enum VARCHAR (100),
id_menu INT,
FOREIGN KEY (id_menu) REFERENCES menu(id)
);

CREATE TABLE ristorante_team2.contorno (
id INT auto_increment NOT NULL PRIMARY KEY,
nome VARCHAR (255) NOT NULL,
prezzo DOUBLE NOT NULL,
lista_allergeni_enum VARCHAR (255),
calorie_enum VARCHAR (100),
id_menu INT,
FOREIGN KEY (id_menu) REFERENCES menu(id)
);

CREATE TABLE ristorante_team2.dessert (
id INT auto_increment NOT NULL PRIMARY KEY,
nome VARCHAR (255) NOT NULL,
prezzo DOUBLE NOT NULL,
lista_allergeni_enum VARCHAR (255),
calorie_enum VARCHAR (100),
livello_dolcezza_enum LONG VARCHAR NOT NULL,
id_menu INT,
FOREIGN KEY (id_menu) REFERENCES menu(id)
);

CREATE TABLE ristorante_team2.vino (
id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
nome VARCHAR(100) NOT NULL,
prezzo DOUBLE NOT NULL,
lista_allergeni_enum LONG VARCHAR NOT NULL,
calorie_enum VARCHAR(255) NOT NULL,
tipologia VARCHAR(255) NOT NULL,
descrizione LONG VARCHAR NOT NULL,
provenienza VARCHAR(255) NOT NULL,
anno_produzione INT,
id_menu INT,
FOREIGN KEY (id_menu) REFERENCES menu(id)
);

CREATE TABLE ristorante_team2.drink (
id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
nome VARCHAR(100) NOT NULL,
prezzo DOUBLE NOT NULL,
lista_allergeni_enum LONG VARCHAR NOT NULL,
calorie_enum VARCHAR(255) NOT NULL,
ingredienti VARCHAR(255) NOT NULL,
id_menu INT,
FOREIGN KEY (id_menu) REFERENCES menu(id)
);

CREATE TABLE ristorante_team2.soft_drink (
id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
nome VARCHAR(100) NOT NULL,
prezzo DOUBLE NOT NULL,
lista_allergeni_enum LONG VARCHAR NOT NULL,
calorie_enum VARCHAR(255) NOT NULL,
centilitri VARCHAR(255) NOT NULL,
id_menu INT,
FOREIGN KEY (id_menu) REFERENCES menu(id)
);
INSERT INTO ristorante_team2.menu (portata_list,tipo_enum,data_creazione)
VALUES ('

 ~  ☆ MENÙ DI PESCE ☆  ~

 ~  ☆ ANTIPASTI ☆  ~
Insalata di mare................................................................10.0
(molluschi, crostacei)

Crudités di mare (per due persone)..............................................11.0
(crostacei, lupini, molluschi)

Polipetti affogati..............................................................9.0
(frutta a guscio)

 ~    ☆ PRIMI ☆    ~
Trepoline con rape e cozze......................................................10.0
(molluschi)

Spaghetti all\'assassina con polpo...............................................14.0
(glutine, frutta a guscio)

Spaghetti allo scoglio..........................................................12.0
(molluschi, crostacei, glutine)

 ~    ☆ SECONDI ☆    ~
Orata al cartoccio..............................................................17.0
(senape, prodotto congelato a bordo)
 ~ Piatto di stagione ~
Polpo alla luciana..............................................................12.0
(sedano)
 ~ Piatto di stagione ~
Gamberoni al forno..............................................................15.0
(crostacei)
 ~ Piatto di stagione ~

 ~    ☆ CONTORNI ☆    ~
Patate al limone................................................................7.0
Carote alla vinaigrette.........................................................6.0
(sesamo)
Carciofi allo zest d\'arancia....................................................6.5

 ~    ☆ DESSERTS ☆    ~
Mousse di Mango (Dolcezza medio)................................................10.5
(latte)
Mousse di Maracuya (Dolcezza alto)..............................................8.5
(latte)
Mousse di Noce (Dolcezza basso).................................................5.5
(latte, frutta a guscio)

 ~   ☆ CARTA VINI ☆   ~
Champagne Brut Vintage - Dom Pérignon...........................................300.0
(solfiti)
Tipologia: Bollicina
Descrizione: Uve - Pinot Nero Chardonnay | Abbinamento - Pesce e crostacei | Alcool - 12.5%
Provenienza: Champagne, Francia
Anno di produzione: 2013

Champagne Brut Réserve Premier Cru - De Vilmont.................................50.0
(solfiti)
Tipologia: Bollicina
Descrizione: Uve - Chardonnay Pinot Nero Meunier | Abbinamento - Pesce e crostacei | Alcool - 12.5%
Provenienza: Champagne, Francia
Anno di produzione: 2020

Champagne Brut Cuvée Saint Petersbourg - Veuve Clicquot.........................70.0
(solfiti)
Tipologia: Bollicina
Descrizione: Uve - Pinot Nero Chardonnay Meunier | Abbinamento - Pesce e crostacei | Alcool - 12%
Provenienza: Champagne, Francia
Anno di produzione: 2020

Prosecco Rosé Vigner - Serena Wines.............................................25.0
(solfiti)
Tipologia: Bollicina
Descrizione: Uve - Glera Pinot Nero | Abbinamento - Salumi | Alcool - 11%
Provenienza: Veneto, Italia
Anno di produzione: 2022

Champagne Nature Meunier Frqncois Diligent......................................100.0
(solfiti)
Tipologia: Bollicina
Descrizione: Uve - Meunier | Abbinamento - Pesce e crostacei | Alcool: 12.5%
Provenienza: Champagne, Francia
Anno di produzione: 2017

Prosecco Valdobbiadene Superiore Extra Dry - Col Vetoraz........................90.0
(solfiti)
Tipologia: Bollicina
Descrizione: Uve - Timorasso | Abbinamento - Salumi | Alcool - 11.5%
Provenienza: Veneto, Italia
Anno di produzione: 2022

Alto Adige Gewürztraminer Kolbenhof - Hofstatter................................50.0
(solfiti)
Tipologia: Bianco
Descrizione: Uve - Gewürztraminer | Abbinamento - Pesce e crostacei | Alcool - 15%
Provenienza: Alto Adige, Italia
Anno di produzione: 2021

Colli Tortonesi Timorasso Sterpi - Vigneti Massa................................70.0
(solfiti)
Tipologia: Bianco
Descrizione: Uve - Timorasso | Abbinamento - Pesce e crostacei | Alcool - 15%
Provenienza: Piemonte, Italia
Anno di produzione: 2021

Trebbiano d\'Abruzzo - Bossanova.................................................35.0
(solfiti)
Tipologia: Bianco
Descrizione: Uve - Trebbiano | Abbinamenti - Pesce e crostacei | Alcool - 12%
Provenienza: Abruzzo, Italia
Anno di produzione: 2022

Contea di Sclafani Chardonnay Vigna San Francesco - Tasca D\'Almerita............55.0
(solfiti)
Tipologia: Bianco
Descrizione: Uve - Chardonnay | Abbinamento - Formaggi | Alcool - 14%
Provenienza: Sicilia, Italia
Anno di produzione: 2021

Venezia Giulia Ribolla Gialla - Damijan.........................................60.0
(solfiti)
Tipologia: Bianco
Descrizione: Uve - Ribolla Gialla | Abbinamento - Carni bianche e verdure | Alcool - 13.5%
Provenienza: Friuli-Venezia Giulia, Italia
Anno di produzione: 2019

Alto Adige Pinot Bianco Platt & Riegl - Girlan..................................20.0
(solfiti)
Tipologia: Bianco
Descrizione: Uve - Pinot Bianco | Abbinamento - Carni bianche e verdure | Alcool - 14%
Provenienza: Alto Adige, Italia
Anno di produzione: 2022

Valpolicella Ripasso Superiore Sfojà - Bennati..................................30.0
(solfiti)
Tipologia: Rosso
Descrizione: Uve - Corvina Corvinone Rondinella | Abbinamento - Carni rosse | Alcool - 14%
Provenienza: Veneto, Italia
Anno di produzione: 2021

Sicilia Mille e una Notte - Donnafugata.........................................80.0
(solfiti)
Tipologia: Rosso
Descrizione: Uve - Nero d\'Avola Petit Verdot Syrah | Abbinamento - Carni rosse | Alcool - 13.5%
Provenienza: Sicilia, Italia
Anno di produzione: 2019

Rubicone Sangiovese Ginevra - Pandolfa..........................................25.0
(solfiti)
Tipologia: Rosato
Descrizione: Uve - Sangiovese | Abbinamento - Carni bianche e verdure | Alcool - 12%
Provenienza: Emilia Romagna, Italia
Anno di produzione: 2022

Montepulciano d\'Abbruzzo - Bossanova............................................35.0
(solfiti)
Tipologia: Rosso
Descrizione: Uve - Montepulciano | Abbinamento - Carni bianche e verdure | Alcool - 13.5%
Provenienza: Abbruzzo, Italia
Anno di produzione: 2021

Bardolino - Cavalchina..........................................................20.0
(solfiti)
Tipologia: Rosso
Descrizione: Uve - Corvina Rondinella Molinara | Abbinamento - Salumi | Alcool - 12.5%
Provenienza: Veneto, Italia
Anno di produzione: 2022

Recioto Classico della Valpolicella Francesca Finato - Villa Spinosa............40.0
(solfiti)
Tipologia: Rosso
Descrizione: Uve - Corvina Veronese Corvinone Rondinella | Abbinamento - Formaggi | Alcool - 15%
Provenienza: Veneto, Italia
Anno di produzione: 2019

 ~  ☆ SOFT DRINKS ☆  ~
Acqua Naturale..................................................................4.0
750 cl
Acqua Frizzante.................................................................4.0
750 cl
Coca Cola.......................................................................6.0
330 cl
Fanta...........................................................................6.0
330 cl
Sprite..........................................................................6.0
330 cl
Lipton..........................................................................6.0
500 cl
Té caldo........................................................................4.0
400 cl

 ~     ☆ DRINKS ☆     ~
Bloody Mary.....................................................................10.0
(pepe)
Bloody Mix, Vodka, Lemon juice, Salt&Pepper
Camilla.........................................................................10.0
Chamomile, Portobello Road Gin, Chartreuse Jaune, Umeshu
Flò.............................................................................10.0
Zubrowka, Granny Smith Apple, Lime Sherbet
My Tie..........................................................................12.0
(frutta a guscio)
Appleton 8 Almond Milk Washed, Dry Curacao, Bubbles
Beat me.........................................................................11.0
(sedano)
Bloody Mix, Mr Three and Bros Falernum, Beetroot, Tomato Juice, Celery Cachaca
Say My Name.....................................................................12.0
Sage leaves, Absinth, Ginger Syrup, Lime, Fig Liqueur, Xoriguer Gin
Fermento........................................................................10.0
(pepe)
Fresh Sage, Pimento Liqueur, Lemon Juice, Fernet, Honey, Zubrowka, Peated Whisky Spray
Purple Rain.....................................................................11.0
Mezcal, Select, Raspberry, Beetrot, Ginger Ale, Absinth, Lime
My Experience...................................................................10.0
Fresh Cucumber, Lemon & Lime Juice, Mastiha, Americano Bianco, Kaffir Leaves Gin
Goldie..........................................................................13.0
Hennessy VS Cognac, Rye Whiskey, Pear distillate, Chartreuse Jaune, Agave, Cardamom Bitters, Palo Santo

Menù creato in data: lunedì 04 dicembre 2023','Menù di pesce','2023-12-04')

INSERT INTO ristorante_team2.primo(nome,prezzo,allergeniEnumArrayList,calorie_enum,id_menu)
VALUES ('Trepoline',10.0,'molluschi','500 Kcal',1),
       ('Assassina',14.0,'glutine,frutta a guscio','550 Kcal',1),
       ('Scoglio',12.0,'molluschi,crostacei,glutine','600 Kcal',1);

INSERT INTO ristorante_team2.antipasto(nome,prezzo,allergeniEnumArrayList,calorie_enum,perDuePersone,id_menu)
VALUES ('Insalata Di Mare',10.0,'molluschi,crostacei','300 Kcal',false,1),
       ('Crudites Di Mare',11.0,'molluschi,crostacei,lupini','250 Kcal',true,1),
       ('Polipetti Affogati',9.0,'frutta a guscio','200 Kcal',false,1);