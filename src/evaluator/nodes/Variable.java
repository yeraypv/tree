package evaluator.nodes;

class Variable extends Node {

    private Type type;

    public Variable(Type value) {
        this.type = value;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public Type evaluate() {
        return type;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
