package Modelo;


public class Suministrador {
    private String codSuministrador;
    private String nombre;
    private String direccion;
    private int codPostal;
    private String poblacion;
    private String nif;
    private String eMail;
    private long telefono;
    private long telefono2;
    private long fax;

    public Suministrador() {
        this.codSuministrador = "";
        this.nombre = "";
        this.direccion = "";
        this.codPostal = 0;
        this.poblacion = "";
        this.nif = "";
        this.eMail = "";
        this.telefono = 0;
        this.telefono2 = 0;
        this.fax = 0;
    }

    public String getCodSuministrador() {
        return codSuministrador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public String getNif() {
        return nif;
    }

    public String geteMail() {
        return eMail;
    }

    public long getTelefono() {
        return telefono;
    }

    public long getTelefono2() {
        return telefono2;
    }

    public long getFax() {
        return fax;
    }

    public void setCodSuministrador(String codSuministrador) {
        this.codSuministrador = codSuministrador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setTelefono2(long telefono2) {
        this.telefono2 = telefono2;
    }

    public void setFax(long fax) {
        this.fax = fax;
    }
    
    

}
