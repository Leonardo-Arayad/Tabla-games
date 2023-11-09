CREATE TABLE IF NOT EXISTS juegos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    tipo VARCHAR(255) NOT NULL,
    fecha_lanzamiento DATE NOT NULL
);


--  Sql Sever 
-- CREATE TABLE  juegos (
--     id BIGINT IDENTITY(1,1) PRIMARY KEY,
--     nombre VARCHAR(255) NOT NULL,
--     tipo VARCHAR(255) NOT NULL,
--     fecha_lanzamiento DATE NOT NULL
-- );