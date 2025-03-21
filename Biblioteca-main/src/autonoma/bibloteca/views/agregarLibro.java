/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package autonoma.bibloteca.views;

import javax.swing.ImageIcon;
import autonoma.bibloteca.models.Biblioteca;
import javax.swing.JOptionPane;
import autonoma.bibloteca.models.Libro;

/**
 * Clase que representa una ventana de dialogo para agregar un nuevo libro.
 * 
 * @author SOFIA RUDAS
 */
public class agregarLibro extends javax.swing.JDialog {
    private Biblioteca biblioteca;   // Instancia de la biblioteca
    private ventanaPrincipal VentanaPrincipal;  // Instancia de la biblioteca
    

    /**
     * Constructor de la clase agregarLibro.
     * 
     * @param parent Ventana padre (puede ser null).
     * @param modal Indica si el dialogo es modal (bloquea la ventana principal).
     * @param biblioteca Instancia de la biblioteca.
     * @param ventana Referencia a la ventana principal.
     */
    public agregarLibro(java.awt.Frame parent, boolean modal, Biblioteca biblioteca, ventanaPrincipal ventana) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);// Centrar la ventana en la pantalla
        
        
        // Intentar cargar el icono de la ventana
        try{
            this.setIconImage(new ImageIcon(getClass().getResource("/proyecto/biblioteca/images/principal.png")).getImage());
            
        }catch(Exception e){
            
            // Manejar excepcion si no se puede cargar el icono
            
        }
        this.biblioteca= biblioteca;
        this.VentanaPrincipal=ventana;
    }

    /**
     * Metodo para inicializar los componentes de la interfaz grafica.
     * Este metodo es generado automaticamente por el IDE y no debe modificarse manualmente.
     */

    @SuppressWarnings("unchecked")
    
    // Codigo generado automaticamente por el IDE
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtautorLibro = new javax.swing.JTextField();
        Autor = new javax.swing.JLabel();
        txttituloLibro = new javax.swing.JTextField();
        botonageragrLibro = new javax.swing.JButton();
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

        botonageragrLibro.setBackground(new java.awt.Color(204, 204, 204));
        botonageragrLibro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        botonageragrLibro.setForeground(new java.awt.Color(0, 0, 0));
        botonageragrLibro.setText("Agregar Libro");
        botonageragrLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonageragrLibroMouseClicked(evt);
            }
        });
        botonageragrLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonageragrLibroActionPerformed(evt);
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
                        .addGap(124, 124, 124)
                        .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Autor)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttituloLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txtautorLibro)))
                    .addGroup(TituloLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(botonageragrLibro)
                        .addGap(85, 85, 85)
                        .addComponent(volver)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(botonageragrLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jPanel1.setBackground(new java.awt.Color(223, 133, 114));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar Libro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jLabel1)
                .addContainerGap(241, Short.MAX_VALUE))
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
    }// </editor-fold>

    

    private void botonageragrLibroActionPerformed(java.awt.event.ActionEvent evt) {  
    }

    
    /**
     * Metodo que se ejecuta cuando se hace clic en el boton "Volver".
     * Cierra la ventana actual.
     */
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void txttituloLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttituloLibroActionPerformed
        // TODO add your handling code here:
    }

    
    /**
     * Metodo que se ejecuta cuando se hace clic en el boton "Agregar Libro".
     * Obtiene los valores de los campos de texto y agrega un nuevo libro a la biblioteca.
     */
    private void botonageragrLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonageragrLibroMouseClicked
        String titulo = this.txttituloLibro.getText();
        String Autor = this.txtautorLibro.getText();
        
        Libro libro = new Libro(titulo,Autor);
        if(this.biblioteca.agregarLibro(libro)){
            JOptionPane.showMessageDialog(this, "Libro "+ titulo+ " ha sido agregado correctamente");
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error");
            this.dispose();
        }

    }//GEN-LAST:event_botonageragrLibroMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Autor;
    private javax.swing.JPanel Titulo;
    private javax.swing.JButton botonageragrLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtautorLibro;
    private javax.swing.JTextField txttituloLibro;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
