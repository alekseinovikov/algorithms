package me.freedom4live.algorithms.integration;

import java.util.function.Function;

public class AdaptiveIntegration extends AbstractIntegration {

    @Override
    protected float integrateInternal(Function<Float, Float> function, float currentX, float dx, float mistake) {
        float leftRectangle = integrateWithNoSteps(function, currentX, dx);
        float rightRectangle = integrateWithNoSteps(function, currentX + dx, dx);

        if ((Math.abs(rightRectangle - leftRectangle)) < mistake) return leftRectangle;

        return integrateInternal(function, currentX, dx / 2, mistake) + integrateInternal(function, currentX + dx / 2, dx / 2, mistake);
    }

    private float integrateWithNoSteps(Function<Float, Float> function, float currentX, float dx) {
        return function.apply(currentX) * dx;
    }

}
