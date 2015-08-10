/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.facturacion;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import sistema.de.facturacion.menu;

/**
 *
 * @author Julio
 */
public class Producto extends javax.swing.JFrame {

    private DefaultListModel modeloListaProducto;
    private ResultSet rsProductosBuscados;

    /**
     * Creates new form proovedor
     */
    public Producto() {
        initComponents();
        enableComponents(panelDatos, false);
//          modeloListaProducto = (DefaultListModel) jTextArea1.getModel();

        this.setLocationRelativeTo(null);
        WindowListener exitListener = new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                new menu().setVisible(true);
            }
        };
        this.addWindowListener(exitListener);
        
        
        btBuscarMouseClicked(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatos = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btAgregar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        tfPrecio = new javax.swing.JTextField();
        tfDescripcion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfTipoproducto = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        spCantidad = new javax.swing.JSpinner();
        lbTrabajo = new javax.swing.JLabel();
        lbProducto = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfProductoBuscar = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaProductos = new javax.swing.JList();
        btEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDatos.setOpaque(false);
        panelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Cantidad");
        panelDatos.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        btAgregar.setText("Agregar");
        btAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAgregarMouseClicked(evt);
            }
        });
        panelDatos.add(btAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 120, 50));

        btLimpiar.setText("Limpiar");
        btLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLimpiarMouseClicked(evt);
            }
        });
        panelDatos.add(btLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 110, 50));
        panelDatos.add(tfPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 200, -1));

        tfDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescripcionActionPerformed(evt);
            }
        });
        panelDatos.add(tfDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 200, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Descripcion");
        panelDatos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 70, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre");
        panelDatos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, 40));

        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });
        panelDatos.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 200, -1));
        panelDatos.add(tfTipoproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 200, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Tipo de Producto");
        panelDatos.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Precio");
        panelDatos.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        spCantidad.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        panelDatos.add(spCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 170, -1));

        getContentPane().add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 380, 320));

        lbTrabajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/servicio3.png"))); // NOI18N
        lbTrabajo.setToolTipText("Servicio");
        lbTrabajo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbTrabajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTrabajoMouseClicked(evt);
            }
        });
        getContentPane().add(lbTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 130, 130));

        lbProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos1.png"))); // NOI18N
        lbProducto.setToolTipText("Producto");
        lbProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbProductoMouseClicked(evt);
            }
        });
        getContentPane().add(lbProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, 110));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SIGCA(LOGO)_1 pequeño.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 220, 80));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Gestion de Producto");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 190, 40));

        tfProductoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfProductoBuscarActionPerformed(evt);
            }
        });
        tfProductoBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfProductoBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(tfProductoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 170, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(240, 240, 240)));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 240, 190));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Datos del Producto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 160, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 140, 30));

        jButton7.setText("Atras");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 120, 50));

        btBuscar.setText("Buscar");
        btBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBuscarMouseClicked(evt);
            }
        });
        getContentPane().add(btBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 170, 40));

        listaProductos.setModel(new DefaultListModel());
        listaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listaProductos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 240, 180));

        btEliminar.setText("Eliminar");
        btEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEliminarMouseClicked(evt);
            }
        });
        getContentPane().add(btEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 100, 50));

        jLabel3.setFont(new java.awt.Font("Luminari", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Trabajo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Luminari", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Producto");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel20.setFont(new java.awt.Font("Luminari", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("de Servicio");
        jLabel20.setToolTipText("");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 120, 70));

        jLabel21.setFont(new java.awt.Font("Luminari", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Seleccione el tipo");
        jLabel21.setToolTipText("");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 220, 70));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Lista de Productos y Servicios");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 190, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WINDOWS_7_WALLPAPER_BY_AMYSTIKALDESIGNS.JPG"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved


    }//GEN-LAST:event_jLabel1MouseMoved

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    private void tfDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDescripcionActionPerformed

    private void tfProductoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfProductoBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfProductoBuscarActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        menu principal = new menu();
        dispose();

        principal.setTitle("Menu Principal");
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAgregarMouseClicked
        if (tfTipoproducto.getText().equals("") || tfNombre.getText().equals("") || tfDescripcion.getText().equals("") || tfPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe completar los datos");
            return;
        } else {
            try {
                if (btAgregar.getText().equals("Agregar")) {

                    PreparedStatement pps = Conexion.getConnection().prepareStatement(""
                            + "INSERT INTO producto("
                            + " nombre_producto, descripcion_producto, id_tproducto, precio_producto,cantidad)"
                            + " VALUES (?, ?, ?, ?,?);");

                    pps.setString(1, tfNombre.getText());
                    pps.setString(2, tfDescripcion.getText());
                    pps.setInt(3, tfTipoproducto.getText().equals("TRABAJO") ? 1 : 2);
                    pps.setFloat(4, Float.parseFloat(tfPrecio.getText()));
                    pps.setInt(5, (int) spCantidad.getValue());
                    pps.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Se ha creado un nuevo " + (tfTipoproducto.getText().equals("TRABAJO") ? "TRABAJO" : "PRODUCTO"));

                } else {//MODIFICAR

                    PreparedStatement pps = Conexion.getConnection().prepareStatement("UPDATE producto"
                            + "   SET nombre_producto=?, descripcion_producto=?, precio_producto=?,  cantidad=?"
                            + "  WHERE id_producto = ?");

                    pps.setString(1, tfNombre.getText());
                    pps.setString(2, tfDescripcion.getText());
                    pps.setFloat(3, Float.parseFloat(tfPrecio.getText()));
                    pps.setInt(4, (int) spCantidad.getValue());
                    pps.setInt(5, rsProductosBuscados.getInt("id_producto"));
                    pps.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Se ha modificado el registro");
                    
                    btAgregar.setText("Agregar");
                }

                btLimpiarMouseClicked(null);
                btBuscarMouseClicked(null);
                enableComponents(panelDatos, false);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ha ocurido un error en la insercion de los datos");
                Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btAgregarMouseClicked

    public void enableComponents(Container container, boolean enable) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            component.setEnabled(enable);
            if (component instanceof Container) {
                enableComponents((Container) component, enable);
            }
        }
    }
    private void lbProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbProductoMouseClicked
        enableComponents(panelDatos, true);
        tfTipoproducto.setText("Producto");
        tfTipoproducto.setEnabled(false);
        btAgregar.setText("Agregar");
        jLabel18.setText("Horas de trabajo");
    }//GEN-LAST:event_lbProductoMouseClicked

    private void lbTrabajoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTrabajoMouseClicked
        enableComponents(panelDatos, true);
        tfTipoproducto.setText("TRABAJO");
        tfTipoproducto.setEnabled(false);
        btAgregar.setText("Agregar");
        jLabel18.setText("Cantidad");
    }//GEN-LAST:event_lbTrabajoMouseClicked

    private void btLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLimpiarMouseClicked
        tfTipoproducto.setText("");
        tfDescripcion.setText("");
        tfPrecio.setText("");
        tfNombre.setText("");
        spCantidad.setValue(1);
    }//GEN-LAST:event_btLimpiarMouseClicked

    private void btBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscarMouseClicked
          try {
              
              String sql = "SELECT nombre_producto, descripcion_producto, id_tproducto, precio_producto, cantidad, id_producto"
                    + "  FROM producto WHERE producto.nombre_producto like '%" + tfProductoBuscar.getText() + "%'"
                  + " OR producto.descripcion_producto like '%" + tfProductoBuscar.getText() + "%' OR CAST(producto.id_producto AS text) like '%" 
                      +tfProductoBuscar.getText() + "%'";

            
                Statement st = Conexion.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                rsProductosBuscados = st.executeQuery(sql);
                modeloListaProducto = new DefaultListModel();
                while (rsProductosBuscados.next()) {
                    modeloListaProducto.addElement(rsProductosBuscados.getObject("nombre_producto") + "  ID:"+
                            rsProductosBuscados.getObject("id_producto"));
                }
                listaProductos.setModel(modeloListaProducto);
            } catch (Exception ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btBuscarMouseClicked

    private void listaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaProductosMouseClicked
        try {
            rsProductosBuscados.beforeFirst();
            for (int i = 0; i <= listaProductos.getSelectedIndex(); i++) {
                rsProductosBuscados.next();
            }
            
            
            if (rsProductosBuscados == null || listaProductos.getSelectedIndex() == -1) {
                return;
            }

            enableComponents(panelDatos, true);
            btLimpiarMouseClicked(null);
            btAgregar.setText("Modificar");

            tfTipoproducto.setEnabled(false);
            tfTipoproducto.setText(rsProductosBuscados.getInt("id_tproducto") == 1 ? "TRABAJO" : "PRODUCTO");
            tfNombre.setText(rsProductosBuscados.getString("nombre_producto"));
            tfDescripcion.setText(rsProductosBuscados.getString("descripcion_producto"));
            tfPrecio.setText(rsProductosBuscados.getString("precio_producto"));
            spCantidad.setValue(rsProductosBuscados.getInt("cantidad"));
            jLabel18.setText(rsProductosBuscados.getInt("id_tproducto") == 1 ? "Horas de Trabajo" : "Cantidad");
            
        } catch (SQLException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listaProductosMouseClicked

    private void btEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEliminarMouseClicked
        //rsClientesBuscados
        if (rsProductosBuscados == null || listaProductos.getSelectedIndex() == -1) {
            return;
        }

        try {
            PreparedStatement pps = Conexion.getConnection().prepareStatement(""
                + "DELETE FROM producto WHERE id_producto = ?");

            pps.setInt(1, rsProductosBuscados.getInt("id_producto"));
            pps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Se ha eliminado el registro");
            btBuscarMouseClicked(null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurido un error en la eliminacion de los datos");
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btEliminarMouseClicked

    private void tfProductoBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfProductoBuscarKeyReleased
        btBuscarMouseClicked(null);
    }//GEN-LAST:event_tfProductoBuscarKeyReleased

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
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbProducto;
    private javax.swing.JLabel lbTrabajo;
    private javax.swing.JList listaProductos;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JSpinner spCantidad;
    private javax.swing.JTextField tfDescripcion;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPrecio;
    private javax.swing.JTextField tfProductoBuscar;
    private javax.swing.JTextField tfTipoproducto;
    // End of variables declaration//GEN-END:variables

}
