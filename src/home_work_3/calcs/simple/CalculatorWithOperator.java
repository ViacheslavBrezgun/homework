package home_work_3.runners.calcs.simple;

public class CalculatorWithOperator {

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

    public double stepan(double a, double b) {
    double res=1;
        for (int i = 0; i < b; i++) {
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
    }
    public double koren(double a){
        Math.sqrt(a);
        return a;
    }



}
