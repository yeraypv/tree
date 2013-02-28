package sintactictree;
public class UnaryOperationNode<TypeGeneric> extends Node {
        public UnaryOperationNode(){   
    }
        
    public UnaryOperationNode(TypeGeneric info){
        this.setNodeInfo(info);
        this.setNodeLeft(null);
        this.setNodeRight(null);
    }
    
    @Override
    public TypeGeneric Evaluate() { 
        return (TypeGeneric) this.getNodeInfo();
    }
    
}
