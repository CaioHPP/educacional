CREATE TABLE Cursos (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    codigo VARCHAR(20) NOT NULL UNIQUE,
    carga_horaria INT NOT NULL
);