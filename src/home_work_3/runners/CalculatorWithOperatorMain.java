package home_work_3.calcs.simple;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator raz = new CalculatorWithOperator();
        double delenie = raz.division(28, 5);//5.6
        double rezultatV = Math.pow(delenie, 2);
        double umnogenie = raz.multiplication(15, 7);//105
        double slogenie = raz.addition(4.1, umnogenie);//109.1

        double slogenie1 = raz.addition(slogenie, rezultatV);
        System.out.println(slogenie1 + " результат ");
        double t = raz.stepan(2, 3);
        System.out.println(t+" dsdfeds");


    }
}
