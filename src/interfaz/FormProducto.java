/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

import controlador.ClsProducto;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import modelo.IdProducto;
import recursos.RecursosMetodos;


/**
 *
 * @author Parisan
 */

public class FormProducto extends javax.swing.JFrame {

    ClsProducto clsp;
    
    IdProducto idp = new IdProducto();
    RecursosMetodos rm = new RecursosMetodos();
    DefaultTableModel modelo;
    
    ArrayList <IdProducto>tbProducto;
    
    //ComboBoxDataModel CmboTipoPersona;
    
    public FormProducto() {
        initComponents();
        cargar_cab();
       
    }
    public void llenarTabla()
    {
        idp.setId(rm.contador());
        idp.setNombre(TxtAppNombre.getText());
       idp.setCantidad(TxtAppCantidad.getText());
        idp.setPrecio(TxtAppPrecio.getText());
        idp.setProveedor(TxtAppProveedor.getText());        
        clsp = new ClsProducto(idp);
    }
    public void cargar_cab(){
        modelo = new DefaultTableModel();
        modelo.addColumn("id_producto");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        modelo.addColumn("Proveedor");
        TableProducto.setModel(modelo);
    }
    public void limpiar_text()
    {
     this.TxtAppNombre.setText("");
     this.TxtAppCantidad.setText("");
     this.TxtAppPrecio.setText("");
     this.TxtAppProveedor.setText("");
     enabled_text(true);
    }
    public void enabled_text(boolean estado)
    {
     this.TxtAppNombre.enable(estado);
     this.TxtAppCantidad.enable(estado);
     this.TxtAppPrecio.enable(estado);
     this.TxtAppProveedor.enable(estado);
    }
    public void cargar_datos()
    {
        tbProducto = clsp.reporteProducto();
        for(IdProducto idp1 : tbProducto){
            modelo.addRow(new Object[]{idp1.getId(),
                                        idp1.getNombre(),
                                        idp1.getCantidad(),
                                        idp1.getPrecio(),
                                        idp1.getProveedor()
                });
        }
        
    }
    /*public void cargar_tipo_persona_home(){
        //modelotp = new ComboBoxModel();
        CmbTipoPersona.setModel(modelotp);
    }*/
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnNuevo = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtAppNombre = new javax.swing.JTextField();
        TxtAppCantidad = new javax.swing.JTextField();
        TxtAppPrecio = new javax.swing.JTextField();
        TxtAppProveedor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        BtnEditar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableProducto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        BtnNuevo.setText("Nuevo");
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });

        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(BtnNuevo)
                .addGap(39, 39, 39)
                .addComponent(BtnGuardar)
                .addGap(41, 41, 41)
                .addComponent(BtnCancelar)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnNuevo)
                    .addComponent(BtnGuardar)
                    .addComponent(BtnCancelar))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 11, 380, 45);

        jLabel1.setText("Nombre");

        jLabel2.setText("Cantidad");

        jLabel3.setText("Precio");

        jLabel4.setText("Proveedor");

        TxtAppNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAppNombreActionPerformed(evt);
            }
        });
        TxtAppNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtAppNombreKeyPressed(evt);
            }
        });

        TxtAppCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAppCantidadActionPerformed(evt);
            }
        });
        TxtAppCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtAppCantidadKeyPressed(evt);
            }
        });

        TxtAppPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAppPrecioActionPerformed(evt);
            }
        });
        TxtAppPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtAppPrecioKeyPressed(evt);
            }
        });

        TxtAppProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAppProveedorActionPerformed(evt);
            }
        });
        TxtAppProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtAppProveedorKeyPressed(evt);
            }
        });

        jLabel5.setText("Datos Producto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtAppNombre)
                            .addComponent(TxtAppCantidad)
                            .addComponent(TxtAppPrecio)
                            .addComponent(TxtAppProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(TxtAppNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtAppCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtAppPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtAppProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 62, 380, 134);

        BtnEditar.setText("Editar");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(BtnEditar)
                .addGap(53, 53, 53)
                .addComponent(BtnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(BtnSalir)
                .addGap(41, 41, 41))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEditar)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 210, 380, 45);

        TableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TableProducto);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 270, 379, 171);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtAppNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAppNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAppNombreActionPerformed

    private void TxtAppCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAppCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAppCantidadActionPerformed

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
          limpiar_text();
        enabled_text(true);
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
       llenarTabla();
        cargar_datos();
        limpiar_text();
        enabled_text(true);
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
       int p=TableProducto.getRowCount();
       for(int i=p-1;i>=0;i--){
           modelo.removeRow(i);
       }
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void TxtAppNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAppNombreKeyPressed
         if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        this.TxtAppCantidad.requestFocus();
        }
    }//GEN-LAST:event_TxtAppNombreKeyPressed

    private void TxtAppCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAppCantidadKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        this.TxtAppPrecio.requestFocus();
        }
    }//GEN-LAST:event_TxtAppCantidadKeyPressed

    private void TxtAppPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAppPrecioActionPerformed
        
    }//GEN-LAST:event_TxtAppPrecioActionPerformed

    private void TxtAppPrecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAppPrecioKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        this.TxtAppProveedor.requestFocus();
        }
    }//GEN-LAST:event_TxtAppPrecioKeyPressed

    private void TxtAppProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAppProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAppProveedorActionPerformed

    private void TxtAppProveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAppProveedorKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        this.TxtAppNombre.requestFocus();     
        llenarTabla();
        cargar_datos();
        limpiar_text();
       } 
    }//GEN-LAST:event_TxtAppProveedorKeyPressed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        int fila=Integer.parseInt(TxtAppCantidad.getText());
         int fila1=Integer.parseInt(TxtAppPrecio.getText());
         modelo.setValueAt(fila1, fila, fila);
         
    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        int filaseleccionada=TableProducto.getSelectedRow();
        if( filaseleccionada>=0){
        modelo.removeRow(filaseleccionada);
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JTable TableProducto;
    private javax.swing.JTextField TxtAppCantidad;
    private javax.swing.JTextField TxtAppNombre;
    private javax.swing.JTextField TxtAppPrecio;
    private javax.swing.JTextField TxtAppProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
