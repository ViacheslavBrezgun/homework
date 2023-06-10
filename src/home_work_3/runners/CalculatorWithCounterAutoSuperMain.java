package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper sup = new CalculatorWithCounterAutoSuper();
        double res=sup.division(28,5);
        double res1=sup.stepan(res,2);
        double res2=sup.multiplication(15,7);
        double res3=sup.addition(4.1,res2);
        double res4=sup.addition(res3,res1);


        System.out.println(sup.getCountOperation()+ "операций");
        System.out.println(" "+res4);

    }
}
