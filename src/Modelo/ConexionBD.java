package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {
    
    private Connection conn;
    private static ConexionBD instancia=null;
    private static Statement st;

    /* Constructores **********************************************************/

    private ConexionBD() {}
    public static ConexionBD getInstancia() {
        if (instancia==null) {
            synchronized (ConexionBD.class) {
                if (instancia==null)
                    instancia=new ConexionBD();
            }
            instancia=new ConexionBD();
            if (st==null){
                st= instancia.getSt();
            }
        }
        return instancia;
    }
    /* Métodos getters & setters **********************************************/

    public Statement getSt() {
        return st;
    }

    /* Otros métodos **********************************************************/
    
    public boolean abrirConexion(){
        try {
            conn=DriverManager.getConnection("jdbc:ucanaccess://bd.mdb");
            st=conn.createStatement();
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
    
    public void cerrarConexion() throws Exception {
        try {
            if (st!=null) st.close();
            if (conn!=null) conn.close();
        } catch (SQLException e) {
            throw new Exception("Error cerrarConexion()!!",e);
        }
    }
    
    public void crearTablas() throws Exception {
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
                System.out.println(sql);
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
                System.out.println(sql);
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
                System.out.println(sql);
                st.executeUpdate(sql);
                
                sql="	CREATE TABLE ALBARAN(\n" +
            "		num_albaran INTEGER constraint num_alb_pk primary key,\n" +
            "		fecha Time,\n" +
            "		direccion CHAR(50),\n" +
            "		num_explotacion INTEGER,\n" +
            "		nif CHAR(9),\n" +
            "		poblacion CHAR(50),\n" +
            "		provincia CHAR(30),\n" +
            "		num_animales INTEGER,\n" +
            "		num_colegiado INTEGER,\n" +
            "		apellidos CHAR(30),\n" +
            "		nombre CHAR(20))";
                System.out.println(sql);
                st.executeUpdate(sql);
                sql="CREATE TABLE PRODUCTOS(\n" +
"		cod_producto INTEGER,\n" +
"		cod_suministrador INTEGER,\n" +
"		cod_albaran INTEGER,\n" +
"		nombre CHAR(20),\n" +
"		presentacion CHAR(20),\n" +
"		formato CHAR(30),\n" +
"		unidades CHAR(20),\n" +
"		composicion CHAR(20),\n" +
"		tiempo_espera INTEGER,\n" +
"		forma_farmacologica CHAR(20),\n" +
"		n_registro CHAR(20),\n" +
"		lote CHAR(20),\n" +
"		nec_receta boolean,\n" +
"		fecha_compra date,\n" +
"		caducidad date,\n" +
"		precio INTEGER,\n" +
"		PVP INTEGER,\n" +
"		IVA INTEGER,\n" +
"		indicaciones CHAR(30),\n" +
"		instruciones CHAR(150),\n" +
"		familia CHAR(20),\n" +
"		almacen CHAR(20),\n" +
"		grp_vtas CHAR(20),\n" +
"		constraint product_pk PRIMARY KEY(cod_producto,cod_suministrador,cod_albaran),\n" +
"		constraint product_sum_fk FOREIGN KEY(cod_suministrador) REFERENCES SUMINISTRADORES,\n" +
"		constraint product_alb_fk FOREIGN KEY(cod_albaran) REFERENCES ALBARAN)";
                System.out.println(sql);
                st.executeUpdate(sql);
                sql="CREATE TABLE LINEAFACTURAS(\n" +
                    "	cod_albaran INTEGER ,\n" +
                    "	cod_producto INTEGER,\n" +
                    "	nombre_pro CHAR(20),\n" +
                    "	unidades INTEGER,\n" +
                    "	PVP INTEGER,\n" +
                    "	total INTEGER,\n" +
                    "	constraint linea_Alb_fk foreign key(cod_albaran) references ALBARAN,\n" +
                    "	constraint linea_produc_fk foreign key(cod_producto) references PRODUCTOS)";
                System.out.println(sql);
                st.executeUpdate(sql);
            } catch (SQLException e2) {
                throw new Exception("Error crearTablas()!!",e2);
            }
        }
    }
    public void borrarTablas() throws Exception{
        String sql;
        try {
            sql="drop table VETERINARIOS";
            st.executeQuery(sql);
            sql="drop table GANADEROS";
            st.executeQuery(sql);
            sql="drop table SUMINISTRADORES";
            st.executeQuery(sql);
            sql="drop table ALBARAN";
            st.executeQuery(sql);
            sql="drop table LINEAFACTURA";
            st.executeQuery(sql);
            sql="drop table PRODUCTOS";
            st.executeQuery(sql);
        } catch (SQLException e1) {
            throw new Exception(e1.getMessage());
        }
    }
}
