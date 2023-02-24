package by.tms.task2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GasTank {

    private int currentVolumeGas;
    private int maxVolumeGas;

    protected void refuel() {
        currentVolumeGas = maxVolumeGas;
        System.out.println("Бак заправлен");
        System.out.printf("Топлива в баке", currentVolumeGas);
    }

}