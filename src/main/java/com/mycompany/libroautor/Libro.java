/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libroautor;

/**
 *
 * @author jorge
 */
public class Libro {

    private String tituloLibro;
    private Autor autorLibro;

    public Libro(String titulo, Autor autor) {
        tituloLibro = titulo;
        autorLibro = autor;
    }

    public Libro() {
    
    }
    
    public String getTitulo() {
        return tituloLibro;
    }

    public void setTitulo(String titulo) {
        tituloLibro = titulo;
    }

    public Autor getAutor() {
        return autorLibro;
    }

    public void setAutor(Autor autor) {
        this.autorLibro = autor;
    }
    
}
