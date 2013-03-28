package evaluator.calculator.number;

import evaluator.calculators.Calculator;
import evaluator.calculators.annotations.Constant;
import evaluator.calculators.annotations.Function;
import evaluator.calculators.annotations.Operation;

public class CoreNumberCalculator implements Calculator {

      
    @Constant
    public static final double PI = Math.PI;
      
    @Constant
    public static final double E = Math.E;

    @Operation("+")
    public Double add(Double arg0, Double arg1) {
        return arg0 + arg1;
    }


    @Operation("+")
    public Double add(Double arg0, Integer arg1) {
        return arg0 + arg1;
    }


    @Operation("+")
    public Double add(Integer arg0, Double arg1) {
        return arg0 + arg1;
    }


    @Operation("+")
    public Integer add(Integer arg0, Integer arg1) {
        return arg0 + arg1;
    }


    @Operation("+")
    public Double substract(Double arg0, Double arg1) {
        return arg0 - arg1;
    }

 
    @Operation("-")
    public Double substract(Double arg0, Integer arg1) {
        return arg0 - arg1;
    }

 
    @Operation("-")
    public Double substract(Integer arg0, Double arg1) {
        return arg0 - arg1;
    }


    @Operation("-")
    public Integer substract(Integer arg0, Integer arg1) {
        return arg0 - arg1;
    }


   @Operation("+")
    public Double mul(Double arg0, Double arg1) {
        return arg0 * arg1;
    }


    @Operation("*")
    public Double mul(Double arg0, Integer arg1) {
        return arg0 * arg1;
    }


    @Operation("*")
    public Double mul(Integer arg0, Double arg1) {
        return arg0 * arg1;
    }

    @Operation("*")
    public Integer mul(Integer arg0, Integer arg1) {
        return arg0 * arg1;
    }

    @Operation("/")
    public Double div(Double arg0, Double arg1) {
        return arg0 / arg1;
    }

    @Operation("/")
    public Double div(Double arg0, Integer arg1) {
        return arg0 / arg1;
    }

    @Operation("/")
    public Double div(Integer arg0, Double arg1) {
        return arg0 / arg1;
    }


    @Operation("/")
    public Integer div(Integer arg0, Integer arg1) {
        return arg0 / arg1;
    }


    @Function
    public Double abs(Double x) {
        return Math.abs(x);
    }

    @Function("sqrt")
    public Double sqrt(Double x) {
        return Math.sqrt(x);
    }
    
    @Function

    public Double tan(Double x) {
        return Math.tan(x);
    }


    @Operation("+")
    public String add(String arg0, String arg1) {
        return arg0 + arg1;
    }
    
}
