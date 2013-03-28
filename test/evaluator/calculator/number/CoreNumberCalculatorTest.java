package evaluator.calculator.number;

import evaluator.calculators.CoreNumberCalculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CoreNumberCalculatorTest {

    public CoreNumberCalculator getCalculator() {
        return new CoreNumberCalculator();
    }

    public RangeNumberCalculator getCalculator(Double upperLimit, Double lowerLimit) {
        return new RangeNumberCalculator(getCalculator(), new Range(upperLimit, lowerLimit));
    }

    @Test
    public void addTest() {
        assertEquals(4.0, getCalculator().add(2.0, 2.0), 0.0);
    }
}