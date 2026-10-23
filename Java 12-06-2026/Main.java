public class Main {
    public static void main (String [] args) {
        FleetManager fleetManager = new FleetManager();

        Van f1 = new Van("123", "Citroen Jumper", 400.0, 300.0, "In deposito", 5.0, 400.0);
        Van f2 = new Van("456", "Ford Transit", 400.0, 300.0, "In deposito", 11.0, 400.0);

        DeliveryDrone d1 = new DeliveryDrone("789", "DJI Mini", 200.0, 100.0, "In deposito", 50, 300.0);
        DeliveryDrone d2 = new DeliveryDrone("098", "Potensic ATOM", 200.0, 4.0, "In deposito", 50, 300.0);

        fleetManager.addVehicle(f1);
        fleetManager.addVehicle(f2);
        fleetManager.addVehicle(d1);
        fleetManager.addVehicle(d2);

        f1.addLoad(10.0);
        f2.addLoad(15.0);

        d1.addLoad(20.0);
        d2.addLoad(25.0);

        fleetManager.showFleetStatus();

        Thread t1 = new Thread(f1);
        Thread t2 = new Thread(f2);
        Thread t3 = new Thread(d1);
        Thread t4 = new Thread(d2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
    }