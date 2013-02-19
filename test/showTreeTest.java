
import org.junit.Test;
import static org.junit.Assert.*;
import sintactictree.BinaryOperationNode;
import sintactictree.ConstantNode;
import sintactictree.Node;

/**
 *
 * @author usuario
 */
public class showTreeTest {

    public void show(Node node){
        if (node != null){
            show(node.getNodeLeft());
            System.out.print(node.getNodeInfo() + " ");
            show(node.getNodeRight());
        }
    }
    @Test
    public void showTree(){
        ConstantNode constant1 = new ConstantNode(1.5);      
        ConstantNode constant2 = new ConstantNode(3.1432);
        BinaryOperationNode op1 = new BinaryOperationNode("+");
        ConstantNode constant3 = new ConstantNode(4.5);      
        BinaryOperationNode op2 = new BinaryOperationNode("*");
        op1.setNodeLeft(constant1);
        op1.setNodeRight(op2);
        op2.setNodeLeft(constant2);
        op2.setNodeRight(constant3);    
        show(op1);
    }
}
