package tests.home_work_1.fourTask;

import home_work_1.fourTask.FourTask6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FourTask6Test {
    FourTask6 task6 = new FourTask6();

    @Test
    void main() {
    }

    @Test
    void visikosniy() {
        Assertions.assertEquals(true, task6.visikosniy(1764));
    }
}