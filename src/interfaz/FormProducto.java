/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

import controlador.ClsProducto;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
        
        idp.setProducto(TxtAppProducto.getText());
        idp.setCantidad(TxtAppCantidad.getText());
         idp.setPrecio(TxtAppPrecio.getText());   
         idp.setSubtotal(TxtAppSubTotal.getText()); 
        clsp = new ClsProducto(idp);
    }
    public void cargar_cab(){
        modelo = new DefaultTableModel();
        modelo.addColumn("id_producto");
        
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        modelo.addColumn("SubTotal");
        TableProducto.setModel(modelo);
    }
    


    public void limpiar_text()
    {
     this.TxtAppNombre.setText("");
     this.TxtAppDireccion.setText("");
     this.TxtAppRuc.setText("");
     this.TxtAppProducto.setText("");
     this.TxtAppCantidad.setText("");
     this.TxtAppPrecio.setText("");
     
     enabled_text(true);
    }
    public void enabled_text(boolean estado)
    {
     this.TxtAppNombre.enable(estado);
     this.TxtAppDireccion.enable(estado);
     this.TxtAppRuc.enable(estado);
     this.TxtAppProducto.enable(estado);
     this.TxtAppCantidad.enable(estado);
      this.TxtAppPrecio.enable(estado);
      
  
    }
    public void cargar_datos()
    {
        tbProducto = clsp.reporteProducto();
        for(IdProducto idp1 : tbProducto){
            modelo.addRow(new Object[]{idp1.getId(),
                                        
                                        idp1.getProducto(),
                                        idp1.getCantidad(),
                                        idp1.getPrecio(),
                                        idp1.getSubtotal(),
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        BtnNuevo = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtAppNombre = new javax.swing.JTextField();
        TxtAppDireccion = new javax.swing.JTextField();
        TxtAppRuc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        TxtAppProducto = new javax.swing.JTextField();
        TxtAppCantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtAppPrecio = new javax.swing.JTextField();
        TxtAppSubTotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableProducto = new javax.swing.JTable();
        BtnEliminar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

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

        jLabel2.setText("Direccion");

        jLabel3.setText("Ruc");

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

        TxtAppDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAppDireccionActionPerformed(evt);
            }
        });
        TxtAppDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtAppDireccionKeyPressed(evt);
            }
        });

        TxtAppRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAppRucActionPerformed(evt);
            }
        });
        TxtAppRuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtAppRucKeyPressed(evt);
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
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtAppNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(TxtAppDireccion)
                            .addComponent(TxtAppRuc))))
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
                    .addComponent(TxtAppDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtAppRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 62, 380, 110);

        jLabel4.setText("Producto");

        TxtAppProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAppProductoActionPerformed(evt);
            }
        });
        TxtAppProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtAppProductoKeyPressed(evt);
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

        jLabel6.setText("Cantidad");

        jLabel8.setText("Precio");

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

        TxtAppSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAppSubTotalActionPerformed(evt);
            }
        });
        TxtAppSubTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtAppSubTotalKeyPressed(evt);
            }
        });

        jLabel9.setText("SubTotal");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtAppSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtAppProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtAppCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtAppPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtAppCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtAppProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(TxtAppPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAppSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(20, 170, 370, 100);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(30, 160, 330, 40);

        TableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        TableProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TableProductoKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(TableProducto);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(30, 330, 360, 90);

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEliminar);
        BtnEliminar.setBounds(180, 280, 69, 23);

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSalir);
        BtnSalir.setBounds(300, 280, 53, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtAppNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAppNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAppNombreActionPerformed

    private void TxtAppDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAppDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAppDireccionActionPerformed

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
          limpiar_text();
        enabled_text(true);
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
       
        llenarTabla();
        cargar_datos();
         int p=TableProducto.getRowCount();
       for(int i=p-1;i>=0;i--){
           modelo.removeRow(i);
       }
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
        this.TxtAppDireccion.requestFocus();
        }
    }//GEN-LAST:event_TxtAppNombreKeyPressed

    private void TxtAppDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAppDireccionKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        this.TxtAppRuc.requestFocus();
        }
    }//GEN-LAST:event_TxtAppDireccionKeyPressed

    private void TxtAppRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAppRucActionPerformed
        
    }//GEN-LAST:event_TxtAppRucActionPerformed

    private void TxtAppRucKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAppRucKeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        this.TxtAppProducto.requestFocus();     
      
       } 
    }//GEN-LAST:event_TxtAppRucKeyPressed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        int filaseleccionada=TableProducto.getSelectedRow();
        modelo.removeRow(filaseleccionada);
         
        filaseleccionada=rm.contador();
        
       
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void TxtAppProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAppProductoKeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        this.TxtAppCantidad.requestFocus();     
      
       } 
    }//GEN-LAST:event_TxtAppProductoKeyPressed

    private void TxtAppCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAppCantidadKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        this.TxtAppPrecio.requestFocus();     
       
    }//GEN-LAST:event_TxtAppCantidadKeyPressed
    }
    private void TxtAppPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAppPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAppPrecioActionPerformed

    private void TxtAppPrecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAppPrecioKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        this.TxtAppSubTotal.requestFocus();     
        }
    }//GEN-LAST:event_TxtAppPrecioKeyPressed

    private void TableProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableProductoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TableProductoKeyPressed

    private void TxtAppProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAppProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAppProductoActionPerformed

    private void TxtAppCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAppCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAppCantidadActionPerformed

    private void TxtAppSubTotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAppSubTotalKeyPressed
       if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        this.TxtAppProducto.requestFocus();     
        llenarTabla();
        cargar_datos();
        
       } 
    }//GEN-LAST:event_TxtAppSubTotalKeyPressed

    private void TxtAppSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAppSubTotalActionPerformed
          // TODO add your handling code here:
    }//GEN-LAST:event_TxtAppSubTotalActionPerformed

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
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JTable TableProducto;
    private javax.swing.JTextField TxtAppCantidad;
    private javax.swing.JTextField TxtAppDireccion;
    private javax.swing.JTextField TxtAppNombre;
    private javax.swing.JTextField TxtAppPrecio;
    private javax.swing.JTextField TxtAppProducto;
    private javax.swing.JTextField TxtAppRuc;
    private javax.swing.JTextField TxtAppSubTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
