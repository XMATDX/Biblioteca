/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.biblioteca.models;

/**
 *
 * @author Mateo quintero
 */


public abstract class Persona {

     ////////////////////////////////////////////////////////////////////////////////////
     /// Atributos
    private String nombre;
    private String  documentacionIdentidad;
    private String  correoElectronico;


     ////////////////////////////////////////////////////////////////////////////////////
     /// Metodo Contructor
    public Persona(String nombre, String documentacionIdentidad, String correoElectronico) {
        this.nombre = nombre;
        this.documentacionIdentidad = documentacionIdentidad;
        this.correoElectronico = correoElectronico;
    }


    ///////////////////////////////////////////////////////////////////////////
    /// Metodos de acceso
    public String getNombre() {
        return nombre;
    }

    public String getDocumentacionIdentidad() {
        return documentacionIdentidad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumentacionIdentidad(String documentacionIdentidad) {
        this.documentacionIdentidad = documentacionIdentidad;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
}
