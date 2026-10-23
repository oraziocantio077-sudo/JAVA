import java.util.*;

public class Park {
    private ArrayList<Vehicle> park;

    public Park() {
        this.park = new ArrayList<>();
    }

    public void addVehicle(Vehicle v) {
        park.add(v);
    }

    public void removeVehicle(Vehicle v) {
        park.remove(v);
    }

    public void lookPark() {
        for (int i = 0; i < park.size(); i++) {
            System.out.println(park.get(i));
        }
    }
}