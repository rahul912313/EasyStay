/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import Business.User.User;
import java.util.UUID;

/**
 *
 * @author RAHUL
 */
public class Register extends javax.swing.JPanel {

    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    /**
     * Creates new form Register
     */
    public Register(EcoSystem system) {
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

        jLabel1 = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        cmbRole = new javax.swing.JComboBox<>();
        btnRegister = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 250, 250));
        setLayout(null);

        jLabel1.setText("First Name");
        add(jLabel1);
        jLabel1.setBounds(186, 79, 162, 17);

        txtFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNameActionPerformed(evt);
            }
        });
        add(txtFName);
        txtFName.setBounds(382, 76, 289, 23);
        add(txtLName);
        txtLName.setBounds(382, 117, 289, 23);
        add(txtUserName);
        txtUserName.setBounds(382, 158, 289, 23);
        add(txtPassword);
        txtPassword.setBounds(382, 199, 289, 23);

        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Admin", "Vehicle Contractor", "Pool Incharge", "Gaming Incharge", "Laundry Manager", "Janitor", "Food Manager", "Shop Manager" }));
        cmbRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRoleActionPerformed(evt);
            }
        });
        add(cmbRole);
        cmbRole.setBounds(382, 240, 289, 23);

        btnRegister.setText("REGISTER");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        add(btnRegister);
        btnRegister.setBounds(352, 463, 110, 23);

        jLabel2.setText("User Name");
        add(jLabel2);
        jLabel2.setBounds(186, 161, 119, 17);

        jLabel3.setText("Last Name");
        add(jLabel3);
        jLabel3.setBounds(186, 120, 119, 17);

        jLabel4.setText("Password");
        add(jLabel4);
        jLabel4.setBounds(186, 202, 119, 17);

        jLabel5.setText("Roletype");
        add(jLabel5);
        jLabel5.setBounds(186, 243, 119, 17);
        add(txtAddress);
        txtAddress.setBounds(382, 281, 289, 23);
        add(txtPhoneNumber);
        txtPhoneNumber.setBounds(382, 322, 289, 23);

        jLabel8.setText("Address");
        add(jLabel8);
        jLabel8.setBounds(186, 284, 106, 17);

        jLabel10.setText("Age");
        add(jLabel10);
        jLabel10.setBounds(186, 366, 162, 17);

        jLabel11.setText("Phone Number");
        add(jLabel11);
        jLabel11.setBounds(186, 325, 93, 17);
        add(txtAge);
        txtAge.setBounds(382, 363, 289, 23);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("REGISTER PAGE");
        add(jLabel13);
        jLabel13.setBounds(339, 24, 146, 21);

        jLabel14.setText("Email Address");
        add(jLabel14);
        jLabel14.setBounds(186, 407, 85, 17);

        txtEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAddressActionPerformed(evt);
            }
        });
        add(txtEmailAddress);
        txtEmailAddress.setBounds(382, 404, 289, 23);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/undraw_my_app_re_gxtj.png"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(2, -3, 1160, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNameActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        User user = new User();
        
        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();

        String firstName = txtFName.getText();
        String lastName = txtLName.getText();
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        String address = txtAddress.getText();
        String age = txtAge.getText();
        String phoneNumber = txtPhoneNumber.getText();
        String userId = randomUUIDString;
        String roleType = (String) cmbRole.getSelectedItem();
        String emailAddress = txtEmailAddress.getText();

        if (firstName.isEmpty() || lastName.isEmpty() || userName.isEmpty()|| password.isEmpty()
                || phoneNumber.isEmpty()|| userId.isEmpty()|| age.isEmpty()|| address.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter all details !");
            //clearAllFields();
            return;
        }

        if (validatePhoneNumber(phoneNumber) == null) {
            JOptionPane.showMessageDialog(this, "Please enter a valid phone number !");
            return;
        }
        
        if(validateEmailAddress(emailAddress) == null) {
            JOptionPane.showMessageDialog(this, "Please enter a valid email address !");
            return;
        }

        if (validateAge(age) == null) {
            JOptionPane.showMessageDialog(this, "Please enter a valid age!");
            return;
        }

        for (User p : system.getUserDirectory().getUsers()) {
            if (userName.equals(p.getUserName())) {
                JOptionPane.showMessageDialog(this, "Person already exists !");
                return;
            }
        }
        Integer a = validateAge(age);
        Long pn = validatePhoneNumber(phoneNumber);

        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUserName(userName);
        user.setPassword(password);
        user.setRoleType(roleType);
        user.setAge(a);
        user.setAddress(address);
        user.setPhoneNumber(pn);
        user.setEmailId(emailAddress);
        user.setUserId(userId);

        ArrayList<User> users = system.getUserDirectory().getUsers();
        users.add(user);
        system.getUserDirectory().setUsers(users);

        JOptionPane.showMessageDialog(this, "Profile successfully added !");
        dB4OUtil.storeSystem(system);
        clearAllFields();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void cmbRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRoleActionPerformed
        // TODO add your handling code here:
        String roleType = (String) cmbRole.getSelectedItem();
        if (roleType.equals("Customer")) {

        } else if (roleType.equals("Admin")) {

        } else {

        }
    }//GEN-LAST:event_cmbRoleActionPerformed

    private void txtEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddressActionPerformed

    private Integer validateAge(String age) {
        try {
            return Integer.parseInt(age);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    private Long validatePhoneNumber(String phoneNumber) {
        try {

            String cellPhoneNumberRegex = "^\\d{10}$";

            Pattern cellPhoneNumberPattern = Pattern.compile(cellPhoneNumberRegex);
            Matcher cellPhoneNumberMatcher = cellPhoneNumberPattern.matcher(phoneNumber);

            if (cellPhoneNumberMatcher.matches()) {
                return Long.parseLong(phoneNumber);
            } else {
                //JOptionPane.showMessageDialog(this, "Invalid Phone Number!");
                return null;
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return null;
        }

    }
    
    private String validateEmailAddress(String emailAddress) {
        try {

            String emailAddressRegex = "^(.+)@(\\S+)$";

            Pattern emailPattern = Pattern.compile(emailAddressRegex);
            Matcher emailMatcher = emailPattern.matcher(txtEmailAddress.getText());

            if (emailMatcher.matches()) {
                return emailAddress;
            } else {
//                JOptionPane.showMessageDialog(this, "Invalid Email Address!");
                return null;
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void clearAllFields() {
        txtAge.setText("");
        txtFName.setText("");
        txtLName.setText("");
        txtPassword.setText("");
        txtPhoneNumber.setText("");
        txtAddress.setText("");
        txtUserName.setText("");
        txtEmailAddress.setText("");
    }

}
