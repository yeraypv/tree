package sintactictree;
public class ConstantNode extends Node{

    public ConstantNode(double info){
        this.setNodeInfo(info);
        this.setNodeLeft(null);
        this.setNodeRight(null);
    }

    @Override
    public Object Evaluate() {
        return this.getNodeInfo();
    }
}
