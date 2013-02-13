package sintactictree;

public class Add extends BinaryOperationNode{  
    
    public double add(Node node){
        return node.left.Evaluate() + node.right.Evaluate();
    }
}
