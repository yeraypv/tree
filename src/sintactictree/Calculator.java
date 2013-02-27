
package sintactictree;


abstract class Calculator {
    abstract Double add(Double p0, Double p1);
    abstract Double add(Integer p0, Double p1);
    abstract Double add(Double p0, Integer p1);
    abstract Integer add(Integer p0, Integer p1);

    
    abstract Double substract(Double p0, Double p1);
    abstract Double substract(Integer p0, Double p1);
    abstract Double substract(Double p0, Integer p1);
    abstract Integer substract(Integer p0, Integer p1);
    
    
    abstract Double mult(Double p0, Double p1);
    abstract Double mult(Integer p0, Double p1);
    abstract Double mult(Double p0, Integer p1);
    abstract Integer mult(Integer p0, Integer p1);
    
    
    abstract Double divide(Double p0, Double p1) throws ExceptionDivideByZero;
    abstract Double divide(Integer p0, Double p1) throws ExceptionDivideByZero;
    abstract Double divide(Double p0, Integer p1) throws ExceptionDivideByZero;
    abstract Integer divide(Integer p0, Integer p1) throws ExceptionDivideByZero;
    
    abstract Type calculate(Operator operator, Type arg1, Type arg2);
    
}
