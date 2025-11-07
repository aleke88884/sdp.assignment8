package visitors;

import context_models.Car;
import context_models.Motorcycle;
import context_models.Truck;

public interface VehicleVisitor {
    void visitCar(Car car);

    void visitTruck(Truck truck);

    void visitMotorcycle(Motorcycle motorcycle);
}
