package sintactictree;

public class Type<TypeGeneric>{
    private String type;
    private TypeGeneric info;
    
    public Type(String type, TypeGeneric info){
        this.type = type;
        this.info = info;
    }

    Type() {
     
    }
    
    public String getType(){
        return type;
    }
    
    public TypeGeneric getInfo(){
        return info;
    }
    
    public void setInfo(TypeGeneric info){
        this.info = info; 
    }
}
