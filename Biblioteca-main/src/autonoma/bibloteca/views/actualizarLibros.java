/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package autonoma.bibloteca.views;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import autonoma.bibloteca.models.Autor;
import autonoma.bibloteca.models.Biblioteca;
import autonoma.bibloteca.models.Libro;

    /**
     * Clase que representa una ventana de diálogo para actualizar la información de un libro.
     * 
     * @author SOFIA RUDAS
     */
public class actualizarLibros extends javax.swing.JDialog {

    private final Biblioteca biblioteca; // Instancia de la biblioteca
    private Libro libro; // Libro que se va a actualizar
    private mostrarLibros VentanaLibros; // Referencia a la ventana principal de libros
    private final mostrarLibros mostrarLibros;// Referencia a la ventana principal de libros
    

    /**
     * Constructor de la clase actualizarLibros.
     * 
     * @param parent Ventana padre (puede ser null).
     * @param modal Indica si el diálogo es modal (bloquea la ventana principal).
     * @param biblioteca Instancia de la biblioteca.
     * @param VentanaLibros Referencia a la ventana principal de libros.
     * @param libro Libro que se va a actualizar.
     */
    public actualizarLibros(java.awt.Frame parent, boolean modal, Biblioteca biblioteca, mostrarLibros VentanaLibros, Libro libro) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        
    // Intentar cargar el ícono de la ventana
        try{
            this.setIconImage(new ImageIcon(getClass().getResource("/proyecto/biblioteca/images/principal.png")).getImage());
            
        }catch(Exception e){
            // Manejar excepción si no se puede cargar el ícono
        }
        this.biblioteca= biblioteca;
        this.mostrarLibros = VentanaLibros;
        this.libro= libro;
        
        
        // Mostrar los datos actuales del libro en los campos de texto
        this.txtautorLibro.setText(this.libro.obtenerTitulo());
        this.txtautorLibro.setText(this.libro.obtenerAutor().getNombre());

    }

    /**
     * Método para inicializar los componentes de la interfaz gráfica.
     * Este método es generado automáticamente por el IDE y no debe modificarse manualmente.
     */
    @SuppressWarnings("unchecked")
        
    // Código generado automáticamente por el IDE
    private void initComponents() {

        Titulo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtautorLibro = new javax.swing.JTextField();
        Autor = new javax.swing.JLabel();
        txttituloLibro = new javax.swing.JTextField();
        botonactualizar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Titulo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Título:");

        txtautorLibro.setBackground(new java.awt.Color(204, 204, 204));

        Autor.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Autor.setForeground(new java.awt.Color(0, 0, 0));
        Autor.setText("Autor:");

        txttituloLibro.setBackground(new java.awt.Color(204, 204, 204));
        txttituloLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttituloLibroActionPerformed(evt);
            }
        });

        botonactualizar.setBackground(new java.awt.Color(204, 204, 204));
        botonactualizar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        botonactualizar.setForeground(new java.awt.Color(0, 0, 0));
        botonactualizar.setText("Actualizar Libro");
        botonactualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonactualizarMouseClicked(evt);
            }
        });
        botonactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonactualizarActionPerformed(evt);
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

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TituloLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(Autor))
                        .addGap(38, 38, 38)
                        .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtautorLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TituloLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonactualizar)
                        .addGap(78, 78, 78)
                        .addComponent(volver)))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txttituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Autor)
                    .addComponent(txtautorLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jPanel1.setBackground(new java.awt.Color(223, 133, 114));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Actualizar Libro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(233, 233, 233))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END

    
    
    private void txttituloLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttituloLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttituloLibroActionPerformed

    
     /**
     * Método que se ejecuta cuando se hace clic en el botón "Actualizar Libro".
     * Llama al método actualizarLibro() para realizar la actualización.
     */
    private void botonactualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonactualizarMouseClicked
        actualizarLibro();
    }

    
    /**
     * Método que se ejecuta cuando se hace clic en el botón "Actualizar Libro".
     * Llama al método actualizarLibro() para realizar la actualización.
     */
    private void botonactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonactualizarActionPerformed
        actualizarLibro();
    }

    
     /**
     * Método que se ejecuta cuando se hace clic en el botón "Volver".
     * Cierra la ventana actual.
     */
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }
    
    
     /**
     * Método para actualizar la información del libro.
     * Valida los campos de entrada y actualiza el libro en la biblioteca.
     */
    private void actualizarLibro() {
        String nuevoTitulo = this.txttituloLibro.getText().trim();
        String nuevoAutor = this.txtautorLibro.getText().trim();
        
        // Validación de campos
        if (nuevoTitulo.isEmpty() || nuevoAutor.isEmpty()) {
            JOptionPane.showMessageDialog(
                this,
                "Por favor, complete todos los campos",
                "Error de validación",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }
        
        try {
            // Actualizar datos del libro
            this.libro.setTitulo(nuevoTitulo);
            Autor autorActual = this.libro.obtenerAutor();
            autorActual.setNombre(nuevoAutor);
            
            // Actualizar en la biblioteca
            if (this.biblioteca.actualizarLibro(this.libro.obtenerId(), this.libro)) {
                JOptionPane.showMessageDialog(
                    this,
                    "Libro actualizado correctamente",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE
                );
                
                // Actualizar la tabla en la ventana principal
                if (this.mostrarLibros != null) {
                    this.mostrarLibros.cargarLibrosEnTabla();
                }
                
                this.dispose(); // Cerrar la ventana después de la actualización
            } else {
                JOptionPane.showMessageDialog(
                    this,
                    "No se pudo actualizar el libro",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                this,
                "Error al actualizar el libro: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Autor;
    private javax.swing.JPanel Titulo;
    private javax.swing.JButton botonactualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtautorLibro;
    private javax.swing.JTextField txttituloLibro;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
