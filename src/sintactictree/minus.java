package sintactictree;

public class minus {
        
    public double add(Node node){
        return Double.parseDouble(node.left.Evaluate().toString()) - Double.parseDouble(node.right.Evaluate().toString());
    }
}
