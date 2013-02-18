package sintactictree;

public abstract class Node {
    private Object info;
    private Node right, left;
    public Object getNodeInfo(){
        return info;
    }
    
    public Node getNodeRight(){
        return right;
    }
    
    public Node getNodeLeft(){
        return left;
    }
    
    public void setNodeRight(Node node){
        right = node;
    }
    
    public void setNodeLeft(Node node){
        left = node;
    }
    abstract Object Evaluate();
}
