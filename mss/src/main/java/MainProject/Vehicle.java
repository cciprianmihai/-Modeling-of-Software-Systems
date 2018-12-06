package MainProject;//Abstract class - MainProject.Vehicle - is used to define the main characteristics of a MainProject.Vehicle
import java.util.ArrayList;

public abstract class Vehicle {
    // protected field for the number of Spots used by the MainProject.Vehicle
    protected static int numberOfSpots;
    // protected field for the size of the MainProject.Vehicle
    protected VehicleSize vehicleSize;
    // protected field for the license number of the MainProject.Vehicle
    protected String licenseNumber;
    // protected ArrayList for the available Parking Spots
    protected static ArrayList<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();
    // getter method for the size of the MainProject.Vehicle
    public VehicleSize getSize(){
        // return the size of the MainProject.Vehicle
        return vehicleSize;
    } // end of getSize method
    // getter method for the number of spots used by a specific MainProject.Vehicle
    public int getNumberOfSpots(){
        // return the number of spots used by a specific MainProject.Vehicle
        return numberOfSpots;
    } // end of getNumberOfSpots method
    // method for adding a new ParkingSpor in the ArrayList
    public void parkSpots(ParkingSpot s){
        parkingSpots.add(s);
    } // end of parkSpot method
    // abstract method that tests if a MainProject.Vehicle can fit in a spot or not
    public abstract boolean canFitSpot(ParkingSpot spt);
} // end of MainProject.Vehicle class