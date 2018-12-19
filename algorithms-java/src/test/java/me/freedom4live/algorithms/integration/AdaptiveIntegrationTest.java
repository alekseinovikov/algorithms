package me.freedom4live.algorithms.integration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

class AdaptiveIntegrationTest {

    private AbstractIntegration integration = new AdaptiveIntegration();

    @Test
    void integrate_hardFunction_rightAnswer() {
        Function<Float, Float> function = x -> (float) (Math.sin(x * x + 2.5)) / (x * x * x + 3);

        float result = integration.integrate(function, 0.4f, 2.2f, 1000, 0.1f);

        Assertions.assertEquals(-0.07805605232715607, result);
    }

}
