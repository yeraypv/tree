import junit.framework.Assert;
import org.junit.Test;
import sintactictree.BinaryOperationNode;

public class BinaryOperationNodeTest {
    @Test
    public void CreateBinaryOperationNode(){
        BinaryOperationNode binoperator1 = new BinaryOperationNode("+");
        Assert.assertEquals("+",binoperator1.Evaluate());
        BinaryOperationNode binoperator2 = new BinaryOperationNode("-");
        Assert.assertEquals("-",binoperator2.Evaluate());
        BinaryOperationNode binoperator3 = new BinaryOperationNode("*");
        Assert.assertEquals("*",binoperator3.Evaluate());
        BinaryOperationNode binoperator4 = new BinaryOperationNode("/");
        Assert.assertEquals("/",binoperator4.Evaluate());
    }
    @Test
    
}
