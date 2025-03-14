/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.FoodandBev;

import Business.EcoSystem;
import Business.Email.EmailNotification;
import Business.FoodandBev.Menu.FoodBevItem;
import Business.PaymentHistory.CustomerTransaction;
import Business.User.User;
import Business.WorkRequest.FoodBevWorkRequest;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rushang 
 */
public class WorkRequest extends javax.swing.JPanel {

    private EcoSystem system;
    float totalPrice;

    /**
     * Creates new form WorkRequest
     */
    public WorkRequest(EcoSystem system) {
        initComponents();
        this.system = system;
        populateWorkRequestTable();
        formatRows();
    }

    public void populateWorkRequestTable() {
        ArrayList<FoodBevWorkRequest> pendingFoodBevRequest = new ArrayList<FoodBevWorkRequest>();
        ArrayList<FoodBevWorkRequest> non_pendingFoodBevRequest = new ArrayList<FoodBevWorkRequest>();

        for (FoodBevWorkRequest foodBevWorkRequest : system.getFoodBevWorkRequestDirectory().getFoodBevWorkRequestList()) {
            if (foodBevWorkRequest.getStatus().equals("Pending")) {
                pendingFoodBevRequest.add(foodBevWorkRequest);
            } else {
                non_pendingFoodBevRequest.add(foodBevWorkRequest);
            }
        }

        populate_based_on_status(pendingFoodBevRequest, non_pendingFoodBevRequest);
    }

    public void populate_based_on_status(ArrayList<FoodBevWorkRequest> pendingFoodBevRequest, ArrayList<FoodBevWorkRequest> non_pendingFoodBevRequest) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        for (FoodBevWorkRequest pfbr : pendingFoodBevRequest) {
            ArrayList<String> foodItemNames = new ArrayList<String>();
            long foodItemsTotalPrice = 0;
            for (FoodBevItem fb : pfbr.getFbItemDetails()) {
                foodItemNames.add(fb.getFbName());
                foodItemsTotalPrice += fb.getPrice();
            }
            totalPrice = foodItemsTotalPrice;
            Object[] newRow = new Object[4];
            newRow[0] = pfbr;
            newRow[1] = foodItemNames.toString().replace("[", "").replace("]", "");
            newRow[2] = foodItemsTotalPrice;
            newRow[3] = pfbr.getStatus();
            model.addRow(newRow);
        }

        DefaultTableModel modelNon_Pending = (DefaultTableModel) jTable2.getModel();
        modelNon_Pending.setRowCount(0);

        for (FoodBevWorkRequest pfbr : non_pendingFoodBevRequest) {
            ArrayList<String> foodItemNames = new ArrayList<String>();
            long foodItemsTotalPrice = 0;
            for (FoodBevItem fb : pfbr.getFbItemDetails()) {
                foodItemNames.add(fb.getFbName());
                foodItemsTotalPrice += fb.getPrice();
            }
            Object[] newRow = new Object[4];
            newRow[0] = pfbr;
            newRow[1] = foodItemNames.toString().replace("[", "").replace("]", "");
            newRow[2] = foodItemsTotalPrice;
            newRow[3] = pfbr.getStatus();
            modelNon_Pending.addRow(newRow);
        }
    }

    void updateWorkRequestStatus(FoodBevWorkRequest selectedFoodBevWorkRequest, String status) {
        selectedFoodBevWorkRequest.setStatus(status);
        int index = 0;
        for (FoodBevWorkRequest fbr : system.getFoodBevWorkRequestDirectory().getFoodBevWorkRequestList()) {
            if (fbr.getUserId().equals(selectedFoodBevWorkRequest.getUserId())) {
                system.getFoodBevWorkRequestDirectory().updateFoodBevWorkRequest(fbr, index);
                break;
            }
            index++;
        }
    }

    private void formatRows() {

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

        jTable2.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                String status = String.valueOf(model.getValueAt(row, 3));
                c.setBackground(status.equals("Pending") ? Color.WHITE : status.equals("Approved") ? Color.GREEN : Color.RED);
                return c;
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 102, 255));
        setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "UserId", "Item Details", "Total Price", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(19, 46, 933, 163);

        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove);
        btnApprove.setBounds(238, 242, 79, 23);

        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject);
        btnReject.setBounds(335, 242, 72, 23);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "UserId", "Item Details", "Total Price", "Status"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2);
        jScrollPane2.setBounds(19, 305, 933, 182);
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRowIndex = jTable1.getSelectedRow();
            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row to approve.");
                return;
            }
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            FoodBevWorkRequest selectedFoodBevWorkRequest = (FoodBevWorkRequest) model.getValueAt(selectedRowIndex, 0);
            updateWorkRequestStatus(selectedFoodBevWorkRequest, "Approved");
            CustomerTransaction ct = new CustomerTransaction();
            ct.setUserId(selectedFoodBevWorkRequest.getUserId());
            ct.setFacilityUsed("Food&Beverage");
            ct.setPrice(totalPrice);
            system.getCustomerTransactionDirectory().addCustomerTransaction(ct);
            User getUser = system.getUserDirectory().getUserById(selectedFoodBevWorkRequest.getUserId());
            new EmailNotification().SendEmailOfNotification(getUser, "Food and Beverage");
            JOptionPane.showMessageDialog(this, "Request approved successfully and email notification sent");
            populateWorkRequestTable();
            formatRows();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRowIndex = jTable1.getSelectedRow();
            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row to reject.");
                return;
            }
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            FoodBevWorkRequest selectedFoodBevWorkRequest = (FoodBevWorkRequest) model.getValueAt(selectedRowIndex, 0);
            updateWorkRequestStatus(selectedFoodBevWorkRequest, "Rejected");
            JOptionPane.showMessageDialog(this, "Order rejected successfully");
            populateWorkRequestTable();
            formatRows();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnReject;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
