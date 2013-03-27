package evaluator.calculators;

import evaluator.elements.Type;
import evaluator.calculator.number.CoreNumberCalculator;
import evaluator.nodes.Operator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class CalculateEvaluate implements Evaluate {

    //TODO: Refactoring reflection
    @Override
    public Type calculate(Operator operator, Type arg0, Type arg1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
