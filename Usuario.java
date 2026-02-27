public class Usuario {
    private String id;
    private String nombre;
    private String email;
    private String passwordHash;
    private boolean activo;

    public Usuario(String id, String nombre, String email, String passwordHash) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.passwordHash = passwordHash;
        this.activo = true;
    }

    public boolean autenticar(String password, ServicioEncriptacion servicio) {
        return servicio.verificarPassword(password, this.passwordHash);
    }

    public void cerrarSesion() {
        System.out.println("Sesión cerrada para: " + nombre);
    }

    public void actualizarPerfil(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public String getNombre() {
        return nombre;
    }
}