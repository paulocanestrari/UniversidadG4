/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidad.data;

import UniversidadG4.entidades.miConexion;
import java.sql.Connection;

/**
 *
 * @author canes
 */
public class Alumnodata {
    private Connection con=null;

    public Alumnodata(miConexion con) {
        
        this.con= con.buscarconexion();
    }

 

  
    
    
    
}
