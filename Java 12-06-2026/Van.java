public class Van extends Vehicle {
    private double volumeCapacity;
    private double kmTraveled;

    public Van (String id, String model, double maxLoad, double currentLoad, String currentStatus, double volumeCapacity, double kmTraveled) {
        super(id, model, maxLoad, currentLoad, currentStatus);
        this.volumeCapacity = volumeCapacity;
        this.kmTraveled = kmTraveled;
    }

    public double getVolumeCapacity() {
        return this.volumeCapacity;
    }

    public double getKmTraveled() {
        return this.kmTraveled;
    }

    @Override
    public double calculateShippingCost() {
        if (this.volumeCapacity > 10) {
            return 1.80 * kmTraveled;
        }
        else {
            return 1.50 * kmTraveled;
        }
    }

    @Override
    public String toString() {
        return "ID: " + getId() + "\n" +  "Model: " + getModel() + "\n" +  "Maximum Load: " + getMaxLoad() + "\n" +  "Current Load: " + getCurrentLoad() + "\n" +  "Current Status: " + getCurrentStatus() + "\n" + "Volume Capacity: " + this.volumeCapacity + "\n" + "KM Traveled: " + getKmTraveled() + "\n";
    }
}
