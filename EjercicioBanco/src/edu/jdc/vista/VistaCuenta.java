package edu.jdc.vista;

import edu.jdc.modelo.Banco;
import java.util.Scanner;

public class VistaCuenta {

    private Scanner leer;

    public VistaCuenta() {
        this.leer = new Scanner(System.in);
    }

    public int mostarMenuYObciones() {
        System.out.println("\n Gestion de cuentas Bancarias");
        System.out.println("\n selecione la opcion que nececita");
        System.out.println("\n 1 Añadir dinero");
        System.out.println("\n 2 Realizar Retiros");
        System.out.println("\n 3 salir ");
        int contraseña = leer.nextInt();
        leer.nextLine();
        return 0;
    }

    public Banco obtenerDatosDeCuenta() {
        System.out.println("Ingrese el nombre del usuario");
        String usuario = leer.nextLine();
        System.out.println("Ingrese numero de cedula");
        String cedula = leer.nextLine();
        System.out.println("Ingrese numero de cuenta");
        String cuenta = leer.nextLine();
        leer.nextLine();
        return new Banco(usuario,cedula,cuenta);
    }

    public void mostarCuentaDeBanco(Banco Banco) {
        if (Banco == null) {
            System.out.println("no hay ninguna cuenta guardada");
        } else {
            System.out.println("\n informacion de la Cuenta");
            System.out.println("usuario:" + Banco.getUsuario());
            System.out.println("cedula:" + Banco.getCedula());
            System.out.println("cuenta:" + Banco.getCuenta());

        }
    }
    public void mostarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
