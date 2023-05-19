package home_work_3.runners.calcs.additional;

import home_work_3.runners.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    int operation=0;

    /**
     * увеличить количество операций на 1
     */
    public void incrementCountOperation(){
        operation+=1;
    }
    public long getCountOperation(){
        return operation;
    }



}
