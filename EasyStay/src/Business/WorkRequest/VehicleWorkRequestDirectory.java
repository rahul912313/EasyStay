/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkRequest;

import java.util.ArrayList;

/**
 *
 * @author kanishk
 */
public class VehicleWorkRequestDirectory {
    
    ArrayList<VehicleWorkRequest> vehicleWorkRequestList;

    public VehicleWorkRequestDirectory() {
        this.vehicleWorkRequestList = new ArrayList<VehicleWorkRequest>();
    }
    
    public ArrayList<VehicleWorkRequest> getVehicleWorkRequestList() {
        return vehicleWorkRequestList;
    }

    public void setVehicleWorkRequestList(ArrayList<VehicleWorkRequest> vehicleWorkRequestList) {
        this.vehicleWorkRequestList = vehicleWorkRequestList;
    }
    
     public void updateVehicleWorkRequest(VehicleWorkRequest vehicleWRequest, int index) {
        this.vehicleWorkRequestList.set(index, vehicleWRequest);
    }
    
}
