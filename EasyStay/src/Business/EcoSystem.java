package Business;

import Business.FoodandBev.Menu.FBItemDirectory;
import Business.HouseKeeping.LaundryFacility.LaundryDirectory;
import Business.HouseKeeping.RoomCleaning.JanitorScheduleDirectory;

import Business.Recreation.GamingFacility.GameDirectory;
import Business.Recreation.PoolFacility.PoolDirectory;
import Business.Shopping.InhouseShopping.SouvenirDirectory;
import Business.TransactionHistory.CustomerTransactionDirectory;
import Business.Transportation.VehicleBooking.VehicleDirectory;
import Business.User.UserDirectory;
import Business.WorkRequest.FoodBevWorkRequestDirectory;
import Business.WorkRequest.GameWorkRequestDirectory;
import Business.WorkRequest.LaundryWorkRequestDirectory;

import Business.WorkRequest.PoolWorkRequestDirectory;
import Business.WorkRequest.VehicleWorkRequestDirectory;
import Business.Parking.ParkingDirectory;  // Added import for ParkingDirectory
import Business.WorkRequest.ParkingWorkRequestDirectory; // Added import for ParkingWorkRequestDirectory

public class EcoSystem {

    private static EcoSystem ecoSystem;
    private UserDirectory userDirectory;
    private VehicleDirectory vehicleDirectory;
    private SouvenirDirectory souvenirDirectory;
    private PoolDirectory poolDirectory;
    private GameDirectory gameDirectory;
    private LaundryDirectory laundryDirectory;
    private FBItemDirectory fBItemDirectory;
    private FoodBevWorkRequestDirectory foodBevWorkRequestDirectory;
    private GameWorkRequestDirectory gameWorkRequestDirectory;
    private LaundryWorkRequestDirectory laundryWorkRequestDirectory;
    private PoolWorkRequestDirectory poolWorkRequestDirectory;
    private VehicleWorkRequestDirectory vehicleWorkRequestDirectory;
    private CustomerTransactionDirectory customerTransactionDirectory;
    private JanitorScheduleDirectory janitorScheduleDirectory;

    // New fields for Parking
    private ParkingDirectory parkingDirectory;
    private ParkingWorkRequestDirectory parkingWorkRequestDirectory;

    public FoodBevWorkRequestDirectory getFoodBevWorkRequestDirectory() {
        return foodBevWorkRequestDirectory;
    }

    public void setFoodBevWorkRequestDirectory(FoodBevWorkRequestDirectory foodBevWorkRequestDirectory) {
        this.foodBevWorkRequestDirectory = foodBevWorkRequestDirectory;
    }

    public GameWorkRequestDirectory getGameWorkRequestDirectory() {
        return gameWorkRequestDirectory;
    }

    public void setGameWorkRequestDirectory(GameWorkRequestDirectory gameWorkRequestDirectory) {
        this.gameWorkRequestDirectory = gameWorkRequestDirectory;
    }

    public LaundryWorkRequestDirectory getLaundryWorkRequestDirectory() {
        return laundryWorkRequestDirectory;
    }

    public void setLaundryWorkRequestDirectory(LaundryWorkRequestDirectory laundryWorkRequestDirectory) {
        this.laundryWorkRequestDirectory = laundryWorkRequestDirectory;
    }

    public PoolWorkRequestDirectory getPoolWorkRequestDirectory() {
        return poolWorkRequestDirectory;
    }

    public void setPoolWorkRequestDirectory(PoolWorkRequestDirectory poolWorkRequestDirectory) {
        this.poolWorkRequestDirectory = poolWorkRequestDirectory;
    }

    public VehicleWorkRequestDirectory getVehicleWorkRequestDirectory() {
        return vehicleWorkRequestDirectory;
    }

    public void setVehicleWorkRequestDirectory(VehicleWorkRequestDirectory vehicleWorkRequestDirectory) {
        this.vehicleWorkRequestDirectory = vehicleWorkRequestDirectory;
    }

    public CustomerTransactionDirectory getCustomerTransactionDirectory() {
        return customerTransactionDirectory;
    }

    public void setCustomerTransactionDirectory(CustomerTransactionDirectory customerTransactionDirectory) {
        this.customerTransactionDirectory = customerTransactionDirectory;
    }

    public static EcoSystem getEcoSystem() {
        return ecoSystem;
    }

    public static void setEcoSystem(EcoSystem ecoSystem) {
        EcoSystem.ecoSystem = ecoSystem;
    }

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

    public VehicleDirectory getVehicleDirectory() {
        return vehicleDirectory;
    }

    public void setVehicleDirectory(VehicleDirectory vehicleDirectory) {
        this.vehicleDirectory = vehicleDirectory;
    }

    public SouvenirDirectory getSouvenirDirectory() {
        return souvenirDirectory;
    }

    public void setSouvenirDirectory(SouvenirDirectory souvenirDirectory) {
        this.souvenirDirectory = souvenirDirectory;
    }

    public PoolDirectory getPoolDirectory() {
        return poolDirectory;
    }

    public void setPoolDirectory(PoolDirectory poolDirectory) {
        this.poolDirectory = poolDirectory;
    }

    public GameDirectory getGameDirectory() {
        return gameDirectory;
    }

    public void setGameDirectory(GameDirectory gameDirectory) {
        this.gameDirectory = gameDirectory;
    }

    public LaundryDirectory getLaundryDirectory() {
        return laundryDirectory;
    }

    public void setLaundryDirectory(LaundryDirectory laundryDirectory) {
        this.laundryDirectory = laundryDirectory;
    }

    public FBItemDirectory getFBItemDirectory() {
        return fBItemDirectory;
    }

    public void setfBItemDirectory(FBItemDirectory fBItemDirectory) {
        this.fBItemDirectory = fBItemDirectory;
    }

    public JanitorScheduleDirectory getJanitorScheduleDirectory() {
        return janitorScheduleDirectory;
    }

    public void setJanitorScheduleDirectory(JanitorScheduleDirectory janitorScheduleDirectory) {
        this.janitorScheduleDirectory = janitorScheduleDirectory;
    }

    // Getters and setters for Parking
    public ParkingDirectory getParkingDirectory() {
    if (parkingDirectory == null) {
        parkingDirectory = new ParkingDirectory();
    }
    return parkingDirectory;
}

    public void setParkingDirectory(ParkingDirectory parkingDirectory) {
        this.parkingDirectory = parkingDirectory;
    }

    public ParkingWorkRequestDirectory getParkingWorkRequestDirectory() {
    if (parkingWorkRequestDirectory == null) {
        parkingWorkRequestDirectory = new ParkingWorkRequestDirectory();
    }
    return parkingWorkRequestDirectory;
}

    public void setParkingWorkRequestDirectory(ParkingWorkRequestDirectory parkingWorkRequestDirectory) {
        this.parkingWorkRequestDirectory = parkingWorkRequestDirectory;
    }

    public static EcoSystem getInstance() {
        if (ecoSystem == null) {
            ecoSystem = new EcoSystem();
        }
        return ecoSystem;
    }

    private EcoSystem() {
        userDirectory = new UserDirectory();
        vehicleDirectory = new VehicleDirectory();
        souvenirDirectory = new SouvenirDirectory();
        poolDirectory = new PoolDirectory();
        gameDirectory = new GameDirectory();
        laundryDirectory = new LaundryDirectory();
        fBItemDirectory = new FBItemDirectory();
        foodBevWorkRequestDirectory = new FoodBevWorkRequestDirectory();
        gameWorkRequestDirectory = new GameWorkRequestDirectory();
        laundryWorkRequestDirectory = new LaundryWorkRequestDirectory();
        poolWorkRequestDirectory = new PoolWorkRequestDirectory();
        vehicleWorkRequestDirectory = new VehicleWorkRequestDirectory();
        customerTransactionDirectory = new CustomerTransactionDirectory();
        janitorScheduleDirectory = new JanitorScheduleDirectory();

        // Initialize Parking-related directories
        parkingDirectory = new ParkingDirectory();
        parkingWorkRequestDirectory = new ParkingWorkRequestDirectory();
    }
}
