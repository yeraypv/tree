package sintactictree;

public class div extends BinaryOperationNode{
        
    public double div(Node node){
        //TODO: Exception divide by zero.
        if(node.right.Evaluate() == 0){
            //TODO: Exception.
        }
        return convertDoubleNode(node.left) * convertDoubleNode(node.right);
    }
    
    public double convertDoubleNode(Node node){
        return Double.parseDouble(convertToString(node));
    }
    
    public String convertToString(Node node){
        return node.Evaluate().toString();
    }
}
