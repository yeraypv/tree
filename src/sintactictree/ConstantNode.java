package sintactictree;
public class ConstantNode extends Node{

    public ConstantNode(double info){
        this.info = info;
        this.left = null;
        this.right = null;
    }

    @Override
    public Object Evaluate() {
        return info;
    }
}
