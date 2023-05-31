package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
    CalculatorWithMathCopy Calc=new CalculatorWithMathCopy();
        double delenie=Calc.division(28,5);//5.6
        double rezultatV=Math.pow(delenie,2);
        double umnogenie=Calc.multiplication(15,7);//105
        double slogenie=Calc.addition(4.1,umnogenie);//109.1

        double slogenie1=Calc.addition(slogenie,rezultatV);
        System.out.println(slogenie1+" результат ");

    }
}
