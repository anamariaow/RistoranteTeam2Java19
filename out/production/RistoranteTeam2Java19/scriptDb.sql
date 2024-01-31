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
INSERT INTO ristorante_team2.menu (portata_list,tipo_enum,data_creazione)
VALUES ('','Menù di pesce','2023-12-04')

INSERT INTO ristorante_team2.primo(nome,prezzo,allergeniEnumArrayList,calorie_enum,id_menu)
VALUES ('Trepoline',10.0,'molluschi','500 Kcal',1),
       ('Assassina',14.0,'glutine,frutta a guscio','550 Kcal',1),
       ('Scoglio',12.0,'molluschi,crostacei,glutine','600 Kcal',1);

INSERT INTO ristorante_team2.antipasto(nome,prezzo,allergeniEnumArrayList,calorie_enum,perDuePersone,id_menu)
VALUES ('Insalata Di Mare',10.0,'molluschi,crostacei','300 Kcal',false,1),
       ('Crudites Di Mare',11.0,'molluschi,crostacei,lupini','250 Kcal',true,1),
       ('Polipetti Affogati',9.0,'frutta a guscio','200 Kcal',false,1);