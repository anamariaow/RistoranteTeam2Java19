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

CREATE TABLE ristorante.secondo (
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