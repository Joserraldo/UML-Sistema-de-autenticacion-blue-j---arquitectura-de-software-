import java.util.Date;

public class Sesion {
    private String idSesion;
    private Usuario usuario;
    private Date fechaInicio;
    private boolean activa;

    public Sesion(String idSesion, Usuario usuario) {
        this.idSesion = idSesion;
        this.usuario = usuario;
        this.fechaInicio = new Date();
        this.activa = true;
    }

    public void finalizar() {
        activa = false;
        System.out.println("Sesión finalizada");
    }

    public boolean isActiva() {
        return activa;
    }
}