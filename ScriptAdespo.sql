--script SQL de ADESPO
CREATE TABLE VETERINARIO(
	cod_veterinario number constraint cod_vet_pk primary key,
	num_colegiado number constraint num_vet_nn not null,
	prov_coleg varchar2(30) constraint prov_vet_nn not null,
	apellidos varchar2(30) constraint ape_vet_nn not null,
	nombre varchar2(20) constraint nom_vet_nn not null,
	direccion varchar2(50) constraint dir_vet_nn	not null,
	poblacion varchar2(50) constraint pob_vet_nn not null,
	provincia varchar2(30) constraint pro_vet_nn not null,
	nif varchar2(9) constraint nif_vet_uk UNIQUE,
	tfno varchar2(9) constraint tel_vet_nn not null,
	e-mail varchar2(20),
	fax varchar(9)
);

CREATE TABLE GANADERO(
	codigo number constraint cod_gan_pk primary key,
	nombre varchar2(20),
	num_explotacion number,
	direccion varchar2(50),
	nif varchar2(9),
	cod_postal number,
	poblacion varchar2(50),
	tfno varchar(9),
	fax varchar(9),
	e-mail varchar(20)
);

CREATE TABLE SUMINISTRADOR(
	cod_suministrador number constraint cod_sum_pk primary key ,
	nombre varchar2(30),
	direccion varchar2(50),
	cod_postal number,
	poblacion varchar2(50),
	provincia varchar2(30),
	nif varchar2(9),
	e-mail varchar2(20),
	tfno varchar2(9),
	fax varchar2(9),
	con_nombre varchar2(30),
	con_tlf1 varchar2(9),
	con_tlf2 varchar2(9),
	con_direccion varchar2(50),
	con_cargo varchar2(20) 
);

CREATE TABLE PRODUCTO(
	codigo number constraint cod_pro_pk primary key,
	nombre varchar(20),
	presentacion varchar(20),
	formato varchar(30),
	unidades varchar(20),
	composicion varchar(20),
	tiempo_espera number-->No lo tengo claro
	forma_farmacologica varchar(20),
	n_registro varchar(20),
	lote varchar(20),
	nec_receta boolean,
	fecha_compra date,
	caducidad date,
	precio number,
	PVP number,
	IVA number,
	indicaciones varchar(30),
	instruciones varchar(150),
	familia varchar(20),-->No se que es
	almacen varchar(20),-->No se que es
	grp_vtas varchar(20),-->No se que es
	suministrador varchar(20),
	num_albaran varchar(20)
);

CREATE TABLE ALBARAN(
	num_albaran number constraint num_alb_pk primary key,
	fecha date,
	direccion varchar2(50),
	nombre varchar2(20),
	num_explotacion number,
	nif varchar2(9),
	poblacion varchar2(50),
	provincia varchar2(30),
	num_animales number,
	num_colegiado number,
	apellidos varchar2(30),
	nombre varchar2(20),
);

CREATE TABLE LINEAFACTURA(
	cod_albaran number,
	cod_producto number,
	nombre_pro varchar(20),
	unidades number,
	PVP number,
	total number
);











