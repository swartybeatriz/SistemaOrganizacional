use bloco;
create table usuarios (
id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(50),
email VARCHAR(50),
senha VARCHAR(20)
);

create table notas(
id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
id_caderno int,
nome VARCHAR(50),
texto VARCHAR(1000),
foreign key (id_caderno) references cadernos (id)

);

create table cadernos(
id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(50),
descricao VARCHAR (200)

);
