--script SQL de ADESPO
CREATE TABLE VETERINARIO(
	cod_veterinario number constraint cod_vet_pk primary key (cod_veterinario),
	num_colegiado constraint num_vet_nn not null,
	prov_coleg varchar2(30) constraint prov_vet_nn not null,
	apellidos varchar2(30) constraint ape_vet_nn not null,
	nombre varchar2(20) constraint nom_vet_nn not null,
	direccion varchar2(50) constraint dir_vet_nn	not null,
	poblacion varchar2(50) constraint pob_vet_nn not null,
	provincia varchar2(30) constraint pro_vet_nn not null,
	nif varchar2(9) constraint nif_vet_uk UNIQUE,
	tfno varchar2(9) constraint tel_vet_nn not null,
	e-mail varchar2 (20),
	fax number
)
CREATE TABLE GANADERO(
	nombre varchar2(20) constraint nom_gan_pk primary key ,
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
	cod_suministrador number
	nombre
	direccion
	cod_postal
	poblacion
	provincia
	nif
	e-mail
	tfno
	fax
	con_nombre
	con_tlf1
	con_tlf2
	con_direccion
	con_cargo
)