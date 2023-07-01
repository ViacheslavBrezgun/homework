package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

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
