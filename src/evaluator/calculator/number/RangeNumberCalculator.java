package evaluator.calculator.number;

public class RangeNumberCalculator implements NumberCalculator {

    private final NumberCalculator calculator;
    private final Range range;

    public RangeNumberCalculator(NumberCalculator calculator, Range range) {
        this.calculator = calculator;
        this.range = range;
    }

    public Range getRange() {
        return range;
    }

    public Double getUpperLimit() {
        return range.getUpperLimit();
    }

    public Double getLowerLimit() {
        return range.getLowerLimit();
    }

    private Double validate(Double arg0) {
        if (arg0 > getUpperLimit()) {
            return null;
            // TODO falta Implemetar limites de rango
        }
        if (arg0 < getLowerLimit()) {
            return null;
        }
        return arg0;
    }

    @Override
    public Double add(Double arg0, Double arg1) {
        return calculator.add(arg0, arg1);
    }

    @Override
    public Double add(Double arg0, Integer arg1) {
        return calculator.add(arg0, arg1);
    }

    @Override
    public Double add(Integer arg0, Double arg1) {
        return calculator.add(arg0, arg1);
    }

    @Override
    public Integer add(Integer arg0, Integer arg1) {
        return calculator.add(arg0, arg1);
    }

    @Override
    public Double substract(Double arg0, Double arg1) {
        return calculator.substract(arg0, arg1);
    }

    @Override
    public Double substract(Double arg0, Integer arg1) {
        return calculator.substract(arg0, arg1);
    }

    @Override
    public Double substract(Integer arg0, Double arg1) {
        return calculator.substract(arg0, arg1);
    }

    @Override
    public Integer substract(Integer arg0, Integer arg1) {
        return calculator.substract(arg0, arg1);
    }

    @Override
    public Double mul(Double arg0, Double arg1) {
        return calculator.mul(arg0, arg1);
    }

    @Override
    public Double mul(Double arg0, Integer arg1) {
        return calculator.mul(arg0, arg1);
    }

    @Override
    public Double mul(Integer arg0, Double arg1) {
        return calculator.mul(arg0, arg1);
    }

    @Override
    public Integer mul(Integer arg0, Integer arg1) {
        return calculator.mul(arg0, arg1);
    }

    @Override
    public Double div(Double arg0, Double arg1) {
         return calculator.div(arg0, arg1);
    }

    @Override
    public Double div(Double arg0, Integer arg1) {
        return calculator.div(arg0, arg1);
    }

    @Override
    public Double div(Integer arg0, Double arg1) {              
        return calculator.div(arg0, arg1);
    }

    @Override
    public Integer div(Integer arg0, Integer arg1) {       
        return calculator.div(arg0, arg1);
    }

    @Override
    public Double abs(Double x) {
        return calculator.abs(x);
    }

    @Override
    public Double sqrt(Double x) {
        return calculator.abs(x);
    }

}
