package sintactictree;
public class ConstantNode<TypeGeneric> extends Node{

    public ConstantNode(TypeGeneric info){
        this.setNodeInfo(info);
        this.setNodeLeft(null);
        this.setNodeRight(null);
    }

    @Override
    public TypeGeneric Evaluate() {
        return (TypeGeneric) this.getNodeInfo();
    }
}
