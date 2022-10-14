package UniversidadG4;


import java.time.LocalDate;

public class Alumno {

    private int id_Alumno;

    private Long dni;

    private String Apellido;

    private String nombre;

    private LocalDate fecha_nacimiento;

    private boolean estado;

    public Alumno() {
    }

    public Alumno(int id_Alumno, Long dni, String Apellido, String nombre, LocalDate fecha_nacimiento, boolean estado) {
        this.id_Alumno = id_Alumno;
        this.dni = dni;
        this.Apellido = Apellido;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.estado = estado;
    }

    public Alumno(Long dni, String Apellido, String nombre, LocalDate fecha_nacimiento, boolean estado) {
        this.dni = dni;
        this.Apellido = Apellido;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.estado = estado;
    }

    public int getId_Alumno() {
        return id_Alumno;
    }

    public void setId_Alumno(int id_Alumno) {
        this.id_Alumno = id_Alumno;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id_Alumno=" + id_Alumno + ", dni=" + dni + ", Apellido=" + Apellido + ", nombre=" + nombre + ", fecha_nacimiento=" + fecha_nacimiento + ", estado=" + estado + '}';
    }

   
}
