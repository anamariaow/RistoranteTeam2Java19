CREATE DATABASE ristorante_team2;
CREATE TABLE menu(
id INT PRIMARY KEY AUTO_INCREMENT,
portata_list LONG VARCHAR NOT NULL,
tipo_enum LONG VARCHAR NOT NULL,
data_creazione DATETIME NOT NULL
);
CREATE TABLE ristorante_team2.primo(
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR NOT NULL,
prezzo DOUBLE NOT NULL,
allergeniEnumArrayList LONG VARCHAR,
calorieEnum LONG VARCHAR NOT NULL,
id_menu FOREIGN KEY
);
CREATE TABLE ristorante_team2.antipasto(
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR NOT NULL,
prezzo DOUBLE NOT NULL,
allergeniEnumArrayList LONG VARCHAR,
calorieEnum LONG VARCHAR NOT NULL,
perDuePersone BOOL,
id_menu FOREIGN KEY
);

CREATE TABLE ristorante.secondo (
id INT auto_increment NOT NULL PRIMARY KEY,
nome VARCHAR (255) NOT NULL,
prezzo DOUBLE NOT NULL,
lista_allergeni_enum VARCHAR (255),
calorie_enum VARCHAR (100),
FOREIGN KEY (id_menu) REFERENCES menu (id)
);

CREATE TABLE ristorante_team2.contorno (
id INT auto_increment NOT NULL PRIMARY KEY,
nome VARCHAR (255) NOT NULL,
prezzo DOUBLE NOT NULL,
lista_allergeni_enum VARCHAR (255),
calorie_enum VARCHAR (100),
FOREIGN KEY (id_menu) REFERENCES menu (id)
);