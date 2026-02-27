public abstract class ProveedorOAuth {
    protected String clientId;
    protected String clientSecret;
    protected String redirectURI;

    public ProveedorOAuth(String clientId, String clientSecret, String redirectURI) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.redirectURI = redirectURI;
    }

    public abstract String solicitarToken();
    public abstract boolean validarToken(String token);
    public abstract String obtenerDatosUsuario(String token);
}