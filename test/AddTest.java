
import org.junit.Assert;
import org.junit.Test;
import sintactictree.Add;
import sintactictree.BinaryOperationNode;
import sintactictree.ConstantNode;
import sintactictree.Node;


public class AddTest {
    private Add add = new Add();
    public void recursiveAdd(Node node, Double aux){
               
        if (node != null){
            recursiveAdd(node.left,aux);
            recursiveAdd(node.right,aux);
            if(node.info != "+"){
                aux += add.add(node);
            }
        }
    }
    
    @Test
    public void addTests(){           
        ConstantNode constant1 = new ConstantNode(1.5);      
        ConstantNode constant2 = new ConstantNode(1.5);
        BinaryOperationNode op1 = new BinaryOperationNode("+");
        ConstantNode constant3 = new ConstantNode(2.5);      
        BinaryOperationNode op2 = new BinaryOperationNode("+");
        op1.left = constant1;
        op1.right = op2;
        op2.left = constant2;
        op2.right = constant3;      
        Add add = new Add();
        double resul = add.add(op2);
        Assert.assertEquals(4.0,resul,1);
        Double aux = 0.0;
        recursiveAdd(op1,aux);
        System.out.println(aux);
    }
}
