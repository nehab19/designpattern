package guru.springframework.spring5webapp.designpattern.LLD.strategy;

public class NormalDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Hi i can drive with normal drive strategy");
    }
}
