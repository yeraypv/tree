package evaluator.parser;

import evaluator.nodes.Node;
import evaluator.nodes.Type;

public class ParserTreeToString extends Node{
    
    private Node tree;

    public ParserTreeToString(Node tree){
        this.tree = tree;
    }
    
    public Object getValue(){
        return evaluate().getValue();
    }
    
    @Override
    public Type evaluate() {
        return tree.evaluate();
    }

    @Override
    public String toString() {
        return tree.toString();
    }
    
}
