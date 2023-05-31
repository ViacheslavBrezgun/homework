package home_work_3.calcs.api.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
   private long count=0;

    /**
     *
     * @return количество использований операций калькулятора
     */
    public long getCountOperation(){
        return count;
    }
    @Override
    public double stepan(double a, double b) {
        count++;
        return super.stepan(a, b);
    }

    @Override
    public double modul(double a) {
        count++;
        return super.modul(a);
    }

    @Override
    public double koren(double a) {
        count++;
        return super.koren(a);
    }

    @Override
    public double division(double a, double b) {
        count++;
        return super.division(a, b);
    }

    @Override
    public double multiplication(double a, double b) {
        count++;
        return super.multiplication(a, b);
    }

    @Override
    public double subtraction(double a, double b) {
        count++;
        return super.subtraction(a, b);
    }

    @Override
    public double addition(double a, double b) {
        count++;
        return super.addition(a, b);

    }
}
