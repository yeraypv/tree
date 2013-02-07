package sintactictree;
public abstract class Node {
    private Object info;
    private Node right, left;
    
    public void setInfo(Object info){
        this.info = info;
    }
    
    public Object getInfo(){
        return info;
    }
    
    public Node (){
        this.info = null;
        this.right = null;
        this.left = null;
    }
    
    public abstract boolean Evaluate();
}
