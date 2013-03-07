package evaluator.nodes;

import evaluator.types.Double;
import static org.junit.Assert.*;
import org.junit.Test;
public class ConstantTest {

    @Test
    public void testDoubleConstant() {
        Constant constant = new Constant(new Double(5.073));
        assertEquals(java.lang.Double.class, constant.evaluate().getValue().getClass());
        assertEquals(5.073, (double) constant.evaluate().getValue(), 0.0);
    }

    @Test
    public void testDoubleNegativeConstant() {
        Constant constant = new Constant(new Double(-2.9980));
        assertEquals(java.lang.Double.class, constant.evaluate().getValue().getClass());
        assertEquals(-2.9980, (double) constant.evaluate().getValue(), 0.0);
    }

    @Test
    public void testDoubleZeroConstant() {
        Constant constant = new Constant(new Double(0.0));
        assertEquals(java.lang.Double.class, constant.evaluate().getValue().getClass());
        assertEquals(0.0, (double) constant.evaluate().getValue(), 0.0);
    }
    
}
