package evaluator.calculators;

import evaluator.calculators.annotations.Constant;
import evaluator.calculators.annotations.Function;
import evaluator.calculators.annotations.Operation;
import evaluator.types.Double;
import evaluator.types.Integer;

public class CoreNumberCalculator implements Calculator {
   
    public CoreNumberCalculator() {
    }
   
    @Constant
    public static final double PI = Math.PI;
      
    @Constant
    public static final double E = Math.E;

      @Operation("+")
    public static Double add(Double p0, Double p1) {
        return new Double(p0.getValue() + p1.getValue());
    }

    @Operation("+")
    public static Double add(Double p0, Integer p1) {
        return new Double(p0.getValue() + p1.getValue());
    }

    @Operation("+")
    public static Double add(Integer p0, Double p1) {
        return new Double(p0.getValue() + p1.getValue());
    }

    @Operation("+")
    public static Integer add(Integer p0, Integer p1) {
        return new Integer(p0.getValue() + p1.getValue());
    }

    @Operation("-")
    public static Double substract(Double p0, Double p1) {
        return new Double(p0.getValue() - p1.getValue());
    }

    @Operation("-")
    public static Double substract(Double p0, Integer p1) {
        return new Double(p0.getValue() - p1.getValue());
    }

    @Operation("-")
    public static Double substract(Integer p0, Double p1) {
        return new Double(p0.getValue() - p1.getValue());
    }

    @Operation("-")
    public static Integer substract(Integer p0, Integer p1) {
        return new Integer(p0.getValue() - p1.getValue());
    }

    @Operation("*")
    public static Double mul(Double p0, Double p1) {
        return new Double(p0.getValue() * p1.getValue());
    }

    @Operation("*")
    public static Double mul(Double p0, Integer p1) {
        return new Double(p0.getValue() * p1.getValue());
    }

    @Operation("*")
    public static Double mul(Integer p0, Double p1) {
        return new Double(p0.getValue() * p1.getValue());
    }

    @Operation("*")
    public static Integer mul(Integer p0, Integer p1) {
        return new Integer(p0.getValue() * p1.getValue());
    }
    
    @Function
    public static double abs(Double x) {
        return Math.abs(x.getValue());
    }

    @Function("sqrt")
    public static double sqrt(Double x) {
        return Math.sqrt(x.getValue());
    }
    
    @Function("tan")
    public static double tan(Double x) {
        return Math.tan(x.getValue());
    }
    
}
