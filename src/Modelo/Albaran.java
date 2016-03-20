package Modelo;

//del albarán se debe hacer un reporte con la informacion de la clase
public class Albaran {
    private int nAlbaran;
    private String fecha;
    private int idGanadero;
    private int idVeterinario;

    public Albaran() {
        this.nAlbaran = 0;
        this.fecha = "";
        this.idGanadero = 0;
        this.idVeterinario = 0;
    }

    public int getnAlbaran() {
        return nAlbaran;
    }

    public String getFecha() {
        return fecha;
    }

    public int getIdGanadero() {
        return idGanadero;
    }

    public int getIdVeterinario() {
        return idVeterinario;
    }

    public void setnAlbaran(int nAlbaran) {
        this.nAlbaran = nAlbaran;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setIdGanadero(int idGanadero) {
        this.idGanadero = idGanadero;
    }

    public void setIdVeterinario(int idVeterinario) {
        this.idVeterinario = idVeterinario;
    }    
}
