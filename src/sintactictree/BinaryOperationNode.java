package sintactictree;
public class BinaryOperationNode extends Node{
    public BinaryOperationNode(){
        
    }
        
    public BinaryOperationNode(Object info){
        this.info = info;
        this.left = null;
        this.right = null;
    }

    
    @Override
    public boolean Evaluate() {      
        return ((info.toString().matches("[+]")) || info.toString().matches("[-]")||
                (info.toString().matches("[*]")) || info.toString().matches("[/]"))?true:false;
    }
    
}
