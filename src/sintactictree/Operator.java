package sintactictree;
public class Operator extends Node{
    public Operator(){   
    }
        
    public Operator(String info){
        this.setNodeInfo(info);
        this.setNodeLeft(null);
        this.setNodeRight(null);
    }
    
    @Override
    public Object Evaluate() { 
        return this.getNodeInfo();
    }
}
