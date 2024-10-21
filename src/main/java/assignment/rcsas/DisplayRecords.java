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
public class DisplayRecords extends javax.swing.JFrame {

    /**
     * Creates new form DisplayRecords
     */
    public DisplayRecords() {
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

        Heading = new javax.swing.JLabel();
        DisplayCoachButton = new javax.swing.JButton();
        DisplaySportButton = new javax.swing.JButton();
        DisplayRegStudentButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Heading.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 153, 153));
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("Display Records of: ");
        Heading.setToolTipText("");

        DisplayCoachButton.setText("Coach");
        DisplayCoachButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayCoachButtonActionPerformed(evt);
            }
        });

        DisplaySportButton.setText("Sport");
        DisplaySportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplaySportButtonActionPerformed(evt);
            }
        });

        DisplayRegStudentButton.setText("Registered Student");
        DisplayRegStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayRegStudentButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(BackButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(DisplayCoachButton)
                        .addGap(34, 34, 34)
                        .addComponent(DisplaySportButton)
                        .addGap(30, 30, 30)
                        .addComponent(DisplayRegStudentButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(Heading)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Heading)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DisplayCoachButton)
                    .addComponent(DisplaySportButton)
                    .addComponent(DisplayRegStudentButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(BackButton)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DisplayCoachButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayCoachButtonActionPerformed
        // TODO add your handling code here:
        DisplayCoachRecords dcr=new DisplayCoachRecords();
        dcr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DisplayCoachButtonActionPerformed

    private void DisplaySportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplaySportButtonActionPerformed
        // TODO add your handling code here:
        DisplaySportRecords dsr= new DisplaySportRecords();
        dsr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DisplaySportButtonActionPerformed

    private void DisplayRegStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayRegStudentButtonActionPerformed
        // TODO add your handling code here:
        DisplayRegisteredStudentRecords drsr=new DisplayRegisteredStudentRecords();
        drsr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DisplayRegStudentButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        AdminFeatures af=new AdminFeatures();
        af.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayRecords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton DisplayCoachButton;
    private javax.swing.JButton DisplayRegStudentButton;
    private javax.swing.JButton DisplaySportButton;
    private javax.swing.JLabel Heading;
    // End of variables declaration//GEN-END:variables
}
