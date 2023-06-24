package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {

    private ICalculator calculator;
    private long count=0;
    public CalculatorWithCounterAutoAgregationInterface(ICalculator iCalculator) {
        this.calculator=iCalculator;

    }
    public long getOperation(){
        return count;
    }
    public double division(double a,double b) {
        count++;
        return  calculator.division(a, b);

    }

    public double addition(double a,double b){
        count++;

        return  calculator.addition(a,b);
    }public double multiplication(double a,double b){
        count++;

        return  calculator.multiplication(a,b);
    }public double subtraction(double a,double b){
        count++;

        return  calculator.subtraction(a,b);
    }public double koren(double a){
        count++;

        return  calculator.koren(a);
    }
    public double stepan(double a,double b){
        count++;

        return  calculator.stepan(a,b);
    }public double modul(double a){
        count++;

        return  calculator.modul(a);
    }

}
