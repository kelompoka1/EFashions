/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package efashion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author kitan
 */
public class LoginEfashion extends javax.swing.JFrame {

    /**dasd
     * Creates new form LoginEfashion
     */
    public LoginEfashion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_masuk = new javax.swing.JButton();
        txt_password = new javax.swing.JTextField();
        txt_username1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_masuk.setBackground(new java.awt.Color(255, 101, 132));
        btn_masuk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_masuk.setForeground(new java.awt.Color(255, 255, 255));
        btn_masuk.setBorder(null);
        btn_masuk.setText("MASUK");
        btn_masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masukActionPerformed(evt);
            }
        });
        getContentPane().add(btn_masuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 200, 50));

        txt_password.setBackground(new java.awt.Color(229, 229, 229));
        txt_password.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_password.setBorder(null);
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 260, 40));

        txt_username1.setBackground(new java.awt.Color(234, 234, 234));
        txt_username1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_username1.setBorder(null);
        txt_username1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_username1ActionPerformed(evt);
            }
        });
        getContentPane().add(txt_username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 260, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/efashion/src/loginformbaru.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 584));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void loginApp() throws SQLException{
        String query = "SELECT `login`.`username`,`login`.`password`,`karyawan`.`nama_krywn`,`karyawan`.`type` FROM `login` JOIN `karyawan` ON `karyawan`.`idkrywn` = `login`.`idkrywn`";         
        java.sql.Connection conn = (Connection)koneksi.getConDB();
            java.sql.Statement statementObj = conn.createStatement();
            java.sql.ResultSet rs = statementObj.executeQuery(query);
            int t = 0; 
            while(rs.next()){
                if(rs.getString("username").equals(txt_username1.getText()) &&
                        rs.getString("password").equals(txt_password.getText())){
                        if(rs.getString("type").equals("Bos")){
                            System.out.printf("%s%n","Switch to owner frame");
                            new FrameOwner().setVisible(true);
                            this.setVisible(false);
                        
                        } else{
                            System.out.printf("%s%n","Switch to member frame ");
                }
            }
            }
    }
    private void txt_username1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_username1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_username1ActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void btn_masukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masukActionPerformed
        try {
            // TODO add your handling code here:
            loginApp();
        } catch (SQLException ex) {
            Logger.getLogger(LoginEfashion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_masukActionPerformed

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
            java.util.logging.Logger.getLogger(LoginEfashion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginEfashion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginEfashion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginEfashion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginEfashion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_masuk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_username1;
    // End of variables declaration//GEN-END:variables
}