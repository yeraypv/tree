package evaluator.calculators;

import evaluator.Type;
import evaluator.calculator.number.CoreNumberCalculator;
import evaluator.nodes.Operator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class CalculateEvaluate implements Evaluate {

    //TODO: tiene que estar en otra clae operador
    private static HashMap<String, Operator> operatorMap;

    static {
        operatorMap = new HashMap<>();
        operatorMap.put("+", Operator.add);
        operatorMap.put("-", Operator.substract);
        operatorMap.put("*", Operator.mul);
        operatorMap.put("/", Operator.div);
    }

    public static Operator getOperator(String value) {
        return operatorMap.get(value);
    }

    @Override
    public Type calculate(Operator operator, Type arg0, Type arg1) {         
        Calculator calculator = selectCalculators(arg0, arg1);       
        if (operator == null || calculator == null) {
            return null;
        }
        try {
            Method method = calculator.getClass().getMethod(operator.getName(), arg0.getValue().getClass(), arg1.getValue().getClass());
            return convertType(method.invoke(calculator, arg0.getValue(), arg1.getValue()));
        } catch (NoSuchMethodException | SecurityException ex) {
            return null;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            return null;
        }
 
    }


    private Type convertType(Object object) {
        if (object instanceof Integer) {
            return new evaluator.types.Integer((Integer) object);
        }
        if (object instanceof Double) {
            return new evaluator.types.Double((Double) object);
        }
        return null;
    }

    private Calculator selectCalculators(Type arg0, Type arg1) {  
        return(arg0 == null || arg1 == null)?null:new CoreNumberCalculator();
    }
}
