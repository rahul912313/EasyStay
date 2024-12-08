/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkRequest;

import Business.FoodandBev.Menu.FoodBevItem;
import java.util.ArrayList;

/**
 *
 * @author kanishk
 */
public class FoodBevWorkRequest {
    
    String userId;
    ArrayList<FoodBevItem> fbItemDetails;
    String status;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ArrayList<FoodBevItem> getFbItemDetails() {
        return fbItemDetails;
    }

    public void setFbItemDetails(ArrayList<FoodBevItem> fbItemDetails) {
        this.fbItemDetails = fbItemDetails;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return userId;
    }
    
}
