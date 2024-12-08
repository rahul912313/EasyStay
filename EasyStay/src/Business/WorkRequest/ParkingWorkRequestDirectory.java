/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkRequest;

import java.util.ArrayList;

/**
 *
 * @author Sushant
 */
public class ParkingWorkRequestDirectory {

    ArrayList<ParkingWorkRequest> parkingWorkRequestList;

    public ParkingWorkRequestDirectory() {
        this.parkingWorkRequestList = new ArrayList<ParkingWorkRequest>();
    }

    public ArrayList<ParkingWorkRequest> getParkingWorkRequestList() {
        return parkingWorkRequestList;
    }

    public void setParkingWorkRequestList(ArrayList<ParkingWorkRequest> parkingWorkRequestList) {
        this.parkingWorkRequestList = parkingWorkRequestList;
    }

    public void updateParkingWorkRequest(ParkingWorkRequest parkingWRequest, int index) {
        this.parkingWorkRequestList.set(index, parkingWRequest);
    }
}
