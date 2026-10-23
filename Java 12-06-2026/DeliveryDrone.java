public class DeliveryDrone extends Vehicle {
    private int batteryAutonomy;
    private double kmTraveled;
    
    public DeliveryDrone (String id, String model, double maxLoad, double currentLoad, String currentStatus, int batteryAutonomy, double kmTraveled) {
        super(id, model, maxLoad, currentLoad, currentStatus);
        this.batteryAutonomy = batteryAutonomy;
        this.kmTraveled = kmTraveled;
    }

    public int getBatteryAutonomy() {
        return this.batteryAutonomy;
    }

    public double getKmTraveled() {
        return this.kmTraveled;
    }

   @Override
    public double calculateShippingCost() {
        if (getCurrentLoad() > 5) {
            return 6 * kmTraveled;
        }
        else {
            return 3 * kmTraveled;
        }
    }

    @Override
    public String toString() {
        return "ID: " + getId() + "\n" +  "Model: " + getModel() + "\n" +  "Maximum Load: " + getMaxLoad() + "\n" +  "Current Load: " + getCurrentLoad() + "\n" +  "Current Status: " + getCurrentStatus() + "\n" + "Battery Autonomy: " + this.batteryAutonomy + "\n" + "KM Traveled: " + getKmTraveled() + "\n";
    }
}
