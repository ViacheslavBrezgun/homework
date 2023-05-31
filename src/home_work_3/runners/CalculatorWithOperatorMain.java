package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator raz = new CalculatorWithOperator();
        double delenie = raz.division(28, 5);//5.6
        double rezultatV = raz.stepan(delenie, 2);
        double umnogenie = raz.multiplication(15, 7);//105
        double slogenie = raz.addition(4.1, umnogenie);//109.1

        double slogenie1 = raz.addition(slogenie, rezultatV);
        System.out.println(slogenie1 + " результат ");



    }
}
