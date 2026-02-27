public class ValidadorCredenciales {

    public boolean validarEmail(String email) {
        return email.contains("@");
    }

    public boolean validarPassword(String password) {
        return password.length() >= 6;
    }
}