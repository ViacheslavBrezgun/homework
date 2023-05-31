package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    @Override
    public double division(double a, double b) {
        return super.division(a, b);
    }

    @Override
    public double multiplication(double a, double b) {
        return super.multiplication(a, b);
    }

    @Override
    public double subtraction(double a, double b) {
        return super.subtraction(a, b);
    }

    @Override
    public double addition(double a, double b) {
        return super.addition(a, b);
    }

    @Override
    public double stepan(double a, double b) {
        return Math.pow(a,b);
    }

    @Override
    public double modul(double a) {
        return Math.abs(a);
    }

    @Override
    public double koren(double a) {
        return  Math.sqrt(a);
    }
}
