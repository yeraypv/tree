package sintactictree;

public class Substract {
        
    public double substract(Node node){
        return Double.parseDouble(node.getNodeLeft().Evaluate().toString()) - Double.parseDouble(node.getNodeRight().Evaluate().toString());
    }
}
