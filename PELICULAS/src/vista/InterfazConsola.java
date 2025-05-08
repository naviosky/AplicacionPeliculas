package vista;

import java.util.Scanner;

public class InterfazConsola {
    private final Scanner sc = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("\n---- Menú PopCornRank ----");
        System.out.println("1. Registrarse");
        System.out.println("2. Iniciar sesión");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");
    }

    public String pedirTexto(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
