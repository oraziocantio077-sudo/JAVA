public abstract class Vehicle implements Trackable, Runnable {
    private String id;
    private String model;
    private double maxLoad;
    private double currentLoad;
    private String currentStatus;

    public Vehicle(String id, String model, double maxLoad, double currentLoad, String currentStatus) {
        this.id = id;
        this.model = model;
        this.maxLoad = maxLoad;
        this.currentLoad = 0;
        this.currentStatus = "In depot";
    }

    public String getId() {
        return this.id;
    }

    public void setId(String newId) {
        this.id = newId;
    }

     public String getModel() {
        return this.model;
    }

    public void setModello(String newModel) {
        this.model = newModel;
    }

     public double getMaxLoad() {
        return this.maxLoad;
    }

    public void setMaxLoad(double newMaxLoad) {
        this.maxLoad = newMaxLoad;
    }

     public double getCurrentLoad() {
        return this.currentLoad;
    }

    public void setCaricoCorrente(double newCurrentLoad) {
        this.currentLoad = newCurrentLoad;
    }

    public String getCurrentStatus() {
        return this.currentStatus;
    }

    public void setCurrentStatus (String newCurrentStatus) {
        this.currentStatus = newCurrentStatus;
    }

    public void addLoad (double weight) {
        if (this.currentLoad + weight <= this.maxLoad) {
            this.currentLoad += weight;
        }
        else {
            System.out.println("maximum load exceeded");
        }
    }

    public abstract double calculateShippingCost();

    @Override
    public String getPositionStatus() {
        return this.currentStatus;
    }

    @Override
    public void run() {
        System.out.println("\n[DEPARTURE] Vehicle " + id + " (" + model + ") has departed for delivery with a load of " + currentLoad + " kg.");
        
        try {
            
            this.currentStatus = "In transit (Departed from depot)";
            Thread.sleep(2000);
            
            
            this.currentStatus = "In transit (Near destination)";
            System.out.println("[UPDATE] Vehicle " + id + ": " + currentStatus);
            Thread.sleep(2000); 
            
        } catch (InterruptedException e) {
            this.currentStatus = "Error: Delivery interrupted due to anomalies!";
            System.out.println("[EMERGENCY] The journey of vehicle " + id + " was interrupted.");
            return; 
        }

        
        this.currentStatus = "Delivered (Returned to depot)";
        this.currentLoad = 0.0; 
        System.out.println("[ARRIVAL] Vehicle " + id + " has successfully completed the delivery. Current status: " + currentStatus);
    }

}