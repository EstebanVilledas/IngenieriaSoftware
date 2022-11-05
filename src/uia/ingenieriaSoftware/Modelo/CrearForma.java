package uia.ingenieriaSoftware.Modelo;

import uia.ingenieriaSoftware.Modelo.SoliciitudMaterial;

import java.util.*;

public class CrearForma {
    Scanner scanner = new Scanner(System.in);

    public static void crearForma() {
        Scanner scanner = new Scanner(System.in);
        SoliciitudMaterial soliciitudMaterial = new SoliciitudMaterial();
        System.out.println("Digite Nombre Item:");
        soliciitudMaterial.setNombre(scanner.nextLine());
        System.out.println("Digite cantidad: ");
        soliciitudMaterial.setCantidad(scanner.nextInt());
        System.out.println("Digite Id: ");
        scanner.next();
        soliciitudMaterial.setId(scanner.nextLine());
        System.out.println("Digite nombre del solicitante: ");
        soliciitudMaterial.setSolicitante(scanner.nextLine());
        System.out.println("Digite Id del solicitante: ");
        soliciitudMaterial.setIdSolicitante(scanner.nextLine());
        System.out.println("Digite status:");
        soliciitudMaterial.setEstatus(scanner.nextLine());

        System.out.println(soliciitudMaterial.toString());
    }

}
