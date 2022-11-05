package uia.ingenieriaSoftware;

import uia.ingenieriaSoftware.Utility.Gestor;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Digite la opcion deseada");
            System.out.println("1. Solicitud de Material.");
            System.out.println("2. Bajas de Inventario.");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                     Gestor.main();
                    break;
                case 2:
                    System.out.println("Bajas de Inventario.");
                    break;
                case 3:
                    System.out.println("-----------Hasta la vista baby!----------");
                    break;
                default:
                    System.out.println("-----------Opcion invalida, intente de nuevo!----------");
            }
        }while(opcion != 4);
    }
}
