package Modelo;


public class Ganadero {
    private int cod_ganadero;
    private String nombre;
    private int num_explotacion;
    private String direccion;
    private String nif;
    private String cod_postal;
    private String poblacion;
    private long tfno;
    private int fax;
    private String eMail;

    public Ganadero(int cod_ganadero, String nombre, int num_explotacion, String direccion, String nif, String cod_postal, String poblacion, long tfno, int fax, String eMail) {
        this.cod_ganadero = cod_ganadero;
        this.nombre = nombre;
        this.num_explotacion = num_explotacion;
        this.direccion = direccion;
        this.nif = nif;
        this.cod_postal = cod_postal;
        this.poblacion = poblacion;
        this.tfno = tfno;
        this.fax = fax;
        this.eMail = eMail;
    }

    public void setCod_ganadero(int cod_ganadero) {
        this.cod_ganadero = cod_ganadero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNum_explotacion(int num_explotacion) {
        this.num_explotacion = num_explotacion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setCod_postal(String cod_postal) {
        this.cod_postal = cod_postal;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setTfno(long tfno) {
        this.tfno = tfno;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getCod_ganadero() {
        return cod_ganadero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNum_explotacion() {
        return num_explotacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNif() {
        return nif;
    }

    public String getCod_postal() {
        return cod_postal;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public long getTfno() {
        return tfno;
    }

    public int getFax() {
        return fax;
    }

    public String geteMail() {
        return eMail;
    }


}
