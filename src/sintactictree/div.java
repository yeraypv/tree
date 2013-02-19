package sintactictree;

public class div extends BinaryOperationNode{
        
    public double div(Node node){
        //TODO: Exception divide by zero.
        if(node.getNodeLeft().Evaluate() == 0){
            //TODO: Exception.
        }
        return convertDoubleNode(node.getNodeLeft()) * convertDoubleNode(node.getNodeRight());
    }
    
    public double convertDoubleNode(Node node){
        return Double.parseDouble(convertToString(node));
    }
    
    public String convertToString(Node node){
        return node.Evaluate().toString();
    }
}
