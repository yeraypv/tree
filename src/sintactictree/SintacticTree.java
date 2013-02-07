package sintactictree;

import static java.lang.System.out;

public class SintacticTree {
    public static void main(String[] args) {
       out.println("hola");
       ConstantNode nodes = new ConstantNode(1);
       out.println(nodes.getInfo().toString());
    }
}