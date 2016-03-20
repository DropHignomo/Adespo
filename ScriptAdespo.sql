--script SQL de ADESPO
drop table VETERINARIOS;
drop table GANADEROS;
drop table SUMINISTRADORES;
drop table ALBARAN;
drop table LINEAFACTURA;
drop table PRODUCTOS;


CREATE TABLE VETERINARIOS(
	cod_veterinario INTEGER constraint cod_vet_pk primary key,
	num_colegiado INTEGER not null,
	prov_coleg CHAR(30) not null,
	apellidos CHAR(30) not null,
	nombre CHAR(20) not null,
	direccion CHAR(50) not null,
	poblacion CHAR(50) not null,
	provincia CHAR(30) not null,
	nif CHAR(9) UNIQUE,
	tfno CHAR(9) not null,
	eMail CHAR(20),
	fax CHAR(9));

CREATE TABLE GANADEROS(
	codigo INTEGER constraint cod_gan_pk primary key,
	nombre CHAR(20),
	num_explotacion INTEGER,
	direccion CHAR(50),
	nif CHAR(9),
	cod_postal INTEGER,
	poblacion CHAR(50),
	tfno CHAR(9),
	fax CHAR(9),
	eMail CHAR(20));

CREATE TABLE SUMINISTRADORES(
	cod_suministrador INTEGER constraint cod_sum_pk primary key ,
	nombre CHAR(30),
	direccion CHAR(50),
	cod_postal INTEGER,
	poblacion CHAR(50),
	provincia CHAR(30),
	nif CHAR(9),
	eMail CHAR(20),
	tfno CHAR(9),
	fax CHAR(9),
	con_nombre CHAR(30),
	con_tlf1 CHAR(9),
	con_tlf2 CHAR(9),
	con_direccion CHAR(50),
	con_cargo CHAR(20));

	CREATE TABLE ALBARAN(
		cod_albaran INTEGER constraint num_alb_pk primary key,
		fecha Time,
		direccion CHAR(50),
		num_explotacion INTEGER,
		nif CHAR(9),
		poblacion CHAR(50),
		provincia CHAR(30),
		num_animales INTEGER,
		num_colegiado INTEGER,
		apellidos CHAR(30),
		nombre CHAR(20));

	CREATE TABLE PRODUCTOS(
		cod_producto INTEGER,
		cod_suministrador INTEGER,
		cod_albaran INTEGER,
		nombre CHAR(20),
		presentacion CHAR(20),
		formato CHAR(30),
		unidades CHAR(20),
		composicion CHAR(20),
		tiempo_espera INTEGER,
		forma_farmacologica CHAR(20),
		n_registro CHAR(20),
		lote CHAR(20),
		nec_receta boolean,
		fecha_compra date,
		caducidad date,
		precio INTEGER,
		PVP INTEGER,
		IVA INTEGER,
		indicaciones CHAR(30),
		instruciones CHAR(150),
		familia CHAR(20),
		almacen CHAR(20),
		grp_vtas CHAR(20),
		constraint product_pk PRIMARY KEY(cod_producto,cod_suministrador,cod_albaran),
		constraint product_sum_fk FOREIGN KEY(cod_suministrador) REFERENCES SUMINISTRADORES,
		constraint product_alb_fk FOREIGN KEY(cod_albaran) REFERENCES ALBARAN);

	CREATE TABLE LINEAFACTURA(
		cod_albaran INTEGER,
		cod_producto INTEGER,
		nombre_pro CHAR(20),
		unidades INTEGER,
		PVP INTEGER,
		total INTEGER,
		);

		constraint linea_Alb_fk foreign key(cod_albaran) references ALBARAN,
		constraint linea_produc_fk foreign key(cod_producto) references PRODUCTOS
