package services;

import context_models.Car;
import context_models.Motorcycle;
import context_models.Truck;
import visitors.VehicleVisitor;

public class RentalCostCalculator implements VehicleVisitor {

    private final int rentalDays;

    private static final int TRUCK_BASE_COST_PER_DAY = 100;
    private static final int TRUCK_EXTRA_COST_PER_TON = 10;
    private static final int MOTORCYCLE_COST_WITH_SIDECAR = 60;
    private static final int MOTORCYCLE_COST_WITHOUT_SIDECAR = 40;

    public RentalCostCalculator(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    @Override
    public void visitCar(Car car) {
        double totalCost = car.getBaseRatePerDay() * rentalDays;
        System.out.printf("Car: %s | Total cost: $%.2f%n", car.getModelName(), totalCost);
    }

    @Override
    public void visitTruck(Truck truck) {
        double dailyCost = TRUCK_BASE_COST_PER_DAY + truck.getLoadCapacityTons() * TRUCK_EXTRA_COST_PER_TON;
        double totalCost = dailyCost * rentalDays;
        System.out.printf("Truck: %s | Total cost: $%.2f%n", truck.getModelName(), totalCost);
    }

    @Override
    public void visitMotorcycle(Motorcycle motorcycle) {
        double dailyCost = motorcycle.hasSidecar()
                ? MOTORCYCLE_COST_WITH_SIDECAR
                : MOTORCYCLE_COST_WITHOUT_SIDECAR;
        double totalCost = dailyCost * rentalDays;
        System.out.printf("Motorcycle: %s | Total cost: $%.2f%n", motorcycle.getModelName(), totalCost);
    }
}
