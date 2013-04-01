package evaluator.parser;

import evaluator.calculator.constants.Constant;
import evaluator.calculator.operators.OperatorBinary;
import evaluator.nodes.Node;
import evaluator.operators.Binary;
import junit.framework.Assert;
import org.junit.Test;

public class SintacticTreeParserToStringTest {

    private Node tree;
    private ParserTreeToString trees;

    @Test
    public void treeToString() {
        tree = new Binary(new Binary(new Binary(new Constant(new evaluator.types.Double(5.0)), new Constant(
                new evaluator.types.Double(22.0)), OperatorBinary.SUBS), new Binary(new Constant(
                new evaluator.types.Double(-1.5)), new Constant(new evaluator.types.Integer(2)), OperatorBinary.ADD),
                OperatorBinary.MUL), new Binary(new Binary(new Constant(new evaluator.types.Integer(5)),
                new Constant(new evaluator.types.Double(2.6)), OperatorBinary.ADD), new Binary(new Constant(new evaluator.types.Double(11.5)),
                new Constant(new evaluator.types.Integer(7)), OperatorBinary.ADD), OperatorBinary.DIV), OperatorBinary.ADD);

        trees = new ParserTreeToString(tree);
        Assert.assertEquals("(5.0-22.0)*(-1.5+2)+(5+2.6)/(11.5+7)", trees.toString());
        Assert.assertEquals(-8.08918918918919, trees.getValue());

        System.out.println(trees.toString());
        System.out.println(trees.getValue());
    }
}