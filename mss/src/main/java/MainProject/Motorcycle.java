package MainProject;

//Class - MainProject.Motorcycle - is used to define the MainProject.Motorcycle MainProject.Vehicle
public class Motorcycle extends Vehicle{
    // constructor of MainProject.Motorcycle class
    public Motorcycle(){
        numberOfSpots = 1;
        vehicleSize = VehicleSize.Motorcycle;
    } // end of constructor
    // method that tests if a MainProject.Motorcycle can fit in a spot or not
    public boolean canFitSpot(ParkingSpot parkingSpot){
        // return true if it is a MainProject.Motorcycle, MainProject.Car or MainProject.Bus spot
        return parkingSpot.getSize() == VehicleSize.Motorcycle || parkingSpot.getSize() == VehicleSize.Car || parkingSpot.getSize() == VehicleSize.Bus;
    } // end of canFitSpot method
    public String toString(){
        return "M";
    }
} // end of MainProject.Motorcycle class