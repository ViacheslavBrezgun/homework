package home_work_3.runners;

import home_work_3.calcs.api.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoChoiceAgregation agregation=new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        double res=agregation.division(28,5);
        double res1=agregation.stepan(res,2);
        double res2=agregation.multiplication(15,7);
        double res3=agregation.addition(4.1,res2);
        double res4=agregation.addition(res3,res1);
        System.out.println(agregation.getOperation());
        System.out.println(res4+" <---Результат1");

        CalculatorWithCounterAutoChoiceAgregation agregation2=new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        double ress=agregation2.division1(28,5);
        double res11=agregation2.stepan1(ress,2);
        double res22=agregation2.multiplication1(15,7);
        double res33=agregation2.addition1(4.1,res22);
        double res44=agregation2.addition1(res33,res11);
        System.out.println(agregation2.getOperation());
        System.out.println(res44+" <---Результат2");

        CalculatorWithCounterAutoChoiceAgregation agregation3=new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        double resss=agregation3.division2(28,5);
        double res111=agregation3.stepan2(resss,2);
        double res222=agregation3.multiplication2(15,7);
        double res333=agregation3.addition2(4.1,res222);
        double res444=agregation3.addition2(res333,res111);
        System.out.println(agregation3.getOperation());
        System.out.println(res444+" <---Результат3");


    }
}
