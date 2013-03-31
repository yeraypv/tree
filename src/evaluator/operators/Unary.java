package evaluator.operators;

import evaluator.calculators.Calculate;
import evaluator.nodes.Node;
import evaluator.nodes.Operation;
import evaluator.nodes.Operator;
import evaluator.nodes.Type;

public class Unary extends Operation {
 
    private Calculate calculatorEvaluator = new Calculate();
    private final Operator unary;
    private final Node info;

    public Unary(Operator unary, Node info) {
        this.unary = unary;
        this.info = info;
    }

    public Node getInfo() {
        return info;
    }
    
    public Operator getOperator() {
        return unary;
    }

    @Override
    public Type evaluate() {
        return calculatorEvaluator.getType(unary, new Type[]{info.evaluate()});
    }

    @Override
    public String toString() {
        return info.toString() + unary.getInfo();
    }
}
