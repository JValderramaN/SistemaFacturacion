/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.facturacion;

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
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Julio
 */
public class Venta extends javax.swing.JFrame {

    /**
     * Creates new form proovedor
     */
    private ResultSet rsProductoBuscado;
    private ResultSet rsClienteBuscado;
    private DefaultTableModel modeloTabla;
    private DefaultListModel modeloListaProducto;

    public Venta() {
        initComponents();
        jTabledeventa.getTableHeader().setReorderingAllowed(false);

        modeloTabla = (DefaultTableModel) jTabledeventa.getModel();
        configure();
        this.setLocationRelativeTo(null);
        WindowListener exitListener = new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                new menu().setVisible(true);
            }
        };
        this.addWindowListener(exitListener);

        /* String sql = "SELECT nombre_producto, descripcion_producto, id_tproducto, precio_producto, cantidad, id_producto"
         + "  FROM producto WHERE producto.nombre_producto like '%" + tfProducto.getText() + "%'"
         + " OR producto.descripcion_producto like '%" + tfProducto.getText() + "%' OR CAST(producto.id_producto AS text) like '%"
         + tfProducto.getText() + "%'";*/
        loadProductos();
    }

    private void loadProductos() {
        String sql = "SELECT nombre_producto, descripcion_producto, id_tproducto, precio_producto, "
                + " id_producto, cantidad"
                + " FROM producto WHERE producto.cantidad > 0 ORDER BY producto.id_producto";

        try {
            Statement st = Conexion.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rsProductoBuscado = st.executeQuery(sql);
            modeloListaProducto = new DefaultListModel();
            while (rsProductoBuscado.next()) {
                modeloListaProducto.addElement(rsProductoBuscado.getObject("nombre_producto") + "  ID:"
                        + rsProductoBuscado.getObject("id_producto"));
            }
            listadoProductos.setModel(modeloListaProducto);
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfSubTotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfIva = new javax.swing.JTextField();
        jTCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTcedulaorif = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBVer = new javax.swing.JButton();
        jBNueva = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabledeventa = new javax.swing.JTable();
        btAgregarProducto = new javax.swing.JButton();
        crearVenta = new javax.swing.JButton();
        jBuscar = new javax.swing.JButton();
        btEliminarRenglon = new javax.swing.JButton();
        spCantidad = new javax.swing.JSpinner();
        lbNumeroVenta = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cbTipoId = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        listadoProductos = new javax.swing.JList();
        jLabel22 = new javax.swing.JLabel();
        spIva = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("IVA %");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SUBTOTAL");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 475, -1, -1));

        tfTotal.setEditable(false);
        tfTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTotalActionPerformed(evt);
            }
        });
        getContentPane().add(tfTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 475, 110, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TOTAL A PAGAR");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 475, -1, -1));

        tfSubTotal.setEditable(false);
        getContentPane().add(tfSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 475, 90, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Bs.");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, -1, 30));

        tfIva.setEditable(false);
        tfIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIvaActionPerformed(evt);
            }
        });
        getContentPane().add(tfIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 475, 100, -1));

        jTCliente.setEditable(false);
        getContentPane().add(jTCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 170, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Cliente");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 40, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Cantidad");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, -1, -1));

        tfProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfProductoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfProductoKeyTyped(evt);
            }
        });
        getContentPane().add(tfProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 200, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("PRODUCTO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jTcedulaorif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcedulaorifActionPerformed(evt);
            }
        });
        getContentPane().add(jTcedulaorif, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 90, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("CEDULA O RIF");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("NUMERO DE VENTA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        jBVer.setText("Ventas Previas");
        jBVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBVerMouseClicked(evt);
            }
        });
        getContentPane().add(jBVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, -1, 40));

        jBNueva.setText("Nueva");
        jBNueva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBNuevaMouseClicked(evt);
            }
        });
        jBNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevaActionPerformed(evt);
            }
        });
        getContentPane().add(jBNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 130, 40));

        jBSalir.setText("Atras");
        jBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSalirMouseClicked(evt);
            }
        });
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 130, 40));

        jTabledeventa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Producto", "Descripcion", "Cantidad", "Precio", "Importe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabledeventa.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTabledeventa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabledeventaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTabledeventa);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 410, 190));

        btAgregarProducto.setText("Agregar");
        btAgregarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAgregarProductoMouseClicked(evt);
            }
        });
        btAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 90, 30));

        crearVenta.setText("Facturar");
        crearVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearVentaMouseClicked(evt);
            }
        });
        crearVenta.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                crearVentaComponentHidden(evt);
            }
        });
        crearVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearVentaActionPerformed(evt);
            }
        });
        getContentPane().add(crearVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 160, 50));

        jBuscar.setText("Buscar");
        jBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBuscarMouseClicked(evt);
            }
        });
        getContentPane().add(jBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 100, 30));

        btEliminarRenglon.setText("Eliminar");
        btEliminarRenglon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEliminarRenglonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btEliminarRenglonMouseEntered(evt);
            }
        });
        getContentPane().add(btEliminarRenglon, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 90, 30));

        spCantidad.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        getContentPane().add(spCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 60, -1));

        lbNumeroVenta.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        getContentPane().add(lbNumeroVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 170, 20));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SIGCA(LOGO)_1 pequeño.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 220, 80));

        cbTipoId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "J", "G", "V", "E" }));
        getContentPane().add(cbTipoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 60, 30));

        listadoProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listadoProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listadoProductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 240, 100));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Seleccione Producto o Servicio");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 154, 190, -1));

        spIva.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(12), Integer.valueOf(1), null, Integer.valueOf(1)));
        getContentPane().add(spIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 475, 50, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("IVA %");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WINDOWS_7_WALLPAPER_BY_AMYSTIKALDESIGNS.JPG"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 930, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearVentaActionPerformed
        try {
            PreparedStatement pps = Conexion.getConnection().prepareStatement(""
                    + "INSERT INTO venta("
                    + " total_venta,id_usuario,id_cliente)"
                    + " VALUES (?,?,?);", Statement.RETURN_GENERATED_KEYS);

            pps.setFloat(1, Float.parseFloat(tfTotal.getText()));
            pps.setInt(2, Login.usr.getID());
            pps.setInt(3, rsClienteBuscado.getInt("serial"));
            pps.executeUpdate();
            ResultSet generatedKeys = pps.getGeneratedKeys();
            generatedKeys.next();
            lbNumeroVenta.setText(generatedKeys.getLong(1) + "");

            for (int i = 0; i < modeloTabla.getRowCount(); i++) {
                PreparedStatement pps2 = Conexion.getConnection().prepareStatement(""
                        + "INSERT INTO detalle_venta("
                        + " cantidad, importe, id_producto, id_venta)"
                        + " VALUES (?,?,?,?);");

                pps2.setInt(1, (int) modeloTabla.getValueAt(i, 3));
                pps2.setFloat(2, (Float) modeloTabla.getValueAt(i, 5));
                pps2.setInt(3, (int) modeloTabla.getValueAt(i, 0));
                pps2.setLong(4, generatedKeys.getLong(1));
                pps2.executeUpdate();
            }
            configure();
        } catch (SQLException ex) {
            Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_crearVentaActionPerformed

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseMoved

    private void configure() {
        btAgregarProducto.setEnabled(false);
        btEliminarRenglon.setEnabled(false);
        crearVenta.setEnabled(false);
        jTcedulaorif.setText("");
        tfProducto.setText("");
        jTCliente.setText("");
        tfSubTotal.setText("");
        tfIva.setText("");
        tfTotal.setText("");
        int cant = modeloTabla.getRowCount();
        for (int i = 0; i < cant; i++) {
            modeloTabla.removeRow(0);
        }

        /*        String sql = "select CURRVAL('venta_id_venta_seq') as valor";

         try {
         Statement st = Conexion.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
         ResultSet currVal = st.executeQuery(sql);
         if (currVal.next()) {
         lbNumeroVenta.setText(currVal.getInt("valor")+"");
         } else {
         lbNumeroVenta.setText("");
         }
         } catch (SQLException ex) {
         Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
         }
         */
    }

    private void tfIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIvaActionPerformed

    private void jBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBuscarMouseClicked
        if (jTcedulaorif.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe completar los datos");
            return;
        } else {

            String sql = "SELECT nombre_cliente, apellido_cliente, domicilio_cliente, id_tcliente, "
                    + "       email_cliente, tlf_cliente, serial, cedula_rif "
                    + "  FROM cliente WHERE cliente.cedula_rif = '" + cbTipoId.getSelectedItem().toString() + jTcedulaorif.getText() /*+ "' OR "
                     + "cliente.rif = '" + jTcedulaorif.getText()*/ + "'";

            try {
                Statement st = Conexion.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                rsClienteBuscado = st.executeQuery(sql);
                if (rsClienteBuscado.next()) {
                    jTCliente.setText(rsClienteBuscado.getString("nombre_cliente") + " " + rsClienteBuscado.getString("apellido_cliente"));
                } else {
                    rsClienteBuscado = null;
                    jTCliente.setText("");

                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jBuscarMouseClicked

    private void btAgregarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAgregarProductoMouseClicked
        try {
            
            if(((int) spCantidad.getValue()) > rsProductoBuscado.getInt("cantidad") ){
                JOptionPane.showMessageDialog(null, "Debe ingresar una cantidad igual o menor a "+rsProductoBuscado.getInt("cantidad"));
                return;
            }
            
            modeloTabla.addRow(new Object[]{
                rsProductoBuscado.getInt("id_producto"),
                rsProductoBuscado.getString("nombre_producto"),
                rsProductoBuscado.getString("descripcion_producto"),
                (int) spCantidad.getValue(),
                rsProductoBuscado.getFloat("precio_producto"),
                rsProductoBuscado.getFloat("precio_producto") * (int) spCantidad.getValue()
            });
            updateTotals();
            rsProductoBuscado.updateInt("cantidad", rsProductoBuscado.getInt("cantidad") - (int) spCantidad.getValue());
            rsProductoBuscado.updateRow();

            loadProductos();
            listadoProductosMouseClicked(null);
        } catch (SQLException ex) {
            Logger.getLogger(Venta.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAgregarProductoMouseClicked

    private void jTabledeventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabledeventaMouseClicked
        btEliminarRenglon.setEnabled(jTabledeventa.getSelectedRow() != -1);
    }//GEN-LAST:event_jTabledeventaMouseClicked

    private void btEliminarRenglonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEliminarRenglonMouseClicked
        if (jTabledeventa.getSelectedRow() != -1) {
            try {
                boolean sw = false;
                rsProductoBuscado.beforeFirst();
                while (rsProductoBuscado.next()) {
                    if (rsProductoBuscado.getInt("id_producto") == (int) modeloTabla.getValueAt(jTabledeventa.getSelectedRow(), 0)) {
                        sw = true;
                        break;
                    }
                }

                PreparedStatement pps = Conexion.getConnection().prepareStatement("UPDATE producto"
                        + "   SET cantidad=?"
                        + "  WHERE id_producto = ?");
                int valor = (int) modeloTabla.getValueAt(jTabledeventa.getSelectedRow(), 3);
                pps.setInt(1, sw ? rsProductoBuscado.getInt("cantidad")
                        + valor : valor);
                pps.setInt(2, (int) modeloTabla.getValueAt(jTabledeventa.getSelectedRow(), 0));
                pps.executeUpdate();

                modeloTabla.removeRow(jTabledeventa.getSelectedRow());
                updateTotals();

                loadProductos();
                listadoProductosMouseClicked(null);
            } catch (SQLException ex) {
                Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btEliminarRenglonMouseClicked

    private void crearVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearVentaMouseClicked

    }//GEN-LAST:event_crearVentaMouseClicked

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseClicked
        menu principal = new menu();
        dispose();

        principal.setTitle("Menu Principal");
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
    }//GEN-LAST:event_jBSalirMouseClicked

    private void jTcedulaorifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcedulaorifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcedulaorifActionPerformed

    private void jBNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBNuevaActionPerformed

    private void jBNuevaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNuevaMouseClicked
        dispose();
        new Venta().setVisible(true);
    }//GEN-LAST:event_jBNuevaMouseClicked

    private void tfTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTotalActionPerformed

    private void tfProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfProductoKeyReleased
        try {
            rsProductoBuscado.beforeFirst();
            int pos = 0;
            btAgregarProducto.setEnabled(false);
            while (rsProductoBuscado.next()) {
                if (rsProductoBuscado.getString("nombre_producto").toLowerCase().contains(tfProducto.getText().toLowerCase())
                        || rsProductoBuscado.getString("id_producto").contains(tfProducto.getText())) {
                    listadoProductos.setSelectedIndex(pos);
                    ((SpinnerNumberModel) spCantidad.getModel()).setMaximum(rsProductoBuscado.getInt("cantidad"));
                    spCantidad.setValue(rsProductoBuscado.getInt("cantidad"));
                    btAgregarProducto.setEnabled(true);
                    break;
                }
                pos++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Venta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tfProductoKeyReleased

    private void listadoProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listadoProductosMouseClicked
        try {

            if ((rsProductoBuscado == null || listadoProductos.getSelectedIndex() == -1) && modeloListaProducto.getSize() > 0) {
                return;
            }
            btAgregarProducto.setEnabled(false);
            rsProductoBuscado.beforeFirst();
            for (int i = 0; i <= listadoProductos.getSelectedIndex(); i++) {
                rsProductoBuscado.next();
            }

            tfProducto.setText(rsProductoBuscado.getString("nombre_producto"));
            ((SpinnerNumberModel) spCantidad.getModel()).setMaximum(rsProductoBuscado.getInt("cantidad"));
            spCantidad.setValue(rsProductoBuscado.getInt("cantidad"));
            btAgregarProducto.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listadoProductosMouseClicked

    private void tfProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfProductoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfProductoKeyTyped

    private void btAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAgregarProductoActionPerformed

    private void crearVentaComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_crearVentaComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_crearVentaComponentHidden

    private void btEliminarRenglonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEliminarRenglonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btEliminarRenglonMouseEntered

    private void jBVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVerMouseClicked
        dispose();
        new ReporteVenta().setVisible(true);
    }//GEN-LAST:event_jBVerMouseClicked

    private void updateTotals() {
        float subTOtal = 0;
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            subTOtal += (Float) modeloTabla.getValueAt(i, 5);
        }
        crearVenta.setEnabled(subTOtal != 0);
        tfSubTotal.setText(subTOtal + "");
        tfIva.setText((subTOtal * 0.12) + "");
        tfTotal.setText((subTOtal + (subTOtal * ((int) spIva.getValue()) / 100)) + "");
    }

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
            java.util.logging.Logger.getLogger(Venta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregarProducto;
    private javax.swing.JButton btEliminarRenglon;
    private javax.swing.JComboBox cbTipoId;
    private javax.swing.JButton crearVenta;
    private javax.swing.JButton jBNueva;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBVer;
    private javax.swing.JButton jBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTCliente;
    private javax.swing.JTable jTabledeventa;
    private javax.swing.JTextField jTcedulaorif;
    private javax.swing.JLabel lbNumeroVenta;
    private javax.swing.JList listadoProductos;
    private javax.swing.JSpinner spCantidad;
    private javax.swing.JSpinner spIva;
    private javax.swing.JTextField tfIva;
    private javax.swing.JTextField tfProducto;
    private javax.swing.JTextField tfSubTotal;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables
}
