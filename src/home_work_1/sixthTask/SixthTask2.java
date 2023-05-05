//	6.2 Написать в отдельном классе main метод и в нём код который будет выполнять общее условие при помощи if else if

package Home_Work_1.SixthTask;

import java.util.Objects;
import java.util.Scanner;

public class SixthTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Твое имя, смертный!?");
        String name = sc.nextLine();
        answer(name);
    }

    private static String answer(String name1) {
        if (Objects.equals(name1, "Вася")) {
            System.out.println("Привет!\nЯ тебя так долго ждал");
        } else if (Objects.equals(name1, "Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
        return name1;
    }
}
