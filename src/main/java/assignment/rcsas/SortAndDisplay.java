/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.rcsas;

/**
 *
 * @author Arshad Khalid (TP058473)
 */
public class SortAndDisplay extends javax.swing.JFrame {

    /**
     * Creates new form SortAndDisplay
     */
    public SortAndDisplay() {
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

        BackButton = new javax.swing.JButton();
        CoachNameAscendingButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        RateButton = new javax.swing.JButton();
        PerformanceButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        CoachNameAscendingButton.setText("Coach Name (Ascending)");
        CoachNameAscendingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoachNameAscendingButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 51, 0));
        jLabel3.setText("Sort and display Coaches by:");
        jLabel3.setToolTipText("");

        RateButton.setText("Hourly Pay (Ascending)");
        RateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RateButtonActionPerformed(evt);
            }
        });

        PerformanceButton.setText("Overall Performance (Ascending)");
        PerformanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerformanceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(BackButton)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PerformanceButton)
                    .addComponent(CoachNameAscendingButton)
                    .addComponent(RateButton))
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(CoachNameAscendingButton)
                .addGap(18, 18, 18)
                .addComponent(RateButton)
                .addGap(18, 18, 18)
                .addComponent(PerformanceButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(BackButton)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        AdminFeatures af=new AdminFeatures();
        af.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void CoachNameAscendingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoachNameAscendingButtonActionPerformed
        // TODO add your handling code here:
        SortAndDisplayCoachName sadcn=new SortAndDisplayCoachName();
        sadcn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CoachNameAscendingButtonActionPerformed

    private void RateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RateButtonActionPerformed
        // TODO add your handling code here:
        SortAndDisplayCoachPay sadcp=new SortAndDisplayCoachPay();
        sadcp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RateButtonActionPerformed

    private void PerformanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerformanceButtonActionPerformed
        // TODO add your handling code here:
        SortAndDisplayCoachPerformance sadcp=new SortAndDisplayCoachPerformance();
        sadcp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PerformanceButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SortAndDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortAndDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortAndDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortAndDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortAndDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton CoachNameAscendingButton;
    private javax.swing.JButton PerformanceButton;
    private javax.swing.JButton RateButton;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
