package sintactictree;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NumberCalculator extends Calculator{

    @Override
    Double add(Double p0, Double p1) {
        return p0 + p1;
    }

    @Override
    Double add(Integer p0, Double p1) {
        return p0 + p1;
    }

    @Override
    Double add(Double p0, Integer p1) {
        return p0 + p1;
    }

    @Override
    Integer add(Integer p0, Integer p1) {
        return p0 + p1;
    }

    @Override
    Double substract(Double p0, Double p1) {
        return p0 - p1;
    }

    @Override
    Double substract(Integer p0, Double p1) {
         return p0 - p1;
    }

    @Override
    Double substract(Double p0, Integer p1) {
         return p0 - p1;
    }

    @Override
    Integer substract(Integer p0, Integer p1) {
        return p0 - p1;
    }

    @Override
    Double mult(Double p0, Double p1) {
         return p0 * p1;
    }

    @Override
    Double mult(Integer p0, Double p1) {
         return p0 * p1;
    }

    @Override
    Double mult(Double p0, Integer p1) {
         return p0 * p1;
    }

    @Override
    Integer mult(Integer p0, Integer p1) {
         return p0 * p1;
    }

   
    @Override
    public Double divide(Double p0, Double p1) throws ExceptionDivideByZero{
        if(p1 == 0.0){throw new ExceptionDivideByZero("Error division por cero");}
        return  (p0 / p1);
    }

    @Override
    public Double divide(Integer p0, Double p1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Double divide(Double p0, Integer p1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer divide(Integer p0, Integer p1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Type calculate(Operator operator, Type arg1, Type arg2) {
        for(Method method : NumberCalculator.class.getDeclaredMethods()){
            if(getMethodSignature(method).equals(getSignature(operator,arg1,arg2))){
                try {
                    return (Type) method.invoke(this, arg1, arg2);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                    Logger.getLogger(NumberCalculator.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }
    
    private static String getMethodSignature(Method method){
        String result = method.getName();
        for(Class<?> parameter : method.getParameterTypes()){
            result += parameter.getSimpleName();
        }
        return result;
        
    }

    private static String getSignature(Operator operator, Type arg1, Type arg2) {
        return operator.toString() + arg1.toString() + arg2.toString();
    }
    
}
