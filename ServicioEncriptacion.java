public class ServicioEncriptacion {

    public String encriptarPassword(String password) {
        return Integer.toHexString(password.hashCode());
    }

    public boolean verificarPassword(String password, String hashGuardado) {
        return encriptarPassword(password).equals(hashGuardado);
    }
}