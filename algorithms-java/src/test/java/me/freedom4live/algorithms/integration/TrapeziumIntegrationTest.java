package me.freedom4live.algorithms.integration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

class TrapeziumIntegrationTest {

    private AbstractIntegration integration = new TrapeziumIntegration();

    @Test
    void integrate_hardFunction_rightAnswer() {
        Function<Float, Float> function = x -> (float) (Math.sin(x * x + 2.5)) / (x * x * x + 3);

        float result = integration.integrate(function, 0.4f, 2.2f, 10000, 0.0f);

        Assertions.assertEquals(-0.07812270522117615, result);
    }

}
