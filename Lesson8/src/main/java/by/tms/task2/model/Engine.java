package by.tms.task2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Engine implements RequiredFieldsEngineClassAware {

    private final String ENGINE;

    @Override
    public void stopEngine() {
        RequiredFieldsEngineClassAware.super.stopEngine();
    }

    @Override
    public void startEngine() {
        RequiredFieldsEngineClassAware.super.startEngine();
    }
}