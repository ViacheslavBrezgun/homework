package tests.home_work_1.fourTask;

import home_work_1.fourTask.FourTask5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FourTask5Test {
    FourTask5 task5 = new FourTask5();

    @Test
    void main() {
    }

    @Test
    void lit() {
        Assertions.assertEquals(true, task5.lit('f'));
    }
}