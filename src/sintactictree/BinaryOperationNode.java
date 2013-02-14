package sintactictree;
public class BinaryOperationNode extends Node{
    public BinaryOperationNode(){   
    }
        
    public BinaryOperationNode(String info){
        this.info = info;
        this.left = null;
        this.right = null;
    }
    
    @Override
    public Object Evaluate() { 
        return info;
    }
}
