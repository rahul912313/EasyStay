/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PoolBooking;

import Business.EcoSystem;
import Business.Recreation.PoolFacility.Pool;
import Business.Transportation.VehicleBooking.Vehicle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rushang
 */
public class ManagePoolPanel extends javax.swing.JPanel {
    private EcoSystem system;
    
    String mainValidationString = "";
    String validationString1 = "";
    String validationString2 = "";

    /**
     * Creates new form ManagePoolPanel
     */
    public ManagePoolPanel(EcoSystem system) {
        initComponents();
        this.system = system;
        
        populateTable();
    }
    
    private void resetPoolData() {
        txtPoolName.setText("");
        txtPrice.setText("");
    }
    
    public boolean areDataFieldsEmpty() {
        validationString1 = "";
        if (txtPoolName.getText().isEmpty()) {
            validationString1 += "Pool Name, ";
        }
       
        if (txtPrice.getText() == null) {
            validationString1 += "Price per hour, ";
        }
        
        return isNotValid(validationString1);
    }

    public boolean areDataTypesCorrect() {
        validationString2 = "";
        if (!validateFloatDataType(txtPrice.getText())) {
            validationString2 += "Price, ";
        }
        return isNotValid(validationString2);
    }

    public boolean isNotValid(String str) {
        if (str.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validateFloatDataType(String str) {
        try {
            Float.parseFloat(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public void validationErrorMessagesDialog(boolean validation1, boolean validation2) {
        if (validation1) {
            mainValidationString = validationString1;
            JOptionPane.showMessageDialog(this, "Please update the data for these fields: " + mainValidationString);
        } else if (validation2) {
            mainValidationString = validationString2;
            JOptionPane.showMessageDialog(this, "Please enter only numbers for these fields: " + mainValidationString);
        }
    }
    
    private boolean poolDetailsExistence() {
        String poolName = txtPoolName.getText();
        boolean exist = false;
            for (Pool pool : system.getPoolDirectory().getPoolDirectory() ) {
                if (poolName.equals(pool.getPoolName())) {
                    exist = true;
                    break;
                }
            }
        return exist;
    }
    
     private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblPool.getModel();

        model.setRowCount(0);

        for (Pool pool : system.getPoolDirectory().getPoolDirectory()) {
            Object[] row = new Object[2];

            row[0] = pool;
            row[1] = pool.getPrice();

            model.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPool = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtPoolName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 102, 255));
        setPreferredSize(new java.awt.Dimension(827, 777));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE POOLS");
        add(jLabel1);
        jLabel1.setBounds(646, 16, 199, 30);

        tblPool.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Pool Name", "Price per hour"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPool);

        add(jScrollPane1);
        jScrollPane1.setBounds(245, 90, 1039, 394);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Pool Name");
        add(jLabel2);
        jLabel2.setBounds(555, 518, 161, 22);
        add(txtPoolName);
        txtPoolName.setBounds(871, 522, 176, 23);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Price per hour ($)");
        add(jLabel3);
        jLabel3.setBounds(555, 567, 170, 22);
        add(txtPrice);
        txtPrice.setBounds(871, 571, 176, 23);

        btnAdd.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("ADD");
        btnAdd.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd);
        btnAdd.setBounds(333, 639, 104, 51);

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(552, 639, 104, 51);

        btnView.setBackground(new java.awt.Color(0, 0, 0));
        btnView.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("VIEW");
        btnView.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView);
        btnView.setBounds(788, 639, 104, 51);

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(997, 639, 104, 51);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        try {
            boolean validation1 = areDataFieldsEmpty();
            boolean validation2 = areDataTypesCorrect();

            if (!validation1 && !validation2) {
                String poolName = txtPoolName.getText();
                Float price = Float.parseFloat(txtPrice.getText());

                if (!poolDetailsExistence()) {
                    Pool pool = system.getPoolDirectory().addPoolDetails();
                    pool.setPoolName(poolName);
                    pool.setPrice(price);

                    JOptionPane.showMessageDialog(this, "Pool name- " + poolName + " added");
                    resetPoolData();
                    populateTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Pool details already exists with the Pool Name"
                            + " : " + poolName);
                }
            } else {
                validationErrorMessagesDialog(validation1, validation2);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRowIndex = tblPool.getSelectedRow();

            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row for deletion");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) tblPool.getModel();
            Pool selectedPool = (Pool) model.getValueAt(selectedRowIndex, 0);

            system.getPoolDirectory().deletePool(selectedPool);

            JOptionPane.showMessageDialog(this, "Pool Deleted");

            populateTable();
            resetPoolData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRowIndex = tblPool.getSelectedRow();

            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row for viewing");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) tblPool.getModel();
            Pool selectedPool = (Pool) model.getValueAt(selectedRowIndex, 0);

            txtPoolName.setText(selectedPool.getPoolName());
            txtPrice.setText(String.valueOf(selectedPool.getPrice()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
         try {
            DefaultTableModel model = (DefaultTableModel) tblPool.getModel();

            if (tblPool.getSelectedRowCount() == 1) {

                String poolName = txtPoolName.getText();
                float price = Float.parseFloat(txtPrice.getText());

                int selectedRowIndex = tblPool.getSelectedRow();
                Pool pool = system.getPoolDirectory().getPools(selectedRowIndex);

                pool.setPoolName(poolName);
                pool.setPrice(price);

                populateTable();
                resetPoolData();

                JOptionPane.showMessageDialog(this, "Update successful!");
            } else if (tblPool.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table is empty");
            } else {
                JOptionPane.showMessageDialog(this, "Please select single row");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPool;
    private javax.swing.JTextField txtPoolName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
