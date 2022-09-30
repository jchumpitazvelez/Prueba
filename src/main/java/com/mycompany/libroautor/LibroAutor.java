/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.libroautor;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class LibroAutor {

    public static void main(String[] args) {
        String nombreAutor, apellidoAutor;
        String tituloLibro;
        Autor autor = new Autor ();
        Libro libro = new Libro ();
        Scanner sc = new Scanner(System.in);
        
        try{
             System.out.println("Ingrese Nombre del Autor:");
             nombreAutor = sc.next();//Se captura el valor ingresado por consola.
             System.out.println("Ingrese Apellido del Autor:");
             apellidoAutor = sc.next();//Se captura el valor ingresado por consola.
             autor.setNombre(nombreAutor);
             autor.setApellido(apellidoAutor);
             System.out.println("Ingrese Titulo del Libro:");
             tituloLibro = sc.next();//Se captura el valor ingresado por consola.
             libro.setTitulo(tituloLibro);
             libro.setAutor(autor);
             
             System.out.println ("El Libro: "+libro.getTitulo()+" su Autor es: " + (libro.getAutor()).toString());
             
        }catch(Exception e){
            System.out.println("Datos ingresados de manera no correcta");
        }           
    }
}