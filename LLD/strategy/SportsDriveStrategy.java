package guru.springframework.spring5webapp.designpattern.LLD.strategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Hi, I can drive with sports drive strategy");
    }
}
