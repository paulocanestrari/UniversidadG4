/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidad.data;

import UniversidadG4.entidades.Alumno;
import UniversidadG4.entidades.Inscripcion;
import UniversidadG4.entidades.Materia;
import UniversidadG4.entidades.miConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author canes
 */
public class Inscripciondata {
    private Connection con;
    private Alumnodata al;
    private Materiadata ma;

    public Inscripciondata() {
          this.con = miConexion.buscarconexion();
        this.al = new Alumnodata();
        this.ma = new Materiadata();
    }
   
public void guardarInscripcion (Inscripcion ins){
  String sql="INSERT INTO inscripcion(id_alumno, id_materia, nota) VALUES ( ?, ?, ?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,ins.getAlumno().getId_alumno());
            ps.setInt(2,ins.getMateria().getId_materia());
            ps.setDouble(3, ins.getNota());
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                ins.setId_inscripcion(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null, "Inscripción agregado exitosamente!");           
            }          
            ps.close();           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo Inscribir!");
            
            System.out.println(ex.getMessage());
        }}  

public Inscripcion obtenerInscripcion (int id_alumno, int id_materia ){
Inscripcion in=null;
        String sql = "SELECT  id_inscripcion, id_alumno, id_materia, nota FROM inscripcion WHERE id_alumno= ? AND id_materia=?";
try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,id_alumno);
            //ps.setInt(2,id_materia);
            ResultSet rs= ps.executeQuery();
            
            if(rs.next()){
            in = new Inscripcion();
                in.setAlumno(al.obtenerAlumnoPorId(rs.getInt("id_alumno")));
                in.setMateria(ma.obtenerMateriaPorId(rs.getInt("id_materia")));
                in.setNota(rs.getInt("nota"));
                in.setId_inscripcion(rs.getInt("id_inscripcion"));
                           
            }          
            ps.close();           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al procesar Obtener Inscribir!"+ ex.getMessage());
            System.out.println(ex.getMessage());
        }
      
    if (in==null) {
     JOptionPane.showMessageDialog(null, "No esta inscripto!");
}
return in;
}


public ArrayList <Inscripcion>  obtenerInscripciones (int id_alumno ){
ArrayList <Inscripcion> ins=new ArrayList();
Inscripcion in=null;
        String sql = "SELECT* FROM inscripcion WHERE id_alumno= ?";
try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,id_alumno);
            //ps.setInt(2,id_materia);
            ResultSet rs= ps.executeQuery();
            
            while(rs.next()){
            in = new Inscripcion();
                in.setAlumno(al.obtenerAlumnoPorId(rs.getInt("id_alumno")));
                in.setMateria(ma.obtenerMateriaPorId(rs.getInt("id_materia")));
                in.setNota(rs.getInt("nota"));
                in.setId_inscripcion(rs.getInt("id_inscripcion"));
                ins.add(in);
                          
            }          
            ps.close();           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al procesar Obtener Inscribciones!"+ ex.getMessage());
            System.out.println(ex.getMessage());
        }
      
    if (in==null) {
     JOptionPane.showMessageDialog(null, "No esta inscripto!");
}
return ins;
}
public void borrarInscripcion (int id_alumno, int id_materia){
String sql = " DELETE FROM inscripcion WHERE id_alumno =? AND id_materia =?";
    
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id_alumno);
            ps.setInt(2, id_materia);
            ps.executeUpdate();//
            JOptionPane.showMessageDialog(null, "Se elimino correctamente la inscripción");
            ps.close();
            
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo borrar Inscripción");
        }
}
public void actualizarNota (int id_inscripcion, double nota){
 String sql="UPDATE inscripcion SET nota=? WHERE id_inscripcion=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setDouble(1,nota);
            ps.setInt(2,id_inscripcion);
           
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Nota actualizada");
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "inscripcionData Sentencia SQL erronea-actualizar nota");
        }
    }
public ArrayList <Materia> obtenermateriasInscriptas (Alumno alumno){
  ArrayList <Materia> ml= new ArrayList();
  Materia mat= new Materia();
  String sql="SELECT id_materia FROM inscripcion  WHERE id_alumno=? ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,alumno.getId_alumno());
            ResultSet rs= ps.executeQuery();
           while (rs.next()){
            ml.add(ma.obtenerMateriaPorId(rs.getInt("id_materia")));
        }
            ps.close();
           JOptionPane.showMessageDialog(null, "Se obtubo lista con materias inscriptas");
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "inscripcionData Sentencia SQL erronea-obtenermateriainscriptas ");
        }
        return ml;
}
public ArrayList <Materia> obtenermateriasNOInscriptas ( Alumno alumno){
  ArrayList <Materia> ml= new ArrayList();
  Materia mat= new Materia();
  String sql="SELECT id_materia FROM materia WHERE id_materia NOT IN (SELECT id_materia FROM inscripcion WHERE id_alumno =?)";
          try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,alumno.getId_alumno());
            ResultSet rs= ps.executeQuery();
           while (rs.next()){
               ml.add(ma.obtenerMateriaPorId(rs.getInt("id_materia")));
        }
           ps.close();
           JOptionPane.showMessageDialog(null, "Se obtubo lista con materias NO inscriptas");
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "inscripcionData Sentencia SQL erronea-obtenermateriaNOinscriptas ");
        }
     return ml;
  }
public ArrayList <Alumno> obtenerAlumnosinscriptos ( Materia materia){
  ArrayList <Alumno> listal= new ArrayList();
  Alumno alu= new Alumno();
  String sql="SELECT id_alumno FROM inscripcion WHERE id_materia=?";
          try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,materia.getId_materia());
            ResultSet rs= ps.executeQuery();
           while (rs.next()){
               listal.add(al.obtenerAlumnoPorId(rs.getInt("id_alumno")));
        }
           ps.close();
           JOptionPane.showMessageDialog(null, "Se obtubo lista con Alumnos inscriptos");
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "inscripcionData Sentencia SQL erronea-obteneralumnoinscriptos ");
        }
     return listal;
  }


  }
