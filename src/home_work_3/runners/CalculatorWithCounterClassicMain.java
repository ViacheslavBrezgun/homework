package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic classic=new CalculatorWithCounterClassic();

        double res=classic.division(28,5);
        classic.incrementCountOperation();
        double res1=classic.stepan(res,2);
        classic.incrementCountOperation();
        double res2=classic.multiplication(15,7);
        classic.incrementCountOperation();
        double res3=classic.addition(4.1,res2);
        classic.incrementCountOperation();
        double res4=classic.addition(res3,res1);
        classic.incrementCountOperation();

        System.out.println(res4+" <---Результат");
        System.out.println( classic.getCountOperation()+ " <---количество обращений к методу  incrementCountOperation()");
    }
}
