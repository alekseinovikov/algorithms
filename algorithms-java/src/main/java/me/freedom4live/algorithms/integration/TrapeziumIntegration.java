package me.freedom4live.algorithms.integration;

import java.util.function.Function;

public class TrapeziumIntegration extends AbstractIntegration {

    @Override
    protected float integrateInternal(Function<Float, Float> function, float currentX, float dx, float mistake) {
        return function.apply(currentX + dx * 0.5f) * dx;
    }

}
