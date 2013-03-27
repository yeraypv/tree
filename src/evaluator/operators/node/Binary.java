package evaluator.operators.node;

import evaluator.elements.Node;
import evaluator.elements.Type;
import evaluator.calculators.CalculateEvaluate;
import evaluator.calculators.Evaluate;
import evaluator.nodes.Operation;
import evaluator.nodes.Operator;

public class Binary extends Operation {

    private final Operator operator;
    private final Node left, right;
    private Evaluate evaluate = new CalculateEvaluate();

    public Binary(Operator operation, Node leftChild, Node rightChild) {
        this.operator = operation;
        this.left = leftChild;
        this.right = rightChild;
    }

    public Operator getOperator() {
        return operator;
    }

    public Node getLeftChild() {
        return left;
    }

    public Node getRightChild() {
        return right;
    }

    @Override
    public Type evaluate() {
        Type left = getLeftChild().evaluate();
        Type right = getRightChild().evaluate();
        return evaluate.calculate(operator, left, right);
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
