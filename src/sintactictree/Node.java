package sintactictree;

public abstract class Node {
    public Object info;
    public Node right, left;
    abstract Object Evaluate();
}
