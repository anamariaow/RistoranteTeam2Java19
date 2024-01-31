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
lista_allergeni_enum VARCHAR NOT NULL,
calorie_enum VARCHAR NOT NULL,
tipologia VARCHAR NOT NULL,
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

INSERT INTO ristorante_team2.primo(nome,prezzo,allergeniEnumArrayList,calorie_enum,id_menu)
VALUES ('trepoline',10.0,'MOLLUSCHI','CINQUECENTO',1),
       ('assassina',14.0,'GLUTINE,FRUTTAAGUSCIO','CINQUECENTOCINQUANTA',1),
       ('scoglio',12.0,'MOLLUSCHI,CROSTACEI,GLUTINE','SEICENTO',1);

INSERT INTO ristorante_team2.antipasto(nome,prezzo,allergeniEnumArrayList,calorie_enum,perDuePersone,id_menu)
VALUES ('insalataDiMare',10.0,'MOLLUSCHI,CROSTACEI','TRECENTO',TRUE,1),
       ('cruditesDiMare',11.0,'MOLLUSCHI,CROSTACEI,LUPINI','DUECENTOCINQUANTA',TRUE,1),
       ('polipettiAffogati',9.0,'FRUTTAAGUSCIO','DUECENTO',TRUE,1);
INSERT INTO ristorante_team2.dessert(nome,prezzo,allergeniEnumArrayList,calorie_enum,livello_dolcezza_enum,id_menu)
VALUES ('Mousse di Mango',10.50,'LATTE','CENTO','MEDIO',1),
       ('Mousse di Maracuya',8.50,'LATTE','CENTOCINQUANTA','ALTO',1),
       ('Mousse di Noce',5.50,'FRUTTAAGUSCIO','LATTE','DUECENTO','BASSO',1);