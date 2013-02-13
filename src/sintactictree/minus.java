package sintactictree;

public class minus {
        
    public double add(Node node){
        return node.left.Evaluate() - node.right.Evaluate();
    }
}
