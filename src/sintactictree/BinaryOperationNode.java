package sintactictree;
public class BinaryOperationNode extends Node{
    public BinaryOperationNode(){   
    }
        
    public BinaryOperationNode(String info){
        this.setNodeInfo(info);
        this.setNodeLeft(null);
        this.setNodeRight(null);
    }
    
    @Override
    public Object Evaluate() { 
        return this.getNodeInfo();
    }
}
