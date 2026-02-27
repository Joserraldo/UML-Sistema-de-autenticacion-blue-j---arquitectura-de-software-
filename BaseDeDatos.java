import java.util.HashMap;
import java.util.Map;

public class BaseDeDatos {
    private Map<String, Usuario> usuarios;

    public BaseDeDatos() {
        usuarios = new HashMap<>();
    }

    public void guardarUsuario(Usuario usuario) {
        usuarios.put(usuario.getEmail(), usuario);
    }

    public Usuario buscarUsuario(String email) {
        return usuarios.get(email);
    }
}