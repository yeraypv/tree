package evaluator.parser;

import evaluator.calculator.constants.Constant;
import evaluator.calculator.operators.OperatorBinary;
import evaluator.tree.Tree;
import evaluator.types.Double;
import evaluator.types.Integer;
import evaluator.operators.Binary;
import junit.framework.Assert;
import org.junit.Test;

public class SintacticTreeParserToStringTest {

    private Tree tree;
    private ParserTreeToString trees;

    @Test
    public void treeToString() {
        tree = new Binary(new Binary(new Binary(new Constant(new Double(5.0)), new Constant(
                new Double(22.0)), OperatorBinary.SUBS), new Binary(new Constant(
                new Double(-1.5)), new Constant(new Integer(2)), OperatorBinary.ADD),
                OperatorBinary.MUL), new Binary(new Binary(new Constant(new Integer(5)),
                new Constant(new Double(2.6)), OperatorBinary.ADD), new Binary(new Constant(new Double(11.5)),
                new Constant(new Integer(7)), OperatorBinary.ADD), OperatorBinary.DIV), OperatorBinary.ADD);

        trees = new ParserTreeToString(tree);
        Assert.assertEquals("(5.0-22.0)*(-1.5+2)+(5+2.6)/(11.5+7)", trees.toString());
        Assert.assertEquals(-8.08918918918919, trees.getValue());

        System.out.println(trees.toString());
        System.out.println(trees.getValue());

        ShuttingYardMethodParser parser = new ShuttingYardMethodParser();
        
        String[] input = "( 1 + 2 ) * ( 3 / 4 ) - ( 5 + 6 )".split(" ");
        String[] output = parser.infixToRPN(input);
 
        
    }
}
