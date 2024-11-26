package org.ies.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Biblioteca {
    private String nombre;
    private Book[] book;

    public Biblioteca(String nombre, Book[] book) {
        this.nombre = nombre;
        this.book = book;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Book[] getBook() {
        return book;
    }

    public void setBook(Book[] book) {
        this.book = book;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Biblioteca that = (Biblioteca) o;
        return Objects.equals(nombre, that.nombre) && Objects.deepEquals(book, that.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, Arrays.hashCode(book));
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", book=" + Arrays.toString(book) +
                '}';
    }
}
