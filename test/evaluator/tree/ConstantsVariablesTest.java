package evaluator.tree;

import evaluator.types.Double;
import static org.junit.Assert.*;
import org.junit.Test;

public class ConstantsVariablesTest {

    @Test
    public void setsVariables() {
        Variables variable = new Variables(new Double(2.0));
        assertEquals(java.lang.Double.class, variable.evaluate().getValue().getClass());
        assertEquals(2.0, (double) variable.getValue(), 0.0);

        variable.setType(new Double(3.0));
        assertEquals(java.lang.Double.class, variable.evaluate().getValue().getClass());
        assertEquals(3.0, (double) variable.getValue(), 0.0);
    }

    @Test
    public void testEvaluates() {
        Variables variable = new Variables(new Double(2.0));
        assertEquals(java.lang.Double.class, variable.evaluate().getValue().getClass());
        assertEquals(2.0, (double) variable.getValue(), 0.0);
    }
}
