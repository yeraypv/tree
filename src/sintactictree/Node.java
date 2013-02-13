package sintactictree;

public abstract class Node {
    protected double info;
    protected Node right, left;
    abstract double Evaluate();
}
