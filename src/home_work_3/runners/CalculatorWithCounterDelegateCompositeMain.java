package home_work_3.runners;

import home_work_3.calcs.api.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite composite=new CalculatorWithCounterAutoComposite();
//        composite.addition(3,5);
//        composite.division(12,4);
//        composite.stepan(4,2);
//        composite.modul(-4);
//        composite.koren(4);
//        composite.multiplication(4,4);
//        composite.subtraction(4,4);

        double res=composite.division(28,5);
        double res1=composite.stepan(res,2);
        double res2=composite.multiplication(15,7);
        double res3=composite.addition(4.1,res2);
        double res4=composite.addition(res3,res1);
        System.out.println(composite.getOperation());
        System.out.println(res4+" <---Результат");
    }
}
