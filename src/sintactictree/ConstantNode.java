package sintactictree;
public class ConstantNode extends Node{    
    private Node node;
    
    public ConstantNode(Object info){
        node.setInfo(info);
    }
    
    public Object getInfo(){
        return node.getInfo();
    }
    
    @Override
    public boolean Evaluate() {
       return true;
    }
}
