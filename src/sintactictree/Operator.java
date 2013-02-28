package sintactictree;

import java.util.HashMap;

public class Operator {
    private String symbol;
    private boolean isBinary;
    
    private static HashMap<String,Operator> operatorMap;
    
    static{
        operatorMap = new HashMap<>();
        operatorMap.put("+", new Operator("+",true));//TODO: true por BINARY.
    }
    
    private Operator(String symbol, boolean isBinary){ //TODO: true por BINARY.
        this.isBinary = isBinary;
        this.symbol = symbol;
    }
    
    public static Operator get(String symbol){
        return operatorMap.get(symbol);
    }
    
}
