package guru.springframework.spring5webapp.designpattern.strategy;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle() {
        super(new NormalDriveStrategy());
    }
}
