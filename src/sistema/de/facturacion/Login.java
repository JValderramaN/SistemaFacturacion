/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.facturacion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class Login extends javax.swing.JFrame {

    private ResultSet rs;
    private ResultSet rs2;
    String sql;
    public static UsuarioLogeado usr ;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();

        Conexion.createConexion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/llave 3.png"))); // NOI18N
        jLabel10.setToolTipText("Haga Clic  Para Continuar");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 110, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo43.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 130));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seguridad-candado2.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 200, 310));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/llabe.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 70, 80));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Clave");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 80, 20));

        jSeparator4.setBackground(new java.awt.Color(51, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(0, 51, 204));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setPreferredSize(new java.awt.Dimension(50, 20));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 30, 300));

        jSeparator3.setBackground(new java.awt.Color(51, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 51, 204));
        jSeparator3.setPreferredSize(new java.awt.Dimension(50, 20));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 460, 20));

        jSeparator2.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(255, 0, 51));
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 20));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 440, 20));

        jSeparator1.setBackground(new java.awt.Color(204, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 10, 340));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 90, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 250, 30));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 250, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/123.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 310, 190));

        jButton1.setText("crear usuario");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seguridad2.png"))); // NOI18N
        jLabel1.setText("Clave");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents
boolean Comprobaracceso(String valor, String valor2) {

        if (valor.equals("") || valor2.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe escribir que tipo de usuario es y una Clave");
            return false;
        } else {

            sql = "SELECT "
                    + "  usr.id_usuario, "
                    + "  usr.nombre_usuario, "
                    + "  usr.claveacceso, "
                    + "  descripcion_usuario, "
                    + "  cedula_usuario"
                    + " FROM "
                    + "  public.usuario usr"
                    + " WHERE usr.nombre_usuario = '" + valor + "' AND usr.claveacceso='" + valor2 + "'";

            try {
                Statement st = Conexion.getConnection().createStatement();
                rs = st.executeQuery(sql);
                if (rs.next()) {
                    usr  = new  UsuarioLogeado(
                                rs.getString("nombre_usuario"),
                                rs.getString("descripcion_usuario"),
                                rs.getString("cedula_usuario"), 
                                rs.getString("claveacceso"),
                                rs.getInt("id_usuario")
                    );
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Error de autentificacion. Existe mas de un usuario"
                                + " con esas credenciales");
                        return false;
                    } else {
                        JOptionPane.showMessageDialog(null, "Bienvenido");
                        
                        return true;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error de autentificacion. No Existe un usuario"
                            + " con esas credenciales");
                    return false;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }

        }

        
    }
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        if (!Comprobaracceso(jTextField1.getText(), jTextField2.getText())) {
            return;
        }

        dispose();
        menu Entrar = new menu();
        //continuar present = new continuar();
        Entrar.setTitle("Menù");//asigna titulo a la pantalla
        Entrar.setLocationRelativeTo(null);//centro la pantalla del vieo
        Entrar.setVisible(true);//ago visible la pantalla del video


    }//GEN-LAST:event_jLabel10MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        dispose();
        new Usuario().setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    class UsuarioLogeado {
        private String nombre;
        private String descripcion;
        private String cedula;
        private String clave;
        private int ID;

        public UsuarioLogeado(String nombre, String descripcion, String cedula, String clave,int ID) {
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.cedula = cedula;
            this.clave = clave;
            this.ID = ID;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getCedula() {
            return cedula;
        }

        public void setCedula(String cedula) {
            this.cedula = cedula;
        }

        public String getClave() {
            return clave;
        }

        public void setClave(String clave) {
            this.clave = clave;
        }
        
        
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
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
