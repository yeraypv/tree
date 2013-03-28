package evaluator.elements;

public class Constant extends Node {

   private final Type<?> value;

    public Constant(Type<?> value) {
        this.value = value;
    }
    
    private String getValueString(){
        return value.getValue().toString();
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
