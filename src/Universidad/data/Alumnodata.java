/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidad.data;


import UniversidadG4.entidades.Alumno;
import UniversidadG4.entidades.miConexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class Alumnodata {
    private Connection con;

    public Alumnodata() {
        this.con=miConexion.buscarconexion();
    }
    
    public void guardarAlumno(Alumno alumno){
        String sql="INSERT INTO alumno (dni, apellido, nombre, fecha_nacimiento, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, alumno.getDni());
            ps.setString(2,alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFecha_nacimiento()));
            ps.setBoolean(5, alumno.getEstado());
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
            
                alumno.setId_alumno(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null, "Alumno agregado exitosamente!");           
            }          
            ps.close();           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Alumno no se pudo agregar!");
            System.out.println(ex.getMessage());
            
        }
    }
    
    public ArrayList<Alumno> obtenerAlumnos(){
        
        ArrayList<Alumno> listaAlumnos=new ArrayList();
        
        String sql="SELECT * FROM alumno WHERE estado = 1";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
            
                Alumno a=new Alumno();
                
                a.setId_alumno(rs.getInt("id_alumno"));
                a.setDni(rs.getLong("dni"));
                a.setApellido(rs.getString("apellido"));
                a.setNombre(rs.getString("nombre"));
                a.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                a.setEstado(rs.getBoolean("estado"));
                
                listaAlumnos.add(a);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener Alumnos");
        }
    return listaAlumnos;
    }
    
    
    public Alumno obtenerAlumnoPorId(int id_alumno) {
        String sql= "SELECT * FROM alumno WHERE estado = 1 AND id_alumno = ?";
        Alumno al = new Alumno();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id_alumno);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){              
                al.setId_alumno(id_alumno);
                al.setDni(rs.getLong("dni"));
                al.setApellido(rs.getString("apellido"));
                al.setNombre(rs.getString("nombre"));
                al.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                al.setEstado(rs.getBoolean("estado"));
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ALumnoData Sentencia SQL erronea-obtenerAlumnoPorId");
        }
        return al;
         
    }
    
    
    public void borrarAlumno (int id){
        String sql="DELETE FROM alumno WHERE id_alumno=? AND estado=0";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();//
            
            JOptionPane.showMessageDialog(null, "Se elimino el alumno correctamente");
            
            ps.close();
            
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ALumnoData Sentencia SQL erronea-borrarAlumno");
        }
    }
    
    
    
    public void actualizaAlumno(Alumno alumno){
        String sql="UPDATE alumno SET dni=?, apellido = ?, nombre = ?, fecha_nacimiento = ?, estado=? WHERE id_alumno= ?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setLong(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFecha_nacimiento()));
            ps.setBoolean(5, alumno.getEstado());
            ps.setInt(6, alumno.getId_alumno());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos del alumno actualizados");
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ALumnoData Sentencia SQL erronea-actualizarAlumno");
        }
    }
}
    
    
    

    
    
    

