
import junit.framework.Assert;
import org.junit.Test;
import sintactictree.NumberCalculator;


public class NumberCalculatorTest {
        
    @Test
    public void addMaxValuesTest(){
        NumberCalculator calculator1 = new NumberCalculator(); 
        calculator1.add(2.0, 3.5);
        Assert.assertEquals(5.5, calculator1.add(2.0, 3.5));
        Assert.assertEquals(5.0, calculator1.add(5.0, 0));
        Assert.assertEquals(0.0, calculator1.add(5.0, -5.0));      
        Assert.assertEquals(-10.0, calculator1.add(-5.0, -5.0));     
        Assert.assertEquals(Double.MAX_VALUE, calculator1.add(Double.MAX_VALUE, 0.0)); 
        Assert.assertEquals(Double.NEGATIVE_INFINITY, calculator1.add(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY));
        Assert.assertEquals(Double.POSITIVE_INFINITY, calculator1.add(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY));
   
    }
    
    @Test
    public void exceptionDivideByZeroTest(){
        NumberCalculator calculator2 = new NumberCalculator(); 
        Double result = calculator2.divide(3.3, 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, result);

        Double result2 = calculator2.divide(3.3, -0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, result2);
        
    }
    
}
