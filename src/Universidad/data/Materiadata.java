/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidad.data;

import UniversidadG4.entidades.Materia;
import UniversidadG4.entidades.miConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author canes
 */
public class Materiadata {
     private Connection con;

    public Materiadata(Connection con) {
        this.con = miConexion.buscarconexion();
    }
public void guardarMateria(Materia materia){
        String sql= "INSERT INTO `materia`( `nombre`, `anio`, `estado`) VALUES (?,?,?)";
         try {
             PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
             ps.setString(1, materia.getNombre() );
             ps.setInt(2, materia.getAnio());
             ps.setBoolean(3, materia.isEstado());
              ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
            
                materia.setId_materia(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null, "Materia agregada exitosamente!");           
            }          
            ps.close(); 
                    
             
         } catch (SQLException ex) {
             Logger.getLogger(Materiadata.class.getName()).log(Level.SEVERE, null, ex);
         }
  
      
    }
public ArrayList<Materia> obtenerMateria(){
        
        ArrayList<Materia> listaMateria=new ArrayList();
        
        String sql="SELECT * FROM materia WHERE estado=1";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
            
                Materia m=new Materia();
                
                m.setId_materia(rs.getInt("id_materia"));
                m.setNombre(rs.getString("nombre"));
                m.setAnio(rs.getInt("anio"));
                m.setEstado(rs.getBoolean("estado"));
                
                listaMateria.add(m);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener Materia");
        }
    return listaMateria;
    }
    public Materia obtenerMateriaPorId(int id_materia) {
        String sql= "SELECT * FROM materia WHERE estado = 1 AND id_materia = ?";
        Materia ma = new Materia();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id_materia);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){              
                ma.setId_materia(id_materia);
                ma.setNombre(rs.getString("nombre"));
                ma.setAnio(rs.getInt("anio"));
                ma.setEstado(rs.getBoolean("estado"));
               }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "MateriaData Sentencia SQL erronea-obtenerMateriaPorId");
        }
        return ma;
    }
        public void borrarMateria (int id) {
        String sql="UPDATE Materia SET estado=0 WHERE id_materia=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();//
            
            JOptionPane.showMessageDialog(null, "Se elimino la Materia correctamente");
            
            ps.close();
            
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "MateriaData Sentencia SQL erronea-borrarMateria");
        }}
    public void actualizaMateria(Materia materia){
        String sql="UPDATE materia SET nombre=?, anio=?, estado=? WHERE id_materia=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setString(1, materia.getNombre());
             ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getId_materia());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos de la Materia actualizada");
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "MateriaData Sentencia SQL erronea-actualizarMateria");
        }
    }    
        
    }
        
        
        
        
        
        
        
        
        
    






