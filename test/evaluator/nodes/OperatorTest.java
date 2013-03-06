package evaluator.nodes;

import evaluator.Node;
import evaluator.operators.node.Binary;
import evaluator.types.Double;
import evaluator.types.Integer;
import static org.junit.Assert.*;
import org.junit.Test;

public class OperatorTest {
    
    @Test
    public void addDoubleDouble() {
        Node node = new Binary(Operator.add, new Constant(new Double(50.0)), new Constant(new Double(5.0)));
        assertEquals(java.lang.Double.class, node.evaluate().getValue().getClass());
        assertEquals(55.0, (double) node.evaluate().getValue(), 0.001);
    }

    @Test
    public void addDoubleInteger() {
        Node node = new Binary(Operator.add, new Constant(new Double(-5.0)), new Constant(new Integer(5)));
        assertEquals(java.lang.Double.class, node.evaluate().getValue().getClass());
        assertEquals(0.0, (double) node.evaluate().getValue(), 0.001);
    }

    @Test
    public void addIntegerDouble() {
        Node node = new Binary(Operator.add, new Constant(new Integer(-3)), new Constant(new Double(5.0)));
        assertEquals(java.lang.Double.class, node.evaluate().getValue().getClass());
        assertEquals(2.0, (double) node.evaluate().getValue(), 0.001);
    }

    @Test
    public void addIntegerInteger() {
        Node node = new Binary(Operator.add, new Constant(new Integer(-3)), new Constant(new Integer(-5)));
        assertEquals(java.lang.Integer.class, node.evaluate().getValue().getClass());
        assertEquals(-8, (int) node.evaluate().getValue());
    }
    
    @Test
    public void divIntegerInteger() {
        Node node = new Binary(Operator.div, new Constant(new Integer(5)), new Constant(new Integer(5)));
        assertEquals(java.lang.Integer.class, node.evaluate().getValue().getClass());
        assertEquals(1, (int) node.evaluate().getValue());
    }
    
  
}
