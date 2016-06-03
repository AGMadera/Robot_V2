CREATE TABLE Cliente3(--Estos son datos del usuario
id_cliente3 integer,
nombre varchar(50),---nombre del cliente de la cadena
usuario varchar(50),
pass varchar(50),
CONSTRAINT PK_id_cliente3 primary key (id_cliente3)
);

CREATE TABLE Cadena3(
id_cadena3 integer,
id_cliente3 integer,
nombre varchar(80),
url varchar(250),
CONSTRAINT PK_id_cadena3 primary key (id_cadena3),
CONSTRAINT fk_id_cliente3 foreign key (id_cliente3) REFERENCES Cliente3 (id_cliente3)
);

CREATE TABLE Accion3(
id_accion3 integer,
id_cadena3 integer,
tipoElemento varchar(150),
accion varchar(250),
orden integer,
tiempo integer,
CONSTRAINT PK_id_accion3 primary key (id_accion3), 
CONSTRAINT FK_id_cadena3_acc3 foreign key (id_cadena3) REFERENCES Cadena3 (id_cadena3)
);

CREATE TABLE Dato3(
id_dato3 integer,
id_accion3 integer,
urlDescarga varchar(250),
urlSalida varchar(250),
campoLogin varchar(50),
campoPass varchar(50),
CONSTRAINT PK_id_dato3 primary key (id_dato3)
);