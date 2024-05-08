public class Estudiante {
    private String id;
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String estado;
    
    public Estudiante(String id, String nombre, String apellido, String fechaDeNacimiento, String estado){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.estado = estado;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public String getEstado() {
        return estado;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
