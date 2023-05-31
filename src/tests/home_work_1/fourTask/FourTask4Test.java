package tests.home_work_1.fourTask;

import home_work_1.fourTask.FourTask3;
import home_work_1.fourTask.FourTask4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FourTask4Test {
    FourTask4 task4 = new FourTask4();

    @Test
    void main() {

    }

    @Test
    void kByte() {
        Assertions.assertEquals(10, task4.kByte(10240));
    }

    @Test
    void Byte() {
        Assertions.assertEquals(10240, task4.Byte(10));
    }
}