
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import sintactictree.ExceptionDivideByZero;
import sintactictree.NumberCalculator;


public class NumberCalculatorTest {
    
    @Test
    public void exceptionDivideByZeroTest(){
        NumberCalculator calculator = new NumberCalculator();
        try {    
            calculator.divide(3.3, 0.0);
        } catch (ExceptionDivideByZero ex) {
            Logger.getLogger(NumberCalculatorTest.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
