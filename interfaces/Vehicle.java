package interfaces;

import visitors.VehicleVisitor;

public interface Vehicle {
    void accept(VehicleVisitor visitor);

    String getModelName();
}
