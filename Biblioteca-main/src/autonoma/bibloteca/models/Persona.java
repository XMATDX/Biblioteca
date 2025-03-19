/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.bibloteca.models;

/**
 *
 * @author Mateo Quintero Morales
 * since 2025-03-12
 * version 1.0.0
 */
public class Persona {
    
 //////////////////////////////////////////////////////////////////////
 ////////Atributso 
    
 private String nombre;
 private String  documentacionIdentidad;
  private String  correoElectronico;

    public Persona(String nombre, String documentacionIdentidad, String correoElectronico) {
        this.nombre = nombre;
        this.documentacionIdentidad = documentacionIdentidad;
        this.correoElectronico = correoElectronico;
    }

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
