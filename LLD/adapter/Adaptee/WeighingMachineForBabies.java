package guru.springframework.spring5webapp.designpattern.LLD.adapter.Adaptee;

public class WeighingMachineForBabies implements WeighingMachine{
    @Override
    public double getWeightInPound() {
        return 28;
    }
}
