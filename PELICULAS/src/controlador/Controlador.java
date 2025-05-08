package controlador;

import modelo.Usuario;
import vista.InterfazConsola;

import java.util.ArrayList;

public class Controlador {
    private final InterfazConsola vista;
    private final ArrayList<Usuario> usuarios;

    public Controlador(InterfazConsola vista) {
        this.vista = vista;
        this.usuarios = new ArrayList<>();
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            vista.mostrarMenu();
            String opcion = vista.pedirTexto("");
            switch (opcion) {
                case "1":
                    registrarUsuario();
                    break;
                case "2":
                    iniciarSesion();
                    break;
                case "3":
                    salir = true;
                    break;
                default:
                    vista.mostrarMensaje("Opción inválida.");
            }
        }
    }

    public void registrarUsuario() {
        String nombre = vista.pedirTexto("Nombre de usuario: ");
        String correo = vista.pedirTexto("Correo: ");
        String contraseña = vista.pedirTexto("Contraseña: ");
        boolean esAdmin = false;

        for (Usuario u : usuarios) {
            if (u.getCorreo().equalsIgnoreCase(correo)) {
                vista.mostrarMensaje("Ya existe un usuario con ese correo.");
                return;
            }
        }

        usuarios.add(new Usuario(nombre, correo, contraseña, esAdmin));
        vista.mostrarMensaje("Usuario registrado con éxito.");
    }

    public void iniciarSesion() {
        String correo = vista.pedirTexto("Correo: ");
        String contraseña = vista.pedirTexto("Contraseña: ");

        for (Usuario u : usuarios) {
            if (u.getCorreo().equalsIgnoreCase(correo) && u.getContraseña().equals(contraseña)) {
                vista.mostrarMensaje("¡Bienvenido, " + u.getNombreUsuario() + "!");
                return;
            }
        }

        vista.mostrarMensaje("Credenciales incorrectas.");
    }
}
