/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package autonoma.bibloteca.views;

import autonoma.bibloteca.models.Biblioteca;
import javax.swing.ImageIcon;

/**
 * Clase que representa la ventana principal de la aplicacion de la biblioteca.
 * Desde esta ventana, el usuario puede acceder a las funcionalidades de agregar,
 * mostrar y buscar libros.
 * 
 * @author SOFIA RUDAS
 */
public class ventanaPrincipal extends javax.swing.JFrame {

    private Biblioteca biblioteca; // Instancia de la biblioteca

    /**
     * Constructor de la clase ventanaPrincipal.
     * Inicializa la ventana y la biblioteca.
     */
    public ventanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        this.biblioteca = new Biblioteca(); // Inicializar la biblioteca

        // Intentar cargar el icono de la ventana
        try {
            this.setIconImage(new ImageIcon(getClass().getResource("/proyecto/biblioteca/images/principal.png")).getImage());
        } catch (Exception e) {
            // Manejar excepcion si no se puede cargar el icono
        }
    }

    /**
     * Metodo para inicializar los componentes de la interfaz grafica.
     * Este metodo es generado automaticamente por el IDE y no debe modificarse manualmente.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        // Codigo generado automaticamente por el IDE
    }

    /**
     * Metodo que se ejecuta cuando se hace clic en el panel "Agregar Libro".
     * Abre una ventana para agregar un nuevo libro.
     */
    private void agregarLibroMouseClicked(java.awt.event.MouseEvent evt) {
        agregarLibro ventanaAgregar = new agregarLibro(this, true, this.biblioteca, this);
        ventanaAgregar.setVisible(true);
    }

    /**
     * Metodo que se ejecuta cuando se hace clic en la imagen de "Buscar Libro".
     * Abre una ventana para buscar un libro.
     */
    private void imagenBuscarMouseClicked(java.awt.event.MouseEvent evt) {
        buscarLibro ventanaBuscar = new buscarLibro(this, true, this.biblioteca, this);
        ventanaBuscar.setVisible(true);
    }

    /**
     * Metodo que se ejecuta cuando se hace clic en el panel "Buscar Libro".
     * Abre una ventana para buscar un libro.
     */
    private void buscarLibroMouseClicked(java.awt.event.MouseEvent evt) {
        buscarLibro ventanaBuscar = new buscarLibro(this, true, this.biblioteca, this);
        ventanaBuscar.setVisible(true);
    }

    /**
     * Metodo que se ejecuta cuando se hace clic en el panel "Mostrar Libros".
     * Abre una ventana para mostrar todos los libros en la biblioteca.
     */
    private void mostrarLibrosMouseClicked(java.awt.event.MouseEvent evt) {
        mostrarLibros ventanaMostrar = new mostrarLibros(this, true, this.biblioteca, this);
        ventanaMostrar.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agregarLibro;
    private javax.swing.JPanel buscarLibro;
    private javax.swing.JLabel imagenBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel mostrarLibros;
    private javax.swing.JPanel mostrarLibros1;
    // End of variables declaration//GEN-END:variables
}