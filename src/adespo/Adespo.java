package adespo;

import Modelo.Albaran;
import Modelo.ConexionBD;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Adespo {

    public static void main(String[] args) {
        try {
            ConexionBD bd=ConexionBD.getInstancia();
            bd.abrirConexion();
            bd.crearTablas();
            Albaran a = new Albaran(1, new Date(), "direccion", 1, "444", "poblacion", "provincia", 88, 66, "apellidos", "nombre");
            System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(a.getFecha()));
            if(a.alta())
                System.out.println("alta correcta");
        } catch (Exception ex) {
            Logger.getLogger(Adespo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
