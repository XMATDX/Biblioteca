/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.biblioteca.models;

/**
 *
 * @author Mateo Quintero
 */
public class Autor extends Persona {
    

     ////////////////////////////////////////////////////////////////////////////////////
     /// Atributos
     /// 
    private String editorial;
    private String profesion;
    

     ////////////////////////////////////////////////////////////////////////////////////
     /// Metodo Contructor
    public Autor(String nombre, String documentoIdentidad, String correoElectronico, String editorial, String profesion) {
        
        super(nombre, documentoIdentidad, correoElectronico); //llamar al constructor de la clase Persona
        this.editorial = editorial;
        this.profesion = profesion;
    }
    
}
