package autonoma.bibloteca.models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import autonoma.bibloteca.models.Persona;

/**
 *
 * @author SOFIA RUDAS
 */
public class Autor extends Persona {
    
    private String editorial;
    private String profesion;
    
    public Autor(String nombre, String documentoIdentidad, String correoElectronico, String editorial, String profesion) {
        
        super(nombre, documentoIdentidad, correoElectronico); //llamar al constructor de la clase Persona
        this.editorial = editorial;
        this.profesion = profesion;
    }
    
}
