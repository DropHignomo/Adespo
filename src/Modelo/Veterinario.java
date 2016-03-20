package Modelo;

public class Veterinario {

    private int cod_veterinario;
    private int  num_colegiado;
    private int prov_coleg;
    private String apellidos;
    private String nombre;
    private String direccion;
    private String poblacion;
    private String provincia;
    private String nif;
    private long tfno;
    private String eMail;
    private String fax;

    public Veterinario(int codVeterinario, int numColegiado, int provColeg, String apellidos, String nombre, String direccion, String poblacion, String provincia, String nif, long telefono, String eMail, String fax) {
        this.cod_veterinario = codVeterinario;
        this.num_colegiado = numColegiado;
        this.prov_coleg = provColeg;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.nif = nif;
        this.tfno = telefono;
        this.eMail = eMail;
        this.fax = fax;
    }


    public int getCodVeterinario() {
        return cod_veterinario;
    }

    public int getNumColegiado() {
        return num_colegiado;
    }

    public int getProvColeg() {
        return prov_coleg;
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
        return tfno;
    }

    public String geteMail() {
        return eMail;
    }

    public String getFax() {
        return fax;
    }

    public void setCodVeterinario(int codVeterinario) {
        this.cod_veterinario = codVeterinario;
    }

    public void setNumColegiado(int numColegiado) {
        this.num_colegiado = numColegiado;
    }

    public void setProvColeg(int provColeg) {
        this.prov_coleg = provColeg;
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
        this.tfno = telefono;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}