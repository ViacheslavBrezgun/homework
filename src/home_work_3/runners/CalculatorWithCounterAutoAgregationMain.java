package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregationMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoAgregation agregation=new CalculatorWithCounterAutoAgregation(new CalculatorWithOperator());
        double res=agregation.division(28,5);
        double res1=agregation.stepan(res,2);
        double res2=agregation.multiplication(15,7);
        double res3=agregation.addition(4.1,res2);
        double res4=agregation.addition(res3,res1);
        System.out.println(agregation.getOperation());
        System.out.println(res4+" <---Результат");
    }

}
