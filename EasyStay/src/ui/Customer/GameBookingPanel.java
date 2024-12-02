/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Customer;

import Business.EcoSystem;
import Business.Enjoyments.Gaming.Game;
import Business.User.User;
import Business.WorkRequest.GameWorkRequest;
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
public class GameBookingPanel extends javax.swing.JPanel {

    /**
     * Creates new form GameBookingPanel
     */
    private Image backgroundImage;

    EcoSystem system;
    User user;

    public GameBookingPanel(EcoSystem system, User user) {
        initComponents();
        
        this.system = system;
        this.user = user;
        
        backgroundImage = new ImageIcon(getClass().getResource("/images/game-zone.jpeg")).getImage();

        
        MutableComboBoxModel<String> model = new DefaultComboBoxModel<String>();

        for (Game gameList : system.getGameDirectory().getGameDirectory()) {
            model.addElement(gameList.getGameName());
        }

        chooseGameDropdown.setModel(model);

        gameNameTxt.setEditable(false);
        gameCategoryTxt.setEditable(false);
        priceTxt.setEditable(false);

        populateRequestTable();
        formatRows();
    }
    
     @Override
        protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the background image, scaled to panel size
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
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

        viewGameBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        priceTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        numberOfHoursTxt = new javax.swing.JTextField();
        bookGameBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        gameWorkQueueTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        chooseGameDropdown = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        gameNameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        gameCategoryTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        gameBookingDateTxt = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(204, 102, 255));
        setLayout(null);

        viewGameBtn.setText("View Details");
        viewGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewGameBtnActionPerformed(evt);
            }
        });
        add(viewGameBtn);
        viewGameBtn.setBounds(643, 122, 102, 23);

        jLabel6.setText("Price per hour:");
        add(jLabel6);
        jLabel6.setBounds(695, 207, 85, 17);
        add(priceTxt);
        priceTxt.setBounds(808, 203, 160, 23);

        jLabel7.setText("Select Game Booking Date:");
        add(jLabel7);
        jLabel7.setBounds(52, 312, 161, 17);

        jLabel8.setText("Enter Number of Hours:");
        add(jLabel8);
        jLabel8.setBounds(447, 308, 137, 17);
        add(numberOfHoursTxt);
        numberOfHoursTxt.setBounds(621, 304, 160, 23);

        bookGameBtn.setText("Book Game");
        bookGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookGameBtnActionPerformed(evt);
            }
        });
        add(bookGameBtn);
        bookGameBtn.setBounds(831, 280, 137, 50);

        gameWorkQueueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Game Name", "Game Category", "Booking Date", "Price per hour", "Number of hours", "Total price", "Request Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(gameWorkQueueTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(26, 424, 942, 257);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Book A Game");
        add(jLabel1);
        jLabel1.setBounds(410, 50, 180, 30);

        add(chooseGameDropdown);
        chooseGameDropdown.setBounds(448, 122, 148, 23);

        jLabel2.setText("Choose a game of your choice:");
        add(jLabel2);
        jLabel2.setBounds(204, 130, 181, 17);

        jLabel3.setText("Game Name:");
        add(jLabel3);
        jLabel3.setBounds(26, 207, 77, 17);
        add(gameNameTxt);
        gameNameTxt.setBounds(130, 203, 160, 23);

        jLabel4.setText("Game Category:");
        add(jLabel4);
        jLabel4.setBounds(348, 207, 95, 17);
        add(gameCategoryTxt);
        gameCategoryTxt.setBounds(472, 203, 160, 23);

        jLabel9.setText("Game Booking Status");
        add(jLabel9);
        jLabel9.setBounds(411, 385, 127, 17);
        add(gameBookingDateTxt);
        gameBookingDateTxt.setBounds(210, 310, 93, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void viewGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewGameBtnActionPerformed
        // View Vehicle Details on choosing

        try {
            if (chooseGameDropdown.getSelectedItem() != null) {

                String gameName = String.valueOf(chooseGameDropdown.getSelectedItem());
                Game gameDetails = system.getGameDirectory().getGameByName(gameName);

                gameNameTxt.setText(gameDetails.getGameName());
                gameCategoryTxt.setText(gameDetails.getGameCategory());
                priceTxt.setText(String.valueOf(gameDetails.getPrice()));

            } else {
                JOptionPane.showMessageDialog(this, "Choose a valid Game for booking");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Choose a valid Game for booking");
        }
    }//GEN-LAST:event_viewGameBtnActionPerformed

    private void bookGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookGameBtnActionPerformed
        // Book a vehiclgameBookingDateTxtils
        GameWorkRequest bookGame = new GameWorkRequest();

        try {
            if (chooseGameDropdown.getSelectedItem() != null) {
                String gameName = String.valueOf(chooseGameDropdown.getSelectedItem());
                Game gameDetails = system.getGameDirectory().getGameByName(gameName);

                Date selectedDate = gameBookingDateTxt.getDate();
                SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                String strDate = dateFormat.format(selectedDate);
                Date bookingDate = dateFormat.parse(strDate);

                int numberOfHours = Integer.parseInt(numberOfHoursTxt.getText());

                bookGame.setGameDetails(gameDetails);
                bookGame.setBookingDate(bookingDate);
                bookGame.setNumberOfHours(numberOfHours);
                bookGame.setUserId(user.getUserId());
                bookGame.setStatus("Pending");

                system.getGameWorkRequestDirectory().getGameWorkRequestList().add(bookGame);

                JOptionPane.showMessageDialog(this, "Game booking request sent to Incharge");
                populateRequestTable();
                clearFields();
                formatRows();
                
            } else {
                JOptionPane.showMessageDialog(this, "Enter valid date and number of hours for booking a Game");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Enter valid date and number of hours for booking a Game");
        }
    }//GEN-LAST:event_bookGameBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookGameBtn;
    private javax.swing.JComboBox<String> chooseGameDropdown;
    private com.toedter.calendar.JDateChooser gameBookingDateTxt;
    private javax.swing.JTextField gameCategoryTxt;
    private javax.swing.JTextField gameNameTxt;
    private javax.swing.JTable gameWorkQueueTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField numberOfHoursTxt;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JButton viewGameBtn;
    // End of variables declaration//GEN-END:variables

    private void populateRequestTable() {
        
        try {
            DefaultTableModel model = (DefaultTableModel) gameWorkQueueTable.getModel();
            model.setRowCount(0);

            for (GameWorkRequest gameWorkRequest : system.getGameWorkRequestDirectory().getGameWorkRequestList()) {

                if (gameWorkRequest.getUserId().equals(user.getUserId())) {
                    Object[] newRow = new Object[7];
                    newRow[0] = gameWorkRequest.getGameDetails().getGameName();
                    newRow[1] = gameWorkRequest.getGameDetails().getGameCategory();
                    newRow[2] = gameWorkRequest.getBookingDate();
                    newRow[3] = gameWorkRequest.getGameDetails().getPrice();
                    newRow[4] = gameWorkRequest.getNumberOfHours();
                    newRow[5] = (gameWorkRequest.getNumberOfHours()*gameWorkRequest.getGameDetails().getPrice());
                    newRow[6] = gameWorkRequest.getStatus();

                    model.addRow(newRow);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void clearFields() {
        
        gameNameTxt.setText("");
        gameCategoryTxt.setText("");
        priceTxt.setText("");
        numberOfHoursTxt.setText("");
        gameBookingDateTxt.setCalendar(null);
    }
    
    private void formatRows() {

        DefaultTableModel model = (DefaultTableModel) gameWorkQueueTable.getModel();

        gameWorkQueueTable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                String status = String.valueOf(model.getValueAt(row, 6));
                c.setBackground(status.equals("Pending") ? Color.WHITE : status.equals("Approved") ? Color.GREEN : Color.RED);
                return c;
            }
        });

    }
}
