package main;

import controlador.Controlador;
import vista.InterfazConsola;

public class Main {
    public static void main(String[] args) {
        InterfazConsola vista = new InterfazConsola();
        Controlador control = new Controlador(vista);
        control.iniciar();
    }
}
