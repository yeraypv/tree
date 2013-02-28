import junit.framework.Assert;
import org.junit.Test;
import sintactictree.ConstantNode;

/**
 *
 * @author yeray
 */
public class ConstantNodeTest {

    @Test
    public void CreateConstant(){
        ConstantNode constant1 = new ConstantNode(1);
        Assert.assertEquals(constant1.Evaluate(),1);
        ConstantNode constant2 = new ConstantNode(2.0);
        Assert.assertEquals(constant2.Evaluate(),2.0);
        ConstantNode constant3 = new ConstantNode("a");
        Assert.assertEquals(constant3.Evaluate(),"a");               
        ConstantNode constant4 = new ConstantNode(true);
        Assert.assertEquals(constant4.Evaluate(),true);
    }
}
