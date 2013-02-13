package sintactictree;

public abstract class Node {
    protected Object info;
    protected Node right, left;
    abstract boolean Evaluate();
}
