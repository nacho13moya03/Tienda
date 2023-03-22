/*Se crea la base de datos */
CREATE SCHEMA curso ;
/*Se crea la tabla dentro de la base de datos*/
CREATE TABLE curso.estudiante(
id_alumno INT NOT NULL AUTO_INCREMENT,
cedula VARCHAR(50) NOT NULL,
nombre VARCHAR(20) NOT NULL,
apellido VARCHAR(50) NOT NULL,
telefono INT NOT NULL,
correo VARCHAR(50) NOT NULL,
PRIMARY KEY (`id_alumno`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;
/*Se escriben los datos que iran dentro de la base de datos*/
INSERT INTO curso.estudiante (id_alumno, cedula, nombre, apellido, telefono, correo)
VALUES(1,'207650654', 'Pedro', 'Vargas Montero','85630978','pvargas50654@gmail.com'),
(2,'GOVM800705MCLMLR01','Margarita','Gomez Velazquez', '65789322', 'mgomez01@gmail.com'),
(3,'123456', 'Arnoldo', 'Esposito Costa','73459087','aesposito56@gmail.com');
/*Se crea el usuario con el cual se va lograr acceder a la base de datos*/
create user 'estudiante'@'%' identified by 'admin';
/*Se asignan los privilegios sobre la base de datos curso al usuario creado*/
grant all privileges on curso.* to 'usuario_prueba'@'%';
flush privileges;