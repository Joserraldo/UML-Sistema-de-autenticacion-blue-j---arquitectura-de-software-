import java.util.Date;

public class Token {
    private String accessToken;
    private String refreshToken;
    private Date fechaExpiracion;

    public Token(String accessToken, String refreshToken, Date fechaExpiracion) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.fechaExpiracion = fechaExpiracion;
    }

    public boolean esValido() {
        return new Date().before(fechaExpiracion);
    }

    public void renovar(Date nuevaFecha) {
        this.fechaExpiracion = nuevaFecha;
    }
}