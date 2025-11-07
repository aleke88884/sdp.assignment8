package context_models;

import interfaces.Vehicle;
import visitors.VehicleVisitor;

// File: Motorcycle.java
public class Motorcycle implements Vehicle {
    private final String modelName;
    private final boolean hasSidecar;

    public Motorcycle(String modelName, boolean hasSidecar) {
        this.modelName = modelName;
        this.hasSidecar = hasSidecar;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public void accept(VehicleVisitor visitor) {
        visitor.visitMotorcycle(this);
    }
}
