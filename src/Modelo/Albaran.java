package Modelo;

//del albarán se debe hacer un reporte con la informacion de la clase

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Albaran {
    private int cod_albaran;
    private Date fecha;
    private String direccion;
    private int num_explotacion;
    private String nif;
    private String poblacion;
    private String provincia;
    private int num_animales;
    private int num_colegiado;
    private String apellidos;
    private String nombre;

    public Albaran(int cod_albaran, Date fecha, String direccion, int num_explotacion, String nif, String poblacion, String provincia, int num_animales, int num_colegiado, String apellidos, String nombre) {
        this.cod_albaran = cod_albaran;
        this.fecha = fecha;
        this.direccion = direccion;
        this.num_explotacion = num_explotacion;
        this.nif = nif;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.num_animales = num_animales;
        this.num_colegiado = num_colegiado;
        this.apellidos = apellidos;
        this.nombre = nombre;
    }

    public int getCod_albaran() {
        return cod_albaran;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNum_explotacion() {
        return num_explotacion;
    }

    public String getNif() {
        return nif;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public int getNum_animales() {
        return num_animales;
    }

    public int getNum_colegiado() {
        return num_colegiado;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCod_albaran(int cod_albaran) {
        this.cod_albaran = cod_albaran;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNum_explotacion(int num_explotacion) {
        this.num_explotacion = num_explotacion;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setNum_animales(int num_animales) {
        this.num_animales = num_animales;
    }

    public void setNum_colegiado(int num_colegiado) {
        this.num_colegiado = num_colegiado;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public boolean alta() throws SQLException{
        Statement st=ConexionBD.getInstancia().getSt();
        String sql="insert into ALBARAN values("
                +this.cod_albaran+","+this.fecha+","
                +this.direccion+","+this.num_explotacion+","
                +this.nif+","+this.poblacion+","+this.provincia+","
                +this.num_animales+","+this.num_colegiado+","+this.apellidos+
                ","+this.nombre+")";
        return st.execute(sql);
    }
    public boolean baja() throws SQLException{
        Statement st=ConexionBD.getInstancia().getSt();
        String sql="delete from albaran where cod_albaran="+this.cod_albaran;
        return st.execute(sql);
    }
}
