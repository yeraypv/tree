
import org.junit.Assert;
import org.junit.Test;
import sintactictree.Add;
import sintactictree.BinaryOperationNode;
import sintactictree.ConstantNode;


public class AddTest {
    
    @Test
    public void addTests(){           
        ConstantNode constant1 = new ConstantNode(1.5);      
        ConstantNode constant2 = new ConstantNode(1.5);
        BinaryOperationNode op1 = new BinaryOperationNode("+");
        ConstantNode constant3 = new ConstantNode(2.5);      
        BinaryOperationNode op2 = new BinaryOperationNode("+");
        op1.setNodeLeft(constant1);
        op1.setNodeRight(op2);
        op2.setNodeLeft(constant2);
        op2.setNodeRight(constant3);      
        Add add = new Add();
        double resul = add.add(op2);
        Assert.assertEquals(4.0,resul,1);
        Double aux = 0.0;
        System.out.println(aux);
    }
}
