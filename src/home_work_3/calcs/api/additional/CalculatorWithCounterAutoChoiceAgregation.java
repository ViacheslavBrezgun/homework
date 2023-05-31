package home_work_3.calcs.api.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    CalculatorWithOperator operator;
    CalculatorWithMathCopy copy;
    CalculatorWithMathExtends ex;
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator operator){
        this.operator=operator;
    }
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy copy){
        this.copy=copy;
    }
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends ex){
        this.ex=ex;
    } private long count=0;
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
    }
    public double stepan(double a,double b){
        count++;

        return  operator.stepan(a,b);
    }public double modul(double a){
        count++;

        return  operator.modul(a);
    }

    public double division1(double a,double b) {
        count++;
        return  copy.division(a, b);

    }

    public double addition1(double a,double b){
        count++;

        return  copy.addition(a,b);
    }public double multiplication1(double a,double b){
        count++;

        return  copy.multiplication(a,b);
    }public double subtraction1(double a,double b){
        count++;

        return  copy.subtraction(a,b);
    }public double koren1(double a){
        count++;

        return  copy.koren(a);
    }
    public double stepan1(double a,double b){
        count++;

        return  copy.stepan(a,b);
    }public double modul1(double a){
        count++;

        return  copy.modul(a);
    }

    public double division2(double a,double b) {
        count++;
        return  ex.division(a, b);

    }

    public double addition2(double a,double b){
        count++;

        return  ex.addition(a,b);
    }public double multiplication2(double a,double b){
        count++;

        return  ex.multiplication(a,b);
    }public double subtraction2(double a,double b){
        count++;

        return  ex.subtraction(a,b);
    }public double koren2(double a){
        count++;

        return  ex.koren(a);
    }
    public double stepan2(double a,double b){
        count++;

        return  ex.stepan(a,b);
    }public double modul2(double a){
        count++;

        return  ex.modul(a);
    }


}
