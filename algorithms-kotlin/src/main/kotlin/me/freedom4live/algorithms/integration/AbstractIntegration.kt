package me.freedom4live.algorithms.integration

abstract class AbstractIntegration {

    fun integrate(function: (Float) -> Float, xMin: Float, xMax: Float, steps: Int, mistake: Float): Float {
        val dx = (xMax - xMin) / steps
        var result = 0.0f
        var currentX = xMin

        repeat(steps) {
            result += integrateInternal(function, currentX, dx, mistake)
            currentX += dx
        }

        return result
    }

    protected abstract fun integrateInternal(
        function: (Float) -> Float, currentX: Float, dx: Float, mistake: Float
    ): Float

}

class AdaptiveIntegration : AbstractIntegration() {

    override fun integrateInternal(
        function: (Float) -> Float, currentX: Float, dx: Float, mistake: Float
    ): Float {
        val leftRectangle = integrateWithNoSteps(function, currentX, dx)
        val rightRectangle = integrateWithNoSteps(function, currentX + dx, dx)

        return if (Math.abs(rightRectangle - leftRectangle) < mistake) leftRectangle else integrateInternal(
            function, currentX, dx / 2, mistake
        ) + integrateInternal(function, currentX + dx / 2, dx / 2, mistake)

    }

    private fun integrateWithNoSteps(function: (Float) -> Float, currentX: Float, dx: Float): Float {
        return function(currentX) * dx
    }

}

class RecatangleIntegration : AbstractIntegration() {

    override fun integrateInternal(
        function: (Float) -> Float,
        currentX: Float,
        dx: Float,
        mistake: Float
    ): Float = function(currentX) * dx

}

class TrapeziumIntegration : AbstractIntegration() {

    override fun integrateInternal(
        function: (Float) -> Float,
        currentX: Float,
        dx: Float,
        mistake: Float
    ): Float = function(currentX + dx * 0.5f) * dx

}

