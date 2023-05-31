package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calculator=new CalculatorWithMathExtends();


        double res=calculator.division(28,5);
        double res1=calculator.stepan(res,2);
        double res2=calculator.multiplication(15,7);
        double res3=calculator.addition(4.1,res2);
        double res4=calculator.addition(res3,res1);
        System.out.println(res4+" <---Результат");
    }
}
