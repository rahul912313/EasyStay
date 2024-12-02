/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.PaymentHistory;

import java.util.ArrayList;

/**
 *
 * @author kanishk
 */
public class CustomerTransactionDirectory {
    
    ArrayList<CustomerTransaction> customerTransactionList;

    public CustomerTransactionDirectory() {
        this.customerTransactionList = new ArrayList<CustomerTransaction>();
    }
    
    public ArrayList<CustomerTransaction> getCustomerTransactionList() {
        return customerTransactionList;
    }

    public void setCustomerTransactionList(ArrayList<CustomerTransaction> customerTransactionList) {
        this.customerTransactionList = customerTransactionList;
    }
    
    public void addCustomerTransaction(CustomerTransaction ct) {
        this.customerTransactionList.add(ct);
    }
    
}
