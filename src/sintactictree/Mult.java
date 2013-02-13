package sintactictree;
public class Mult extends BinaryOperationNode{  
        
    public double add(Node node){
        return node.left.Evaluate() * node.right.Evaluate();
    }
}
