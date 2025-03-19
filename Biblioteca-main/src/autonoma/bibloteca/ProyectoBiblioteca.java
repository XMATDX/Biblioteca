/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.biblioteca;

import proyecto.biblioteca.models.Biblioteca;
import proyecto.biblioteca.models.views.ventanaPrincipal;

/**
 *
 * @author SOFIA RUDAS
 */
public class ProyectoBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biblioteca bilioteca= new Biblioteca();
        ventanaPrincipal ventana = new ventanaPrincipal();
        ventana.setVisible(true);
        
    }
}
    
