/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Parking;
import java.util.ArrayList;

/**
 *
 * @author Sushant
 */
public class ParkingDirectory {
    ArrayList<Parking> parkingDirectory;
    
    public ParkingDirectory() {
        this.parkingDirectory = new ArrayList<>();
    }

    public ArrayList<Parking> getParkingDirectory() {
        return parkingDirectory;
    }

    public void setParkingDirectory(ArrayList<Parking> parkingDirectory) {
        this.parkingDirectory = parkingDirectory;
    }
    
    public Parking getParkings(int index) {
        Parking newParking = new Parking();
        newParking = parkingDirectory.get(index);
        return newParking;
    }
    
    public Parking addParkingDetails() {
        Parking newParking = new Parking();
        parkingDirectory.add(newParking);
        return newParking;
    }
    
    public Parking getParkingByName(String parkingName) {
        Parking selectedParking = new Parking();
        for (Parking parking : parkingDirectory) {
            if (parking.getParkingName().equals(parkingName)) {
                selectedParking = parking;
                break;
            }
        }
        return selectedParking;
    }
    
    public void deleteParking(Parking parking) {
        parkingDirectory.remove(parking);
    }
}
