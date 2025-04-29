package guru.springframework.spring5webapp.designpattern.LLD.strategy;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle() {
        super(new NormalDriveStrategy());
    }
}
