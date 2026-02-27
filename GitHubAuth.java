public class GitHubAuth extends ProveedorOAuth {

    public GitHubAuth(String clientId, String clientSecret, String redirectURI) {
        super(clientId, clientSecret, redirectURI);
    }

    public String solicitarToken() {
        return "GitHubToken456";
    }

    public boolean validarToken(String token) {
        return token.startsWith("GitHub");
    }

    public String obtenerDatosUsuario(String token) {
        return "UsuarioGitHub";
    }
}