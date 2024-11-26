package org.ies.library.componentes;

import org.ies.library.model.Biblioteca;
import org.ies.library.model.Book;

import java.util.Scanner;

public class BibliotecaReader {
    private final Scanner scanner;
    private final BookReader reader;

    public BibliotecaReader(Scanner scanner, BookReader reader) {
        this.scanner = scanner;
        this.reader = reader;
    }

    public Biblioteca reader() {
        System.out.println("Introduzca los datos");
        System.out.println("Nombre");
        String nombre = scanner.nextLine();
        System.out.println("¿Cuantos libros tiene?");
        int size = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce los libros");
        Book[] books = new Book[size];
        for (int i = 0; i < size; i++) {
            Book book = reader.read();
            books[i] = book;
        }

        return new Biblioteca(
                nombre,
                books
        );
    }
}
