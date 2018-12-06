package MainProject;

public class Message {
    private String message;

    private static final Message instance = new Message();

    private Message(){
        message = "Please enter bus, car, or motor to parkVehicle a vehicle. \n" +
                  "Please enter fbus, fcar, or fmotor to remove a vehicle. \n" +
                  "Please enter 0 to exit.";
    }

    public static Message getInstance(){
        return instance;
    }

    public void showMessage() {
        System.out.println(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
