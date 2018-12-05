package MainProject;

//Class - MainProject.VehicleFactory - is used to construct and return new MainProject.Vehicle objects based on a parameter
public class VehicleFactory {
    // method that takes as parameter a String - vehicle type and if it is a valid MainProject.Vehicle it returns an instance of that MainProject.Vehicle type
    public Vehicle getVehicle(String vehicleType){
        if(vehicleType == null){
            return null;
        }
        if(vehicleType.equalsIgnoreCase("MOTORCYCLE")){
            return new Motorcycle();
        }
        if(vehicleType.equalsIgnoreCase("CAR")){
            return new Car();
        }
        if(vehicleType.equalsIgnoreCase("BUS")){
            return new Bus();
        }
        return null;
    }
}
