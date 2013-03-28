package evaluator.calculator.operators;
import evaluator.nodes.Operator;

public class OperatorBinary extends Operator {
    //TODO:
    public static final OperatorBinary ADD = new OperatorBinary("+", "add", 1);
    public static final OperatorBinary SUBS = new OperatorBinary("-", "substract", 1);
    public static final OperatorBinary MUL = new OperatorBinary("*", "multiply", 2);
    public static final OperatorBinary DIV = new OperatorBinary("/", "division", 2);

    private OperatorBinary(String symbol, String name, int precedence) {
        super(symbol, name, precedence);
    }
    
}
