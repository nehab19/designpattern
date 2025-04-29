package guru.springframework.spring5webapp.designpattern.LLD.adapter.client;

import guru.springframework.spring5webapp.designpattern.LLD.adapter.Adaptee.WeighingMachineForBabies;
import guru.springframework.spring5webapp.designpattern.LLD.adapter.Adapter.WeightMachineAdapter;
import guru.springframework.spring5webapp.designpattern.LLD.adapter.Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeighingMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
