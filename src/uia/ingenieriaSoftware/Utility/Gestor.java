package uia.ingenieriaSoftware.Utility;

import uia.ingenieriaSoftware.Modelo.CrearForma;

import java.util.*;

public class Gestor {
    public static void main() {

        Scanner scanner = new Scanner(System.in);
        int opcion2;
        do {
            System.out.println("Digite la opcion deseada");
            System.out.println("1. Nueva Solicitud Material.");
            System.out.println("2. Solicitudes Material.");
            System.out.println("3. Salir");
            opcion2 = scanner.nextInt();
            switch (opcion2) {
                case 1:
                    CrearForma.crearForma();
                    break;
                case 2:
                    System.out.println("Solicitudes.");
                    break;
                case 3:
                    System.out.println("-----------Hasta la vista baby!----------");
                    break;
                default:
                    System.out.println("-----------Opcion invalida, intente de nuevo!----------");
            }
        }while(opcion2 != 4);
    }
}
