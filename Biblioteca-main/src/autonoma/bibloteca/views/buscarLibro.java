/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package autonoma.bibloteca.views;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import autonoma.bibloteca.models.Biblioteca;
import autonoma.bibloteca.models.Libro;

/**
 * Clase que representa una ventana de dialogo para buscar un libro en la biblioteca.
 * 
 * @author SOFIA RUDAS
 */
public class buscarLibro extends javax.swing.JDialog {

    private Biblioteca biblioteca; // Instancia de la biblioteca
    private ventanaPrincipal VentanaPrincipal; // Referencia a la ventana principal
    
    
     /**
     * Constructor de la clase buscarLibro.
     * 
     * @param parent Ventana padre (puede ser null).
     * @param modal Indica si el dialogo es modal (bloquea la ventana principal).
     * @param biblioteca Instancia de la biblioteca.
     * @param ventana Referencia a la ventana principal.
     */
    public buscarLibro(java.awt.Frame parent, boolean modal,Biblioteca biblioteca, ventanaPrincipal ventana) {
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
    }

    /**
     * Metodo para inicializar los componentes de la interfaz grafica.
     * Este metodo es generado automaticamente por el IDE y no debe modificarse manualmente.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Titulo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txttituloLibro = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(223, 133, 114));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Buscar libro");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(266, 266, 266))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        Titulo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Título:");

        txttituloLibro.setBackground(new java.awt.Color(204, 204, 204));
        txttituloLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttituloLibroActionPerformed(evt);
            }
        });

        botonBuscar.setBackground(new java.awt.Color(204, 204, 204));
        botonBuscar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        botonBuscar.setForeground(new java.awt.Color(0, 0, 0));
        botonBuscar.setText("Buscar");
        botonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBuscarMouseClicked(evt);
            }
        });
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
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
                        .addGap(222, 222, 222)
                        .addComponent(botonBuscar)
                        .addGap(111, 111, 111)
                        .addComponent(volver))
                    .addGroup(TituloLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txttituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txttituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
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
    }// </editor-fold> // Codigo generado automaticamente por el IDE


    private void txttituloLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttituloLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttituloLibroActionPerformed

    private void botonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseClicked
        
    }//GEN-LAST:event_botonBuscarMouseClicked

    
    /**
     * Metodo que se ejecuta cuando se hace clic en el boton "Buscar".
     * Busca un libro en la biblioteca por su titulo y muestra el resultado.
     */
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        String titulo = this.txttituloLibro.getText();
        Libro libro = this.biblioteca.buscarLibro(titulo);
        
        if(libro== null){
            JOptionPane.showMessageDialog(this, "el libro: "+ titulo+" no se encuentra registrado");
        }else{
            JOptionPane.showMessageDialog(this, "el libro ha sido encontrado: \n\n"+
                                                "Libro: "+titulo+ " Id: " +libro.obtenerId()+"\n");
        }
    }
    
     /**
     * Metodo que se ejecuta cuando se hace clic en el boton "Volver".
     * Cierra la ventana actual.
     */
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        this.dispose();
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Titulo;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txttituloLibro;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
