package me.freedom4live.algorithms.integration;

import java.util.function.Function;

public class RecatangleIntegration extends AbstractIntegration {

    @Override
    protected float integrateInternal(Function<Float, Float> function, float currentX, float dx, float mistake) {
        return function.apply(currentX) * dx;
    }

}
