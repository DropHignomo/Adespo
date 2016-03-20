package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {
    
    private Connection conn;
    private Statement st;

    /* Constructores **********************************************************/

    public ConexionBD() {
        conn=null;
        st=null;
    }
    
    /* Métodos getters & setters **********************************************/

    public Statement getSt() {
        return st;
    }

    /* Otros métodos **********************************************************/

    public void abrirConexion() throws Exception {
        try {
            conn=DriverManager.getConnection("jdbc:ucanaccess://bd.mdb");
            st=conn.createStatement();
            crearTablas();
        } catch (SQLException e) {
            throw new Exception("Error abrirConexion()!!",e);
        }
    }
    
    public void cerrarConexion() throws Exception {
        try {
            if (st!=null) st.close();
            if (conn!=null) conn.close();
        } catch (SQLException e) {
            throw new Exception("Error cerrarConexion()!!",e);
        }
    }
    
    private void crearTablas() throws Exception {
        String sql;
        try {
            sql="SELECT count(*) FROM VETERINARIOS";
            st.executeQuery(sql);
        } catch (SQLException e1) {
            try {
                sql="CREATE TABLE VETERINARIOS(\n" +
                    "	cod_veterinario INTEGER constraint cod_vet_pk primary key,\n" +
                    "	num_colegiado INTEGER not null,\n" +
                    "	prov_coleg CHAR(30) not null,\n" +
                    "	apellidos CHAR(30) not null,\n" +
                    "	nombre CHAR(20) not null,\n" +
                    "	direccion CHAR(50) not null,\n" +
                    "	poblacion CHAR(50) not null,\n" +
                    "	provincia CHAR(30) not null,\n" +
                    "	nif CHAR(9) UNIQUE,\n" +
                    "	tfno CHAR(9) not null,\n" +
                    "	eMail CHAR(20),\n" +
                    "	fax CHAR(9))";
                st.executeUpdate(sql);
                sql="CREATE TABLE GANADEROS(\n" +
                    "	codigo INTEGER constraint cod_gan_pk primary key,\n" +
                    "	nombre CHAR(20),\n" +
                    "	num_explotacion INTEGER,\n" +
                    "	direccion CHAR(50),\n" +
                    "	nif CHAR(9),\n" +
                    "	cod_postal INTEGER,\n" +
                    "	poblacion CHAR(50),\n" +
                    "	tfno CHAR(9),\n" +
                    "	fax CHAR(9),\n" +
                    "	eMail CHAR(20))";
                st.executeUpdate(sql);
                sql="CREATE TABLE SUMINISTRADORES(\n" +
                    "	cod_suministrador INTEGER constraint cod_sum_pk primary key ,\n" +
                    "	nombre CHAR(30),\n" +
                    "	direccion CHAR(50),\n" +
                    "	cod_postal INTEGER,\n" +
                    "	poblacion CHAR(50),\n" +
                    "	provincia CHAR(30),\n" +
                    "	nif CHAR(9),\n" +
                    "	eMail CHAR(20),\n" +
                    "	tfno CHAR(9),\n" +
                    "	fax CHAR(9),\n" +
                    "	con_nombre CHAR(30),\n" +
                    "	con_tlf1 CHAR(9),\n" +
                    "	con_tlf2 CHAR(9),\n" +
                    "	con_direccion CHAR(50),\n" +
                    "	con_cargo CHAR(20))";
                st.executeUpdate(sql);
                sql="CREATE TABLE PRODUCTOS(\n" +
                    "	cod_producto INTEGER not null,\n" +
                    "	cod_suministrador CHAR(20) constraint cod_sum_fk foreign key references(SUMINISTRADORES),\n" +
                    "	cod_albaran CHAR(20) constraint cod_alb_fk foreign key references(ALBARANES),\n" +
                    "	nombre CHAR(20),\n" +
                    "	presentacion CHAR(20),\n" +
                    "	formato CHAR(30),\n" +
                    "	unidades CHAR(20),\n" +
                    "	composicion CHAR(20),\n" +
                    "	tiempo_espera INTEGER-->No lo tengo claro\n" +
                    "	forma_farmacologica CHAR(20),\n" +
                    "	n_registro CHAR(20),\n" +
                    "	lote CHAR(20),\n" +
                    "	nec_receta boolean,\n" +
                    "	fecha_compra date,\n" +
                    "	caducidad date,\n" +
                    "	precio INTEGER,\n" +
                    "	PVP INTEGER,\n" +
                    "	IVA INTEGER,\n" +
                    "	indicaciones CHAR(30),\n" +
                    "	instruciones CHAR(150),\n" +
                    "	familia CHAR(20),-->No se que es\n" +
                    "	almacen CHAR(20),-->No se que es\n" +
                    "	grp_vtas CHAR(20),-->No se que es\n" +
                    "	constraint pk_produc primary key(cod_producto,cod_suministrador,cod_albaran)";
                st.executeUpdate(sql);
                sql="CREATE TABLE ALBARANES(\n" +
                    "	cod_albaran INTEGER constraint num_alb_pk primary key,\n" +
                    "	fecha date,\n" +
                    "	direccion CHAR(50),\n" +
                    "	nombre CHAR(20),\n" +
                    "	num_explotacion INTEGER,\n" +
                    "	nif CHAR(9),\n" +   
                    "	poblacion CHAR(50),\n" +
                    "	provincia CHAR(30),\n" +
                    "	num_animales INTEGER,\n" +
                    "	num_colegiado INTEGER,\n" +
                    "	apellidos CHAR(30),\n" +
                    "	nombre CHAR(20))";
                st.executeUpdate(sql);
                sql="CREATE TABLE LINEAFACTURAS(\n" +
                    "	cod_albaran INTEGER ,\n" +
                    "	cod_producto INTEGER,\n" +
                    "	nombre_pro CHAR(20),\n" +
                    "	unidades INTEGER,\n" +
                    "	PVP INTEGER,\n" +
                    "	total INTEGER,\n" +
                    "	constraint linea_Alb_fk foreign key(cod_albaran) references ALBARANES,\n" +
                    "	constraint linea_produc_fk foreign key(cod_producto) references PRODUCTOS)";
            } catch (SQLException e2) {
                throw new Exception("Error crearTablas()!!",e2);
            }
        }
    }
}
