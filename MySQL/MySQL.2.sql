-- comando para criação de banco de dados
CREATE DATABASE db_ecommerce;

-- comando para criação de banco de dados
CREATE TABLE tb_produtos(

-- criação da coluna de id, indicando que ela só vai aceitar dados do tipo bigint(numeros inteiros até 20 caracteres) passando a propriedade auto-increment, para que o mysql faça o gerenciamento dos ids
	id BIGINT AUTO_INCREMENT,

    nome VARCHAR(255),

	-- indicação da chave primaria que será a coluna de id 
	PRIMARY KEY(id)
);

-- comando de inserção de dados dentro da tabela de colaboradores **CUIDADO** O comando insert não bloqueia o envio de dados repetidos, rode ele apenas uma vez, confira se ele inseriu, e então insira os outros dados em seguida
INSERT INTO produtos(nome) 
VALUES("produtos",25, 400.99,"Desenvolvedor");


SELECT * FROM produtos;


SELECT * FROM produtos WHERE itens > 2000;


SELECT * FROM produtos WHERE salario < 2000;


ALTER TABLE produtos
MODIFY COLUMN salario DECIMAL(10,2);


UPDATE produtos
SET itens= 5001.99
WHERE id=2;


