package home_work_3.calcs.api.additional;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregation {
    CalculatorWithOperator operator;

    public CalculatorWithCounterAutoAgregation(CalculatorWithOperator operator){
        this.operator=operator;
    }
    private long count=0;
    public long getOperation(){
        return count;
    }

    public double division(double a,double b) {
        count++;
        return  operator.division(a, b);

    }
    public double addition(double a,double b){
        count++;

        return  operator.addition(a,b);
    }public double multiplication(double a,double b){
        count++;

        return  operator.multiplication(a,b);
    }public double subtraction(double a,double b){
        count++;

        return  operator.subtraction(a,b);
    }public double koren(double a){
        count++;

        return  operator.koren(a);
    }public double stepan(double a,double b){
        count++;

        return  operator.stepan(a,b);
    }public double modul(double a){
        count++;

        return  operator.modul(a);
    }
}
