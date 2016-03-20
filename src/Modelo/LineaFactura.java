package Modelo;

import java.util.ArrayList;

public class LineaFactura {
    private int codAlbaran;
    private int codProducto;
    private ArrayList lProductos;
    private int unidades;
    private double pvp;
    private double total;

    public LineaFactura(int codAlbaran, int codProducto, ArrayList lProductos, int unidades, double pvp, double total) {
        this.codAlbaran = codAlbaran;
        this.codProducto = codProducto;
        this.lProductos = lProductos;
        this.unidades = unidades;
        this.pvp = pvp;
        this.total = total;
    }

    public int getCodAlbaran() {
        return codAlbaran;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public ArrayList getlProductos() {
        return lProductos;
    }

    public int getUnidades() {
        return unidades;
    }

    public double getPvp() {
        return pvp;
    }

    public double getTotal() {
        return total;
    }

    public void setCodAlbaran(int codAlbaran) {
        this.codAlbaran = codAlbaran;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public void setlProductos(ArrayList lProductos) {
        this.lProductos = lProductos;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
