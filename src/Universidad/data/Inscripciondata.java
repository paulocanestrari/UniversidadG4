/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidad.data;

import UniversidadG4.entidades.Inscripcion;
import UniversidadG4.entidades.miConexion;
import java.sql.Connection;

/**
 *
 * @author canes
 */
public class Inscripciondata {
    private Connection con;

    public Inscripciondata(Connection con) {
        this.con = miConexion.buscarconexion();
    }
public void guardarInscripcion (Inscripcion ins){
}
public Inscripcion obtenerInscripcion (int id_alumno , int id_materia);

return null;
}



}
  
    
    
    
    
    
    
    
}
