package context_models;

import interfaces.Vehicle;
import visitors.VehicleVisitor;

// File: Truck.java
public class Truck implements Vehicle {
    private final String modelName;
    private final double loadCapacityTons;

    public Truck(String modelName, double loadCapacityTons) {
        this.modelName = modelName;
        this.loadCapacityTons = loadCapacityTons;
    }

    public double getLoadCapacityTons() {
        return loadCapacityTons;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public void accept(VehicleVisitor visitor) {
        visitor.visitTruck(this);
    }
}
