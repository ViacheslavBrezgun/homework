package tests.home_work_1.fourTask;

import home_work_1.fourTask.FourTask2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FourTask2Test {
    @Test
    void main() {

        Assertions.assertEquals(FourTask2.sred(0, -6, 3), 0);
    }
}