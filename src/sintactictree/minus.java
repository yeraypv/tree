package sintactictree;

public class minus {
        
    public double add(Node node){
        return Double.parseDouble(node.getNodeLeft().Evaluate().toString()) - Double.parseDouble(node.getNodeRight().Evaluate().toString());
    }
}
