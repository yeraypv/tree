/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sintactictree;

/**
 *
 * @author yeray
 */
public class div extends BinaryOperationNode{
        
    public double div(Node node){
        //TODO: Exception divide by zero.
        return (node.left.Evaluate() / node.right.Evaluate());
    }
}
