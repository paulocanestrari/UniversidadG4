package UniversidadG4.entidades;


import java.time.LocalDate;

public class Alumno {

    private int id_alumno;

    private long dni;

    private String apellido;

    private String nombre;

    private LocalDate fecha_nacimiento;

    private boolean estado;

    public Alumno() {
    }

    public Alumno(int id_alumno, Long dni, String Apellido, String nombre, LocalDate fecha_nacimiento, boolean estado) {
        this.id_alumno = id_alumno;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.estado = estado;
    }

    public Alumno(long dni, String apellido, String nombre, LocalDate fecha_nacimiento, boolean estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.estado = estado;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_Alumno) {
        this.id_alumno = id_Alumno;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id_Alumno=" + id_alumno + ", dni=" + dni + ", Apellido=" + apellido + ", nombre=" + nombre + ", fecha_nacimiento=" + fecha_nacimiento + ", estado=" + estado + '}';
    }

   
}
