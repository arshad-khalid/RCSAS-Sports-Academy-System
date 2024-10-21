package assignment.rcsas;
public class AddRecords extends javax.swing.JFrame {

    public AddRecords() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        AddCoachRecordButton = new javax.swing.JButton();
        AddSportRecordButton = new javax.swing.JButton();
        AddScheduleRecordButton = new javax.swing.JButton();
        AddRecordBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setText("Add new record of: ");

        AddCoachRecordButton.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        AddCoachRecordButton.setText("Coach");
        AddCoachRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCoachRecordButtonActionPerformed(evt);
            }
        });

        AddSportRecordButton.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        AddSportRecordButton.setText("Sport");
        AddSportRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSportRecordButtonActionPerformed(evt);
            }
        });

        AddScheduleRecordButton.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        AddScheduleRecordButton.setText("Schedule");
        AddScheduleRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddScheduleRecordButtonActionPerformed(evt);
            }
        });

        AddRecordBackButton.setText("Back");
        AddRecordBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRecordBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AddRecordBackButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AddCoachRecordButton)
                                .addGap(18, 18, 18)
                                .addComponent(AddSportRecordButton)
                                .addGap(18, 18, 18)
                                .addComponent(AddScheduleRecordButton)))
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddCoachRecordButton)
                    .addComponent(AddSportRecordButton)
                    .addComponent(AddScheduleRecordButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(AddRecordBackButton)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddScheduleRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddScheduleRecordButtonActionPerformed

        Schedule s= new Schedule();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddScheduleRecordButtonActionPerformed

    private void AddRecordBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRecordBackButtonActionPerformed
        //setting true so a new window shows up
        //setting false so that the current window disappers
        AdminFeatures af= new AdminFeatures();
        af.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddRecordBackButtonActionPerformed

    private void AddCoachRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCoachRecordButtonActionPerformed
        
        CoachRecords cr=new CoachRecords();
        cr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddCoachRecordButtonActionPerformed

    private void AddSportRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSportRecordButtonActionPerformed
        
        SportRecord sr= new SportRecord();
        sr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddSportRecordButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRecords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCoachRecordButton;
    private javax.swing.JButton AddRecordBackButton;
    private javax.swing.JButton AddScheduleRecordButton;
    private javax.swing.JButton AddSportRecordButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
