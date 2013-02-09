package sintactictree;

public abstract class Node {
    private Object info;
    private Node right, left;
    
        
    public Node (){
        this.info = null;
        this.right = null;
        this.left = null;
    }
    
    public Node (Object info){
        this.info = info;
        this.right = null;
        this.left = null;
    }
    
    public Object getInfo() {
        return info;
    }

    public Node getNodeRight() {
        return right;
    }
      
    public Node getNodeLeft() {
        return left;
    }

    public void setInfo(Object info){
        this.info = info;
    }
    public void setNodeRight(Node rnode) {
        this.right = rnode;
    }

    public void setNodeLeft(Node lnode) {
        this.left = lnode;
    }

    public abstract boolean Evaluate();
}
