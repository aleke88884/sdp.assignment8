package context_models;

import interfaces.Vehicle;
import visitors.VehicleVisitor;

public class Car implements Vehicle {
    private final String modelName;
    private final double baseRatePerDay;

    public Car(String modelName, double baseRatePerDay) {
        this.modelName = modelName;
        this.baseRatePerDay = baseRatePerDay;
    }

    public double getBaseRatePerDay() {
        return baseRatePerDay;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public void accept(VehicleVisitor visitor) {
        visitor.visitCar(this);
    }
}
