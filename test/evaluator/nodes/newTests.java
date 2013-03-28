package evaluator.nodes;

import evaluator.calculator.constants.Constant;
import evaluator.calculator.operators.OperatorBinary;
import evaluator.operators.Binary;
import evaluator.types.Double;
import junit.framework.Assert;
import org.junit.Test;

public class newTests {

    @Test
    public void doubleDoubleAdd() {
        Node addToken = new Binary(new Constant(new Double(1.0)), new Constant(new Double(2.0)), OperatorBinary.ADD);
        Assert.assertEquals(3.0, addToken.evaluate().getValue());
    }


}
