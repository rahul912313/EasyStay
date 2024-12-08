/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Customer;

import Business.EcoSystem;
import Business.Enjoyments.Pool.Pool;
import Business.User.User;
import Business.WorkRequest.PoolWorkRequest;
import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.MutableComboBoxModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author RAHUL
 */
public class PoolBookingPanel extends javax.swing.JPanel {

    /**
     * Creates new form PoolBookingPanel
     */
    EcoSystem system;
    User user;
    private Image backgroundImage;


    public PoolBookingPanel(EcoSystem system, User user) {
        initComponents();
        

        this.system = system;
        this.user = user;
               
//        backgroundImage = new ImageIcon(getClass().getResource("/images/swimming-pool.jpg")).getImage();


        MutableComboBoxModel<String> model = new DefaultComboBoxModel<String>();
        

        for (Pool poolList : system.getPoolDirectory().getPoolDirectory()) {
            model.addElement(poolList.getPoolName());
        }

        choosePoolDropdown.setModel(model);

        poolNameTxt.setEditable(false);
        priceTxt.setEditable(false);

        populateRequestTable();
        formatRows();
    }
//    @Override
//        protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//
//        // Draw the background image, scaled to panel size
//        if (backgroundImage != null) {
//            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
//        }
//    }
//        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewPoolBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        priceTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        numberOfHoursTxt = new javax.swing.JTextField();
        bookPoolBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        poolWorkQueueTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        choosePoolDropdown = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        poolNameTxt = new javax.swing.JTextField();
        poolBookingDateTxt = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(204, 0, 255));
        setLayout(null);

        viewPoolBtn.setBackground(new java.awt.Color(0, 0, 0));
        viewPoolBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewPoolBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewPoolBtn.setText("View Details");
        viewPoolBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPoolBtnActionPerformed(evt);
            }
        });
        add(viewPoolBtn);
        viewPoolBtn.setBounds(990, 230, 130, 50);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Price per hour:");
        add(jLabel6);
        jLabel6.setBounds(290, 300, 130, 25);
        add(priceTxt);
        priceTxt.setBounds(460, 300, 160, 22);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Select Pool Booking Date:");
        add(jLabel7);
        jLabel7.setBounds(190, 250, 230, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Enter Number of Hours:");
        add(jLabel8);
        jLabel8.setBounds(210, 150, 210, 25);
        add(numberOfHoursTxt);
        numberOfHoursTxt.setBounds(460, 150, 160, 22);

        bookPoolBtn.setBackground(new java.awt.Color(0, 0, 0));
        bookPoolBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bookPoolBtn.setForeground(new java.awt.Color(255, 255, 255));
        bookPoolBtn.setText("Book Pool");
        bookPoolBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookPoolBtnActionPerformed(evt);
            }
        });
        add(bookPoolBtn);
        bookPoolBtn.setBounds(760, 230, 137, 50);

        poolWorkQueueTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        poolWorkQueueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pool Name", "Booking Date", "Price per hour", "Number of hours", "Total Price", "Request Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(poolWorkQueueTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(110, 450, 1170, 380);

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
        jLabel1.setText("Book A Swimming Pool");
        add(jLabel1);
        jLabel1.setBounds(550, 30, 380, 37);

        add(choosePoolDropdown);
        choosePoolDropdown.setBounds(1000, 150, 160, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Choose a pool of your choice:");
        add(jLabel2);
        jLabel2.setBounds(710, 150, 310, 20);

        jLabel9.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel9.setText("Pool Booking Status");
        add(jLabel9);
        jLabel9.setBounds(610, 390, 230, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Pool Name:");
        add(jLabel3);
        jLabel3.setBounds(310, 200, 120, 25);
        add(poolNameTxt);
        poolNameTxt.setBounds(460, 200, 160, 22);
        add(poolBookingDateTxt);
        poolBookingDateTxt.setBounds(460, 250, 160, 22);
    }// </editor-fold>//GEN-END:initComponents

    private void viewPoolBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPoolBtnActionPerformed
        // View Vehicle Details on choosing

        try {
            if (choosePoolDropdown.getSelectedItem() != null) {

                String poolName = String.valueOf(choosePoolDropdown.getSelectedItem());
                Pool poolDetails = system.getPoolDirectory().getPoolByName(poolName);

                poolNameTxt.setText(poolDetails.getPoolName());
                priceTxt.setText(String.valueOf(poolDetails.getPrice()));

            } else {
                JOptionPane.showMessageDialog(this, "Choose a valid Pool for booking");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Choose a valid Pool for booking");
        }
    }//GEN-LAST:event_viewPoolBtnActionPerformed

    private void bookPoolBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookPoolBtnActionPerformed
        // Book a vehicle after entering details
        PoolWorkRequest bookPool = new PoolWorkRequest();

        try {
            if (choosePoolDropdown.getSelectedItem() != null) {
                String poolName = String.valueOf(choosePoolDropdown.getSelectedItem());
                Pool poolDetails = system.getPoolDirectory().getPoolByName(poolName);

                Date selectedDate = poolBookingDateTxt.getDate();
                SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                String strDate = dateFormat.format(selectedDate);
                Date bookingDate = dateFormat.parse(strDate);

                int numberOfHours = Integer.parseInt(numberOfHoursTxt.getText());

                bookPool.setPoolDetails(poolDetails);
                bookPool.setBookingDate(bookingDate);
                bookPool.setNumberOfHours(numberOfHours);
                bookPool.setUserId(user.getUserId());
                bookPool.setStatus("Pending");

                system.getPoolWorkRequestDirectory().getPoolWorkRequestList().add(bookPool);

                JOptionPane.showMessageDialog(this, "Pool booking request sent to Manager");
                populateRequestTable();
                clearFields();
                formatRows();
                
            } else {
                JOptionPane.showMessageDialog(this, "Enter valid date and number of hours for booking a Pool");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Enter valid date and number of hours for booking a Pool");
        }
    }//GEN-LAST:event_bookPoolBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookPoolBtn;
    private javax.swing.JComboBox<String> choosePoolDropdown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField numberOfHoursTxt;
    private com.toedter.calendar.JDateChooser poolBookingDateTxt;
    private javax.swing.JTextField poolNameTxt;
    private javax.swing.JTable poolWorkQueueTable;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JButton viewPoolBtn;
    // End of variables declaration//GEN-END:variables

    private void populateRequestTable() {

        try {
            DefaultTableModel model = (DefaultTableModel) poolWorkQueueTable.getModel();
            model.setRowCount(0);

            for (PoolWorkRequest poolWorkRequest : system.getPoolWorkRequestDirectory().getPoolWorkRequestList()) {

                if (poolWorkRequest.getUserId().equals(user.getUserId())) {
                    Object[] newRow = new Object[6];
                    newRow[0] = poolWorkRequest.getPoolDetails().getPoolName();
                    newRow[1] = poolWorkRequest.getBookingDate();
                    newRow[2] = poolWorkRequest.getPoolDetails().getPrice();
                    newRow[3] = poolWorkRequest.getNumberOfHours();
                    newRow[4] = (poolWorkRequest.getPoolDetails().getPrice()*poolWorkRequest.getNumberOfHours());
                    newRow[5] = poolWorkRequest.getStatus();

                    model.addRow(newRow);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void clearFields() {
        
        poolNameTxt.setText("");
        priceTxt.setText("");
        numberOfHoursTxt.setText("");
        poolBookingDateTxt.setCalendar(null);
    }
    
    private void formatRows() {

        DefaultTableModel model = (DefaultTableModel) poolWorkQueueTable.getModel();

        poolWorkQueueTable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                String status = String.valueOf(model.getValueAt(row, 5));
                c.setBackground(status.equals("Pending") ? Color.WHITE : status.equals("Approved") ? Color.GREEN : Color.RED);
                return c;
            }
        });

    }
}
