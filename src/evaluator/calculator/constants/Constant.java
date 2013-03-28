package evaluator.calculator.constants;

import evaluator.nodes.Node;
import evaluator.nodes.Type;

public class Constant extends Node {
    private final Type<?> value;

    private String getValueString(){
        return value.getValue().toString();
    }
    
    public Constant(Type<?> value) {
        this.value = value;
    }

    @Override
    public Type<?> evaluate() {
        return value;
    }

    @Override
    public String toString() {
        return getValueString();
    }
}
