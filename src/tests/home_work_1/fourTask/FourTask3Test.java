package tests.home_work_1.fourTask;

import home_work_1.fourTask.FourTask3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FourTask3Test {
    FourTask3 task3 = new FourTask3();

    @Test
    void main() {
//        Assertions.assertTrue(true==task3.delit(0,3));
        Assertions.assertEquals(true, task3.delit(3, 9));
    }
}