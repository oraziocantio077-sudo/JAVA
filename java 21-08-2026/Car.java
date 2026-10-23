import java.util.Objects;

public class Car extends Vehicle {
    private String color;

    public Car(String plate, int nOfWheels, String color) {
        super(plate, nOfWheels);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Car car = (Car) obj;
        return Objects.equals(getPlate(), car.getPlate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlate());
    }
    
}