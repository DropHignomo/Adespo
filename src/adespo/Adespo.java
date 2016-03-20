package adespo;

import Modelo.ConexionBD;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Adespo {

    public static void main(String[] args) {
        try {
            ConexionBD bd= new ConexionBD();
            bd.borrarTablas();
        } catch (Exception ex) {
            Logger.getLogger(Adespo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
