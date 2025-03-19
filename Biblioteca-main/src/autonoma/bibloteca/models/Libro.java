package autonoma.bibloteca.models;


import autonoma.bibloteca.models.Autor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author SOFIA RUDAS
 */
public class Libro {
    private long id;
    private String titulo;
    private Autor autor;  

    public Libro(long id, String titulo, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public long obtenerId() {
        return this.id;
    }

    public String obtenerTitulo() {
        return this.titulo;
    }
    
}
