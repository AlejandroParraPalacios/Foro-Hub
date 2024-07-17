CREATE TABLE respuestas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    creationDate DATETIME NOT NULL,
    solution TEXT NOT NULL,
    author INT,
    topico INT,
    active BOOLEAN NOT NULL,
    FOREIGN KEY (author) REFERENCES usuarios(id),
    FOREIGN KEY (topico) REFERENCES topicos(id)
);