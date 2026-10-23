import java.util.ArrayList;

public class FleetManager {
    private ArrayList<Vehicle> fleetList;

    public FleetManager() {
        this.fleetList = new ArrayList<>();
    }

    public void addVehicle(Vehicle v) {
        fleetList.add(v);
    }

    public void showFleetStatus() {
        for (int i = 0; i < fleetList.size(); i++) {
            System.out.println(fleetList.get(i));
        }
    }

    public void totalQuote() {
        for (int i = 0; i < fleetList.size(); i++) {
            System.out.println(fleetList.get(i).calculateShippingCost());
        }
    }
}