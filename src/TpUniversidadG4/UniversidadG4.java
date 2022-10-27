
package TpUniversidadG4;

import UniversidadG4.entidades.miConexion;
import java.sql.Connection;


public class UniversidadG4 {

    
    public static void main(String[] args) {
        
       miConexion com =new miConexion();
       Connection po=com.buscarconexion();
      
    }
}
