/*6. Запросить у пользователя через консоль его имя. В данном задании у вас должно получиться 3 класса.
	Что в итоге надо сделать (общее условие):
		1. Если имя будет равно имени "Вася" тогда в консоль должно вывести сообщение "Привет!" на одной строке,
		а на второй "Я тебя так долго ждал".
		2. Если имя будет равно имени "Анастасия" тогда в консоль должно вывести сообщение "Я тебя так долго ждал".
		3. В случае если это будет другое имя то вывести сообщение "Добрый день, а вы кто?".
	Как это сделать:
		6.1 Написать в отдельном классе main метод и в нём код который будет выполнять общее условие при помощи
		if else
		6.2 Написать в отдельном классе main метод и в нём код который будет выполнять общее условие при помощи
		if else if
		6.3 Написать в отдельном классе main метод и в нём код который будет выполнять общее условие при помощи
		switch
	ВНИМАНИЕ! В примерах c if для сравнения имён использовать код вида Objects.equals("Имя1", "Имя2").
*/
package home_work_1.sixthTask;

import java.util.Objects;
import java.util.Scanner;

public class SixthTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Твое имя, смертный!?");
        String name = sc.nextLine();
        answer(name);
    }
    public static String answer(String name1) {
        if (Objects.equals(name1, "Вася")) {
           // System.out.println("Привет!\nЯ тебя так долго ждал");
            name1="Привет!\nЯ тебя так долго ждал";
        }
//         else {
//            // System.out.println("Добрый день, а вы кто?");
////        }
       else if (Objects.equals(name1, "Анастасия")) {
//            System.out.println("Я тебя так долго ждал");
            name1="Я тебя так долго ждал";

        } else {
//            System.out.println("Добрый день, а вы кто?");
            name1="Добрый день, а вы кто?";
        }
        return name1;
    }
}
