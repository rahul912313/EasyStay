/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.VehicleBooking;

import Business.EcoSystem;
import javax.swing.JOptionPane;

/**
 *
 * @author Sushant
 * 
 */
public class BookVehiclePanel extends javax.swing.JPanel {
    private EcoSystem system;

    /**
     * Creates new form BookVehicle
     */
    public BookVehiclePanel(EcoSystem system) {
        initComponents();
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        buttonPanel = new javax.swing.JPanel();
        btnManageVehicle = new javax.swing.JButton();
        btnRequestQueue = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        buttonPanel.setBackground(new java.awt.Color(204, 102, 255));

        btnManageVehicle.setBackground(new java.awt.Color(0, 0, 0));
        btnManageVehicle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnManageVehicle.setForeground(new java.awt.Color(255, 255, 255));
        btnManageVehicle.setText("MANAGE FLEET");
        btnManageVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageVehicleActionPerformed(evt);
            }
        });

        btnRequestQueue.setBackground(new java.awt.Color(0, 0, 0));
        btnRequestQueue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRequestQueue.setForeground(new java.awt.Color(255, 255, 255));
        btnRequestQueue.setText("MANAGE REQUESTS");
        btnRequestQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestQueueActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(0, 0, 0));
        btnHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("HOME");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRequestQueue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageVehicle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(btnManageVehicle)
                .addGap(18, 18, 18)
                .addComponent(btnRequestQueue)
                .addGap(18, 18, 18)
                .addComponent(btnHome)
                .addContainerGap(417, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(buttonPanel);

        jPanel1.setBackground(new java.awt.Color(204, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        try {
            HomeVehiclePanel homeVehiclePanel = new HomeVehiclePanel();
            jSplitPane1.setRightComponent(homeVehiclePanel);
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnRequestQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestQueueActionPerformed
        // TODO add your handling code here:
        try {
            ManageVehicleRequestsPanel manageRequestsPanel = new ManageVehicleRequestsPanel(system);
            jSplitPane1.setRightComponent(manageRequestsPanel);
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_btnRequestQueueActionPerformed

    private void btnManageVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageVehicleActionPerformed
        // TODO add your handling code here:
        try {
            ManageVehiclePanel managevehiclePanel = new ManageVehiclePanel(system);
            jSplitPane1.setRightComponent(managevehiclePanel);
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnManageVehicleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnManageVehicle;
    private javax.swing.JButton btnRequestQueue;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
