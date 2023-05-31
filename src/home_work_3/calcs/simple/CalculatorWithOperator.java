package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

    public double division(double a, double b) {
        double res = a / b;
        return res;
    }

    public double multiplication(double a, double b) {
        double res = a * b;

        return res;
    }

    public double subtraction(double a, double b) {
        double res = a - b;

        return res;
    }

    public double addition(double a, double b) {
        double res = a + b;

        return res;
    }

    public double stepan(double a, double b) {///////int b
    double res=1;
        for (int i = 0; i < b; i++) {////////////int i =1;
            res=res*a;
        }
        return res;
    }
    public double modul(double a){
        double res=0;
        if(a<0){
            res=a*(-1);
        }else{
            res=a;
        }
        return res;
        ///////////////////////////////////return a<0?-a:a;
    }
    public double koren(double a){
        Math.sqrt(a);
        return a;
    }



}
