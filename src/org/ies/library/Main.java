package org.ies.library;

import org.ies.library.componentes.AutorReader;
import org.ies.library.componentes.BibliotecaReader;
import org.ies.library.componentes.BookReader;
import org.ies.library.model.Biblioteca;
import org.ies.library.model.Book;

import javax.script.ScriptContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AutorReader autorReader = new AutorReader(scanner);
        BookReader bookReader = new BookReader(scanner, autorReader);
        BibliotecaReader bibliotecaReader = new BibliotecaReader(scanner, bookReader);
        Biblioteca library = bibliotecaReader.reader();
        System.out.println(library);
        library.getBooks();
    }
}
