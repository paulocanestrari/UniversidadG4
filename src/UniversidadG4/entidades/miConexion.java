/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniversidadG4.entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author canes
 */
public class miConexion {

    private String url= "jdbc:mariadb://Localhost/Universidad";
    private String usuario= "root";
    private String password= "";
    private Connection conexion;

    public miConexion() {
    }

    public Connection buscarconexion() {
        if (conexion==null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                  conexion= DriverManager.getConnection(url, usuario, password);
            } catch (SQLException |ClassNotFoundException ex) {
                Logger.getLogger(miConexion.class.getName()).log(Level.SEVERE, null, ex);
            }}
             return conexion;
       
    }}
    
    