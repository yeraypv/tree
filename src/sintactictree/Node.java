package sintactictree;

public abstract class Node {
    private Object info;
    private Node right, getNodeLeft;
    
    public Object getNodeInfo(){
        return info;
    }
    
    public Node getNodeRight(){
        return right;
    }
    
    public Node getNodeLeft(){
        return getNodeLeft;
    }
    
    public void setNodeRight(Node node){
        right = node;
    }
    
    public void setNodeLeft(Node node){
        getNodeLeft = node;
    }
    
    public void setNodeInfo(Object info){
        this.info = info;
    }
    abstract Object Evaluate();
}
