package evaluator.operators.node;

import evaluator.calculator.operators.OperatorBinary;
import evaluator.calculators.Calculate;
import evaluator.elements.Node;
import evaluator.elements.Type;
import evaluator.nodes.Operation;
import evaluator.nodes.Operator;

public class Binary extends Operation {
    private Calculate calculatorEvaluator = new Calculate();
    private final Node leftChild;
    private final Node rightChild;
    private final OperatorBinary operator;

    public Binary(Node Left, Node Right, OperatorBinary operator) {
        this.leftChild = Left;
        this.rightChild = Right;
        this.operator = operator;
    }

    public Operator getOperator() {
        return operator;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }
    
    private int getIndexOperator(Binary binary){
        return binary.getOperator().getIndexOperator();
    }
    
    private boolean isMaxPreference(Binary binary1, Binary binary2) {
        return (getIndexOperator(binary1) > getIndexOperator(binary2)) ? true : false;
    }

    private String StringCatch(Node elem) {
        return (elem instanceof Binary && isMaxPreference(this, (Binary) elem))? "(" + elem.toString() + ")" : elem.toString();
    }
        
    @Override
    public Type evaluate() {
        return calculatorEvaluator.getType(operator, new Type[]{leftChild.evaluate(), rightChild.evaluate()});
    }
        
    @Override
    public String toString() {
        return StringCatch(leftChild) + operator.getInfo() + StringCatch(rightChild);
    }

}
