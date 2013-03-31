
package evaluator.mockito.tests;

import evaluator.nodes.Node;
import evaluator.nodes.Operator;
import evaluator.nodes.Type;
import evaluator.operators.Binary;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class MockitoTest {

    private Binary binaryOperation;
    
    @Before
    public void createBinary(){
        binaryOperation = mock(Binary.class);
    }
    
    public Operator getOperator(){                
        return binaryOperation.getOperator();
    }

    public Node getLeftChild() {
        return binaryOperation.getLeftChild();
    }

    public Node getRightChild() {
        return binaryOperation.getRightChild();
    }
    
    public String toString(){
        return binaryOperation.toString();
    }
    
    public Type evalutate(){
        return binaryOperation.evaluate();
    }
}
