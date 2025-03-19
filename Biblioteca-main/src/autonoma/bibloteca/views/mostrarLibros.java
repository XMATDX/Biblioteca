/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package autonoma.bibloteca.views;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import autonoma.bibloteca.models.Autor;
import autonoma.bibloteca.models.Biblioteca;
import autonoma.bibloteca.models.Libro;

/**
 * Clase que representa una ventana de dialogo para mostrar, eliminar y actualizar libros en la biblioteca.
 * 
 * @author SOFIA RUDAS
 */
public class mostrarLibros extends javax.swing.JDialog {

    private Biblioteca biblioteca; // Instancia de la biblioteca
    private ventanaPrincipal VentanaPrincipal; // Referencia a la ventana principal
    private ArrayList<Libro> libros; // Lista de libros
    
    
    
    
        /**
     * Constructor de la clase mostrarLibros.
     * 
     * @param parent Ventana padre (puede ser null).
     * @param modal Indica si el dialogo es modal (bloquea la ventana principal).
     * @param biblioteca Instancia de la biblioteca.
     * @param ventana Referencia a la ventana principal.
     */
    public mostrarLibros(java.awt.Frame parent, boolean modal, Biblioteca biblioteca, ventanaPrincipal ventana) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        
        // Intentar cargar el icono de la ventana
        try{
            this.setIconImage(new ImageIcon(getClass().getResource("/proyecto/biblioteca/images/principal.png")).getImage());
            
        }catch(Exception e){
            // Manejar excepcion si no se puede cargar el icono 
        }
        this.biblioteca= biblioteca;
        this.VentanaPrincipal=ventana;
        
        cargarLibrosEnTabla(); // Cargar los libros en la tabla al iniciar la ventan
    }

    /**
     * Metodo para inicializar los componentes de la interfaz grafica.
     * Este metodo es generado automaticamente por el IDE y no debe modificarse manualmente.
     */
    @SuppressWarnings("unchecked")
    // Codigo generado automaticamente por el IDE
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Titulo = new javax.swing.JPanel();
        botonEliminar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(223, 133, 114));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mostrar libros");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(246, 246, 246))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        Titulo.setBackground(new java.awt.Color(255, 255, 255));

        botonEliminar.setBackground(new java.awt.Color(204, 204, 204));
        botonEliminar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(0, 0, 0));
        botonEliminar.setText("Eliminar");
        botonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminarMouseClicked(evt);
            }
        });
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        volver.setBackground(new java.awt.Color(204, 204, 204));
        volver.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        volver.setForeground(new java.awt.Color(0, 0, 0));
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        botonActualizar.setBackground(new java.awt.Color(204, 204, 204));
        botonActualizar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        botonActualizar.setForeground(new java.awt.Color(0, 0, 0));
        botonActualizar.setText("Actualizar");
        botonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonActualizarMouseClicked(evt);
            }
        });
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        Tabla.setBackground(new java.awt.Color(255, 255, 255));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Titulo", "ID", "Autor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TituloLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonActualizar))
                .addGap(64, 64, 64))
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TituloLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(botonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TituloLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>
    
    
    private void botonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseClicked

    }//GEN-LAST:event_botonEliminarMouseClicked

    
    /**
     * Metodo que se ejecuta cuando se hace clic en el boton "Eliminar".
     * Elimina el libro seleccionado de la biblioteca.
     */
    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        int selectedRow = Tabla.getSelectedRow(); // Obtener la fila seleccionada en la tabla
        if (selectedRow >= 0) {
            // Obtener el ID y el titulo del libro seleccionado
            long id = (long) Tabla.getValueAt(selectedRow, 1);
            String titulo = (String) Tabla.getValueAt(selectedRow, 0);
            
            // Show confirmation dialog
            int confirmacion = JOptionPane.showConfirmDialog(
                this,
                "¿Desea eliminar el libro '" + titulo + "' de manera permanente?",
                "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
            );
            
            if (confirmacion == JOptionPane.YES_OPTION) {
                if (biblioteca.eliminarLibro(id)) {
                    // Refresh the table
                    cargarLibrosEnTabla();
                    JOptionPane.showMessageDialog(
                        this,
                        "Libro eliminado exitosamente",
                        "Éxito",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                } else {
                    JOptionPane.showMessageDialog(
                        this,
                        "No se pudo eliminar el libro",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        } else {
            JOptionPane.showMessageDialog(
                this,
                "Por favor, seleccione el libro que desea eliminar",
                "Selección requerida",
                JOptionPane.WARNING_MESSAGE
            );
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    
    
     /* Metodo que se ejecuta cuando se hace clic en el boton "Volver".
     * Cierra la ventana actual.
     */
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        this.dispose();
    }

    private void botonActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonActualizarMouseClicked

    
    /**
     * Metodo que se ejecuta cuando se hace clic en el boton "Actualizar".
     * Abre una ventana para actualizar el libro seleccionado.
     */
    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        int selectedRow = Tabla.getSelectedRow();// Obtener la fila seleccionada en la tabla
if (selectedRow >= 0) {
    // Obtener el título del libro seleccionado en la tabla
    String titulo = (String) Tabla.getValueAt(selectedRow, 0);

    // Buscar el libro en la biblioteca
    Libro libroSeleccionado = biblioteca.buscarLibro(titulo);

    if (libroSeleccionado != null) {
        // Abrir la ventana para actualizar el libro
        actualizarLibros ventanaActualizar = new actualizarLibros(this.VentanaPrincipal, true, biblioteca, this, libroSeleccionado);
        ventanaActualizar.setVisible(true);
    } else {
        JOptionPane.showMessageDialog(
            this,
            "No se encontró el libro seleccionado.",
            "Error",
            JOptionPane.ERROR_MESSAGE
        );
    }
} else {
    JOptionPane.showMessageDialog(
        this,
        "Por favor, seleccione el libro que desea actualizar",
        "Selección requerida",
        JOptionPane.WARNING_MESSAGE
    );
}


        
    }//GEN-LAST:event_botonActualizarActionPerformed

    void cargarLibrosEnTabla() {

        DefaultTableModel model = (DefaultTableModel) Tabla.getModel();

        model.setRowCount(0);

        for (int i = 0; i < biblioteca.cantLibros; i++) {
            Libro libro = biblioteca.libros[i];
            if (libro != null) {
                Autor autor = libro.obtenerAutor();
                String nombreAutor = autor.getNombre(); // Changed to getNombre() to match Persona class
                
                model.addRow(new Object[]{
                    libro.obtenerTitulo(),
                    libro.obtenerId(),
                    nombreAutor
                });
            }
        }
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JPanel Titulo;
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
