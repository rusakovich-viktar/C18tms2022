package by.tms.task2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GasTank {
    private int currentVolumeGas;
    private int maxVolumeGas;

    public void refuel() {
        currentVolumeGas = maxVolumeGas;
        System.out.println("Бак заправлен");
    }
}