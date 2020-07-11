CREATE TABLE roupas(
	nome VARCHAR(20),
	codigo INT,
	PRIMARY KEY(codigo),
	preco NUMERIC(2),
	tipo VARCHAR(10),
	tamanho VARCHAR(1)
);
CREATE TABLE alimentos(
	nome VARCHAR(20),
	codigo INT,
	PRIMARY KEY(codigo),
	preco NUMERIC(2),
	tipo VARCHAR(10),
	validade DATE
);
CREATE TABLE eletroeletronicos(
	nome VARCHAR(20),
	codigo INT,
	PRIMARY KEY(codigo),
	preco NUMERIC(2),
	tipo VARCHAR(10),
	marca VARCHAR(10)
);