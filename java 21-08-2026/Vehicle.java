public class Vehicle {
    private String plate;
    private int nOfWheels;

    public Vehicle(String plate, int nOfWheels) {
        this.plate = plate;
        this.nOfWheels = nOfWheels;
    }

    public String getPlate() {
        return this.plate;
    }

    public int getNOfWheels() {
        return this.nOfWheels;
    }

    @Override
    public String toString() {
        return "Targa: " + this.plate + "\nNumero Ruote: " + this.nOfWheels;
    }
}