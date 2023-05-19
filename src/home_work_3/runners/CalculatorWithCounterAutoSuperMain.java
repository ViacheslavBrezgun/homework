package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithOperator sup=new CalculatorWithCounterAutoSuper();
        double tmp=sup.addition(2.0,3.0);
//        long s =sup.getCountOperation();
        System.out.println(tmp);
//        System.out.p        rintln(s);
    }
}
