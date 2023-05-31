package home_work_3.calcs.api.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {
    CalculatorWithOperator copy = new CalculatorWithOperator();
    private long count=0;
    public long getOperation(){
        return count;
    }

    public double division(double a,double b) {
        count++;
        return  copy.division(a, b);

    }
    public double addition(double a,double b){
        count++;

        return  copy.addition(a,b);
    }public double multiplication(double a,double b){
        count++;

        return  copy.multiplication(a,b);
    }public double subtraction(double a,double b){
        count++;

        return  copy.subtraction(a,b);
    }public double koren(double a){
        count++;

        return  copy.koren(a);
    }public double stepan(double a,double b){
        count++;

        return  copy.stepan(a,b);
    }public double modul(double a){
        count++;

        return  copy.modul(a);
    }




}
