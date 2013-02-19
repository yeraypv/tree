package sintactictree;

public class Add extends BinaryOperationNode{  
    
    public double add(Node node){       
        return Double.parseDouble(node.getNodeLeft().Evaluate().toString() + node.getNodeRight().Evaluate().toString());
 
    }
}
