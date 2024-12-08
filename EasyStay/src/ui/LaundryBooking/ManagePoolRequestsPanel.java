/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.LaundryBooking;

import Business.EcoSystem;
import Business.Email.EmailNotification;
import Business.PaymentHistory.CustomerTransaction;
import Business.User.User;
import Business.WorkRequest.LaundryWorkRequest;
import Business.WorkRequest.PoolWorkRequest;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sushant
 */
public class ManagePoolRequestsPanel extends javax.swing.JPanel {
    EcoSystem system;

    /**
     * Creates new form ManageRequestsPanel
     */
    public ManagePoolRequestsPanel(EcoSystem system) {
        initComponents();
        
        this.system = system;
        populateLaundryRequestTable();
        formatRows();
        
    }
    
    public void populateLaundryRequestTable() {
        ArrayList<LaundryWorkRequest> pendingLaundryRequest = new ArrayList<LaundryWorkRequest>();
        ArrayList<LaundryWorkRequest> non_pendingLaundryRequest = new ArrayList<LaundryWorkRequest>();

        for (LaundryWorkRequest laundryWRequest : system.getLaundryWorkRequestDirectory().getLaundryWorkRequestList()) {
            if (laundryWRequest.getStatus().equals("Pending")) {
                pendingLaundryRequest.add(laundryWRequest);
            } else {
                non_pendingLaundryRequest.add(laundryWRequest);
            }
        }

        populate_based_on_status(pendingLaundryRequest, non_pendingLaundryRequest);
    }

    public void populate_based_on_status(ArrayList<LaundryWorkRequest> pendingLaundryRequest, ArrayList<LaundryWorkRequest> non_pendingLaundryRequest) {
        DefaultTableModel model = (DefaultTableModel) tblLaundryRequests.getModel();
        model.setRowCount(0);
        for (LaundryWorkRequest laundryWRequest : pendingLaundryRequest) {

            Object[] newRow = new Object[5];
            newRow[0] = laundryWRequest;
            newRow[1] = laundryWRequest.getLaundryDetails().getCategory();
            newRow[2] = laundryWRequest.getLaundryDetails().getPrice();
            newRow[3] = laundryWRequest.getNumberOfClothes();
            newRow[4] = laundryWRequest.getStatus();

            model.addRow(newRow);
        }

        DefaultTableModel modelNon_Pending = (DefaultTableModel) tblLaundryConfirmed.getModel();
        modelNon_Pending.setRowCount(0);
        for (LaundryWorkRequest laundryWRequest : non_pendingLaundryRequest) {

             Object[] newRow = new Object[6];
            newRow[0] = laundryWRequest;
            newRow[1] = laundryWRequest.getLaundryDetails().getCategory();
            newRow[2] = laundryWRequest.getLaundryDetails().getPrice();
            newRow[3] = laundryWRequest.getNumberOfClothes();
            newRow[4] = laundryWRequest.getStatus();

            modelNon_Pending.addRow(newRow);
        }
    }
    
    public void updateWorkRequestStatus(LaundryWorkRequest selectedLaundry, String status) {
        selectedLaundry.setStatus(status);
        int index = 0;
        for (LaundryWorkRequest laundryWRequest : system.getLaundryWorkRequestDirectory().getLaundryWorkRequestList()) {
            if (laundryWRequest.getUserId().equals(selectedLaundry.getUserId())) {
                system.getLaundryWorkRequestDirectory().updateLaundryWorkRequest(laundryWRequest, index);
                break;
            }
            index++;
        }
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
        tblLaundryRequests = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLaundryConfirmed = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 255, 204));

        tblLaundryRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "User ID", "Laundry Category", "Price", "No. of Clothes", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblLaundryRequests);

        jLabel1.setText("MANAGE REQUESTS");

        btnApprove.setText("APPROVE");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnReject.setText("REJECT");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        tblLaundryConfirmed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "User ID", "Laundry Category", "Price", "No. of Clothes", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblLaundryConfirmed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApprove)
                    .addComponent(btnReject))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
         try {
    // Step 1: Validate if a row is selected
    int selectedRowIndex = tblLaundryRequests.getSelectedRow();
    if (selectedRowIndex < 0) {
        JOptionPane.showMessageDialog(this, "Please select a row to approve.");
        return;
    }

    // Step 2: Retrieve the selected LaundryWorkRequest
    DefaultTableModel model = (DefaultTableModel) tblLaundryRequests.getModel();
    LaundryWorkRequest selectedLaundryWorkRequest = (LaundryWorkRequest) model.getValueAt(selectedRowIndex, 0);

    // Step 3: Check if the request is already processed
    if (!"Pending".equals(selectedLaundryWorkRequest.getStatus())) {
        JOptionPane.showMessageDialog(this, "This request has already been processed.");
        return;
    }

    // Step 4: Update the request status to "Approved"
    selectedLaundryWorkRequest.setStatus("Approved");

    // Step 5: Calculate the final price for the laundry transaction
    float laundryBookingFinalPrice = selectedLaundryWorkRequest.getNumberOfClothes() * selectedLaundryWorkRequest.getLaundryDetails().getPrice();

    // Step 6: Create a new CustomerTransaction
    CustomerTransaction ct = new CustomerTransaction();
    ct.setUserId(selectedLaundryWorkRequest.getUserId());
    ct.setFacilityUsed("Laundry booked for category - " 
                       + selectedLaundryWorkRequest.getLaundryDetails().getCategory() 
                       + " for " 
                       + selectedLaundryWorkRequest.getNumberOfClothes() 
                       + " clothes");
    ct.setPrice(laundryBookingFinalPrice);

    // Add the transaction to the system's directory
    system.getCustomerTransactionDirectory().addCustomerTransaction(ct);

    // Step 7: Send an email notification to the user
   

    // Step 8: Notify the admin and refresh the table
    JOptionPane.showMessageDialog(this, "Request approved successfully.");
    populateLaundryRequestTable(); // Refresh the table to show updated status
    formatRows(); // Reapply formatting for updated statuses

} catch (Exception e) {
    JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage());
    e.printStackTrace();
}
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
         try {
            int selectedRowIndex = tblLaundryRequests.getSelectedRow();
            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row to approve.");
                return;
            }
            DefaultTableModel model = (DefaultTableModel) tblLaundryRequests.getModel();
            LaundryWorkRequest selectedLaundryWorkRequest = (LaundryWorkRequest) model.getValueAt(selectedRowIndex, 0);
            updateWorkRequestStatus(selectedLaundryWorkRequest, "Rejected");
            JOptionPane.showMessageDialog(this, "Request rejected successfully");
            populateLaundryRequestTable();
            formatRows();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblLaundryConfirmed;
    private javax.swing.JTable tblLaundryRequests;
    // End of variables declaration//GEN-END:variables


    private void formatRows() {

        DefaultTableModel model = (DefaultTableModel) tblLaundryConfirmed.getModel();

        tblLaundryConfirmed.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                String status = String.valueOf(model.getValueAt(row, 4));
                c.setBackground(status.equals("Pending") ? Color.WHITE : status.equals("Approved") ? Color.GREEN : Color.RED);
                return c;
            }
        });

    }
}
