package org.ies.library.componentes;

import org.ies.library.model.Autor;

import java.util.Scanner;

public class AutorReader {
    private final Scanner scanner;

    public AutorReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Autor read() {
        System.out.println("Introduce los datos del autor");
        System.out.println("Introduce el NIF del autor");
        String nif = scanner.nextLine();
        System.out.println("Introduce el Nombre del autor");
        String nombre = scanner.nextLine();
        System.out.println("Introduce el apellido del autor");
        String apellido = scanner.nextLine();

        return new Autor (
                nif,
                nombre,
                apellido
        );
    }
}
