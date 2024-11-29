/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FoodandBev.Menu;

import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class FoodBevDirectory {
    private ArrayList<FoodBevItem> fbItemDirectoryList;
    
    public FoodBevDirectory() {
        this.fbItemDirectoryList = new ArrayList<>();
    }

    public ArrayList<FoodBevItem> getFbItemDirectoryList() {
        return fbItemDirectoryList;
    }

    public void setFbItemDirectoryList(ArrayList<FoodBevItem> fbItemDirectoryList) {
        this.fbItemDirectoryList = fbItemDirectoryList;
    }
    
    public void addNewMenuData(FoodBevItem fb) {
        this.fbItemDirectoryList.add(fb);
    }
    
    public void deleteMenuData(FoodBevItem fb) {
        this.fbItemDirectoryList.remove(fb);
    }
    
    public void updateExistingMenuData(FoodBevItem fb, int index) {
        this.fbItemDirectoryList.set(index, fb);
    }
    
    public FoodBevItem getItemByName(String itemName) {

        FoodBevItem selectedItem = new FoodBevItem();
        for (FoodBevItem item : fbItemDirectoryList) {
            if (item.getFbName().equals(itemName)) {
                selectedItem = item;
                break;
            }
        }
        return selectedItem;
    }
}
