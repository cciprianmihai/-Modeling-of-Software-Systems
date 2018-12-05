package MainProject;

//Class - MainProject.Bus - is used to define the MainProject.Bus MainProject.Vehicle
public class Bus extends Vehicle{
    // constructor of MainProject.Bus class
    public Bus(){
        numberOfSpots = 5;
        vehicleSize = VehicleSize.Bus;
    } // end of constructor
    // method that tests if a MainProject.Bus can fit in a spot or not
    public boolean canFitSpot(ParkingSpot parkingSpot){
        // return true if it is a MainProject.Bus spot
        return parkingSpot.getSize() == VehicleSize.Bus;
    } // end of canFitSpot method
    public String toString(){
        return "B";
    }
} // end of MainProject.Bus class