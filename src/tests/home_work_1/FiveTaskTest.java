package tests.home_work_1;

import home_work_1.FiveTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiveTaskTest {
//    FiveTask five=new FiveTask();

    @Test
    void main() {
        Assertions.assertEquals(true, FiveTask.sleepin(false, true));
    }
}