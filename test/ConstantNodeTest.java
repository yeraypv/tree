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
        Assert.assertEquals(constant1.Evaluate(),1.0);
        ConstantNode constant2 = new ConstantNode(2);
        Assert.assertEquals(constant2.Evaluate(),2.0);
        ConstantNode constant3 = new ConstantNode(3);
        Assert.assertEquals(constant3.Evaluate(),3.0);
    }
}
