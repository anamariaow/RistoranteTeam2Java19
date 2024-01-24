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

create table ristorante.secondo (
id int auto_increment not null primary key,
nome varchar not null,
prezzo double not null,
lista_allergeni_enum varchar,
calorie_enum varchar,
id_menu int foreign key
);

create table ristorante_team2.contorno (
id int auto_increment not null primary key,
nome varchar not null,
prezzo double not null,
lista_allergeni_enum varchar,
calorie_enum varchar,
id_menu int foreign key
);