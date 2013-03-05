package sintactictree;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NumberCalculator extends Calculator{

    @Override
    public Double add(Double p0, Double p1) {
        return p0 + p1;
    }

    @Override
    public Double add(Integer p0, Double p1) {
        return p0 + p1;
    }

    @Override
    public Double add(Double p0, Integer p1) {
        return p0 + p1;
    }

    @Override
    public Integer add(Integer p0, Integer p1) {
        return p0 + p1;
    }

    @Override
    public Double substract(Double p0, Double p1) {
        return p0 - p1;
    }

    @Override
    public Double substract(Integer p0, Double p1) {
         return p0 - p1;
    }

    @Override
    public Double substract(Double p0, Integer p1) {
         return p0 - p1;
    }

    @Override
    public Integer substract(Integer p0, Integer p1) {
        return p0 - p1;
    }

    @Override
    public Double mult(Double p0, Double p1) {
         return p0 * p1;
    }

    @Override
    public Double mult(Integer p0, Double p1) {
         return p0 * p1;
    }

    @Override
    public Double mult(Double p0, Integer p1) {
         return p0 * p1;
    }

    @Override
    public Integer mult(Integer p0, Integer p1) {
         return p0 * p1;
    }

   
    @Override
    public Double divide(Double p0, Double p1){
        return  (p0 / p1);
    }

    @Override
    public Double divide(Integer p0, Double p1) {
         return  (p0 / p1);
    }

    @Override
    public Double divide(Double p0, Integer p1) {
         return  (p0 / p1);
    }

    @Override
    public Integer divide(Integer p0, Integer p1) {
         return  (p0 / p1);
    }

    @Override
    public Type calculate(BinaryOperationNode operator, Type arg1, Type arg2) {
        return null; //TODO: crear calculate
    }
    
    private static String getMethodSignature(Method method){
        String result = method.getName();
        for(Class<?> parameter : method.getParameterTypes()){
            result += parameter.getSimpleName();
        }
      
        return result;
        
    }

    private static String getSignature(BinaryOperationNode operator, Type arg1, Type arg2) {
       return (operator.Evaluate().toString() + arg1.getType()+ arg2.getType());
        
    }
    
}
