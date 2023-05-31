package home_work_3.runners;

import home_work_3.calcs.api.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregationInterface intf=new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        double res=intf.division(28,5);
        double res1=intf.stepan(res,2);
        double res2=intf.multiplication(15,7);
        double res3=intf.addition(4.1,res2);
        double res4=intf.addition(res3,res1);
        System.out.println(intf.getOperation());
        System.out.println(res4+" <---Результат1");

    }
}
