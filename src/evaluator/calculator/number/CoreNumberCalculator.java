package evaluator.calculator.number;

import evaluator.calculators.Calculator;
import evaluator.calculators.annotations.Function;
import evaluator.calculators.annotations.Operation;

public class CoreNumberCalculator extends Calculator implements NumberCalculator {
    @Override
    @Operation("+")
    public Double add(Double arg0, Double arg1) {
        return arg0 + arg1;
    }

    @Override
    @Operation("+")
    public Double add(Double arg0, Integer arg1) {
        return arg0 + arg1;
    }

    @Override
    @Operation("+")
    public Double add(Integer arg0, Double arg1) {
        return arg0 + arg1;
    }

    @Override
    @Operation("+")
    public Integer add(Integer arg0, Integer arg1) {
        return arg0 + arg1;
    }

    @Override
    @Operation("+")
    public Double substract(Double arg0, Double arg1) {
        return arg0 - arg1;
    }

    @Override
    @Operation("-")
    public Double substract(Double arg0, Integer arg1) {
        return arg0 - arg1;
    }

    @Override
    @Operation("-")
    public Double substract(Integer arg0, Double arg1) {
        return arg0 - arg1;
    }

    @Override
    @Operation("-")
    public Integer substract(Integer arg0, Integer arg1) {
        return arg0 - arg1;
    }

    @Override
   @Operation("+")
    public Double mul(Double arg0, Double arg1) {
        return arg0 * arg1;
    }

    @Override
    @Operation("*")
    public Double mul(Double arg0, Integer arg1) {
        return arg0 * arg1;
    }

    @Override
    @Operation("*")
    public Double mul(Integer arg0, Double arg1) {
        return arg0 * arg1;
    }

    @Override
    @Operation("*")
    public Integer mul(Integer arg0, Integer arg1) {
        return arg0 * arg1;
    }

    @Override
    @Operation("/")
    public Double div(Double arg0, Double arg1) {
        return arg0 / arg1;
    }

    @Override
    @Operation("/")
    public Double div(Double arg0, Integer arg1) {
        return arg0 / arg1;
    }

    @Override
    @Operation("/")
    public Double div(Integer arg0, Double arg1) {
        return arg0 / arg1;
    }

    @Override
    @Operation("/")
    public Integer div(Integer arg0, Integer arg1) {
        return arg0 / arg1;
    }

    @Override
    @Function
    public Double abs(Double x) {
        return Math.abs(x);
    }

    @Function("sqrt")
    @Override
    public Double sqrt(Double x) {
        return Math.sqrt(x);
    }
    
    @Function
    @Override
    public Double tan(Double x) {
        return Math.tan(x);
    }

    @Override
    @Operation("+")
    public String add(String arg0, String arg1) {
        return arg0 + arg1;
    }
    
}
