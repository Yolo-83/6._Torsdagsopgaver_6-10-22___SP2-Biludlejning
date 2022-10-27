import java.util.ArrayList;

public class FleetOfCars {

    private final ArrayList<Car> cars = new ArrayList<>();

    public FleetOfCars() { }

    public void addCar(Car car) {
        cars.add(car);
    }

    public int getTotalRegistrationFeeForFleet() {
        return cars.stream().mapToInt(Car::getRegistrationFee).sum();
    }

    @Override
    public java.lang.String FleetOfCars() {
        return "FleetOfCars{" +
                "cars=" + cars +
                '}';
    }
}