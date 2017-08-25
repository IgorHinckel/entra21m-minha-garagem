# Apagar o banco de dados
DROP DATABASE IF EXISTS minha_garagem;

# Criar o Banco de Dados
CREATE DATABASE IF NOT EXISTS minha_garagem;

# SELECIONANDO O BANCO DE DADOS
USE minha_garagem;

DROP TABLE IF EXISTS carros;

CREATE TABLE IF NOT EXISTS carros (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(150),
    cor VARCHAR(100),
    fabricante VARCHAR(225),
    placa VARCHAR(8),
    chassi VARCHAR(50),
    quilometragem FLOAT,
    potencia FLOAT,
    data_compra DATE,
    esta_funcionando BOOLEAN,
    permitida_circulacao BOOLEAN,
    quantidade_portas TINYINT,
    quantidade_batidas TINYINT,
    ano_fabricacao SMALLINT,
    ano_lancamento SMALLINT,
    tipo_pneu SMALLINT,
    renavam INT,
    descricao TEXT
);

DROP TABLE IF EXISTS categorias;
CREATE TABLE IF NOT EXISTS categorias(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(150) UNIQUE NOT NULL, # Não permite ser vazio e é único
    descricao TEXT,
    ativo BOOLEAN DEFAULT FALSE
);


CREATE TABLE IF NOT EXISTS avioes(
id INTEGER PRIMARY KEY AUTO_INCREMENT,

id_categoria INTEGER NOT NULL,
FOREIGN KEY(id_categoria) REFERENCES categorias(id),

nome VARCHAR(100) NOT NULL UNIQUE
);  

INSERT INTO categorias (nome) VALUES 
("Baixa"),
("Média"),
("Alta");

INSERT INTO avioes (id_categoria, nome) VALUE
(1,"Teco Teco"),
(2,"Air Bus A320"),
(2, "Air Bus 777"),
(3, "Air Buss 747");

