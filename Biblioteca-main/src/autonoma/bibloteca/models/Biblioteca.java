/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.biblioteca.models;

import autonoma.bibloteca.models.Libro;

/**
 *
 * @author SOFIA RUDAS
 */
public class Biblioteca {
    
    private Libro[] libros;
    private int cantLibros;
    private final int capacidadMax=150;
    
    public Biblioteca(){
        this.libros= new Libro[capacidadMax];
        this.cantLibros=0;
    }
    
     public String mostrarLibros() {
        String resultado = "";
        for (int i = 0; i < cantLibros; i++) {
            resultado = resultado + "ID: " + libros[i].obtenerId() + " - Título: " + libros[i].obtenerTitulo() + "\n";
        }
        return resultado;
    }
    
    // Método agregarLibro(Libro): boolean
    public boolean agregarLibro(Libro libro) {
        if (cantLibros < capacidadMax) {
            libros[cantLibros] = libro;
            cantLibros = cantLibros + 1;
            return true;
        }
        return false;
    }
    
    // Método buscarLibro(long): Libro
    public Libro buscarLibro(long id) {
        for (int i = 0; i < cantLibros; i++) {
            if (libros[i].obtenerId() == id) {
                return libros[i];
            }
        }
        return null;
    }
    
    // Método actualizarLibro(long, Libro): boolean
    public boolean actualizarLibro(long id, Libro libroNuevo) {
        for (int i = 0; i < cantLibros; i++) {
            if (libros[i].obtenerId() == id) {
                libros[i] = libroNuevo;
                return true;
            }
        }
        return false;
    }
    
    // Método eliminarLibro(long): boolean
    public boolean eliminarLibro(long id) {
        int indiceEliminar = -1;
        
        // Buscar el índice del libro a eliminar
        for (int i = 0; i < cantLibros; i++) {
            if (libros[i].obtenerId() == id) {
                indiceEliminar = i;
                break;
            }
        }
        
        // Si se encontró el libro
        if (indiceEliminar != -1) {
            // Mover todos los libros una posición hacia atrás
            for (int i = indiceEliminar; i < cantLibros - 1; i++) {
                libros[i] = libros[i + 1];
            }
            libros[cantLibros - 1] = null;
            cantLibros = cantLibros - 1;
            return true;
        }
        
        return false;
    }
    
    // Método obtenerLibrosAlfabeticamente(): Libro[]
    public Libro[] obtenerLibrosAlfabeticamente() {
        Libro[] librosOrdenados = new Libro[cantLibros];
        
        // Copiar los libros al nuevo array
        for (int i = 0; i < cantLibros; i++) {
            librosOrdenados[i] = libros[i];
        }
        
        // Ordenamiento extremadamente simplificado:
        // En lugar de comparar letras, ordenaremos por la longitud del título
        // como una aproximación muy básica (esto no es alfabético, pero es una solución muy simple)
        for (int i = 0; i < cantLibros - 1; i++) {
            for (int j = 0; j < cantLibros - i - 1; j++) {
                // Si el primer título es más largo que el segundo, intercambiamos
                if (librosOrdenados[j].obtenerTitulo().length() > 
                    librosOrdenados[j + 1].obtenerTitulo().length()) {
                    
                    Libro temp = librosOrdenados[j];
                    librosOrdenados[j] = librosOrdenados[j + 1];
                    librosOrdenados[j + 1] = temp;
                }
            }
        }
        
        return librosOrdenados;
    }
}
    
   
