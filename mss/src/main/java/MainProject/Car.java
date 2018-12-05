package MainProject;

//Class - MainProject.Car - is used to define the MainProject.Car MainProject.Vehicle
public class Car extends Vehicle{
    // constructor of MainProject.Car class
    public Car(){
        numberOfSpots = 1;
        vehicleSize = VehicleSize.Car;
    } // end of constructor
    // method that tests if a MainProject.Car can fit in a spot or not
    public boolean canFitSpot(ParkingSpot parkingSpot){
        // return true if it is a MainProject.Car or MainProject.Bus spot
        return parkingSpot.getSize() == VehicleSize.Bus || parkingSpot.getSize() == VehicleSize.Car;
    } // end of canFitSpot method
    public String toString(){
        return "C";
    }
} // end of MainProject.Car class