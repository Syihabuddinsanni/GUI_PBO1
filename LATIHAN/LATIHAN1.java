/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LATIHAN;

/**
 *
 * @author Asus
 */
public class LATIHAN1 extends javax.swing.JFrame {

    /**
     * Creates new form LATIHAN1
     */
    public LATIHAN1() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Nama1 = new javax.swing.JTextField();
        Kelas1 = new javax.swing.JTextField();
        Alamat1 = new javax.swing.JTextField();
        Oke = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("-- FORMULIR --");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 30, 140, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nama ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 70, 190, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Kelas ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 100, 150, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Alamat");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 140, 160, 40);

        Nama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nama1ActionPerformed(evt);
            }
        });
        getContentPane().add(Nama1);
        Nama1.setBounds(100, 70, 210, 30);
        getContentPane().add(Kelas1);
        Kelas1.setBounds(100, 110, 210, 30);
        getContentPane().add(Alamat1);
        Alamat1.setBounds(100, 150, 210, 30);

        Oke.setText("OKE");
        Oke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkeActionPerformed(evt);
            }
        });
        getContentPane().add(Oke);
        Oke.setBounds(130, 200, 150, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Nama");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 250, 150, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Kelas");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 290, 140, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Alamat");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 330, 170, 40);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(100, 260, 210, 30);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(100, 300, 210, 30);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(100, 340, 210, 30);

        setBounds(0, 0, 416, 464);
    }// </editor-fold>//GEN-END:initComponents

    private void Nama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nama1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nama1ActionPerformed

    private void OkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkeActionPerformed
            String nama = Nama1.getText();
            Nama1.setText(nama);
            String kelas = Kelas1.getText();
            Kelas1.setText(kelas);
            String alamat = Alamat1.getText();
            Alamat1.setText(alamat);
            
    }//GEN-LAST:event_OkeActionPerformed

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
            java.util.logging.Logger.getLogger(LATIHAN1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LATIHAN1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LATIHAN1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LATIHAN1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LATIHAN1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat1;
    private javax.swing.JTextField Kelas1;
    private javax.swing.JTextField Nama1;
    private javax.swing.JButton Oke;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
