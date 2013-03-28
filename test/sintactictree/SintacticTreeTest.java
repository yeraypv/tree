package sintactictree;

import evaluator.elements.Node;
import evaluator.elements.Tree;
import evaluator.elements.Constant;
import evaluator.nodes.Operator;
import evaluator.operators.node.Binary;
import evaluator.types.Double;
import static java.lang.System.out;
import static org.junit.Assert.*;
import org.junit.Test;

public class SintacticTreeTest {

    @Test
    public void testTree() {
        Tree tree = new Tree();
        Node num1 = new Constant(new Double(1.0));
        Node num2 = new Constant(new Double(3.0));
        Node num3 = new Constant(new Double(3.0));
        Node multi = new Binary(Operator.mul, num2, num3);
        Node sum = new Binary(Operator.add, num1, multi);
        tree.setRoot(sum);
        out.println(tree.run().getValue());
        assertEquals(10.0, (double) tree.run().getValue(), 0.0);
    }

    @Test
    public void testTree2() {
        Tree tree = new Tree();
        Node num1 = new Constant(new Double(1.0));
        Node num2 = new Constant(new Double(2.0));
        Node num3 = new Constant(new Double(3.0));
        Node resta = new Binary(Operator.substract, num2, num3);
        Node sum = new Binary(Operator.add, num1, resta);
        tree.setRoot(sum);
        out.println(tree.run().getValue());
        assertEquals(0.0, (double) tree.run().getValue(), 0.0);
    }
}
