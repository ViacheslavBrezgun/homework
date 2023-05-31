package tests.home_work_1.sixthTask;

import home_work_1.sixthTask.SixthTask1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SixthTask1Test {
    //    SixthTask1 six=new SixthTask1();
    @Test
    void main() {
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал", SixthTask1.answer("Вася"));
        Assertions.assertEquals("Я тебя так долго ждал", SixthTask1.answer("Анастасия"));
        Assertions.assertEquals("Добрый день, а вы кто?", SixthTask1.answer("Пупок"));
    }

}
