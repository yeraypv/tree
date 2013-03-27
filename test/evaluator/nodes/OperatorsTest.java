package evaluator.nodes;

import evaluator.elements.Node;
import evaluator.elements.Type;
import evaluator.operators.node.Binary;
import evaluator.types.Double;
import evaluator.types.Integer;
import static org.junit.Assert.*;
import org.junit.Test;

public class OperatorsTest {

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
    public void substractDoubleDouble() {
        Node node = new Binary(Operator.substract, new Constant(new Double(50.0)), new Constant(new Double(5.0)));
        assertEquals(java.lang.Double.class, node.evaluate().getValue().getClass());
        assertEquals(45.0, (double) node.evaluate().getValue(), 0.001);
    }

    @Test
    public void substractDoubleInteger() {
        Node node = new Binary(Operator.substract, new Constant(new Double(-5.0)), new Constant(new Integer(5)));
        assertEquals(java.lang.Double.class, node.evaluate().getValue().getClass());
        assertEquals(-10.0, (double) node.evaluate().getValue(), 0.001);
    }

    @Test
    public void substractIntegerDouble() {
        Node node = new Binary(Operator.substract, new Constant(new Integer(-3)), new Constant(new Double(5.0)));
        assertEquals(java.lang.Double.class, node.evaluate().getValue().getClass());
        assertEquals(-8.0, (double) node.evaluate().getValue(), 0.001);
    }

    @Test
    public void substractIntegerInteger() {
        Node node = new Binary(Operator.substract, new Constant(new Integer(-3)), new Constant(new Integer(-5)));
        assertEquals(java.lang.Integer.class, node.evaluate().getValue().getClass());
        assertEquals(2, (int) node.evaluate().getValue());
    }

    @Test
    public void divIntegerInteger() {
        Node node = new Binary(Operator.div, new Constant(new Integer(5)), new Constant(new Integer(5)));
        assertEquals(java.lang.Integer.class, node.evaluate().getValue().getClass());
        assertEquals(1, (int) node.evaluate().getValue());
    }

    @Test
    public void divIntegerDouble() {
        Node node = new Binary(Operator.div, new Constant(new Integer(5)), new Constant(new Double(5.0)));
        assertEquals(java.lang.Double.class, node.evaluate().getValue().getClass());
        assertEquals(1.0, (double) node.evaluate().getValue(), 0.001);
    }

    @Test
    public void divDoubleInteger() {
        Node node = new Binary(Operator.div, new Constant(new Double(5.0)), new Constant(new Integer(-5)));
        assertEquals(java.lang.Double.class, node.evaluate().getValue().getClass());
        assertEquals(-1.0, (double) node.evaluate().getValue(), 0.001);
    }

    @Test
    public void divDoubleDouble() {
        Node node = new Binary(Operator.div, new Constant(new Double(5.0)), new Constant(new Double(-5.0)));
        assertEquals(java.lang.Double.class, node.evaluate().getValue().getClass());
        assertEquals(-1.0, (double) node.evaluate().getValue(), 0.001);
    }


    @Test
    public void addStringString() {
        Type num1 = new Type("hola") {};
        Type num2 = new Type("hola") {};
        Type r = new Type("") {};
        Node node = new Binary(Operator.add, new Constant(num1), new Constant(num2));
        assertEquals("holahola", node.evaluate().getValue());
    }
    

}
