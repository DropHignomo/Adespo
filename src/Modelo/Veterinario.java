package Modelo;

public class Veterinario {

    private String codVeterinario;
    private int  numColegiado;
    private int provColeg;
    private String apellidos;
    private String nombre;
    private String direccion;
    private String poblacion;
    private String provincia;
    private String nif;
    private long telefono;
    private String eMail;
    private String fax;

    public Veterinario() {
        this.codVeterinario = "";
        this.numColegiado = 0;
        this.provColeg = 0;
        this.apellidos = "";
        this.nombre = "";
        this.direccion = "";
        this.poblacion = "";
        this.provincia = "";
        this.nif = "";
        this.telefono = 0;
        this.eMail = "";
        this.fax = "";
    }

    public String getCodVeterinario() {
        return codVeterinario;
    }

    public int getNumColegiado() {
        return numColegiado;
    }

    public int getProvColeg() {
        return provColeg;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
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

    public long getTelefono() {
        return telefono;
    }

    public String geteMail() {
        return eMail;
    }

    public String getFax() {
        return fax;
    }

    public void setCodVeterinario(String codVeterinario) {
        this.codVeterinario = codVeterinario;
    }

    public void setNumColegiado(int numColegiado) {
        this.numColegiado = numColegiado;
    }

    public void setProvColeg(int provColeg) {
        this.provColeg = provColeg;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}

