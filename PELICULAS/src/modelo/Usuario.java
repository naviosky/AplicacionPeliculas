package modelo;

public class Usuario {
    private String nombreUsuario;
    private String correo;
    private String contraseña;
    private boolean esAdmin;

    public Usuario(String nombreUsuario, String correo, String contraseña, boolean esAdmin) {
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.contraseña = contraseña;
        this.esAdmin = esAdmin;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public boolean esAdmin() {
        return esAdmin;
    }
}
