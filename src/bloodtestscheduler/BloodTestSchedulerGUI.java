/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloodtestscheduler;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


/**
 *
 * @author tombr
 */
public class BloodTestSchedulerGUI extends javax.swing.JFrame {
    Patient plist[];
    private int count;
    private DefaultListModel<String> queueModel;
    private ButtonGroup PriorityButtons;
    private ButtonGroup WardButtons;
    /**
     * Creates new form BloodTestSchedulerGUI
     */
    public BloodTestSchedulerGUI() {
        initComponents();
        plist = new Patient[5];
        count = 0;
        
        PriorityButtons = new ButtonGroup();
        
        PriorityButtons.add(UrgentRB);
        PriorityButtons.add(MediumRB);
        PriorityButtons.add(LowRB);
        
        WardButtons = new ButtonGroup();
        
        WardButtons.add(wardRB);
        WardButtons.add(noWardRB);
    }
    
    //This will update the Queue JList when a name is added.
    private void updateQueueList(){
        DefaultListModel<String> listModel = new DefaultListModel<>();
        
        for (int i = 0; i < count; i++){
            listModel.addElement(plist[i].getName());
            listModel.addElement(String.valueOf(plist[i].getAge()));
            listModel.addElement(plist[i].getGPDetails());
            
        }
        
        queueLST.setModel(listModel);
    }
    
    //This will reset the form fields when a name is added.
    private void resetFormFields(){
        patientNameTF.setText("");
        patientAgeTF.setText("");
        GPDetailsTF.setText("");
        
        PriorityButtons.clearSelection();
        WardButtons.clearSelection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bloodTestSchedulerLBL = new javax.swing.JLabel();
        patientNameLBL = new javax.swing.JLabel();
        patientNameTF = new javax.swing.JTextField();
        patientAgeLBL = new javax.swing.JLabel();
        patientAgeTF = new javax.swing.JTextField();
        GPDetailsLBL = new javax.swing.JLabel();
        GPDetailsTF = new javax.swing.JTextField();
        UrgentRB = new javax.swing.JRadioButton();
        MediumRB = new javax.swing.JRadioButton();
        LowRB = new javax.swing.JRadioButton();
        wardRB = new javax.swing.JRadioButton();
        noWardRB = new javax.swing.JRadioButton();
        addPatientBTN = new javax.swing.JButton();
        nextPatientBTN = new javax.swing.JButton();
        NoShowListBTN = new javax.swing.JButton();
        exitBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        queueLST = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        noShowLST = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 51));

        bloodTestSchedulerLBL.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        bloodTestSchedulerLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bloodTestSchedulerLBL.setText("Blood Test Scheduler");

        patientNameLBL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        patientNameLBL.setText("Patient Name:");

        patientNameTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        patientNameTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        patientNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientNameTFActionPerformed(evt);
            }
        });

        patientAgeLBL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        patientAgeLBL.setText("Patient Age:");

        patientAgeTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        patientAgeTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        GPDetailsLBL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        GPDetailsLBL.setText("GP Details:");

        GPDetailsTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        GPDetailsTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        GPDetailsTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GPDetailsTFActionPerformed(evt);
            }
        });

        UrgentRB.setBackground(new java.awt.Color(102, 255, 51));
        UrgentRB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        UrgentRB.setText("Urgent");
        UrgentRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UrgentRBActionPerformed(evt);
            }
        });

        MediumRB.setBackground(new java.awt.Color(102, 255, 51));
        MediumRB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MediumRB.setText("Medium");

        LowRB.setBackground(new java.awt.Color(102, 255, 51));
        LowRB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LowRB.setText("Low");

        wardRB.setBackground(new java.awt.Color(102, 255, 51));
        wardRB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        wardRB.setText("Ward");
        wardRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wardRBActionPerformed(evt);
            }
        });

        noWardRB.setBackground(new java.awt.Color(102, 255, 51));
        noWardRB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        noWardRB.setText("No Ward");

        addPatientBTN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addPatientBTN.setText("Add Patient");
        addPatientBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientBTNActionPerformed(evt);
            }
        });

        nextPatientBTN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nextPatientBTN.setText("Next Patient");
        nextPatientBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPatientBTNActionPerformed(evt);
            }
        });

        NoShowListBTN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NoShowListBTN.setText("No Show List");
        NoShowListBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoShowListBTNActionPerformed(evt);
            }
        });

        exitBTN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        exitBTN.setText("Exit");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(queueLST);

        jScrollPane2.setViewportView(noShowLST);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(wardRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(noWardRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(GPDetailsLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(patientNameLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(patientAgeLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UrgentRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(patientNameTF)
                                            .addComponent(patientAgeTF, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                            .addComponent(GPDetailsTF)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addComponent(MediumRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                                        .addComponent(LowRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(NoShowListBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(addPatientBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nextPatientBTN)))
                        .addGap(131, 131, 131))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(bloodTestSchedulerLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bloodTestSchedulerLBL)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientNameLBL)
                            .addComponent(patientNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientAgeLBL)
                            .addComponent(patientAgeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GPDetailsLBL)
                            .addComponent(GPDetailsTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UrgentRB)
                            .addComponent(MediumRB)
                            .addComponent(LowRB))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wardRB)
                            .addComponent(noWardRB))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addPatientBTN)
                            .addComponent(nextPatientBTN))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NoShowListBTN)
                            .addComponent(exitBTN))
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GPDetailsTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GPDetailsTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GPDetailsTFActionPerformed

    private void UrgentRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UrgentRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UrgentRBActionPerformed

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBTNActionPerformed

    private void addPatientBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientBTNActionPerformed
        // TODO add your handling code here:
        String name = patientNameTF.getText().trim();
        int age = Integer.parseInt(patientAgeTF.getText());
        String GPDetails = GPDetailsTF.getText();
        
        //This is the default value for Priority
        int priority = 1;
        
        //This allows the user to select whatever Priority radio button they want to
        if(UrgentRB.isSelected()) {
            priority = 2;
        } else if (MediumRB.isSelected()) {
            priority = 1;
        } else if (LowRB.isSelected()) {
            priority = 0;
        }
        
        //This is the default value for ward
        boolean fromWard = false;
        
        //This allows the user to select whatever Ward radio button they want to
        if(wardRB.isSelected()) {
            fromWard = true;
        } else if (noWardRB.isSelected()) {
            fromWard = false;
        }
        
        Patient tempP = new Patient(name, age, GPDetails, priority, fromWard);
        if(count < plist.length){
            plist[count++] = tempP;
            updateQueueList();
            
            resetFormFields();
        } else {
            JOptionPane.showMessageDialog(this, "Queue is full!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_addPatientBTNActionPerformed

    private void patientNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientNameTFActionPerformed

    private void wardRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wardRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wardRBActionPerformed

    private void NoShowListBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoShowListBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoShowListBTNActionPerformed

    private void nextPatientBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPatientBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextPatientBTNActionPerformed

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
            java.util.logging.Logger.getLogger(BloodTestSchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodTestSchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodTestSchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodTestSchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodTestSchedulerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GPDetailsLBL;
    private javax.swing.JTextField GPDetailsTF;
    private javax.swing.JRadioButton LowRB;
    private javax.swing.JRadioButton MediumRB;
    private javax.swing.JButton NoShowListBTN;
    private javax.swing.JRadioButton UrgentRB;
    private javax.swing.JButton addPatientBTN;
    private javax.swing.JLabel bloodTestSchedulerLBL;
    private javax.swing.JButton exitBTN;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton nextPatientBTN;
    private javax.swing.JList<String> noShowLST;
    private javax.swing.JRadioButton noWardRB;
    private javax.swing.JLabel patientAgeLBL;
    private javax.swing.JTextField patientAgeTF;
    private javax.swing.JLabel patientNameLBL;
    private javax.swing.JTextField patientNameTF;
    private javax.swing.JList<String> queueLST;
    private javax.swing.JRadioButton wardRB;
    // End of variables declaration//GEN-END:variables
}
