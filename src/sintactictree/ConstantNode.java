package sintactictree;
public class ConstantNode extends Node{
    private Node node = new Node() {
            @Override
            public boolean Evaluate() {
                return true;
            }
        };
    
    public ConstantNode(Object info){
        node.setInfo(info);
    }

    public Object getInfo(){
        return node.getInfo();
    }
    
    @Override
    public boolean Evaluate() {
        if(node.getInfo().toString().matches("[0-9]") || node.getInfo().toString().matches("[A-Z]")){
            return true;
        }
        return false;
    }
}
