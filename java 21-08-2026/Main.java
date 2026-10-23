public class Main {
    public static void main (String[] args) {
        Car c1 = new Car("123", 4, "Rosso");
        Car c2 = new Car("456", 6, "Verde");

        Park p1 = new Park();

        p1.addVehicle(c1);
        p1.addVehicle(c2);

        p1.lookPark();
    }
}