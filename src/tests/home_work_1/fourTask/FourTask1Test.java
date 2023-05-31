package tests.home_work_1.fourTask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FourTask1Test {

    int[] actual = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] expect = {1, 3, 5, 7, 9};

    @Test
    void main() {
        for (int arr : expect) {
            Assertions.assertTrue(arr % 2 != 0);
        }
    }
}