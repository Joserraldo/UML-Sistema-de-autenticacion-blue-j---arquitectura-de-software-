import java.util.ArrayList;
import java.util.List;

public class GestorSesion {
    private List<Sesion> sesiones;

    public GestorSesion() {
        sesiones = new ArrayList<>();
    }

    public void crearSesion(Usuario usuario) {
        Sesion sesion = new Sesion("SES" + sesiones.size(), usuario);
        sesiones.add(sesion);
        System.out.println("Sesión creada");
    }

    public void cerrarSesion(String id) {
        for (Sesion s : sesiones) {
            s.finalizar();
        }
    }
}