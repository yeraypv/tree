package sintactictree;

public class BinaryOperationNode<TypeGeneric> extends Node{
    private TypeGeneric info;
    public BinaryOperationNode(){   
    }
        
    public BinaryOperationNode(TypeGeneric info){
        this.info = info;
        this.setNodeLeft(null);
        this.setNodeRight(null);
    }
    
    @Override
    public TypeGeneric Evaluate() { 
        return info;
    }
}
