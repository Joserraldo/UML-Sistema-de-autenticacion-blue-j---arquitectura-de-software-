public class RegistroUsuario {
    private BaseDeDatos baseDeDatos;
    private ServicioEncriptacion servicio;

    public RegistroUsuario(BaseDeDatos baseDeDatos,  ServicioEncriptacion servicio) {
        this.baseDeDatos = baseDeDatos;
        this.servicio = servicio;
    }

    public void registrar(String id, String nombre, String email, String password) {
        String hash = servicio.encriptarPassword(password);
        Usuario usuario = new Usuario(id, nombre, email, hash);
        baseDeDatos.guardarUsuario(usuario);
        System.out.println("Usuario registrado correctamente");
    }
}
