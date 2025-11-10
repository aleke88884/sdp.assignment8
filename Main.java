
import java.util.List;

import context_models.Car;
import context_models.Motorcycle;
import context_models.Truck;
import interfaces.Vehicle;
import services.RentalCostCalculator;
import visitors.VehicleVisitor;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = List.of(
                new Car("Toyota Camry", 70),
                new Truck("Volvo FH16", 5),
                new Motorcycle("Yamaha MT-07", false));

        int rentalDays = 3;
        VehicleVisitor costCalculator = new RentalCostCalculator(rentalDays);

        for (Vehicle vehicle : vehicles) {
            vehicle.accept(costCalculator);
        }
    }
}
