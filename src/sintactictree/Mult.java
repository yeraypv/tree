package sintactictree;
public class Mult extends BinaryOperationNode{  
        
    public double add(Node node){
        return Double.parseDouble(node.left.Evaluate().toString()) * Double.parseDouble(node.right.Evaluate().toString());
    }
}
