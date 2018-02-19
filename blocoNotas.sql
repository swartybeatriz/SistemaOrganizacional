use bloco;
create table usuarios (
id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(50),
email VARCHAR(50),
senha VARCHAR(20)
);

create table notas(
id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(50),
dataCriacao date,
texto VARCHAR(1000)
);

create table caderno(
id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
id_notas int ,
nome VARCHAR(50),
FOREIGN KEY (id_notas) REFERENCES notas(id)
);