package sintactictree;

public class Add extends BinaryOperationNode{  
    
    public double add(Node node){       
        return Double.parseDouble(node.left.Evaluate().toString()) + Double.parseDouble(node.right.Evaluate().toString());
    }
}
