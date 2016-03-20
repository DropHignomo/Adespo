package Modelo;


public class Suministrador {
    private String cod_suministrador;
    private String nombre;
    private String direccion;
    private int cod_postal;
    private String poblacion;
    private String provincia;
    private String nif;
    private String eMail;
    private long tfno;
    private long fax;
    private long con_tlf1;
    private long con_tlf2;
    private long telefono2;
    private long con_direccion;
    private long con_cargo;

    public Suministrador(String cod_suministrador, String nombre, String direccion, int cod_postal, String poblacion, String provincia, String nif, String eMail, long tfno, long fax, long con_tlf1, long con_tlf2, long telefono2, long con_direccion, long con_cargo) {
        this.cod_suministrador = cod_suministrador;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cod_postal = cod_postal;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.nif = nif;
        this.eMail = eMail;
        this.tfno = tfno;
        this.fax = fax;
        this.con_tlf1 = con_tlf1;
        this.con_tlf2 = con_tlf2;
        this.telefono2 = telefono2;
        this.con_direccion = con_direccion;
        this.con_cargo = con_cargo;
    }

    public String getCod_suministrador() {
        return cod_suministrador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCod_postal() {
        return cod_postal;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getNif() {
        return nif;
    }

    public String geteMail() {
        return eMail;
    }

    public long getTfno() {
        return tfno;
    }

    public long getFax() {
        return fax;
    }

    public long getCon_tlf1() {
        return con_tlf1;
    }

    public long getCon_tlf2() {
        return con_tlf2;
    }

    public long getTelefono2() {
        return telefono2;
    }

    public long getCon_direccion() {
        return con_direccion;
    }

    public long getCon_cargo() {
        return con_cargo;
    }

    public void setCod_suministrador(String cod_suministrador) {
        this.cod_suministrador = cod_suministrador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCod_postal(int cod_postal) {
        this.cod_postal = cod_postal;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setTfno(long tfno) {
        this.tfno = tfno;
    }

    public void setFax(long fax) {
        this.fax = fax;
    }

    public void setCon_tlf1(long con_tlf1) {
        this.con_tlf1 = con_tlf1;
    }

    public void setCon_tlf2(long con_tlf2) {
        this.con_tlf2 = con_tlf2;
    }

    public void setTelefono2(long telefono2) {
        this.telefono2 = telefono2;
    }

    public void setCon_direccion(long con_direccion) {
        this.con_direccion = con_direccion;
    }

    public void setCon_cargo(long con_cargo) {
        this.con_cargo = con_cargo;
    }
    
}
