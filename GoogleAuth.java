public class GoogleAuth extends ProveedorOAuth {

    public GoogleAuth(String clientId, String clientSecret, String redirectURI) {
        super(clientId, clientSecret, redirectURI);
    }

    public String solicitarToken() {
        return "GoogleToken123";
    }

    public boolean validarToken(String token) {
        return token.startsWith("Google");
    }

    public String obtenerDatosUsuario(String token) {
        return "UsuarioGoogle";
    }
}