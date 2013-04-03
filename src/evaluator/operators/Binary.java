package evaluator.operators;

import evaluator.calculator.operators.OperatorBinary;
import evaluator.calculators.Calculate;
import evaluator.tree.Operation;
import evaluator.tree.Operator;
import evaluator.tree.Tree;
import evaluator.tree.Type;

public class Binary extends Operation {
    private Calculate calculatorEvaluator = new Calculate();
    private final Tree leftNode;
    private final Tree rightNode;
    private final OperatorBinary operator;

    public Binary(Tree Left, Tree Right, OperatorBinary operator) {
        this.leftNode = Left;
        this.rightNode = Right;
        this.operator = operator;
    }

    public Operator getOperator() {
        return operator;
    }

    public Tree getLeftChild() {
        return leftNode;
    }

    public Tree getRightChild() {
        return rightNode;
    }
    
    private int getIndexOperator(Binary binary){
        return binary.getOperator().getIndexOperator();
    }
    
    private boolean isMaxPreference(Binary binary1, Binary binary2) {
        return (getIndexOperator(binary1) > getIndexOperator(binary2)) ? true : false;
    }

    private boolean isBinary(Tree elem){
        return elem instanceof Binary;
    }
    
    private boolean isBinaryAndMaxPreference(Tree elem){
        return isBinary(elem) && isMaxPreference(this, (Binary) elem);
    }
    
    private String StringCatch(Tree elem) {
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
