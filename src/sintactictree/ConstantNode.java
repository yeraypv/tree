package sintactictree;
public class ConstantNode extends Node{

    public ConstantNode(){}
    public ConstantNode(Object info){
        this.info = info;
        this.left = null;
        this.right = null;
    }

    @Override
    public boolean Evaluate() {
        return ((info.toString().matches("[0-9]")) || info.toString().matches("[A-Z]"))?true:false;
    }
}
