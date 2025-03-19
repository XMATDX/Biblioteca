/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.bibloteca.models;

/**
 *
 * @author Mateo Quintero
 */
public class Biblioteca {
    

    ///////////////////////////////////////////////////////////////////////////
    /// Atributos  
    public Libro[] libros;
    public int cantLibros;
    private final int capacidadMax=150;
    

    ///////////////////////////////////////////////////////////////////////////
    /// Metodo Constructor
    public Biblioteca(){
        this.libros= new Libro[capacidadMax];
        this.cantLibros=0;
    }
    

    ///////////////////////////////////////////////////////////////////////////
    /// Metodos 
    /// 
 
    /**
    * Muestra una lista de todos los libros almacenados en el arreglo.
    * 
    * @return Una cadena de texto que contiene el ID y el titulo de cada libro,
    *         separados por un salto de linea.
    */
     public String mostrarLibros() {
        String resultado = "";
        for (int i = 0; i < cantLibros; i++) {
            resultado = resultado + "ID: " + libros[i].obtenerId() + " - Título: " + libros[i].obtenerTitulo() + "\n";
        }
        return resultado;
    }
    


    /**
     * Agrega un nuevo libro al arreglo de libros, siempre y cuando no se haya alcanzado
     * la capacidad maxima.
     * 
     * @param libro El libro que se desea agregar.
     * @return true si el libro fue agregado exitosamente, false si no se pudo agregar
     *         debido a que se alcanzo la capacidad maxima.
     */
    public boolean agregarLibro(Libro libro) {
    if (cantLibros < capacidadMax) {
        libros[cantLibros] = libro;
        cantLibros++;
        System.out.println("Libro agregado: " + libro.obtenerTitulo());  
        return true;
    }
    System.out.println("No se pudo agregar el libro: " + libro.obtenerTitulo()); 

    return false;
}


    /**
     * Busca un libro en el arreglo por su titulo.
     * 
     * @param titulo El titulo del libro que se desea buscar.
     * @return El libro encontrado, o null si no se encontro ningun libro con el titulo especificado.
     */
    public Libro buscarLibro(String titulo) {
    for (int i = 0; i < cantLibros; i++) {
        if (libros[i].obtenerTitulo().trim().equalsIgnoreCase(titulo.trim())) {
            return libros[i];
        }
    }
    return null;
    }
    
    /**
     * Actualiza la información de un libro existente en el arreglo, identificado por su ID.
     * 
     * @param id El ID del libro que se desea actualizar.
     * @param libroNuevo El objeto Libro con la nueva informacion.
     * @return true si el libro fue actualizado exitosamente, false si no se encontro ningun
     *         libro con el ID especificado.
     */
    public boolean actualizarLibro(long id, Libro libroNuevo) {
        for (int i = 0; i < cantLibros; i++) {
            if (libros[i].obtenerId() == id) {
                libros[i] = libroNuevo;
                return true;
            }
        }
        return false;
    }


    /**
     * Elimina un libro del arreglo, identificado por su ID.
     * 
     * @param id El ID del libro que se desea eliminar.
     * @return true si el libro fue eliminado exitosamente, false si no se encontro ningun
     *         libro con el ID especificado.
     */

    public boolean eliminarLibro(long id) {
        int indiceEliminar = -1;

        for (int i = 0; i < cantLibros; i++) {
            if (libros[i].obtenerId() == id) {
                indiceEliminar = i;
                break;
            }
        }

        if (indiceEliminar != -1) {

            for (int i = indiceEliminar; i < cantLibros - 1; i++) {
                libros[i] = libros[i + 1];
            }
            libros[cantLibros - 1] = null;
            cantLibros = cantLibros - 1;
            return true;
        }
        
        return false;
    }


    /**
     * Ordena los libros alfabeticamente por su titulo y devuelve un nuevo arreglo con
     * los libros ordenados.
     * 
     * @return Un arreglo de libros ordenados alfabticamente por titulo.
     */
    public Libro[] obtenerLibrosAlfabeticamente() {
        Libro[] librosOrdenados = new Libro[cantLibros];
        
        for (int i = 0; i < cantLibros; i++) {
            librosOrdenados[i] = libros[i];
        }
        
        for (int i = 0; i < cantLibros - 1; i++) {
            for (int j = 0; j < cantLibros - i - 1; j++) {

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
    
   
