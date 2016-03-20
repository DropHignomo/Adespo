package Modelo;


public class Cliente {
    private String nombre;
    private int numExplotacion;
    private String direccion;
    private String nif;
    private String codPostal;
    private long telefono;
    private int fax;
    private String eMail;

    public Cliente() {
        this.nombre = "";
        this.numExplotacion = 0;
        this.direccion = "";
        this.nif = "";
        this.codPostal = "";
        this.telefono = 0;
        this.fax = fax;
        this.eMail = "";
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumExplotacion() {
        return numExplotacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNif() {
        return nif;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public long getTelefono() {
        return telefono;
    }

    public int getFax() {
        return fax;
    }

    public String geteMail() {
        return eMail;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumExplotacion(int numExplotacion) {
        this.numExplotacion = numExplotacion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    
    

}
