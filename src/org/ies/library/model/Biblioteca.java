package org.ies.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Biblioteca {
    private String nombre;
    private Book[] books;

    public Biblioteca(String nombre, Book[] books) {
        this.nombre = nombre;
        this.books = books;
    }

    public boolean hasBook(String isbn){
        for (Book book1: books){
            if (book1.getIsbn().equals(isbn)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasAuthor(String nif){
        for (Book book1: books){
            for (Autor autor: book1.getAutores()){
                if (autor.getNif().equals(nif)){
                    return true;
                }
            }
        }
        return false;
    }

    public int countBook(String nif){
        int count = 0;
        for (Book book1: books){
            for (Autor autor: book1.getAutores()){
                if (autor.getNif().equals(nif)){
                    count+=1;
                }
            }
        }
        return count;
    }

    public int yearBooks( int year){
        int count = 0;
        for (Book book1: books){
            if (book1.getYear() ==  year){
                count+=1;
            }
        }
        return count;
    }

    public String findBook(String isbn){
        for (Book book: books){
            if (book.getIsbn().equals(isbn)){
                return book.getTitulo();
            }
        }
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Biblioteca that = (Biblioteca) o;
        return Objects.equals(nombre, that.nombre) && Objects.deepEquals(books, that.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, Arrays.hashCode(books));
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", book=" + Arrays.toString(books) +
                '}';
    }
}
