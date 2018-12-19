package me.freedom4live.algorithms.integration;

import java.util.function.Function;

abstract class AbstractIntegration {

    float integrate(Function<Float, Float> function, Float xMin, Float xMax, int steps, float mistake) {
        float dx = (xMax - xMin) / steps;
        float result = 0.0f;
        float currentX = xMin;
        for (int i = 0; i < steps; i++) {
            result += integrateInternal(function, currentX, dx, mistake);
            currentX += dx;
        }

        return result;
    }

    protected abstract float integrateInternal(Function<Float, Float> function, float currentX, float dx, float mistake);

}
