CREATE TABLE roupas(
	nome VARCHAR(20),
	codigo INT,
	PRIMARY KEY(codigo),
	preco REAL,
	tipo VARCHAR(10),
	tamanho VARCHAR(1),
	quantidade INT
);
CREATE TABLE alimentos(
	nome VARCHAR(20),
	codigo INT,
	PRIMARY KEY(codigo),
	preco REAL,
	tipo VARCHAR(10),
	validade DATE,
	quantidade INT
);
CREATE TABLE eletroeletronicos(
	nome VARCHAR(20),
	codigo INT,
	PRIMARY KEY(codigo),
	preco REAL,
	tipo VARCHAR(10),
	marca VARCHAR(10),
	quantidade INT
);

CREATE TABLE funcionario(
	matricula int,
	PRIMARY KEY(int),
	nome varchar(20),
	cpf varchar(11),
	cargo varchar(11),
	salario REAL,
	login VARCHAR(10),
	senha VARCHAR(50)
);
