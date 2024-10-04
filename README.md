# Pruebas_Rocket_code

Mi usuario de mysql workbench es root con contraseña megadeth 

Adjunto en este documento la cracion de la base de datos y la tabla 


CREATE DATABASE tareas_db;

CREATE TABLE tareas_db.tareas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    descripcion TEXT,
    fecha_inicio DATE
);

