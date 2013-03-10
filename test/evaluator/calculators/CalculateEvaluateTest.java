package evaluator.calculators;

import evaluator.Type;
import evaluator.nodes.Operator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculateEvaluateTest {
    @Test
    public void calculateAddTest() {
        CalculateEvaluate cal = new CalculateEvaluate();
        Type num1 = new Type(2.0) {};
        Type num2 = new Type(2) {};
        Type r = new Type(0.0) {};
        r = cal.calculate(Operator.add, num1, num2);        
        assertEquals(4.0, (Double)r.getValue(),0.001);
    }
        
    @Test
    public void calculateSubstractTest() {
        CalculateEvaluate cal = new CalculateEvaluate();
        Type num1 = new Type(2.0) {};
        Type num2 = new Type(2.0) {};
        Type r = new Type(0.0) {};
        r = cal.calculate(Operator.substract, num1, num2);        
        assertEquals(0.0, (double) r.getValue(), 0.001);
    }
           
    @Test
    public void calculateMulTest() {
        CalculateEvaluate cal = new CalculateEvaluate();
        Type num1 = new Type(2) {};
        Type num2 = new Type(2.0) {};
        Type r = new Type(0.0) {};
        r = cal.calculate(Operator.mul, num1, num2);        
        assertEquals(4.0, (double) r.getValue(), 0.001);
    }
       
   
    @Test
    public void calculateDivTest() {
        CalculateEvaluate cal = new CalculateEvaluate();
        Type num1 = new Type(2) {};
        Type num2 = new Type(2) {};
        Type r = new Type(0.0) {};
        r = cal.calculate(Operator.div, num1, num2);        
        assertEquals(1, (Integer) r.getValue(), 0.001);
    }
    
}
