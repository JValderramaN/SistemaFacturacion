/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.facturacion;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.text.Caret;
import javax.swing.text.NumberFormatter;
import sistema.de.facturacion.menu;

/**
 *
 * @author Julio
 */
public class cliente extends javax.swing.JFrame {

    private DefaultListModel modeloListaClientes;
    private ResultSet rsClientesBuscados;

    public cliente() {
        initComponents();
        enableComponents(panelDatos, false);
        modeloListaClientes = (DefaultListModel) listaClientes.getModel();
        this.setLocationRelativeTo(null);
        WindowListener exitListener = new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                new menu().setVisible(true);
            }
        };
        this.addWindowListener(exitListener);

        //btBuscarMouseClicked(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        listaClientes = new javax.swing.JList();
        panelDatos = new javax.swing.JPanel();
        btAgregar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        tfEmial = new javax.swing.JTextField();
        tfDireccion = new javax.swing.JTextField();
        tfApellido = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfCedula = new javax.swing.JTextField();
        tfTipoCliente = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbTipoId = new javax.swing.JComboBox();
        tfTelefono = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfClienteBuscar = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaClientes.setModel(new DefaultListModel());
        listaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listaClientes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 240, 180));

        panelDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        panelDatos.setOpaque(false);
        panelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btAgregar.setText("Agregar");
        btAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAgregarMouseClicked(evt);
            }
        });
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });
        panelDatos.add(btAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 120, 50));

        btLimpiar.setText("Limpiar");
        btLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLimpiarMouseClicked(evt);
            }
        });
        panelDatos.add(btLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 110, 50));

        tfEmial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfEmialKeyPressed(evt);
            }
        });
        panelDatos.add(tfEmial, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 200, 30));
        panelDatos.add(tfDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 200, 30));

        tfApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfApellidoActionPerformed(evt);
            }
        });
        tfApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfApellidoKeyTyped(evt);
            }
        });
        panelDatos.add(tfApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 200, 30));

        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });
        tfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNombreKeyTyped(evt);
            }
        });
        panelDatos.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 200, 30));

        tfCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCedulaActionPerformed(evt);
            }
        });
        tfCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCedulaKeyTyped(evt);
            }
        });
        panelDatos.add(tfCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 140, 30));
        panelDatos.add(tfTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 200, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Tipo de Cliente");
        panelDatos.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cedula o RIF");
        panelDatos.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(" ");
        panelDatos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre");
        panelDatos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 60, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Apellido");
        panelDatos.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 60, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Direccion");
        panelDatos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 60, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("E-Mail");
        panelDatos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 60, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefono");
        panelDatos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 60, 40));

        cbTipoId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "J", "G", "V", "E" }));
        panelDatos.add(cbTipoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 60, 30));

        try {
            tfTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        panelDatos.add(tfTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 200, 30));

        getContentPane().add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 350, 350));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente1.png"))); // NOI18N
        jLabel10.setToolTipText("Agregar Cliente");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 70, 100));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empresa2.png"))); // NOI18N
        jLabel8.setToolTipText("Agregar Empresa");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, 130));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SIGCA(LOGO)_1 pequeño.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 220, 80));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Agregar Cliente");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 140, 40));

        tfClienteBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClienteBuscarActionPerformed(evt);
            }
        });
        tfClienteBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfClienteBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(tfClienteBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 170, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(240, 240, 240)));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 270, 170));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Datos del Cliente");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 170, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clientes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 130, 30));

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

        btEliminar.setText("Eliminar");
        btEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEliminarMouseClicked(evt);
            }
        });
        getContentPane().add(btEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, 100, 50));

        jLabel3.setFont(new java.awt.Font("Luminari", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Empresa");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel18.setFont(new java.awt.Font("Luminari", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Persona Natural");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 230, -1, -1));

        jLabel19.setFont(new java.awt.Font("Luminari", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("de Cliente");
        jLabel19.setToolTipText("");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 120, 70));

        jLabel20.setFont(new java.awt.Font("Luminari", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Seleccione el tipo");
        jLabel20.setToolTipText("");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 220, 70));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Lista de Clientes");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 110, -1));

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

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseMoved

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    private void tfApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApellidoActionPerformed

    private void tfClienteBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfClienteBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfClienteBuscarActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        menu principal = new menu();
        dispose();

        principal.setTitle("Menu Principal");
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    public void enableComponents(Container container, boolean enable) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            component.setEnabled(enable);
            if (component instanceof Container) {
                enableComponents((Container) component, enable);
            }
        }
    }

    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAgregarActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        enableComponents(panelDatos, true);
        //tfCedula.setEnabled(false);
        //tfCedula.setText("");
        tfTipoCliente.setEnabled(false);
        tfTipoCliente.setText("Empresa");
        btAgregar.setText("Agregar");
        tfApellido.setEnabled(false);
        tfApellido.setText("");
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        enableComponents(panelDatos, true);
        tfTipoCliente.setEnabled(false);
        tfTipoCliente.setText("Persona Natural");
        btAgregar.setText("Agregar");
    }//GEN-LAST:event_jLabel10MouseClicked

    private void btLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLimpiarMouseClicked
        tfApellido.setText("");
        tfCedula.setText("");
        tfDireccion.setText("");
        tfEmial.setText("");
        tfNombre.setText("");
        //tfRif.setText("");
        tfTelefono.setText("");
        tfTipoCliente.setText("");
    }//GEN-LAST:event_btLimpiarMouseClicked

    private void btAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAgregarMouseClicked
        if (tfCedula.getText().equals("") || tfTipoCliente.getText().equals("") || tfNombre.getText().equals("") || tfDireccion.getText().equals("") || tfEmial.getText().equals("") || tfTelefono.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe completar los datos");
            return;
        } else {
            try {

                String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

                if (!tfCedula.isEnabled() && tfApellido.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe completar los datos");
                    return;
                }

                /* Pattern pattern = Pattern.compile(regex);
                 Matcher matcher = pattern.matcher(tfEmial.getText());
                 if (!matcher.matches()) {
                 JOptionPane.showMessageDialog(null, "Ingresar un email correctamente");
                 return;
                 }*/
                String sqlvalidar = "SELECT cedula_rif FROM cliente WHERE cliente.cedula_rif = '"
                        + cbTipoId.getSelectedItem().toString() + tfCedula.getText() + "'";

                Statement st = Conexion.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet validar = st.executeQuery(sqlvalidar);
                if (validar.next()) {
                    JOptionPane.showMessageDialog(null, "Ésta Cédula o RIF ha sido registrada anteriormente, intente una diferente.");
                    return;
                }

                if (btAgregar.getText().equals("Agregar")) {

                    PreparedStatement pps = Conexion.getConnection().prepareStatement(""
                            + "INSERT INTO cliente("
                            + " cedula_rif, nombre_cliente, apellido_cliente, domicilio_cliente, "
                            + " id_tcliente, email_cliente, tlf_cliente)"
                            + " VALUES (?, ?, ?, ?, ?, "
                            + " ?, ? );");

                    pps.setObject(1, cbTipoId.getSelectedItem().toString() + tfCedula.getText());
                    //pps.setString(2, tfRif.getText().equals("") ? null : tfRif.getText());
                    pps.setString(2, tfNombre.getText());
                    pps.setString(3, tfApellido.getText());
                    pps.setString(4, tfDireccion.getText());
                    pps.setInt(5, tfCedula.isEnabled() ? 2 : 1);
                    pps.setString(6, tfEmial.getText());
                    pps.setString(7, tfTelefono.getText());
                    pps.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Se ha creado un nuevo " + (tfCedula.isEnabled() ? "Cliente" : "Empresa"));

                } else {//MODIFICAR

                    PreparedStatement pps = Conexion.getConnection().prepareStatement("UPDATE cliente"
                            + "   SET cedula_rif=?, nombre_cliente=?, apellido_cliente=?, "
                            + "       domicilio_cliente=?, email_cliente=?, tlf_cliente=? "
                            + " WHERE serial = ?");

                    pps.setObject(1, cbTipoId.getSelectedItem().toString() + tfCedula.getText());
                    pps.setString(2, tfNombre.getText());
                    pps.setString(3, tfApellido.getText());
                    pps.setString(4, tfDireccion.getText());
                    pps.setString(5, tfEmial.getText());
                    pps.setString(6, tfTelefono.getText());
                    pps.setObject(7, rsClientesBuscados.getInt("serial"));
                    pps.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Se ha modificado el registro");

                    btAgregar.setText("Agregar");
                }

                btLimpiarMouseClicked(null);
                enableComponents(panelDatos, false);
                btBuscarMouseClicked(null);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ha ocurido un error en la insercion de los datos");
                Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btAgregarMouseClicked

    private void btBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscarMouseClicked
        //rsClientesBuscados

        String sql = "SELECT cedula_rif, nombre_cliente, apellido_cliente, domicilio_cliente, "
                + "       id_tcliente, email_cliente, tlf_cliente, serial"
                + "  FROM cliente WHERE cliente.nombre_cliente like '%" + tfClienteBuscar.getText() + "%' OR "
                + "cliente.cedula_rif like '%" + tfClienteBuscar.getText() + "%'";

        try {
            Statement st = Conexion.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rsClientesBuscados = st.executeQuery(sql);
            modeloListaClientes = new DefaultListModel();
            while (rsClientesBuscados.next()) {
                modeloListaClientes.addElement(rsClientesBuscados.getObject("nombre_cliente")
                        + "   " + rsClientesBuscados.getObject("apellido_cliente")
                        + "   " + rsClientesBuscados.getObject("cedula_rif"));
            }
            listaClientes.setModel(modeloListaClientes);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btBuscarMouseClicked

    private void btEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEliminarMouseClicked
        //rsClientesBuscados
        if (rsClientesBuscados == null || listaClientes.getSelectedIndex() == -1) {
            return;
        }

        try {
            PreparedStatement pps = Conexion.getConnection().prepareStatement(""
                    + "DELETE FROM cliente WHERE serial = ?");

            pps.setObject(1, rsClientesBuscados.getInt("serial"));
            pps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Se ha eliminado el registro");
            btBuscarMouseClicked(null);
            btLimpiarMouseClicked(null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurido un error en la eliminacion de los datos");
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btEliminarMouseClicked

    private void listaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaClientesMouseClicked
        try {
            rsClientesBuscados.beforeFirst();
            for (int i = 0; i <= listaClientes.getSelectedIndex(); i++) {
                rsClientesBuscados.next();
            }

            if (rsClientesBuscados == null || listaClientes.getSelectedIndex() == -1) {
                return;
            }

            enableComponents(panelDatos, true);
            btLimpiarMouseClicked(null);
            btAgregar.setText("Modificar");

            tfTipoCliente.setEnabled(false);
            tfTipoCliente.setText(rsClientesBuscados.getInt("id_tcliente") == 1 ? "Empresa" : "Cliente");
            String tipoID = rsClientesBuscados.getString("cedula_rif");
            tfCedula.setText(tipoID.substring(1, tipoID.length() - 1));
            cbTipoId.setSelectedItem(tipoID.substring(0, 1));
            //tfRif.setText(rsClientesBuscados.getString("rif"));
            tfNombre.setText(rsClientesBuscados.getString("nombre_cliente"));
            tfApellido.setText(rsClientesBuscados.getString("apellido_cliente"));
            tfDireccion.setText(rsClientesBuscados.getString("domicilio_cliente"));
            tfEmial.setText(rsClientesBuscados.getString("email_cliente"));
            tfTelefono.setText(rsClientesBuscados.getString("tlf_cliente"));

        } catch (SQLException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listaClientesMouseClicked

    private void tfClienteBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfClienteBuscarKeyReleased
        btBuscarMouseClicked(null);
    }//GEN-LAST:event_tfClienteBuscarKeyReleased

    private void tfEmialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEmialKeyPressed

    }//GEN-LAST:event_tfEmialKeyPressed

    private void tfCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCedulaActionPerformed

    private void tfCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCedulaKeyReleased

    }//GEN-LAST:event_tfCedulaKeyReleased

    private void tfCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCedulaKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')) || tfCedula.getText().length() >=12) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tfCedulaKeyTyped

    private void tfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyTyped
       if (!Character.isWhitespace(evt.getKeyChar()) && !Character.isLetter(evt.getKeyChar())){
           getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tfNombreKeyTyped

    private void tfApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfApellidoKeyTyped
        if (!Character.isWhitespace(evt.getKeyChar()) && !Character.isLetter(evt.getKeyChar())){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tfApellidoKeyTyped

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
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JComboBox cbTipoId;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaClientes;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfCedula;
    private javax.swing.JTextField tfClienteBuscar;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfEmial;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JFormattedTextField tfTelefono;
    private javax.swing.JTextField tfTipoCliente;
    // End of variables declaration//GEN-END:variables
}
