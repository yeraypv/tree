package evaluator.operators.node;

import evaluator.elements.Node;
import evaluator.elements.Type;
import evaluator.nodes.Operation;
import evaluator.nodes.Operator;

public class Unary extends Operation {

    private final Operator unaryOperation;
    private final Node child;

    public Unary(Operator unaryOperation, Node child) {
        this.unaryOperation = unaryOperation;
        this.child = child;
    }

    public Node getChild() {
        return child;
    }

    @Override
    public Type evaluate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
