package sintactictree;

import evaluator.Node;
import evaluator.Tree;
import evaluator.nodes.Constant;
import evaluator.nodes.Operator;
import evaluator.operators.node.Binary;
import evaluator.types.Double;
import static java.lang.System.out;
import static org.junit.Assert.*;
import org.junit.Test;

public class SintacticTreeTest {

    @Test
    public void testTree() {
        out.print("Tree: 1 + 2 * 3 = ");
        Tree tree = new Tree();
        Node uno = new Constant(new Double(1.0));
        Node dos = new Constant(new Double(2.0));
        Node tres = new Constant(new Double(3.0));
        Node multi = new Binary(Operator.mul, dos, tres);
        Node sum = new Binary(Operator.add, uno, multi);
        tree.setRoot(sum);
        out.println(tree.run().getValue());
        assertEquals(7.0, (double) tree.run().getValue(), 0.0);
    }

    @Test
    public void testTree2() {
        out.print("Tree: 1 + 2 - 3 = ");
        Tree tree = new Tree();
        Node uno = new Constant(new Double(1.0));
        Node dos = new Constant(new Double(2.0));
        Node tres = new Constant(new Double(3.0));
        Node resta = new Binary(Operator.subtract, dos, tres);
        Node sum = new Binary(Operator.add, uno, resta);
        tree.setRoot(sum);
        out.println(tree.run().getValue());
        assertEquals(0.0, (double) tree.run().getValue(), 0.0);
    }
}
