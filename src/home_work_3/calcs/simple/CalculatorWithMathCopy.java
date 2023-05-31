package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    /**
     * умножение
     */
    public  double division(double a, double b){
        double res=a/b;
        return res;
    }
    public  double multiplication(double a, double b){
        double res=a*b;

        return res;
    }
    public  double subtraction(double a, double b){
        double res=a-b;

        return res;
    }
    public  double addition(double a, double b){
        double res=a+b;

        return res ;
    }
    public double stepan(double a, double b) {
        return Math.pow(a,b);
    }
    public double modul(double a){

       return  Math.abs(a);
    }
    public double koren(double a){
        Math.sqrt(a);
        return a;
    }

}
