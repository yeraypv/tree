package sintactictree;

public class Type<Object>{
    private Object type, info;
    
    public Type(Object type, Object info){
        this.type = type;
        this.info = info;
    }

    Type() {
        this.type = null;
        this.info = null;
    }
    
    public Object getType(){
        return type;
    }
    
    public Object getInfo(){
        return info;
    }
    
    public void setType(Object type){
        this.type = type;
    }
    
    public void setInfo(Object info){
        this.info = info; 
    }
}
