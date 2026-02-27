public class Autenticador {
    private ProveedorOAuth proveedorOAuth;
    private BaseDeDatos baseDeDatos;
    private ServicioEncriptacion servicioEncriptacion;

    public Autenticador(BaseDeDatos baseDeDatos, ServicioEncriptacion servicio) {
        this.baseDeDatos = baseDeDatos;
        this.servicioEncriptacion = servicio;
    }

    public Usuario login(String email, String password) {
        Usuario usuario = baseDeDatos.buscarUsuario(email);
        if (usuario != null && usuario.autenticar(password, servicioEncriptacion)) {
            System.out.println("Login exitoso");
            return usuario;
        }
        System.out.println("Credenciales incorrectas");
        return null;
    }

    public void loginConProveedor(ProveedorOAuth proveedor) {
        this.proveedorOAuth = proveedor;
        String token = proveedor.solicitarToken();
        System.out.println("Token recibido: " + token);
    }

    public void logout(Usuario usuario) {
        usuario.cerrarSesion();
    }
}