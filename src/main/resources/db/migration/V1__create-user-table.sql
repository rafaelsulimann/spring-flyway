-- @Id
-- @GeneratedValue
-- private Long id;
-- private String nome;
-- private String email;
-- private String senha;
-- private LocalDateTime dataCriacao;
CREATE TABLE tb_usuarios (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    data_criacao TIMESTAMP NOT NULL
);
