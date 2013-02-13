package sintactictree;
public class BinaryOperationNode extends Node{
    public BinaryOperationNode(){   
    }
        
    public BinaryOperationNode(double info){
        this.info = info;
        this.left = null;
        this.right = null;
    }

    @Override
    public double Evaluate() { 
        return this.info;
    }
    
}
