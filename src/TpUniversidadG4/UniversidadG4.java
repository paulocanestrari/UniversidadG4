
package TpUniversidadG4;

import Universidad.data.Alumnodata;
import Universidad.data.Inscripciondata;
import Universidad.data.Materiadata;
import UniversidadG4.entidades.Alumno;
import UniversidadG4.entidades.Inscripcion;
import UniversidadG4.entidades.Materia;
import UniversidadG4.entidades.miConexion;
import java.sql.Connection;
import java.time.LocalDate;


public class UniversidadG4 {

    
    public static void main(String[] args) {
        
       miConexion com =new miConexion();
       Connection po=com.buscarconexion();
       
       
       
       /*
       
       //******metodos alumno data********
       
       Alumno alumno1 = new Alumno (31486515,"Canestrari","paulo",LocalDate.of(1985, 6, 7),true);
       Alumnodata alumData1= new Alumnodata();
       
       alumData1.guardarAlumno(alumno1);
       
        
        for (Alumno aux : alumData1.obtenerAlumnos()) {
            System.out.println(aux.getApellido() + " "+ aux.getNombre());
            
        }
        
        Alumno a= alumData1.obtenerAlumnoPorId(1);
        
        alumData1.borrarAlumno(2);
        
        
        /*
        a.setApellido("Pepe");
        alumData1.actualizaAlumno(a);
        */
        
        
        
        
        
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
       /* 
        
        //*******metodos Materia data*******
        Materia materia1 = new Materia("web 2",2,true);
        Materiadata materiaData1= new Materiadata();
        
        materiaData1.guardarMateria(materia1);
       
        for (Materia aux : materiaData1.obtenerMateria()) {
            System.out.println(aux.getNombre()+" año "+ aux.getAnio());
            
        }
      Materia m= materiaData1.obtenerMateriaPorId(8);
      
       
       
       materiaData1.borrarMateria(3);
       
       m.setNombre("Calculo 1");
        materiaData1.actualizaMateria(m);
       
       
       
       ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   

       
       
       
       
       
       //*********metodos incripcion data**********
      
       Inscripcion inscripcion1 = new Inscripcion(alumno1,materia1,-1);
       */
       Inscripciondata inscripcionData1= new Inscripciondata();
       
       //inscripcionData1.guardarInscripcion(inscripcion1);
       
       
       
       
        System.out.println(inscripcionData1.obtenerInscripcion(18, 16)); //no anda
       
       
       
       //inscripcionData1.borrarInscripcion(3, 5);
       
       
            
        
       //inscripcionData1.actualizarNota(2, 4, 9);
       
       
       
       
        
       /* for (Materia aux : inscripcionData1.obtenermateriasInscriptas(a)) {
            
            System.out.println(aux.getNombre());
        }*/
       
       
       
       
       
       /* for (Materia aux : inscripcionData1.obtenermateriasNOInscriptas(a)) {
            
            System.out.println(aux.getNombre());
        }*/
       
       
       
       /*
       for (Alumno aux : inscripcionData1.obtenerAlumnosinscriptos(m)) {
            
            System.out.println(aux.getNombre()+" "+ aux.getApellido());
        }*/
       
       
       
      
    }
}
