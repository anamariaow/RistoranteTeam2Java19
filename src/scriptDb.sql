CREATE DATABASE ristorante_team2;

CREATE TABLE ristorante_team2.chef (
id INT auto_increment NOT NULL PRIMARY KEY,
nome VARCHAR (255) NOT NULL,
eta INT NOT NULL,
stelle_michelin VARCHAR (255)
);

CREATE TABLE ristorante_team2.cliente (
id INT auto_increment NOT NULL PRIMARY KEY,
nome VARCHAR (255) NOT NULL,
numero_persone INT NOT NULL,
menu_scelto VARCHAR (255) NOT NULL
);

CREATE TABLE ristorante_team2.prenotazione (
id INT auto_increment NOT NULL PRIMARY KEY,
orario_prenotazione VARCHAR (255) NOT NULL,
cliente VARCHAR (255) NOT NULL,
posti_riservati INT NOT NULL
);

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
lista_allergeni_enum VARCHAR NOT NULL,
calorie_enum VARCHAR NOT NULL,
tipologia_enum VARCHAR NOT NULL,
descrizione VARCHAR NOT NULL,
provenienza VARCHAR NOT NULL,
anno_produzione INT,
id_menu INT,
FOREIGN KEY (id_menu) REFERENCES menu(id)
);

CREATE TABLE ristorante_team2.drink (
id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
nome VARCHAR(100) NOT NULL,
prezzo DOUBLE NOT NULL,
lista_allergeni_enum VARCHAR NOT NULL,
calorie_enum VARCHAR NOT NULL,
ingredienti VARCHAR NOT NULL,
id_menu INT,
FOREIGN KEY (id_menu) REFERENCES menu(id)
);

CREATE TABLE ristorante_team2.soft_drink (
id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
nome VARCHAR(100) NOT NULL,
prezzo DOUBLE NOT NULL,
lista_allergeni_enum VARCHAR NOT NULL,
calorie_enum VARCHAR NOT NULL,
centilitri VARCHAR NOT NULL,
id_menu INT,
FOREIGN KEY (id_menu) REFERENCES menu(id)
);

INSERT INTO ristorante_team2.chef(nome,eta,stelle_michelin)
VALUES ('Simon Timon',45,'☆☆☆');

INSERT INTO ristorante_team2.cliente(nome,numero_persone,menu_scelto)
VALUES ('Ana B.', 2, 'Menù completo'),
       ('Mario F.', 4, 'Menù di pesce'),
       ('Antonio T.', 4, 'Menù completo')
       ('Michele V.', 4, 'Menù vegetariano');

INSERT INTO ristorante_team2.prenotazione(orario_prenotazione,cliente,posti_riservati)
VALUES ('2024-03-17 20:00', cliente1, 4),
       ('2024-03-16 20:00', cliente2, 3),
       ('2024-03-19 20:00', cliente3, 2),
       ('2024-03-19 20:00', cliente3, 2);

INSERT INTO ristorante_team2.antipasto(nome,prezzo,lista_allergeni_enum,calorie_enum,perDuePersone,id_menu)
VALUES ('Insalata di mare',10.0,'molluschi,crostacei','300 Kcal',TRUE,1),
       ('Crudites di mare',11.0,'molluschi,crostacei,lupini','250 Kcal',TRUE,1),
       ('Polipetti affogati',9.0,'frutta a guscio','200 Kcal',TRUE,1);

INSERT INTO ristorante_team2.primo(nome,prezzo,lista_allergeni_enum,calorie_enum,id_menu)
VALUES ('trepoline',10.0,'molluschi','500 Kcal',1),
       ('assassina',14.0,'glutine,frutta a guscio','550 Kcal',1),
       ('scoglio',12.0,'molluschi,crostacei,glutine','600 Kcal',1);

INSERT INTO ristorante_team2.soft_drink(nome,prezzo,lista_allergeni_enum,calorie_enum,tipologia_enum,centilitri,id_menu)
VALUES ('Acqua Naturale', 4.00, '0 Kcal', 750),
       ('Acqua Frizzante', 4.00, '0 Kcal', 750),
       ('Coca Cola', 6.00, '150 Kcal', 330),
       ('Fanta', 6.00, '150 Kcal', 330),
       ('Sprite', 6.00, '150 Kcal', 330),
       ('Lipton', 6.00, '100 Kcal', 500),
       ('Té caldo', 4.00, '5 Kcal', 400);

INSERT INTO ristorante_team2.vino(nome,prezzo,lista_allergeni_enum,calorie_enum,tipologia_enum,descrizione,provenienza,anno_produzione,id_menu)
VALUES ('Champagne Brut Vintage - Dom Pérignon', 300.00, 'solfiti', '100 Kcal', 'Bollicina', 'Uve - Pinot Nero Chardonnay | Abbinamento - Pesce e crostacei | Alcool - 12.5%', 'Champagne, Francia', 2013),
       ('Champagne Brut Réserve Premier Cru - De Vilmont', 50.00, 'solfiti', '150 Kcal', 'Bollicina', 'Uve - Chardonnay Pinot Nero Meunier | Abbinamento - Pesce e crostacei | Alcool - 12.5%', 'Champagne, Francia', 2020),
       ('Champagne Brut Cuvée Saint Petersbourg - Veuve Clicquot', 70.00, 'solfiti', '100 Kcal', 'Bollicina', 'Uve - Pinot Nero Chardonnay Meunier | Abbinamento - Pesce e crostacei | Alcool - 12%', 'Champagne, Francia', 2020),
       ('Prosecco Rosé Vigner - Serena Wines', 25.00, 'solfiti', '150 Kcal', 'Bollicina', 'Uve - Glera Pinot Nero | Abbinamento - Salumi | Alcool - 11%', 'Veneto, Italia', 2022),
       ('Champagne Nature Meunier Frqncois Diligent', 100.00, 'solfiti', '100 Kcal', 'Bollicina', 'Uve - Meunier | Abbinamento - Pesce e crostacei | Alcool: 12.5%', 'Champagne, Francia', 2017),
       ('Prosecco Valdobbiadene Superiore Extra Dry - Col Vetoraz', 90.00, 'solfiti', '100 Kcal', 'Bollicina', 'Uve - Timorasso | Abbinamento - Salumi | Alcool - 11.5%', 'Veneto, Italia', 2022),
       ('Alto Adige Gewürztraminer Kolbenhof - Hofstatter', 50.00, 'solfiti', '150 Kcal', 'Bianco', 'Uve - Gewürztraminer | Abbinamento - Pesce e crostacei | Alcool - 15%', 'Alto Adige, Italia', 2021),
       ('Colli Tortonesi Timorasso Sterpi - Vigneti Massa', 70.00, 'solfiti', '150 Kcal', 'Bianco', 'Uve - Timorasso | Abbinamento - Pesce e crostacei | Alcool - 15%', 'Piemonte, Italia', 2021),
       ('Trebbiano d Abruzzo - Bossanova', 35.00, 'solfiti', '150 Kcal', 'Bianco', 'Uve - Trebbiano | Abbinamenti - Pesce e crostacei | Alcool - 12%', 'Abruzzo, Italia', 2022),
       ('Contea di Sclafani Chardonnay Vigna San Francesco - Tasca D Almerita', 55.00, 'solfiti', '150 Kcal', 'Bianco', 'Uve - Chardonnay | Abbinamento - Formaggi | Alcool - 14%', 'Sicilia, Italia', 2021),
       ('Venezia Giulia Ribolla Gialla - Damijan', 60.00, 'solfiti', '150 Kcal', 'Bianco', 'Uve - Ribolla Gialla | Abbinamento - Carni bianche e verdure | Alcool - 13.5%', 'Friuli-Venezia Giulia, Italia', 2019),
       ('Alto Adige Pinot Bianco Platt & Riegl - Girlan', 20.00, 'solfiti', '150 Kcal', 'Bianco', 'Uve - Pinot Bianco | Abbinamento - Carni bianche e verdure | Alcool - 14%', 'Alto Adige, Italia', 2022),
       ('Valpolicella Ripasso Superiore Sfojà - Bennati', 30.00, 'solfiti', '100 Kcal', 'Rosso', 'Uve - Corvina Corvinone Rondinella | Abbinamento - Carni rosse | Alcool - 14%', 'Veneto, Italia', 2021),
       ('Sicilia Mille e una Notte - Donnafugata', 80.00, 'solfiti', '100 Kcal', 'Rosso', 'Uve - Nero d Avola Petit Verdot Syrah | Abbinamento - Carni rosse | Alcool - 13.5%', 'Sicilia, Italia', 2019),
       ('Rubicone Sangiovese Ginevra - Pandolfa', 25.00, 'solfiti', '100 Kcal', 'Rosso', 'Uve - Sangiovese | Abbinamento - Carni bianche e verdure | Alcool - 12%', 'Emilia Romagna, Italia', 2022),
       ('Montepulciano d Abbruzzo - Bossanova', 35.00, 'solfiti', '100 Kcal', 'Rosso', 'Uve - Montepulciano | Abbinamento - Carni bianche e verdure | Alcool - 13.5%', 'Abbruzzo, Italia', 2021),
       ('Bardolino - Cavalchina', 20.00, 'solfiti', '100 Kcal', 'Rosso', 'Uve - Corvina Rondinella Molinara | Abbinamento - Salumi | Alcool - 12.5%', 'Veneto, Italia', 2022),
       ('Recioto Classico della Valpolicella Francesca Finato - Villa Spinosa', 40.00, 'solfiti', '100 Kcal', 'Rosso', 'Uve - Corvina Veronese Corvinone Rondinella | Abbinamento - Formaggi | Alcool - 15%', 'Veneto, Italia', 2019);

INSERT INTO ristorante_team2.drink(nome,prezzo,lista_allergeni_enum,calorie_enum,ingredienti,id_menu)
VALUES ('Bloody Mary', 10.00, 'pepe', '150 Kcal', 'Bloody Mix, Vodka, Lemon juice, Salt&Pepper'),
       ('Camilla', 10.00,  '200 Kcal', 'Chamomile, Portobello Road Gin, Chartreuse Jaune, Umeshu'),
       ('Flò', 10.00,  '200 Kcal', 'Zubrowka, Granny Smith Apple, Lime Sherbet'),
       ('My Tie', 12.00, 'frutta a guscio', '150 Kcal', 'Appleton 8 Almond Milk Washed, Dry Curacao, Bubbles'),
       ('Beat me', 11.00, 'sedano', '200 Kcal', 'Bloody Mix, Mr Three and Bros Falernum, Beetroot, Tomato Juice, Celery Cachaca'),
       ('Say My Name', 12.00,  '300 Kcal', 'Sage leaves, Absinth, Ginger Syrup, Lime, Fig Liqueur, Xoriguer Gin'),
       ('Fermento', 10.00, 'pepe', '350 Kcal', 'Fresh Sage, Pimento Liqueur, Lemon Juice, Fernet, Honey, Zubrowka, Peated Whisky Spray'),
       ('Purple Rain', 11.00,  '300 Kcal', 'Mezcal, Select, Raspberry, Beetrot, Ginger Ale, Absinth, Lime'),
       ('My Experience', 10.00,  '200 Kcal', 'Fresh Cucumber, Lemon & Lime Juice, Mastiha, Americano Bianco, Kaffir Leaves Gin'),
       ('Goldie', 13.00,  '400 Kcal', 'Hennessy VS Cognac, Rye Whiskey, Pear distillate, Chartreuse Jaune, Agave, Cardamom Bitters, Palo Santo');


