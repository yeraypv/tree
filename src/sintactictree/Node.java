package sintactictree;

public abstract class Node<TypeGeneric> {
    private TypeGeneric info;
    private Node right, Left;
    
    public TypeGeneric getNodeInfo(){
        return info;
    }
    
    public Node getNodeRight(){
        return right;
    }
    
    public Node getNodeLeft(){
        return Left;
    }
    
    public void setNodeRight(Node node){
        right = node;
    }
    
    public void setNodeLeft(Node node){
        Left = node;
    }
    
    public void setNodeInfo(TypeGeneric info){
        this.info = info;
    }
    abstract TypeGeneric Evaluate();
}
