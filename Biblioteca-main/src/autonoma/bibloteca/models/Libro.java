/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.biblioteca.models;

/**
 *
 * @author Mateo Quintero
 */
public class Libro {


    ///////////////////////////////////////////////////////////////////////////
    /// Atributos  
    /// 
    private long id;
    private String titulo;
    private Autor autor;  
    private static int contLibros=1;


    /////////////////////////////////////////////////////////
    /// Metodo Constructor
    public Libro(String titulo, String nombreAutor) {
        this.id = Libro.contLibros;
        this.titulo = titulo; 
        this.autor = new Autor(nombreAutor, "", "", "", ""); 
        contLibros++;
    }


    ///////////////////////////////////////////////////////////////////////////
    /// Metodos de acceso
    public long obtenerId() {
        return this.id;
    }

    public String obtenerTitulo() {
        return this.titulo;
    }
    
    public Autor obtenerAutor() {
        return this.autor;
    }
    
    public void setTitulo(String titulo) {
    this.titulo = titulo;
    }

    
}

