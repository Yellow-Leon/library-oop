package org.ies.library.componentes;

import org.ies.library.model.Autor;
import org.ies.library.model.Book;

import java.util.Scanner;

public class BookReader {
    private final Scanner scanner;
    private final AutorReader reader;

    public BookReader(Scanner scanner, AutorReader reader) {
        this.scanner = scanner;
        this.reader = reader;
    }


    public Book read() {
        System.out.println("Introduce los datos del libro");
        System.out.println("ISBN");
        String isbn = scanner.nextLine();
        System.out.println("Titulo");
        String titulo = scanner.nextLine();
        System.out.println("Año");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Cuantos autores tiene");
        int size = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Autor");
        Autor[] autor = new Autor[size];
        for (int i = 0; i < size; i++) {
            autor[i] = reader.read();
        }

        return new Book(
                isbn,
                titulo,
                year,
                autor
        );
    }
}
