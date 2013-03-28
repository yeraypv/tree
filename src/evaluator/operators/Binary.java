package evaluator.operators;

import evaluator.calculator.operators.OperatorBinary;
import evaluator.calculators.Calculate;
import evaluator.nodes.Node;
import evaluator.nodes.Operation;
import evaluator.nodes.Operator;
import evaluator.nodes.Type;

public class Binary extends Operation {
    private Calculate calculatorEvaluator = new Calculate();
    private final Node leftNode;
    private final Node rightNode;
    private final OperatorBinary operator;

    public Binary(Node Left, Node Right, OperatorBinary operator) {
        this.leftNode = Left;
        this.rightNode = Right;
        this.operator = operator;
    }

    public Operator getOperator() {
        return operator;
    }

    public Node getLeftChild() {
        return leftNode;
    }

    public Node getRightChild() {
        return rightNode;
    }
    
    private int getIndexOperator(Binary binary){
        return binary.getOperator().getIndexOperator();
    }
    
    private boolean isMaxPreference(Binary binary1, Binary binary2) {
        return (getIndexOperator(binary1) > getIndexOperator(binary2)) ? true : false;
    }

    private boolean isBinary(Node elem){
        return elem instanceof Binary;
    }
    
    private boolean isBinaryAndMaxPreference(Node elem){
        return isBinary(elem) && isMaxPreference(this, (Binary) elem);
    }
    
    private String StringCatch(Node elem) {
        return (isBinaryAndMaxPreference(elem))? "(" + elem.toString() + ")" : elem.toString();
    }
        
    @Override
    public Type evaluate() {
        return calculatorEvaluator.getType(operator, new Type[]{leftNode.evaluate(), rightNode.evaluate()});
    }
        
    @Override
    public String toString() {
        return StringCatch(leftNode) + operator.getInfo() + StringCatch(rightNode);
    }

}
