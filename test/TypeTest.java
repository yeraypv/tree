import org.junit.Test;
import sintactictree.BinaryOperationNode;
import sintactictree.NumberCalculator;
import sintactictree.Type;


public class TypeTest {
    @Test
    public void CreateTypeAdd(){

        Type arg1 = new Type("Integer",2);
        Type arg2 = new Type("Double",2.0);
        
        NumberCalculator calculator = new NumberCalculator();   

        BinaryOperationNode operator = new BinaryOperationNode("add");
        
        Type type = calculator.calculate(operator, arg1, arg2);
        System.out.println(type.getInfo());
    
    }
}
