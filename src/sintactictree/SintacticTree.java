package sintactictree;
import static java.lang.System.out;

public class SintacticTree {
    public static void main(String[] args) {
       //out.println("hola");
        ConstantNode cnode = new ConstantNode("9");
        BinaryOperationNode bnode = new BinaryOperationNode("+");
        out.println(cnode.getInfo());
        if(cnode.Evaluate()){
            out.println("es constante");
        }
        else{
            out.println("no es constante");
        }
        
                
        if(bnode.Evaluate()){
            out.println("es operador");
        }
        else{
            out.println("no es operador");
        }
    }
}