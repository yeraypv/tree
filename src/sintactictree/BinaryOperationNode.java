package sintactictree;
public class BinaryOperationNode extends Node{
    private Node node = new Node() {
            @Override
            public boolean Evaluate() {
                return true;
            }
        };
    
    public BinaryOperationNode(){
        
    }
        
    public BinaryOperationNode(Object info){
        node.setInfo(info);
    }

    public Object getInfo(){
        return node.getInfo();
    }
    
    
    @Override
    public boolean Evaluate() {      
        return false;
    }
    
}
