CREATE DATABASE estoque;
USE estoque;

CREATE TABLE produtos(
idProduto INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
nomeProduto VARCHAR (50) NOT NULL,
quantidadeProduto INTEGER NOT NULL,
categoriaProduto VARCHAR(30) NOT NULL,
precoUnitario DECIMAL(10,2) NOT NULL,
precoTotal DECIMAL(10,2) NOT NULL,
fornecedor VARCHAR (100) NOT NULL,
dataChegada DATE NOT NULL
);

