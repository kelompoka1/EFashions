/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package efashion;

import efashion.featureadmin.regist_karyawan;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kitan
 */
public class FrameOwner extends javax.swing.JFrame {

    /**
     * Creates new form FrameOwner
     */
    public FrameOwner() {
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

        btn_reset = new javax.swing.JButton();
        btn_editdatasupplier = new javax.swing.JButton();
        btn_dashboard = new javax.swing.JButton();
        btn_daftarkaryawan1 = new javax.swing.JButton();
        btn_editstock = new javax.swing.JButton();
        btn_daftarsupplier1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_reset.setBackground(new java.awt.Color(255, 101, 132));
        btn_reset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_reset.setForeground(new java.awt.Color(255, 255, 255));
        btn_reset.setText("EDIT DATA KARYAWAN");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 230, 60));

        btn_editdatasupplier.setBackground(new java.awt.Color(255, 101, 132));
        btn_editdatasupplier.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_editdatasupplier.setForeground(new java.awt.Color(255, 255, 255));
        btn_editdatasupplier.setText("EDIT DATA SUPPLIER");
        btn_editdatasupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editdatasupplierActionPerformed(evt);
            }
        });
        getContentPane().add(btn_editdatasupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 230, 60));

        btn_dashboard.setBackground(new java.awt.Color(255, 101, 132));
        btn_dashboard.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_dashboard.setForeground(new java.awt.Color(255, 255, 255));
        btn_dashboard.setText("DASHBOARD");
        btn_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dashboardActionPerformed(evt);
            }
        });
        getContentPane().add(btn_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 230, 60));

        btn_daftarkaryawan1.setBackground(new java.awt.Color(255, 101, 132));
        btn_daftarkaryawan1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_daftarkaryawan1.setForeground(new java.awt.Color(255, 255, 255));
        btn_daftarkaryawan1.setText("DAFTAR KARYAWAN");
        btn_daftarkaryawan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_daftarkaryawan1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_daftarkaryawan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 230, 60));

        btn_editstock.setBackground(new java.awt.Color(255, 101, 132));
        btn_editstock.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_editstock.setForeground(new java.awt.Color(255, 255, 255));
        btn_editstock.setText("EDIT STOCK BARANG");
        btn_editstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editstockActionPerformed(evt);
            }
        });
        getContentPane().add(btn_editstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 230, 60));

        btn_daftarsupplier1.setBackground(new java.awt.Color(255, 101, 132));
        btn_daftarsupplier1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_daftarsupplier1.setForeground(new java.awt.Color(255, 255, 255));
        btn_daftarsupplier1.setText("DAFTAR SUPPLIER");
        btn_daftarsupplier1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_daftarsupplier1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_daftarsupplier1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 230, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/efashion/src/formowner.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dashboardActionPerformed

    private void btn_editdatasupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editdatasupplierActionPerformed
        try {
            this.setVisible(false);
            new efashion.featureadmin.editdelete_supplier().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrameOwner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_editdatasupplierActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        try {
            // TODO add your handling code here:
            new efashion.featureadmin.editdelete_karyawan().setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(FrameOwner.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_daftarkaryawan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_daftarkaryawan1ActionPerformed
        // TODO add your handling code here:   
       this.setVisible(false);
        try {
            new efashion.featureadmin.regist_karyawan().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrameOwner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_daftarkaryawan1ActionPerformed

    private void btn_editstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editstockActionPerformed
        this.setVisible(false);
        //stock frame
// TODO add your handling code here:
    }//GEN-LAST:event_btn_editstockActionPerformed

    private void btn_daftarsupplier1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_daftarsupplier1ActionPerformed
        // TODO add your handling code here
        this.setVisible(false);
       new efashion.featureadmin.regist_supplier().setVisible(true);
       
    }//GEN-LAST:event_btn_daftarsupplier1ActionPerformed

    private void delete(String query,String query2) throws SQLException{
        java.sql.Connection con = (Connection) koneksi.getConDB();
        java.sql.PreparedStatement prs = con.prepareStatement(query);
        if(prs.execute()){
          System.out.printf("%s%n","Eksekusi query berhasil");   
        } else{
            System.out.printf("%s%n","Ekesekusi query gagal");
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
            java.util.logging.Logger.getLogger(FrameOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameOwner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_daftarkaryawan1;
    private javax.swing.JButton btn_daftarsupplier1;
    private javax.swing.JButton btn_dashboard;
    private javax.swing.JButton btn_editdatasupplier;
    private javax.swing.JButton btn_editstock;
    private javax.swing.JButton btn_reset;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
